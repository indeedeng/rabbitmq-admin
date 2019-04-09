
package com.indeed.rabbitmq.admin.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Message flow statistics and other RabbitMQ channel metadata.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "user",
    "node",
    "vhost",
    "state",
    "confirm",
    "transactional",
    "prefetch_count",
    "global_prefetch_count",
    "acks_uncommitted",
    "messages_unacknowledged",
    "messages_uncommitted",
    "messages_unconfirmed",
    "number",
    "consumer_count",
    "idle_since",
    "connection_details",
    "message_stats"
})
public class Channel {

    @JsonProperty("name")
    private String name;
    @JsonProperty("user")
    private String user;
    @JsonProperty("node")
    private String node;
    @JsonProperty("vhost")
    private String vhost;
    @JsonProperty("state")
    private String state;
    @JsonProperty("confirm")
    private Boolean confirm;
    @JsonProperty("transactional")
    private Boolean transactional;
    @JsonProperty("prefetch_count")
    private Long prefetchCount;
    @JsonProperty("global_prefetch_count")
    private Long globalPrefetchCount;
    @JsonProperty("acks_uncommitted")
    private Long acksUncommitted;
    @JsonProperty("messages_unacknowledged")
    private Long messagesUnacknowledged;
    @JsonProperty("messages_uncommitted")
    private Long messagesUncommitted;
    @JsonProperty("messages_unconfirmed")
    private Long messagesUnconfirmed;
    @JsonProperty("number")
    private Long number;
    @JsonProperty("consumer_count")
    private Long consumerCount;
    @JsonProperty("idle_since")
    private String idleSince;
    @JsonProperty("connection_details")
    private ConnectionDetails connectionDetails;
    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     */
    @JsonProperty("message_stats")
    private MessageStatistics messageStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Channel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Channel withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     *
     * @return
     *     The node
     */
    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    /**
     *
     * @param node
     *     The node
     */
    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    public Channel withNode(String node) {
        this.node = node;
        return this;
    }

    /**
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public String getVhost() {
        return vhost;
    }

    /**
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public Channel withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     *
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Channel withState(String state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @return
     *     The confirm
     */
    @JsonProperty("confirm")
    public Boolean getConfirm() {
        return confirm;
    }

