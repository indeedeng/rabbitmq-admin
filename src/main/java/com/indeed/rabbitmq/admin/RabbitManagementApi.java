package com.indeed.rabbitmq.admin;

import com.indeed.rabbitmq.admin.pojo.Bind;
import com.indeed.rabbitmq.admin.pojo.Binding;
import com.indeed.rabbitmq.admin.pojo.Channel;
import com.indeed.rabbitmq.admin.pojo.ClusterName;
import com.indeed.rabbitmq.admin.pojo.Connection;
import com.indeed.rabbitmq.admin.pojo.Consumer;
import com.indeed.rabbitmq.admin.pojo.Exchange;
import com.indeed.rabbitmq.admin.pojo.Extension;
import com.indeed.rabbitmq.admin.pojo.Node;
import com.indeed.rabbitmq.admin.pojo.OperatorPolicy;
import com.indeed.rabbitmq.admin.pojo.Overview;
import com.indeed.rabbitmq.admin.pojo.Parameter;
import com.indeed.rabbitmq.admin.pojo.Permission;
import com.indeed.rabbitmq.admin.pojo.Policy;
import com.indeed.rabbitmq.admin.pojo.Queue;
import com.indeed.rabbitmq.admin.pojo.Shovel;
import com.indeed.rabbitmq.admin.pojo.Status;
import com.indeed.rabbitmq.admin.pojo.User;
import com.indeed.rabbitmq.admin.pojo.VirtualHost;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

/**
 * <p>RabbitMQ server 3.6.1 has a total of 74 APIs, not all of which are
 * implemented here. Missing APIs include:</p>
 * <ul>
 * <li>{@code Definitions getDefinitions()}</li>
 * <li>{@code Definitions getDefinitions(String vhost)}</li>
 * <li>{@code Call<ResponseBody> setDefinitions(Definitions definitions)}</li>
 * <li>{@code Call<ResponseBody> setDefinitions(String vhost, Definitions definitions)}</li>
 * <li>{@code Call<ResponseBody> publishMessage(String vhost, String exchange, Message message)}</li>
 * <li>{@code Call<ResponseBody> setAction(String vhost, String queue, Action action}</li>
 * <li>{@code Message getMessage(String vhost, String queue}</li>
 * </ul>
 *
 * @author Kevin Sitze (kevins@indeed.com)
 */
public interface RabbitManagementApi {

    /**
     * Returns an {@code Overview} of the RabbitMQ service.
     * @return an {@link Overview} instance.
     */
    @GET("api/overview")
    Call<Overview> getOverview();

    /**
     * Returns the {@code "ok"} status if the indicated virtual host is alive.
     * @param vhost the name of the virtual host.
     * @return the {@link Status} of the indicated virtual host.
     */
    @GET("api/aliveness-test/{vhost}")
    Call<Status> getAliveness(@Path("vhost") String vhost);

    // Cluster

    /**
     * Returns the name of the cluster.
     * @return the cluster name.
     */
    @GET("api/cluster-name")
    Call<ClusterName> getClusterName();

    /**
     * Sets the name of the cluster.
     * @param name the cluster name.
     * @return the HTTP ResponseBody.
     */
    @PUT("api/cluster-name")
    Call<ResponseBody> setClusterName(@Body ClusterName name);

    // Bindings

    /**
     * Returns all exchange-to-exchange and exchange-to-queue bindings.
     * @return a list of all bindings on the RabbitMQ service.
     */
    @GET("api/bindings")
    Call<List<Binding>> listBindings();

    /**
     * Returns all exchange-to-exchange and exchange-to-queue bindings in the
     * specified virtual host.
     * @param vhost the RabbitMQ virtual host.
     * @return all bindings in the indicated virtual host.
     */
    @GET("api/bindings/{vhost}")
    Call<List<Binding>> listBindings(@Path("vhost") String vhost);

    /**
     * Returns all bindings whose source is the indicated exchange.
     * @param vhost the RabbitMQ virtual host.
     * @param exchange the source exchange.
     * @return all bindings whose source is the indicated exchange.
     */
    @GET("api/exchanges/{vhost}/{exchange}/bindings/source")
    Call<List<Binding>> listBindingsFromExchange(@Path("vhost") String vhost, @Path("exchange") String exchange);

