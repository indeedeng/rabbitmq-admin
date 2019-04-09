
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
 * Describes an active consumer of a RabbitMQ queue.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "consumer_tag",
    "exclusive",
    "ack_required",
    "prefetch_count",
    "channel_details",
    "queue",
    "arguments"
})
public class Consumer {

    @JsonProperty("consumer_tag")
    private java.lang.String consumerTag;
    @JsonProperty("exclusive")
    private Boolean exclusive;
    @JsonProperty("ack_required")
    private Boolean ackRequired;
    @JsonProperty("prefetch_count")
    private Long prefetchCount;
    @JsonProperty("channel_details")
    private ChannelDetails channelDetails;
    @JsonProperty("queue")
    private QueueDetails queue;
    /**
     * Additional arguments specified by the consumer.
     *
     */
    @JsonProperty("arguments")
    private Map<String, Object> arguments;
    @JsonIgnore
    private Map<java.lang.String, java.lang.Object> additionalProperties = new HashMap<java.lang.String, java.lang.Object>();

    /**
     *
     * @return
     *     The consumerTag
     */
    @JsonProperty("consumer_tag")
    public java.lang.String getConsumerTag() {
        return consumerTag;
    }

    /**
     *
     * @param consumerTag
     *     The consumer_tag
     */
    @JsonProperty("consumer_tag")
    public void setConsumerTag(java.lang.String consumerTag) {
        this.consumerTag = consumerTag;
    }

    public Consumer withConsumerTag(java.lang.String consumerTag) {
        this.consumerTag = consumerTag;
        return this;
    }

    /**
     *
     * @return
     *     The exclusive
     */
    @JsonProperty("exclusive")
    public Boolean getExclusive() {
        return exclusive;
    }

    /**
     *
     * @param exclusive
     *     The exclusive
     */
    @JsonProperty("exclusive")
    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public Consumer withExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }

    /**
     *
     * @return
     *     The ackRequired
     */
    @JsonProperty("ack_required")
    public Boolean getAckRequired() {
        return ackRequired;
    }

    /**
     *
     * @param ackRequired
     *     The ack_required
     */
    @JsonProperty("ack_required")
    public void setAckRequired(Boolean ackRequired) {
        this.ackRequired = ackRequired;
    }

    public Consumer withAckRequired(Boolean ackRequired) {
        this.ackRequired = ackRequired;
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

    public Consumer withPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }

    /**
     *
     * @return
     *     The channelDetails
     */
    @JsonProperty("channel_details")
    public ChannelDetails getChannelDetails() {
        return channelDetails;
    }

    /**
     *
     * @param channelDetails
     *     The channel_details
     */
    @JsonProperty("channel_details")
    public void setChannelDetails(ChannelDetails channelDetails) {
        this.channelDetails = channelDetails;
    }

    public Consumer withChannelDetails(ChannelDetails channelDetails) {
        this.channelDetails = channelDetails;
        return this;
    }

    /**
     *
     * @return
     *     The queue
     */
    @JsonProperty("queue")
    public QueueDetails getQueue() {
        return queue;
    }

    /**
     *
     * @param queue
     *     The queue
     */
    @JsonProperty("queue")
    public void setQueue(QueueDetails queue) {
        this.queue = queue;
    }

    public Consumer withQueue(QueueDetails queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Additional arguments specified by the consumer.
     *
     * @return
     *     The arguments
     */
    @JsonProperty("arguments")
    public Map<String, Object> getArguments() {
        return arguments;
    }

    /**
     * Additional arguments specified by the consumer.
     *
     * @param arguments
     *     The arguments
     */
    @JsonProperty("arguments")
    public void setArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
    }

    public Consumer withArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    public Consumer withAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(consumerTag).append(exclusive).append(ackRequired).append(prefetchCount).append(channelDetails).append(queue).append(arguments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Consumer) == false) {
            return false;
        }
        Consumer rhs = ((Consumer) other);
        return new EqualsBuilder().append(consumerTag, rhs.consumerTag).append(exclusive, rhs.exclusive).append(ackRequired, rhs.ackRequired).append(prefetchCount, rhs.prefetchCount).append(channelDetails, rhs.channelDetails).append(queue, rhs.queue).append(arguments, rhs.arguments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