    /**
     *
     * @param confirm
     *     The confirm
     */
    @JsonProperty("confirm")
    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public Channel withConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }

    /**
     *
     * @return
     *     The transactional
     */
    @JsonProperty("transactional")
    public Boolean getTransactional() {
        return transactional;
    }

    /**
     *
     * @param transactional
     *     The transactional
     */
    @JsonProperty("transactional")
    public void setTransactional(Boolean transactional) {
        this.transactional = transactional;
    }

    public Channel withTransactional(Boolean transactional) {
        this.transactional = transactional;
        return this;
    }

    /**
     *
     * @return
     *     The prefetchCount
     */
    @JsonProperty("prefetch_count")
    public Long getPrefetchCount() {
        return prefetchCount;
    }

    /**
     *
     * @param prefetchCount
     *     The prefetch_count
     */
    @JsonProperty("prefetch_count")
    public void setPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    public Channel withPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }

    /**
     *
     * @return
     *     The globalPrefetchCount
     */
    @JsonProperty("global_prefetch_count")
    public Long getGlobalPrefetchCount() {
        return globalPrefetchCount;
    }

    /**
     *
     * @param globalPrefetchCount
     *     The global_prefetch_count
     */
    @JsonProperty("global_prefetch_count")
    public void setGlobalPrefetchCount(Long globalPrefetchCount) {
        this.globalPrefetchCount = globalPrefetchCount;
    }

    public Channel withGlobalPrefetchCount(Long globalPrefetchCount) {
        this.globalPrefetchCount = globalPrefetchCount;
        return this;
    }

    /**
     *
     * @return
     *     The acksUncommitted
     */
    @JsonProperty("acks_uncommitted")
    public Long getAcksUncommitted() {
        return acksUncommitted;
    }

    /**
     *
     * @param acksUncommitted
     *     The acks_uncommitted
     */
    @JsonProperty("acks_uncommitted")
    public void setAcksUncommitted(Long acksUncommitted) {
        this.acksUncommitted = acksUncommitted;
    }

    public Channel withAcksUncommitted(Long acksUncommitted) {
        this.acksUncommitted = acksUncommitted;
        return this;
    }

    /**
     *
     * @return
     *     The messagesUnacknowledged
     */
    @JsonProperty("messages_unacknowledged")
    public Long getMessagesUnacknowledged() {
        return messagesUnacknowledged;
    }

    /**
     *
     * @param messagesUnacknowledged
     *     The messages_unacknowledged
     */
    @JsonProperty("messages_unacknowledged")
    public void setMessagesUnacknowledged(Long messagesUnacknowledged) {
        this.messagesUnacknowledged = messagesUnacknowledged;
    }

    public Channel withMessagesUnacknowledged(Long messagesUnacknowledged) {
        this.messagesUnacknowledged = messagesUnacknowledged;
        return this;
    }

    /**
     *
     * @return
     *     The messagesUncommitted
     */
    @JsonProperty("messages_uncommitted")
    public Long getMessagesUncommitted() {
        return messagesUncommitted;
    }

    /**
     *
     * @param messagesUncommitted
     *     The messages_uncommitted
     */
    @JsonProperty("messages_uncommitted")
    public void setMessagesUncommitted(Long messagesUncommitted) {
        this.messagesUncommitted = messagesUncommitted;
    }

    public Channel withMessagesUncommitted(Long messagesUncommitted) {
        this.messagesUncommitted = messagesUncommitted;
        return this;
    }

    /**
     *
     * @return
     *     The messagesUnconfirmed
     */
    @JsonProperty("messages_unconfirmed")
    public Long getMessagesUnconfirmed() {
        return messagesUnconfirmed;
    }

    /**
     *
     * @param messagesUnconfirmed
     *     The messages_unconfirmed
     */
    @JsonProperty("messages_unconfirmed")
    public void setMessagesUnconfirmed(Long messagesUnconfirmed) {
        this.messagesUnconfirmed = messagesUnconfirmed;
    }

    public Channel withMessagesUnconfirmed(Long messagesUnconfirmed) {
        this.messagesUnconfirmed = messagesUnconfirmed;
        return this;
    }

    /**
     *
     * @return
     *     The number
     */
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    /**
     *
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(Long number) {
        this.number = number;
    }

    public Channel withNumber(Long number) {
        this.number = number;
        return this;
    }

    /**
     *
     * @return
     *     The consumerCount
     */
    @JsonProperty("consumer_count")
    public Long getConsumerCount() {
        return consumerCount;
    }

    /**
     *
     * @param consumerCount
     *     The consumer_count
     */
    @JsonProperty("consumer_count")
    public void setConsumerCount(Long consumerCount) {
        this.consumerCount = consumerCount;
    }

    public Channel withConsumerCount(Long consumerCount) {
        this.consumerCount = consumerCount;
        return this;
    }

    /**
     *
     * @return
     *     The idleSince
     */
    @JsonProperty("idle_since")
    public String getIdleSince() {
        return idleSince;
    }

    /**
     *
     * @param idleSince
     *     The idle_since
     */
    @JsonProperty("idle_since")
    public void setIdleSince(String idleSince) {
        this.idleSince = idleSince;
    }

    public Channel withIdleSince(String idleSince) {
        this.idleSince = idleSince;
        return this;
    }

    /**
     *
     * @return
     *     The connectionDetails
     */
    @JsonProperty("connection_details")
    public ConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }

    /**
     *
     * @param connectionDetails
     *     The connection_details
     */
    @JsonProperty("connection_details")
    public void setConnectionDetails(ConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    public Channel withConnectionDetails(ConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
        return this;
    }

    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     * @return
     *     The messageStats
     */
    @JsonProperty("message_stats")
    public MessageStatistics getMessageStats() {
        return messageStats;
    }

    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     * @param messageStats
     *     The message_stats
     */
    @JsonProperty("message_stats")
    public void setMessageStats(MessageStatistics messageStats) {
        this.messageStats = messageStats;
    }

    public Channel withMessageStats(MessageStatistics messageStats) {
        this.messageStats = messageStats;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Channel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(user).append(node).append(vhost).append(state).append(confirm).append(transactional).append(prefetchCount).append(globalPrefetchCount).append(acksUncommitted).append(messagesUnacknowledged).append(messagesUncommitted).append(messagesUnconfirmed).append(number).append(consumerCount).append(idleSince).append(connectionDetails).append(messageStats).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Channel) == false) {
            return false;
        }
        Channel rhs = ((Channel) other);
        return new EqualsBuilder().append(name, rhs.name).append(user, rhs.user).append(node, rhs.node).append(vhost, rhs.vhost).append(state, rhs.state).append(confirm, rhs.confirm).append(transactional, rhs.transactional).append(prefetchCount, rhs.prefetchCount).append(globalPrefetchCount, rhs.globalPrefetchCount).append(acksUncommitted, rhs.acksUncommitted).append(messagesUnacknowledged, rhs.messagesUnacknowledged).append(messagesUncommitted, rhs.messagesUncommitted).append(messagesUnconfirmed, rhs.messagesUnconfirmed).append(number, rhs.number).append(consumerCount, rhs.consumerCount).append(idleSince, rhs.idleSince).append(connectionDetails, rhs.connectionDetails).append(messageStats, rhs.messageStats).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