    /**
     * Returns all bindings whose target is the indicated exchange.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param exchange the target exchange.
     * @return all bindings whose target is the indicated exchange.
     */
    @GET("api/exchanges/{vhost}/{exchange}/bindings/destination")
    Call<List<Binding>> listBindingsToExchange(@Path("vhost") String vhost, @Path("exchange") String exchange);

    /**
     * Returns all bindings whose target is the indicated queue.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param queue the target queue.
     * @return all bindings whose target is the indicated queue.
     */
    @GET("api/queues/{vhost}/{queue}/bindings")
    Call<List<Binding>> listBindingsToQueue(@Path("vhost") String vhost, @Path("queue") String queue);

    /**
     * Returns all bindings whose source is the indicated exchange and whose
     * target is the indicated queue.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param exchange the source exchange.
     * @param queue the target queue.
     * @return all bindings from {@code exchange} to {@code queue}.
     */
    @GET("api/bindings/{vhost}/e/{exchange}/q/{queue}")
    Call<List<Binding>> listExchangeToQueueBindings(@Path("vhost") String vhost, @Path("exchange") String exchange, @Path("queue") String queue);

    /**
     * Create a new exchange-to-queue binding.
     *
     * @param vhost the virtual host containing the exchange and queue to bind.
     * @param exchange the name of the source exchange.
     * @param queue the name of the target queue.
     * @param bind the binding key and any binding arguments.
     * @return an HTTP ResponseBody.
     */
    @POST("api/bindings/{vhost}/e/{exchange}/q/{queue}")
    Call<ResponseBody> bindExchangeToQueue(@Path("vhost") String vhost, @Path("exchange") String exchange, @Path("queue") String queue, @Body Bind bind);

    /**
     * Returns the {@code Binding} metadata for the exchange-to-queue binding
     * from {@code exchange} to {@code queue}.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param exchange the name of the source exchange.
     * @param queue the name of the target queue.
     * @param bindingKey the unique binding key.
     * @return the exchange-to-queue binding metadata.
     */
    @GET("api/bindings/{vhost}/e/{exchange}/q/{queue}/{props}")
    Call<Binding> getExchangeToQueueBinding(@Path("vhost") String vhost, @Path("exchange") String exchange, @Path("queue") String queue, @Path("props") String bindingKey);

    /**
     * Destroys the exchange-to-queue binding from {@code exchange} to
     * {@code queue} whose binding key is {@code bindingKey}.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param exchange the name of the source exchange.
     * @param queue the name of the target queue.
     * @param bindingKey the unique binding key.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/bindings/{vhost}/e/{exchange}/q/{queue}/{props}")
    Call<ResponseBody> deleteExchangeToQueueBinding(@Path("vhost") String vhost, @Path("exchange") String exchange, @Path("queue") String queue, @Path("props") String bindingKey);

    /**
     * Returns all bindings whose source is the indicated exchange and whose
     * target is the indicated exchange.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param source the source exchange.
     * @param destination the target exchange.
     * @return all bindings from {@code source} to {@code destination}.
     */
    @GET("api/bindings/{vhost}/e/{source}/e/{destination}")
    Call<List<Binding>> listExchangeToExchangeBindings(@Path("vhost") String vhost, @Path("source") String source, @Path("destination") String destination);

    /**
     * Create a new exchange-to-exchange binding.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param source the source exchange.
     * @param destination the target exchange.
     * @param bind the binding key and any binding arguments.
     * @return an HTTP ResponseBody.
     */
    @POST("api/bindings/{vhost}/e/{source}/e/{destination}")
    Call<ResponseBody> bindExchangeToExchange(@Path("vhost") String vhost, @Path("source") String source, @Path("destination") String destination, @Body Bind bind);

