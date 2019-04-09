
package com.indeed.rabbitmq.admin.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The definitions to apply to a RabbitMQ policy.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "alternate-exchange",
    "dead-letter-exchange",
    "dead-letter-routing-key",
    "expires",
    "ha-mode",
    "ha-params",
    "ha-promote-on-shutdown",
    "ha-sync-batch-size",
    "ha-sync-mode",
    "max-length",
    "max-length-bytes",
    "message-ttl",
    "queue-master-locator"
})
public class Definition {

    /**
     * If an exchange cannot route a message to any queue, that message is
     * rerouted to the alternate exchange for routing.
     * Applied to exchanges.
     *
     */
    @JsonProperty("alternate-exchange")
    private String alternateExchange;
    /**
     * Route dead letter messages to this exchange.
     * <p>
     * Messages are considered dead if the message expires, it is rejected (via
     * nack) or if a queue length limit would be exceeded.
     * Applied to queues.
     *
     */
    @JsonProperty("dead-letter-exchange")
    private String deadLetterExchange;
    /**
     * Modify the routing key of dead letter messages to this value.
     * Applied to queues.
     *
     */
    @JsonProperty("dead-letter-routing-key")
    private String deadLetterRoutingKey;
    /**
     * Remove queue if it remains unused for this number of milliseconds.
     * Applied to queues.
     *
     */
    @JsonProperty("expires")
    private Long expires;
    /**
     * Indicates the nodes to which high availability queues are synchronized.
     *
     */
    @JsonProperty("ha-mode")
    private Definition.HaMode haMode;
    /**
     * Indicates the nodes to which high availability queues are synchronized.
     *
     */
    @JsonProperty("ha-params")
    private Long haParams;
    /**
     * Set to "always" to prefer that master nodes fail over to
     * unsynchronized slaves in all circumstances (i.e., availability over
     * message lost avoidance).
     * Applied to queues.
     *
     */
    @JsonProperty("ha-promote-on-shutdown")
    private Definition.HaPromoteOnShutdown haPromoteOnShutdown;
    /**
     * If queue is automatically synchronized then this argument indicates
     * the number of messages for batch synchronization.
     * Applied to queues.
     *
     */
    @JsonProperty("ha-sync-batch-size")
    private Long haSyncBatchSize;
    /**
     * Indicates how queue synchronization is controlled.
     * If "manual" then the queue must be synchronized via this admin API.
     * Applied to queues.
     *
     */
    @JsonProperty("ha-sync-mode")
    private Definition.HaSyncMode haSyncMode;
    /**
     * Maximum number of messages in a queue.
     * Applied to queues.
     *
     */
    @JsonProperty("max-length")
    private Long maxLength;
    /**
     * Maximum number of bytes in a queue.
     * Applied to queues.
     *
     */
    @JsonProperty("max-length-bytes")
    private Long maxLengthBytes;
    /**
     * Remove message if it remains in the queue for this number of milliseconds.
     * <p>
     * Sets the TTL on messages in a queue. Policy must be attached to a queue.
     * These messages are routed as dead letter messages after expiration.
     * Applied to queues.
     *
     */
    @JsonProperty("message-ttl")
    private Long messageTtl;
    /**
     * Indicates how to elect the queue home node.
     * Applied to queues.
     *
     */
    @JsonProperty("queue-master-locator")
    private Definition.QueueMasterLocator queueMasterLocator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * If an exchange cannot route a message to any queue, that message is
     * rerouted to the alternate exchange for routing.
     * Applied to exchanges.
     *
     * @return
     *     The alternateExchange
     */
    @JsonProperty("alternate-exchange")
    public String getAlternateExchange() {
        return alternateExchange;
    }

    /**
     * If an exchange cannot route a message to any queue, that message is
     * rerouted to the alternate exchange for routing.
     * Applied to exchanges.
     *
     * @param alternateExchange
     *     The alternate-exchange
     */
    @JsonProperty("alternate-exchange")
    public void setAlternateExchange(String alternateExchange) {
        this.alternateExchange = alternateExchange;
    }

    public Definition withAlternateExchange(String alternateExchange) {
        this.alternateExchange = alternateExchange;
        return this;
    }

