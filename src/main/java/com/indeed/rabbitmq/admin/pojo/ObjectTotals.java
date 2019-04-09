
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
 * Totals of various RabbitMQ entities.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "channels",
    "connections",
    "consumers",
    "exchanges",
    "queues"
})
public class ObjectTotals {

    @JsonProperty("channels")
    private Long channels;
    @JsonProperty("connections")
    private Long connections;
    @JsonProperty("consumers")
    private Long consumers;
    @JsonProperty("exchanges")
    private Long exchanges;
    @JsonProperty("queues")
    private Long queues;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The channels
     */
    @JsonProperty("channels")
    public Long getChannels() {
        return channels;
    }

    /**
     *
     * @param channels
     *     The channels
     */
    @JsonProperty("channels")
    public void setChannels(Long channels) {
        this.channels = channels;
    }

    public ObjectTotals withChannels(Long channels) {
        this.channels = channels;
        return this;
    }

    /**
     *
     * @return
     *     The connections
     */
    @JsonProperty("connections")
    public Long getConnections() {
        return connections;
    }

    /**
     *
     * @param connections
     *     The connections
     */
    @JsonProperty("connections")
    public void setConnections(Long connections) {
        this.connections = connections;
    }

    public ObjectTotals withConnections(Long connections) {
        this.connections = connections;
        return this;
    }

    /**
     *
     * @return
     *     The consumers
     */
    @JsonProperty("consumers")
    public Long getConsumers() {
        return consumers;
    }

    /**
     *
     * @param consumers
     *     The consumers
     */
    @JsonProperty("consumers")
    public void setConsumers(Long consumers) {
        this.consumers = consumers;
    }

    public ObjectTotals withConsumers(Long consumers) {
        this.consumers = consumers;
        return this;
    }

    /**
     *
     * @return
     *     The exchanges
     */
    @JsonProperty("exchanges")
    public Long getExchanges() {
        return exchanges;
    }

    /**
     *
     * @param exchanges
     *     The exchanges
     */
    @JsonProperty("exchanges")
    public void setExchanges(Long exchanges) {
        this.exchanges = exchanges;
    }

    public ObjectTotals withExchanges(Long exchanges) {
        this.exchanges = exchanges;
        return this;
    }

    /**
     *
     * @return
     *     The queues
     */
    @JsonProperty("queues")
    public Long getQueues() {
        return queues;
    }

    /**
     *
     * @param queues
     *     The queues
     */
    @JsonProperty("queues")
    public void setQueues(Long queues) {
        this.queues = queues;
    }

    public ObjectTotals withQueues(Long queues) {
        this.queues = queues;
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

    public ObjectTotals withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(channels).append(connections).append(consumers).append(exchanges).append(queues).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectTotals) == false) {
            return false;
        }
        ObjectTotals rhs = ((ObjectTotals) other);
        return new EqualsBuilder().append(channels, rhs.channels).append(connections, rhs.connections).append(consumers, rhs.consumers).append(exchanges, rhs.exchanges).append(queues, rhs.queues).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