    /**
     * Returns the exchange-to-exchange binding metadata from {@code source}
     * exchange to {@code destination} exchange whose binding key is
     * {@code bindingKey}.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param source the source exchange.
     * @param destination the target exchange.
     * @param bindingKey the unique binding key.
     * @return the exchange-to-exchange binding metadata.
     */
    @GET("api/bindings/{vhost}/e/{source}/e/{destination}/{props}")
    Call<Binding> getExchangeToExchangeBinding(@Path("vhost") String vhost, @Path("source") String source, @Path("destination") String destination, @Path("props") String bindingKey);

    /**
     * Destroys the exchange-to-exchange binding from {@code source} to
     * {@code destination} whose binding key is {@code bindingKey}.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param source the name of the source exchange.
     * @param destination the name of the target exchange.
     * @param bindingKey the unique binding key.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/bindings/{vhost}/e/{source}/e/{destination}/{props}")
    Call<ResponseBody> deleteExchangeToExchangeBinding(@Path("vhost") String vhost, @Path("source") String source, @Path("destination") String destination, @Path("props") String bindingKey);

    // Channels

    /**
     * Returns a list of all open channels on the RabbitMQ service.
     * @return a list of open channels.
     */
    @GET("api/channels")
    Call<List<Channel>> listChannels();

    /**
     * Returns a list of all open channels in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return a list of open channels in the specified virtual host.
     */
    @GET("api/vhosts/{vhost}/channels")
    Call<List<Channel>> listChannels(@Path("vhost") String vhost);

    /**
     * Returns a list of all channels on the named connection.
     * @param name the name of a RabbitMQ connection.
     * @return the list of open channels on the named connection.
     */
    @GET("api/connections/{name}/channels")
    Call<List<Channel>> listConnectionChannels(@Path("name") String name);

    /**
     * Returns the named channel.
     * @param name the name of a channel.
     * @return the metadata for the indicated channel.
     */
    @GET("api/channels/{name}")
    Call<Channel> getChannel(@Path("name") String name);

    // Connections

    /**
     * Returns a list of all current RabbitMQ client connections.
     * @return a list of RabbitMQ client connections.
     */
    @GET("api/connections")
    Call<List<Connection>> listConnections();

    /**
     * Returns a list of all connections to the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return a list of connections to the specified virtual host.
     */
    @GET("api/vhosts/{vhost}/connections")
    Call<List<Connection>> listConnections(@Path("vhost") String vhost);

    /**
     * Returns the metadata for the named connection.
     * @param name the connection name.
     * @return the connection metadata.
     */
    @GET("api/connections/{name}")
    Call<Connection> getConnection(@Path("name") String name);

    /**
     * Destroys the named connection.
     * @param name a connection name.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/connections/{name}")
    Call<ResponseBody> deleteConnection(@Path("name") String name);

    // Consumers

    /**
     * Returns a list of all consumers in the RabbitMQ service.
     * @return a list of all consumers in the RabbitMQ service.
     */
    @GET("api/consumers")
    Call<List<Consumer>> listConsumers();

    /**
     * Returns a list of all consumers in the indicated virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return a list of all consumers in the virtual host.
     */
    @GET("api/consumers/{vhost}")
    Call<List<Consumer>> listConsumers(@Path("vhost") String vhost);

    // Server Definitions

//    @GET("api/definitions")
//    Call<Definitions> getDefinitions();

//    @POST("api/definitions")
//    Call<ResponseBody> setDefinitions(@Body Definitions definitions);

//    @GET("api/definitions/{vhost}")
//    Call<Definitions> getDefinitions(@Path("vhost") String vhost);

//    @POST("api/definitions/{vhost}")
//    Call<ResponseBody> setDefinitions(@Path("vhost") String vhost, @Body Definitions definitions);

    // Exchanges

    /**
     * Returns a list of all exchanges on the RabbitMQ service.
     * @return a list of all exchanges
     */
    @GET("api/exchanges")
    Call<List<Exchange>> listExchanges();

    /**
     * Returns a list of all exchanges in the indicated virtual host.
     * @return a list of all exchanges in the indicated virtual host.
     */
    @GET("api/exchanges/{vhost}")
    Call<List<Exchange>> listExchanges(@Path("vhost") String vhost);