    /**
     * Route dead letter messages to this exchange.
     * <p>
     * Messages are considered dead if the message expires, it is rejected (via
     * nack) or if a queue length limit would be exceeded.
     * Applied to queues.
     *
     * @return
     *     The deadLetterExchange
     */
    @JsonProperty("dead-letter-exchange")
    public String getDeadLetterExchange() {
        return deadLetterExchange;
    }

    /**
     * Route dead letter messages to this exchange.
     * <p>
     * Messages are considered dead if the message expires, it is rejected (via
     * nack) or if a queue length limit would be exceeded.
     * Applied to queues.
     *
     * @param deadLetterExchange
     *     The dead-letter-exchange
     */
    @JsonProperty("dead-letter-exchange")
    public void setDeadLetterExchange(String deadLetterExchange) {
        this.deadLetterExchange = deadLetterExchange;
    }

    public Definition withDeadLetterExchange(String deadLetterExchange) {
        this.deadLetterExchange = deadLetterExchange;
        return this;
    }

    /**
     * Modify the routing key of dead letter messages to this value.
     * Applied to queues.
     *
     * @return
     *     The deadLetterRoutingKey
     */
    @JsonProperty("dead-letter-routing-key")
    public String getDeadLetterRoutingKey() {
        return deadLetterRoutingKey;
    }

    /**
     * Modify the routing key of dead letter messages to this value.
     * Applied to queues.
     *
     * @param deadLetterRoutingKey
     *     The dead-letter-routing-key
     */
    @JsonProperty("dead-letter-routing-key")
    public void setDeadLetterRoutingKey(String deadLetterRoutingKey) {
        this.deadLetterRoutingKey = deadLetterRoutingKey;
    }

    public Definition withDeadLetterRoutingKey(String deadLetterRoutingKey) {
        this.deadLetterRoutingKey = deadLetterRoutingKey;
        return this;
    }

    /**
     * Remove queue if it remains unused for this number of milliseconds.
     * Applied to queues.
     *
     * @return
     *     The expires
     */
    @JsonProperty("expires")
    public Long getExpires() {
        return expires;
    }

