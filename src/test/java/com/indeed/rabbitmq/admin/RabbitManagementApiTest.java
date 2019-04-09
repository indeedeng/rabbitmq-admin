package com.indeed.rabbitmq.admin;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.indeed.rabbitmq.admin.pojo.Bind;
import com.indeed.rabbitmq.admin.pojo.Binding;
import com.indeed.rabbitmq.admin.pojo.Channel;
import com.indeed.rabbitmq.admin.pojo.ClusterName;
import com.indeed.rabbitmq.admin.pojo.Connection;
import com.indeed.rabbitmq.admin.pojo.Consumer;
import com.indeed.rabbitmq.admin.pojo.Definition;
import com.indeed.rabbitmq.admin.pojo.Definition.HaMode;
import com.indeed.rabbitmq.admin.pojo.Exchange;
import com.indeed.rabbitmq.admin.pojo.Node;
import com.indeed.rabbitmq.admin.pojo.Parameter;
import com.indeed.rabbitmq.admin.pojo.Permission;
import com.indeed.rabbitmq.admin.pojo.Policy;
import com.indeed.rabbitmq.admin.pojo.Policy.ApplyTo;
import com.indeed.rabbitmq.admin.pojo.Queue;
import com.indeed.rabbitmq.admin.pojo.Shovel;
import com.indeed.rabbitmq.admin.pojo.ShovelArguments;
import com.indeed.rabbitmq.admin.pojo.Status;
import com.indeed.rabbitmq.admin.pojo.User;
import com.indeed.rabbitmq.admin.pojo.VirtualHost;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.converter.JacksonConverter;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Simple integration tests for {@code RabbitManagementApi}.
 *
 * @author Kevin Sitze (kevins@indeed.com)
 */
@Ignore
public class RabbitManagementApiTest {

    public static final Pattern RE_ALL = Pattern.compile(".*");

    public static final String VIRTUAL_HOST = "testApiVirtualHost";
    public static final String USERNAME = "testApiUsername";
    public static final String PASSWORD = "testApiPassword";

    public static final String ADMIN_USERNAME = "guest";
    public static final String ADMIN_PASSWORD = "guest";

    public static final URI ENDPOINT = URI.create("http://localhost:15672/");
    public static final String ADMINISTRATOR = "administrator";

    public static final String EXCHANGE_NAME = "aTestExchange";
    public static final String QUEUE_NAME = "aTestQueue";

    private static void assertStatusCode(final int statusCode, final Response response) {
        assertEquals(statusCode, response.getStatus());
    }

    private static void assertStatusCodeNoContent(final Response response) {
        assertStatusCode(201, response);
    }

    private static String toString(final Pattern pattern) {
        if (null == pattern) {
            return null;
        } else {
            return pattern.pattern();
        }
    }

    private RabbitManagementApi manager;
    private AuthenticationInterceptor interceptor;