    /**
     * Returns the named exchange in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of an exchange.
     * @return the exchange metadata.
     */
    @GET("api/exchanges/{vhost}/{name}")
    Call<Exchange> getExchange(@Path("vhost") String vhost, @Path("name") String name);

    /**
     * Creates a new exchange in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the exchange to create.
     * @param exchange the exchange metadata.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/exchanges/{vhost}/{name}")
    Call<ResponseBody> createExchange(@Path("vhost") String vhost, @Path("name") String name, @Body Exchange exchange);

    /**
     * Deletes an exchange in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the exchange to destroy.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/exchanges/{vhost}/{name}")
    Call<ResponseBody> deleteExchange(@Path("vhost") String vhost, @Path("name") String name);

    // Extensions

    /**
     * Returns the list of all extensions installed in the RabbitMQ service.
     * @return the list of all installed extensions.
     */
    @GET("api/extensions")
    Call<List<Extension>> listExtensions();

    // Nodes

    /**
     * Returns all nodes in the RabbitMQ cluster.
     * @return all RabbitMQ cluster nodes.
     */
    @GET("api/nodes")
    Call<List<Node>> listNodes();

    /**
     * Returns the metadata for the named RabbitMQ node.
     * @param name the name of a RabbitMQ node.
     * @return the node metadata.
     */
    @GET("api/nodes/{name}")
    Call<Node> getNode(@Path("name") String name);

    // Parameters

    /**
     * Returns a list of all parameters defined in the RabbitMQ service.
     * @return a list of all defined parameters.
     */
    @GET("api/parameters")
    Call<List<Parameter>> listParameters();

    /**
     * Returns a list of all parameters defined on the indicated component.
     * @param component the name of a RabbitMQ component.
     * @return a list of all parameters defined on the indicated component.
     */
    @GET("api/parameters/{component}")
    Call<List<Parameter>> listParameters(@Path("component") String component);

    /**
     * List all parameters for the indicated component in the specified virtual
     * host.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param component the name of a RabbitMQ component.
     * @return a list of all parameters defined on the indicated component
     *         within the specified virtual host.
     */
    @GET("api/parameters/{component}/{vhost}")
    Call<List<Parameter>> listParameters(@Path("vhost") String vhost, @Path("component") String component);

    /**
     * Returns the parameter by name.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param component the name of a RabbitMQ component.
     * @param name the parameter name.
     * @return the parameter.
     */
    @GET("api/parameters/{component}/{vhost}/{name}")
    Call<Parameter> getParameter(@Path("vhost") String vhost, @Path("component") String component, @Path("name") String name);

    /**
     * Create a new parameter for a component in the specified virtual host.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param component the name of a RabbitMQ component.
     * @param name the parameter name.
     * @param parameter the parameter metadata.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/parameters/{component}/{vhost}/{name}")
    Call<ResponseBody> createParameter(@Path("vhost") String vhost, @Path("component") String component, @Path("name") String name, @Body Parameter parameter);

    /**
     * Destroys an existing parameter in the specified virtual host.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param component the name of a RabbitMQ component.
     * @param name the name of the parameter to destroy.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/parameters/{component}/{vhost}/{name}")
    Call<ResponseBody> deleteParameter(@Path("vhost") String vhost, @Path("component") String component, @Path("name") String name);

    // Permissions

    /**
     * Returns all permissions defined on the RabbitMQ service.
     * @return all permissions.
     */
    @GET("api/permissions")
    Call<List<Permission>> listPermissions();

    /**
     * Returns all permissions defined in the indicated virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return the list of permissions found in the indicated virtual host.
     */
    @GET("api/vhosts/{vhost}/permissions")
    Call<List<Permission>> listPermissions(@Path("vhost") String vhost);

    /**
     * Returns all user authorizations.
     * @param user the user name.
     * @return all permissions associated with the named user.
     */
    @GET("api/users/{user}/permissions")
    Call<List<Permission>> listUserPermissions(@Path("user") String user);