    /**
     * Remove queue if it remains unused for this number of milliseconds.
     * Applied to queues.
     *
     * @param expires
     *     The expires
     */
    @JsonProperty("expires")
    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public Definition withExpires(Long expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Indicates the nodes to which high availability queues are synchronized.
     *
     * @return
     *     The haMode
     */
    @JsonProperty("ha-mode")
    public Definition.HaMode getHaMode() {
        return haMode;
    }

    /**
     * Indicates the nodes to which high availability queues are synchronized.
     *
     * @param haMode
     *     The ha-mode
     */
    @JsonProperty("ha-mode")
    public void setHaMode(Definition.HaMode haMode) {
        this.haMode = haMode;
    }

    public Definition withHaMode(Definition.HaMode haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * Indicates the nodes to which high availability queues are synchronized.
     *
     * @return
     *     The haParams
     */
    @JsonProperty("ha-params")
    public Long getHaParams() {
        return haParams;
    }

    /**
     * Indicates the nodes to which high availability queues are synchronized.
     *
     * @param haParams
     *     The ha-params
     */
    @JsonProperty("ha-params")
    public void setHaParams(Long haParams) {
        this.haParams = haParams;
    }

    public Definition withHaParams(Long haParams) {
        this.haParams = haParams;
        return this;
    }

    /**
     * Set to "always" to prefer that master nodes fail over to
     * unsynchronized slaves in all circumstances (i.e., availability over
     * message lost avoidance).
     * Applied to queues.
     *
     * @return
     *     The haPromoteOnShutdown
     */
    @JsonProperty("ha-promote-on-shutdown")
    public Definition.HaPromoteOnShutdown getHaPromoteOnShutdown() {
        return haPromoteOnShutdown;
    }

    /**
     * Set to "always" to prefer that master nodes fail over to
     * unsynchronized slaves in all circumstances (i.e., availability over
     * message lost avoidance).
     * Applied to queues.
     *
     * @param haPromoteOnShutdown
     *     The ha-promote-on-shutdown
     */
    @JsonProperty("ha-promote-on-shutdown")
    public void setHaPromoteOnShutdown(Definition.HaPromoteOnShutdown haPromoteOnShutdown) {
        this.haPromoteOnShutdown = haPromoteOnShutdown;
    }

    public Definition withHaPromoteOnShutdown(Definition.HaPromoteOnShutdown haPromoteOnShutdown) {
        this.haPromoteOnShutdown = haPromoteOnShutdown;
        return this;
    }

    /**
     * If queue is automatically synchronized then this argument indicates
     * the number of messages for batch synchronization.
     * Applied to queues.
     *
     * @return
     *     The haSyncBatchSize
     */
    @JsonProperty("ha-sync-batch-size")
    public Long getHaSyncBatchSize() {
        return haSyncBatchSize;
    }

    /**
     * If queue is automatically synchronized then this argument indicates
     * the number of messages for batch synchronization.
     * Applied to queues.
     *
     * @param haSyncBatchSize
     *     The ha-sync-batch-size
     */
    @JsonProperty("ha-sync-batch-size")
    public void setHaSyncBatchSize(Long haSyncBatchSize) {
        this.haSyncBatchSize = haSyncBatchSize;
    }

    public Definition withHaSyncBatchSize(Long haSyncBatchSize) {
        this.haSyncBatchSize = haSyncBatchSize;
        return this;
    }

    /**
     * Indicates how queue synchronization is controlled.
     * If "manual" then the queue must be synchronized via this admin API.
     * Applied to queues.
     *
     * @return
     *     The haSyncMode
     */
    @JsonProperty("ha-sync-mode")
    public Definition.HaSyncMode getHaSyncMode() {
        return haSyncMode;
    }

    /**
     * Indicates how queue synchronization is controlled.
     * If "manual" then the queue must be synchronized via this admin API.
     * Applied to queues.
     *
     * @param haSyncMode
     *     The ha-sync-mode
     */
    @JsonProperty("ha-sync-mode")
    public void setHaSyncMode(Definition.HaSyncMode haSyncMode) {
        this.haSyncMode = haSyncMode;
    }

    public Definition withHaSyncMode(Definition.HaSyncMode haSyncMode) {
        this.haSyncMode = haSyncMode;
        return this;
    }

    /**
     * Maximum number of messages in a queue.
     * Applied to queues.
     *
     * @return
     *     The maxLength
     */
    @JsonProperty("max-length")
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * Maximum number of messages in a queue.
     * Applied to queues.
     *
     * @param maxLength
     *     The max-length
     */
    @JsonProperty("max-length")
    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public Definition withMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Maximum number of bytes in a queue.
     * Applied to queues.
     *
     * @return
     *     The maxLengthBytes
     */
    @JsonProperty("max-length-bytes")
    public Long getMaxLengthBytes() {
        return maxLengthBytes;
    }

    /**
     * Maximum number of bytes in a queue.
     * Applied to queues.
     *
     * @param maxLengthBytes
     *     The max-length-bytes
     */
    @JsonProperty("max-length-bytes")
    public void setMaxLengthBytes(Long maxLengthBytes) {
        this.maxLengthBytes = maxLengthBytes;
    }

    public Definition withMaxLengthBytes(Long maxLengthBytes) {
        this.maxLengthBytes = maxLengthBytes;
        return this;
    }

    /**
     * Remove message if it remains in the queue for this number of milliseconds.
     * <p>
     * Sets the TTL on messages in a queue. Policy must be attached to a queue.
     * These messages are routed as dead letter messages after expiration.
     * Applied to queues.
     *
     * @return
     *     The messageTtl
     */
    @JsonProperty("message-ttl")
    public Long getMessageTtl() {
        return messageTtl;
    }

    /**
     * Remove message if it remains in the queue for this number of milliseconds.
     * <p>
     * Sets the TTL on messages in a queue. Policy must be attached to a queue.
     * These messages are routed as dead letter messages after expiration.
     * Applied to queues.
     *
     * @param messageTtl
     *     The message-ttl
     */
    @JsonProperty("message-ttl")
    public void setMessageTtl(Long messageTtl) {
        this.messageTtl = messageTtl;
    }

    public Definition withMessageTtl(Long messageTtl) {
        this.messageTtl = messageTtl;
        return this;
    }

    /**
     * Indicates how to elect the queue home node.
     * Applied to queues.
     *
     * @return
     *     The queueMasterLocator
     */
    @JsonProperty("queue-master-locator")
    public Definition.QueueMasterLocator getQueueMasterLocator() {
        return queueMasterLocator;
    }

    /**
     * Indicates how to elect the queue home node.
     * Applied to queues.
     *
     * @param queueMasterLocator
     *     The queue-master-locator
     */
    @JsonProperty("queue-master-locator")
    public void setQueueMasterLocator(Definition.QueueMasterLocator queueMasterLocator) {
        this.queueMasterLocator = queueMasterLocator;
    }

    public Definition withQueueMasterLocator(Definition.QueueMasterLocator queueMasterLocator) {
        this.queueMasterLocator = queueMasterLocator;
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

    public Definition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alternateExchange).append(deadLetterExchange).append(deadLetterRoutingKey).append(expires).append(haMode).append(haParams).append(haPromoteOnShutdown).append(haSyncBatchSize).append(haSyncMode).append(maxLength).append(maxLengthBytes).append(messageTtl).append(queueMasterLocator).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Definition) == false) {
            return false;
        }
        Definition rhs = ((Definition) other);
        return new EqualsBuilder().append(alternateExchange, rhs.alternateExchange).append(deadLetterExchange, rhs.deadLetterExchange).append(deadLetterRoutingKey, rhs.deadLetterRoutingKey).append(expires, rhs.expires).append(haMode, rhs.haMode).append(haParams, rhs.haParams).append(haPromoteOnShutdown, rhs.haPromoteOnShutdown).append(haSyncBatchSize, rhs.haSyncBatchSize).append(haSyncMode, rhs.haSyncMode).append(maxLength, rhs.maxLength).append(maxLengthBytes, rhs.maxLengthBytes).append(messageTtl, rhs.messageTtl).append(queueMasterLocator, rhs.queueMasterLocator).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum HaMode {

        ALL("all"),
        EXACTLY("exactly"),
        NODES("nodes");
        private final String value;
        private static Map<String, Definition.HaMode> constants = new HashMap<String, Definition.HaMode>();

        static {
            for (Definition.HaMode c: values()) {
                constants.put(c.value, c);
            }
        }

        private HaMode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Definition.HaMode fromValue(String value) {
            Definition.HaMode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum HaPromoteOnShutdown {

        WHEN_SYNCED("when-synced"),
        ALWAYS("always");
        private final String value;
        private static Map<String, Definition.HaPromoteOnShutdown> constants = new HashMap<String, Definition.HaPromoteOnShutdown>();

        static {
            for (Definition.HaPromoteOnShutdown c: values()) {
                constants.put(c.value, c);
            }
        }

        private HaPromoteOnShutdown(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Definition.HaPromoteOnShutdown fromValue(String value) {
            Definition.HaPromoteOnShutdown constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum HaSyncMode {

        AUTOMATIC("automatic"),
        MANUAL("manual");
        private final String value;
        private static Map<String, Definition.HaSyncMode> constants = new HashMap<String, Definition.HaSyncMode>();

        static {
            for (Definition.HaSyncMode c: values()) {
                constants.put(c.value, c);
            }
        }

        private HaSyncMode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Definition.HaSyncMode fromValue(String value) {
            Definition.HaSyncMode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum QueueMasterLocator {

        MIN_MASTERS("min-masters"),
        CLIENT_LOCAL("client-local"),
        RANDOM("random");
        private final String value;
        private static Map<String, Definition.QueueMasterLocator> constants = new HashMap<String, Definition.QueueMasterLocator>();

        static {
            for (Definition.QueueMasterLocator c: values()) {
                constants.put(c.value, c);
            }
        }

        private QueueMasterLocator(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Definition.QueueMasterLocator fromValue(String value) {
            Definition.QueueMasterLocator constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