    private boolean hasChannel(final String name) {
        for (final Channel channel : manager.listChannels()) {
            if (name.equals(channel.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasChannel(final String name, final String virtualHost) {
        for (final Channel channel : manager.listChannels(virtualHost)) {
            if (name.equals(channel.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasConnection(final String name) {
        for (final Connection connection : manager.listConnections()) {
            if (name.equals(connection.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasConnection(final String name, final String virtualHost) {
        for (final Connection connection : manager.listConnections(virtualHost)) {
            if (name.equals(connection.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasConsumer(final String consumerTag) {
        for (final VirtualHost virtualHost: manager.listVirtualHosts()) {
            for (final Consumer consumer : manager.listConsumers(virtualHost.getName())) {
                if (consumerTag.equals(consumer.getConsumerTag())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasUsername(final String username) {
        for (final User user : manager.listUsers()) {
            if (username.equals(user.getName())) {
                return true;
            }
        }
        return false;
    }

    private void createTestUser() {
        if (! hasUsername(USERNAME)) {
            final User user = new User().withPassword(PASSWORD).withTags(ADMINISTRATOR);
            assertStatusCodeNoContent(manager.createUser(USERNAME, user));
            assertTrue(hasUsername(USERNAME));
        }
        interceptor.setCredentials(USERNAME, PASSWORD);
    }

    private boolean hasVirtualHost(final String virtualHost) {
        for (final VirtualHost host : manager.listVirtualHosts()) {
            if (virtualHost.equals(host.getName())) {
                return true;
            }
        }
        return false;
    }

    private void createTestVirtualHost() {
        createTestUser();
        if (! hasVirtualHost(VIRTUAL_HOST)) {
            assertStatusCodeNoContent(manager.createVirtualHost(VIRTUAL_HOST));
            assertTrue(hasVirtualHost(VIRTUAL_HOST));
        }
    }

    private boolean hasUserPermission(final Permission permission, final String user) {
        for (final Permission element : manager.listUserPermissions(user)) {
            if (permission.equals(element)) {
                return true;
            }
        }
        return false;
    }

    private Permission configureTestVirtualHost() {
        createTestVirtualHost();
        final Permission permission = new Permission().withConfigure(RE_ALL).withRead(RE_ALL).withWrite(RE_ALL);
        assertStatusCodeNoContent(manager.createPermission(VIRTUAL_HOST, USERNAME, permission));
        permission.withVhost(VIRTUAL_HOST).withUser(USERNAME);
        assertTrue(hasUserPermission(permission, USERNAME));
        return permission;
    }

    private boolean hasExchange(final String exchangeName, final String virtualHost) {
        for (final Exchange exchange : manager.listExchanges(virtualHost)) {
            if (exchangeName.equals(exchange.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasExchange(final String exchangeName) {
        for (final Exchange exchange : manager.listExchanges()) {
            if (exchangeName.equals(exchange.getName())) {
                return true;
            }
        }
        return false;
    }

    private void createExchange(final String exchangeName) {
        final Exchange topic = new Exchange().withType("topic");
        assertStatusCodeNoContent(manager.createExchange(VIRTUAL_HOST, exchangeName, topic));
        assertTrue(hasExchange(exchangeName, VIRTUAL_HOST));
        assertTrue(hasExchange(exchangeName));

        // Verify that exchange was created correctly.
        final Exchange exchange = manager.getExchange(VIRTUAL_HOST, exchangeName);
        assertNotNull(exchange);
        assertEquals(exchangeName, exchange.getName());
        assertEquals("topic", exchange.getType());
    }

    private void destroyExchange(final String exchangeName) {
        assertStatusCodeNoContent(manager.deleteExchange(VIRTUAL_HOST, exchangeName));
        assertFalse(hasExchange(exchangeName, VIRTUAL_HOST));
    }

    private void destroyUser() {
        interceptor.setCredentials(ADMIN_USERNAME, ADMIN_PASSWORD);
        assertStatusCodeNoContent(manager.deleteUser(USERNAME));
        assertFalse(hasUsername(USERNAME));
    }

    private boolean hasQueue(final String queueName, final String virtualHost) {
        for (final Queue queue : manager.listQueues(virtualHost)) {
            if (queueName.equals(queue.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasQueue(final String queueName) {
        for (final Queue queue : manager.listQueues()) {
            if (queueName.equals(queue.getName())) {
                return true;
            }
        }
        return false;
    }

    private void createQueue(final String queueName) {
        assertStatusCodeNoContent(manager.createQueue(VIRTUAL_HOST, queueName, new Queue().withDurable(true)));
        assertTrue(hasQueue(queueName, VIRTUAL_HOST));
        assertTrue(hasQueue(queueName));

        // Verify that queue was created correctly.
        final Queue queue = manager.getQueue(VIRTUAL_HOST, queueName);
        assertNotNull(queue);
        assertEquals(queueName, queue.getName());

        // Purge all messages currently in this queue.
        assertStatusCodeNoContent(manager.purgeQueue(VIRTUAL_HOST, queueName));
    }

    private void destroyQueue(final String queueName) {
        assertStatusCodeNoContent(manager.deleteQueue(VIRTUAL_HOST, queueName));
        assertFalse(hasQueue(queueName, VIRTUAL_HOST));
    }

    private boolean hasNode(final String name) {
        assertEquals(name, manager.getNode(name).getName());
        return true;
    }

    private boolean hasBinding(final String source, final String target, final String virtualHost) {
        for (final Binding binding : manager.listBindings()) {
            if (source.equals(binding.getSource()) && target.equals(binding.getDestination()) && virtualHost.equals(binding.getVhost())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasBinding(final String source, final String target, final String virtualHost, final String type) {
        for (final Binding binding : manager.listBindings(virtualHost)) {
            if (source.equals(binding.getSource()) && target.equals(binding.getDestination()) && type.equals(binding.getDestinationType().toString())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasPolicy(final String name) {
        for (final Policy policy : manager.listPolicies()) {
            if (name.equals(policy.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasPolicy(final String name, final String virtualHost) {
        for (final Policy policy : manager.listPolicies(virtualHost)) {
            if (name.equals(policy.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasPermission(final Permission permission) {
        for (final Permission element : manager.listPermissions()) {
            if (element.equals(permission)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasVirtualHostPermission(final Permission permission, final String virtualHost) {
        for (final Permission element : manager.listPermissions(virtualHost)) {
            if (element.equals(permission)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasParameter(final String component, final Parameter parameter) {
        for (final Parameter element : manager.listParameters(component)) {
            if (parameter.equals(element)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasParameter(final String component, final String virtualHost, final Parameter parameter) {
        for (final Parameter element : manager.listParameters(virtualHost, component)) {
            if (parameter.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Before
    public void setUp() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        interceptor = new AuthenticationInterceptor(ADMIN_USERNAME, ADMIN_PASSWORD);

        final RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setRequestInterceptor(interceptor)
               .setEndpoint(ENDPOINT.toASCIIString())
               .setConverter(new JacksonConverter(objectMapper));
        manager = builder.build().create(RabbitManagementApi.class);
    }

    @Before
    @After
    public void deleteVirtualHost() {
        try {
            manager.deleteVirtualHost(VIRTUAL_HOST);
        } catch (final RetrofitError e) {
            assertEquals(404, e.getResponse().getStatus());
        }
    }

    @Test
    public void testOverview() {
        Assert.assertNotNull(manager.getOverview());
    }

    @Test
    public void testAliveness() {
        final Status status = manager.getAliveness("/");
        assertNotNull(status);
        assertEquals("ok", status.getStatus());
    }

    @Test
    public void testClusterName() {
        final ClusterName clusterName = manager.getClusterName();
        assertStatusCodeNoContent(manager.setClusterName(new ClusterName().withName("cluster")));
        assertEquals("cluster", manager.getClusterName().getName());
        assertStatusCodeNoContent(manager.setClusterName(clusterName));
    }

    @Test
    public void testChannels() {
        for (final Channel channel : manager.listChannels()) {
            assertTrue(hasChannel(channel.getName()));
            assertTrue(hasChannel(channel.getName(), channel.getVhost()));
            assertNotNull(manager.getChannel(channel.getName()));
        }
    }

    @Test
    public void testConnections() {
        for (final Connection connection : manager.listConnections()) {
            assertTrue(hasConnection(connection.getName()));
            assertTrue(hasConnection(connection.getName(), connection.getVhost()));
            assertNotNull(manager.getConnection(connection.getName()));
            for (final Channel channel : manager.listConnectionChannels(connection.getName())) {
                assertTrue(hasChannel(channel.getName()));
            }
        }
    }

    @Test
    public void testConsumers() {
        for (final Consumer consumer : manager.listConsumers()) {
            assertTrue(hasConsumer(consumer.getConsumerTag()));
        }
    }

    @Test
    public void testExchanges() {
        configureTestVirtualHost();
        createExchange(EXCHANGE_NAME);
        destroyExchange(EXCHANGE_NAME);
        destroyUser();
    }

    @Test
    public void testExchangePermissions() {
        configureTestVirtualHost();
        createExchange(EXCHANGE_NAME);
        assertStatusCodeNoContent(manager.deletePermission(VIRTUAL_HOST, USERNAME));

        try {
            manager.listExchanges(VIRTUAL_HOST);
            fail("listExchanges succeeded");
        } catch (final RetrofitError e) {
            assertEquals(401, e.getResponse().getStatus());
        }

        destroyUser();
    }

    @Test
    public void testListExtensions() {
        assertNotNull(manager.listExtensions());
    }

    @Test
    public void testNodes() {
        for (final Node node : manager.listNodes()) {
            assertTrue(hasNode(node.getName()));
        }
    }

    @Test
    public void testParameters() throws IOException {
        assertStatusCodeNoContent(manager.createUser(USERNAME, new User().withPassword(PASSWORD).withTags(ADMINISTRATOR)));
        interceptor.setCredentials(USERNAME, PASSWORD);
        assertStatusCodeNoContent(manager.createVirtualHost(VIRTUAL_HOST));
        for (final Parameter parameter : manager.listParameters()) {
            assertEquals(parameter, manager.getParameter(parameter.getVhost(), parameter.getComponent(), parameter.getName()));
            assertTrue(hasParameter(parameter.getComponent(), parameter));
            assertTrue(hasParameter(parameter.getComponent(), parameter.getVhost(), parameter));
        }
    }

    @Test
    public void testPermissions() {
        final Permission permission = configureTestVirtualHost();

        permission.withUser(USERNAME).withVhost(VIRTUAL_HOST);
        assertEquals(permission, manager.getPermission(VIRTUAL_HOST, USERNAME));
        assertTrue(hasPermission(permission));
        assertTrue(hasUserPermission(permission, USERNAME));
        assertTrue(hasVirtualHostPermission(permission, VIRTUAL_HOST));
        assertStatusCodeNoContent(manager.deletePermission(VIRTUAL_HOST, USERNAME));
        assertFalse(hasPermission(permission));
        assertFalse(hasUserPermission(permission, USERNAME));
        assertFalse(hasVirtualHostPermission(permission, VIRTUAL_HOST));
    }

    @Test
    public void testPolicy() {
        configureTestVirtualHost();

        final List<Policy> policies = manager.listPolicies(VIRTUAL_HOST);
        assertTrue(policies.isEmpty());
        final Policy policy
            = new Policy().withApplyTo(ApplyTo.ALL)
                          .withDefinition(new Definition().withHaMode(HaMode.ALL))
                          .withPattern(Pattern.compile("^amq."));
        assertStatusCodeNoContent(manager.createPolicy(VIRTUAL_HOST, "policy", policy));
        policy.withName("policy")
              .withPriority(0L) // default priority
              .withVhost(VIRTUAL_HOST);
        assertEquals(policy, manager.getPolicy(VIRTUAL_HOST, "policy"));
        assertTrue(hasPolicy("policy"));
        assertTrue(hasPolicy("policy", VIRTUAL_HOST));
        assertStatusCodeNoContent(manager.deletePolicy(VIRTUAL_HOST, "policy"));
    }

    @Test
    public void testQueues() {
        configureTestVirtualHost();
        createQueue(QUEUE_NAME);
        destroyQueue(QUEUE_NAME);
        destroyUser();
    }

    @Test
    public void testQueuePermissions() {
        configureTestVirtualHost();
        createQueue(QUEUE_NAME);
        assertStatusCodeNoContent(manager.deletePermission(VIRTUAL_HOST, USERNAME));

        try {
            manager.listQueues(VIRTUAL_HOST);
            fail("listQueues succeeded");
        } catch (final RetrofitError e) {
            assertEquals(401, e.getResponse().getStatus());
        }

        destroyUser();
    }

    @Test
    public void testUsers() {
        for (final User user : manager.listUsers()) {
            Assert.assertEquals(user, manager.getUser(user.getName()));
        }
    }

    @Test
    public void testWhoAmI() {
        final User user = manager.whoami();
        assertNotNull(user);
        assertEquals(ADMIN_USERNAME, user.getName());
    }

    @Test
    public void testBindings() {
        configureTestVirtualHost();

        createQueue("q1");
        createExchange("e1");
        createExchange("e2");

        // Create an exchange -> queue binding
        manager.bindExchangeToQueue(VIRTUAL_HOST, "e1", "q1", new Bind().withRoutingKey("key"));
        assertTrue(hasBinding("e1", "q1", VIRTUAL_HOST));
        assertTrue(hasBinding("e1", "q1", VIRTUAL_HOST, "queue"));

        // Create an exchange -> exchange binding
        manager.bindExchangeToExchange(VIRTUAL_HOST, "e1", "e2", new Bind().withRoutingKey("#"));
        assertTrue(hasBinding("e1", "e2", VIRTUAL_HOST));
        assertTrue(hasBinding("e1", "e2", VIRTUAL_HOST, "exchange"));

        {
            final List<Binding> bindings = manager.listBindingsFromExchange(VIRTUAL_HOST, "e1");
            assertNotNull(bindings);
            assertFalse(bindings.isEmpty());
            for (final Binding binding : bindings) {
                assertEquals("e1", binding.getSource());
            }
        }

        {
            final List<Binding> bindings = manager.listBindingsToExchange(VIRTUAL_HOST, "e2");
            assertNotNull(bindings);
            assertFalse(bindings.isEmpty());
            for (final Binding binding : bindings) {
                assertEquals("e2", binding.getDestination());
            }
        }

        {
            final List<Binding> bindings = manager.listBindingsToQueue(VIRTUAL_HOST, "q1");
            assertNotNull(bindings);
            assertFalse(bindings.isEmpty());
            for (final Binding binding : bindings) {
                assertEquals("q1", binding.getDestination());
            }
        }

        {
            final List<Binding> bindings = manager.listExchangeToExchangeBindings(VIRTUAL_HOST, "e1", "e2");
            assertNotNull(bindings);
            assertEquals(1, bindings.size());
            final Binding binding = bindings.get(0);
            assertEquals("e1", binding.getSource());
            assertEquals("e2", binding.getDestination());
            assertEquals("#", binding.getRoutingKey());
            assertEquals(binding, manager.getExchangeToExchangeBinding(VIRTUAL_HOST, "e1", "e2", binding.getPropertiesKey()));

            // Delete binding
            assertStatusCodeNoContent(manager.deleteExchangeToExchangeBinding(VIRTUAL_HOST, "e1", "e2", binding.getPropertiesKey()));
        }

        {
            final List<Binding> bindings = manager.listExchangeToQueueBindings(VIRTUAL_HOST, "e1", "q1");
            assertNotNull(bindings);
            assertEquals(1, bindings.size());
            final Binding binding = bindings.get(0);
            assertEquals("e1", binding.getSource());
            assertEquals("q1", binding.getDestination());
            assertEquals("key", binding.getRoutingKey());
            assertEquals(binding, manager.getExchangeToQueueBinding(VIRTUAL_HOST, "e1", "q1", binding.getPropertiesKey()));

            // Delete binding
            assertStatusCodeNoContent(manager.deleteExchangeToQueueBinding(VIRTUAL_HOST, "e1", "q1", binding.getPropertiesKey()));
        }

        destroyExchange("e2");
        destroyExchange("e1");
        destroyQueue("q1");
        destroyUser();
    }

    @Test
    public void testFactory() {
        RabbitManagementApiFactory.newInstance(ENDPOINT, ADMIN_USERNAME , ADMIN_PASSWORD).listUsers();
    }

    @Test
    public void testVirtualHost() {
        assertStatusCodeNoContent(manager.createVirtualHost(VIRTUAL_HOST));
        assertTrue(hasVirtualHost(VIRTUAL_HOST));

        final VirtualHost virtualHost = manager.getVirtualHost(VIRTUAL_HOST);
        assertNotNull(virtualHost);
        assertEquals(VIRTUAL_HOST, virtualHost.getName());

        assertStatusCodeNoContent(manager.deleteVirtualHost(VIRTUAL_HOST));
        assertFalse(hasVirtualHost(VIRTUAL_HOST));
    }

    private boolean hasShovel(final String shovelName) {
        for (final Shovel shovel : manager.listShovels()) {
            if (shovelName.equals(shovel.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasShovel(final String shovelName, final String virtualHost) {
        for (final Shovel shovel : manager.listShovels(virtualHost)) {
            if (shovelName.equals(shovel.getName())) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testShovel() throws IOException {
        configureTestVirtualHost();

        createExchange("e1");
        createExchange("e2");

        final ShovelArguments shovel = new ShovelArguments();
        shovel.withSrcExchange("e1").withDestExchange("e2").withAckMode(ShovelArguments.AckMode.ON_CONFIRM);
        assertStatusCodeNoContent(manager.createShovel(VIRTUAL_HOST, "test-shovel", new Shovel().withValue(shovel)));
        assertTrue(hasShovel("test-shovel"));
        assertTrue(hasShovel("test-shovel", VIRTUAL_HOST));
        assertStatusCodeNoContent(manager.deleteShovel(VIRTUAL_HOST, "test-shovel"));
        assertFalse(hasShovel("test-shovel", VIRTUAL_HOST));
    }
}