    /**
     * Returns all user authorizations.
     * @param vhost a RabbitMQ virtual host.
     * @param user the user name.
     * @return all permissions associated with the named user in {@code vhost}.
     */
    @GET("api/permissions/{vhost}/{user}")
    Call<Permission> getPermission(@Path("vhost") String vhost, @Path("user") String user);

    /**
     * Create a new authorization for a user.
     * @param vhost a RabbitMQ virtual host.
     * @param user the user name.
     * @param permission the permissions allocated to the user.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/permissions/{vhost}/{user}")
    Call<ResponseBody> createPermission(@Path("vhost") String vhost, @Path("user") String user, @Body Permission permission);

    /**
     * Destroys an user authorization.
     * @param vhost a RabbitMQ virtual host.
     * @param user the user name.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/permissions/{vhost}/{user}")
    Call<ResponseBody> deletePermission(@Path("vhost") String vhost, @Path("user") String user);

    // Policies

    /**
     * Returns a list of all RabbitMQ policies.
     * @return a list of all defined policies.
     */
    @GET("api/policies")
    Call<List<Policy>> listPolicies();

    /**
     * Returns a list of all policies defined in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return a list of all policies defined.
     */
    @GET("api/policies/{vhost}")
    Call<List<Policy>> listPolicies(@Path("vhost") String vhost);

    /**
     * Returns a policy by name.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the policy to retrieve.
     * @return the policy metadata.
     */
    @GET("api/policies/{vhost}/{name}")
    Call<Policy> getPolicy(@Path("vhost") String vhost, @Path("name") String name);

    /**
     * Creates a new policy.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the policy name.
     * @param policy the policy details
     * @return an HTTP ResponseBody.
     */
    @PUT("api/policies/{vhost}/{name}")
    Call<ResponseBody> createPolicy(@Path("vhost") String vhost, @Path("name") String name, @Body Policy policy);

    /**
     * Destroys an existing policy.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the policy name.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/policies/{vhost}/{name}")
    Call<ResponseBody> deletePolicy(@Path("vhost") String vhost, @Path("name") String name);

    // Operator Policies

    /**
     * Returns a list of all RabbitMQ operator policies.
     * @return a list of all defined operator policies.
     */
    @GET("api/operator-policies")
    Call<List<OperatorPolicy>> listOperatorPolicies();

    /**
     * Returns a list of all operator policies defined in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return a list of all operator policies defined.
     */
    @GET("api/operator-policies/{vhost}")
    Call<List<OperatorPolicy>> listOperatorPolicies(@Path("vhost") String vhost);

    /**
     * Returns a operator policy by name.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the operator  policy to retrieve.
     * @return the operator policy metadata.
     */
    @GET("api/operator-policies/{vhost}/{name}")
    Call<OperatorPolicy> getOperatorPolicy(@Path("vhost") String vhost, @Path("name") String name);

    /**
     * Creates a new operator policy.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the operator policy name.
     * @param policy the operator policy details
     * @return an HTTP ResponseBody.
     */
    @PUT("api/operator-policies/{vhost}/{name}")
    @Headers("Content-Type: application/json")
    Call<ResponseBody> createOperatorPolicy(@Path("vhost") String vhost, @Path("name") String name, @Body OperatorPolicy policy);

    /**
     * Destroys an existing operator policy.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the operator policy name.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/operator-policies/{vhost}/{name}")
    Call<ResponseBody> deleteOperatorPolicy(@Path("vhost") String vhost, @Path("name") String name);

    // Queues

    /**
     * Returns a list of all queues declared in the RabbitMQ service.
     * @return a list of all declared queues.
     */
    @GET("api/queues")
    Call<List<Queue>> listQueues();

    /**
     * Returns a list of all queues declared in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @return a list of all queues declared in the virtual host.
     */
    @GET("api/queues/{vhost}")
    Call<List<Queue>> listQueues(@Path("vhost") String vhost);

    /**
     * Returns the metadata for the named queue.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the queue name.
     * @return the queue metadata.
     */
    @GET("api/queues/{vhost}/{name}")
    Call<Queue> getQueue(@Path("vhost") String vhost, @Path("name") String name);

    /**
     * Create a new queue in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @param name the queue name.
     * @param queue the queue metadata.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/queues/{vhost}/{name}")
    Call<ResponseBody> createQueue(@Path("vhost") String vhost, @Path("name") String name, @Body Queue queue);

    /**
     * Destroys a queue in the specified virtual host.
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the queue to remove.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/queues/{vhost}/{name}")
    Call<ResponseBody> deleteQueue(@Path("vhost") String vhost, @Path("name") String name);

    /**
     * Destroys all messages in a queue.
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the queue to purge.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/queues/{vhost}/{name}/contents")
    Call<ResponseBody> purgeQueue(@Path("vhost") String vhost, @Path("name") String name);

    // Users

    /**
     * Returns information on all users on the RabbitMQ service.
     * @return a list of RabbitMQ users.
     */
    @GET("api/users")
    Call<List<User>> listUsers();

    /**
     * Returns the user metadata for the named user.
     * @param name the user name.
     * @return the user metadata.
     */
    @GET("api/users/{user}")
    Call<User> getUser(@Path("user") String name);

    /**
     * Define a new user on the current RabbitMQ cluster.
     * @param name the user name.
     * @param user the user metadata.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/users/{user}")
    Call<ResponseBody> createUser(@Path("user") String name, @Body User user);

    /**
     * Deletes the named user from the current RabbitMQ server.
     * @param name the user name.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/users/{user}")
    Call<ResponseBody> deleteUser(@Path("user") String name);

    /**
     * Returns the name of the authenticated user.
     * @return the authenticated user name.
     */
    @GET("api/whoami")
    Call<User> whoami();

    // Virtual Hosts

    /**
     * Returns a list of all virtual hosts on the RabbitMQ service.
     * @return a list of virtual hosts.
     */
    @GET("api/vhosts")
    Call<List<VirtualHost>> listVirtualHosts();

    /**
     * Returns metadata on the indicated virtual host.
     * @param vhost a virtual host.
     * @return details on the virtual host.
     */
    @GET("api/vhosts/{vhost}")
    Call<VirtualHost> getVirtualHost(@Path("vhost") String vhost);

    /**
     * Create a new virtual host.
     * @param vhost the virtual host.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/vhosts/{vhost}")
    @Headers("Content-Type: application/json")
    Call<ResponseBody> createVirtualHost(@Path("vhost") String vhost);

    /**
     * Delete an existing virtual host.
     * @param vhost the virtual host to remove.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/vhosts/{vhost}")
    Call<ResponseBody> deleteVirtualHost(@Path("vhost") String vhost);

    // Shovels

    /**
     * Returns a list of all shovels defined in the RabbitMQ service.
     * @return a list of all defined shovels.
     */
    @GET("api/parameters/shovel")
    Call<List<Shovel>> listShovels();

    /**
     * List all shovels in the specified virtual host.
     *
     * @param vhost a RabbitMQ virtual host.
     * @return a list of all shovels defined on the specified virtual host.
     */
    @GET("api/parameters/shovel/{vhost}")
    Call<List<Shovel>> listShovels(@Path("vhost") String vhost);

    /**
     * Returns a shovel by name.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the shovel name.
     * @return the shovel.
     */
    @GET("api/parameters/shovel/{vhost}/{name}")
    Call<Shovel> getShovel(@Path("vhost") String vhost, @Path("name") String name);

    /**
     * Create a new shovel in the specified virtual host.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the shovel name.
     * @param shovel the shovel metadata.
     * @return an HTTP ResponseBody.
     */
    @PUT("api/parameters/shovel/{vhost}/{name}")
    Call<ResponseBody> createShovel(@Path("vhost") String vhost, @Path("name") String name, @Body Shovel shovel);

    /**
     * Destroys a shovel in the specified virtual host.
     *
     * @param vhost a RabbitMQ virtual host.
     * @param name the name of the shovel to destroy.
     * @return an HTTP ResponseBody.
     */
    @DELETE("api/parameters/shovel/{vhost}/{name}")
    Call<ResponseBody> deleteShovel(@Path("vhost") String vhost, @Path("name") String name);

}
