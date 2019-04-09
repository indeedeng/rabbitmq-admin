
package com.indeed.rabbitmq.admin.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * The shovel declaration.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "src-uri",
    "src-queue",
    "src-exchange",
    "src-exchange-key",
    "dest-uri",
    "dest-queue",
    "dest-exchange",
    "dest-exchange-key",
    "prefetch-count",
    "reconnect-delay",
    "add-forward-headers",
    "ack-mode",
    "delete-after"
})
public class ShovelArguments {

    /**
     * The AMQP URIs for the source RabbitMQ services.
     *
     */
    @JsonProperty("src-uri")
    private List<String> srcUri = new ArrayList<String>();
    /**
     * The queue to consume.
     * If defined then "src-exchange" must be undefined.
     *
     */
    @JsonProperty("src-queue")
    private String srcQueue;
    /**
     * The exchange to consume.
     * If defined then "src-queue" must be undefined.
     *
     */
    @JsonProperty("src-exchange")
    private String srcExchange;
    /**
     * The routing key when using "src-exchange".
     *
     */
    @JsonProperty("src-exchange-key")
    private String srcExchangeKey;
    /**
     * The AMQP URIs for the destination RabbitMQ services.
     *
     */
    @JsonProperty("dest-uri")
    private List<String> destUri = new ArrayList<String>();
    /**
     * The queue to which messages should be published.
     * If defined then "dest-exchange" must be undefined.
     *
     */
    @JsonProperty("dest-queue")
    private String destQueue;
    /**
     * The exchange to which message should be published.
     * If defined then "dest-queue" must be undefined.
     *
     */
    @JsonProperty("dest-exchange")
    private String destExchange;
    /**
     * The routing key to use when using "dest-exchange".
     * If undefined the routing key on the original message is used.
     *
     */
    @JsonProperty("dest-exchange-key")
    private String destExchangeKey;
    /**
     * The maximum number of unconfirmed messages to copy over this shovel.
     *
     */
    @JsonProperty("prefetch-count")
    private Long prefetchCount;
    /**
     * The duration, in seconds, to wait to reconnect to a broker after being disconnected.
     *
     */
    @JsonProperty("reconnect-delay")
    private Long reconnectDelay;
    /**
     * If true then add "x-shovelled" headers to each shovelled message.
     *
     */
    @JsonProperty("add-forward-headers")
    private Boolean addForwardHeaders;
    /**
     * Determines how the shovel should acknowledge messages.
     *
     */
    @JsonProperty("ack-mode")
    private ShovelArguments.AckMode ackMode;
    /**
     * Determines when (if ever) the shovel should delete itself.
     * If "never" then the shovel will never delete itself.
     * If "queue-length" the shovel transfers the number of
     * messages that existed in the queue when it started up.
     * An integer indicates the number of messages to transfer.
     *
     */
    @JsonProperty("delete-after")
    private String deleteAfter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The AMQP URIs for the source RabbitMQ services.
     *
     * @return
     *     The srcUri
     */
    @JsonProperty("src-uri")
    public List<String> getSrcUri() {
        return srcUri;
    }

    /**
     * The AMQP URIs for the source RabbitMQ services.
     *
     * @param srcUri
     *     The src-uri
     */
    @JsonProperty("src-uri")
    public void setSrcUri(List<String> srcUri) {
        this.srcUri = srcUri;
    }

    public ShovelArguments withSrcUri(List<String> srcUri) {
        this.srcUri = srcUri;
        return this;
    }

    /**
     * The queue to consume.
     * If defined then "src-exchange" must be undefined.
     *
     * @return
     *     The srcQueue
     */
    @JsonProperty("src-queue")
    public String getSrcQueue() {
        return srcQueue;
    }

    /**
     * The queue to consume.
     * If defined then "src-exchange" must be undefined.
     *
     * @param srcQueue
     *     The src-queue
     */
    @JsonProperty("src-queue")
    public void setSrcQueue(String srcQueue) {
        this.srcQueue = srcQueue;
    }

    public ShovelArguments withSrcQueue(String srcQueue) {
        this.srcQueue = srcQueue;
        return this;
    }

    /**
     * The exchange to consume.
     * If defined then "src-queue" must be undefined.
     *
     * @return
     *     The srcExchange
     */
    @JsonProperty("src-exchange")
    public String getSrcExchange() {
        return srcExchange;
    }

    /**
     * The exchange to consume.
     * If defined then "src-queue" must be undefined.
     *
     * @param srcExchange
     *     The src-exchange
     */
    @JsonProperty("src-exchange")
    public void setSrcExchange(String srcExchange) {
        this.srcExchange = srcExchange;
    }

    public ShovelArguments withSrcExchange(String srcExchange) {
        this.srcExchange = srcExchange;
        return this;
    }

    /**
     * The routing key when using "src-exchange".
     *
     * @return
     *     The srcExchangeKey
     */
    @JsonProperty("src-exchange-key")
    public String getSrcExchangeKey() {
        return srcExchangeKey;
    }

    /**
     * The routing key when using "src-exchange".
     *
     * @param srcExchangeKey
     *     The src-exchange-key
     */
    @JsonProperty("src-exchange-key")
    public void setSrcExchangeKey(String srcExchangeKey) {
        this.srcExchangeKey = srcExchangeKey;
    }

    public ShovelArguments withSrcExchangeKey(String srcExchangeKey) {
        this.srcExchangeKey = srcExchangeKey;
        return this;
    }

    /**
     * The AMQP URIs for the destination RabbitMQ services.
     *
     * @return
     *     The destUri
     */
    @JsonProperty("dest-uri")
    public List<String> getDestUri() {
        return destUri;
    }

    /**
     * The AMQP URIs for the destination RabbitMQ services.
     *
     * @param destUri
     *     The dest-uri
     */
    @JsonProperty("dest-uri")
    public void setDestUri(List<String> destUri) {
        this.destUri = destUri;
    }

    public ShovelArguments withDestUri(List<String> destUri) {
        this.destUri = destUri;
        return this;
    }

    /**
     * The queue to which messages should be published.
     * If defined then "dest-exchange" must be undefined.
     *
     * @return
     *     The destQueue
     */
    @JsonProperty("dest-queue")
    public String getDestQueue() {
        return destQueue;
    }

    /**
     * The queue to which messages should be published.
     * If defined then "dest-exchange" must be undefined.
     *
     * @param destQueue
     *     The dest-queue
     */
    @JsonProperty("dest-queue")
    public void setDestQueue(String destQueue) {
        this.destQueue = destQueue;
    }

    public ShovelArguments withDestQueue(String destQueue) {
        this.destQueue = destQueue;
        return this;
    }

    /**
     * The exchange to which message should be published.
     * If defined then "dest-queue" must be undefined.
     *
     * @return
     *     The destExchange
     */
    @JsonProperty("dest-exchange")
    public String getDestExchange() {
        return destExchange;
    }

    /**
     * The exchange to which message should be published.
     * If defined then "dest-queue" must be undefined.
     *
     * @param destExchange
     *     The dest-exchange
     */
    @JsonProperty("dest-exchange")
    public void setDestExchange(String destExchange) {
        this.destExchange = destExchange;
    }

    public ShovelArguments withDestExchange(String destExchange) {
        this.destExchange = destExchange;
        return this;
    }

    /**
     * The routing key to use when using "dest-exchange".
     * If undefined the routing key on the original message is used.
     *
     * @return
     *     The destExchangeKey
     */
    @JsonProperty("dest-exchange-key")
    public String getDestExchangeKey() {
        return destExchangeKey;
    }

    /**
     * The routing key to use when using "dest-exchange".
     * If undefined the routing key on the original message is used.
     *
     * @param destExchangeKey
     *     The dest-exchange-key
     */
    @JsonProperty("dest-exchange-key")
    public void setDestExchangeKey(String destExchangeKey) {
        this.destExchangeKey = destExchangeKey;
    }

    public ShovelArguments withDestExchangeKey(String destExchangeKey) {
        this.destExchangeKey = destExchangeKey;
        return this;
    }

    /**
     * The maximum number of unconfirmed messages to copy over this shovel.
     *
     * @return
     *     The prefetchCount
     */
    @JsonProperty("prefetch-count")
    public Long getPrefetchCount() {
        return prefetchCount;
    }

    /**
     * The maximum number of unconfirmed messages to copy over this shovel.
     *
     * @param prefetchCount
     *     The prefetch-count
     */
    @JsonProperty("prefetch-count")
    public void setPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    public ShovelArguments withPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }

    /**
     * The duration, in seconds, to wait to reconnect to a broker after being disconnected.
     *
     * @return
     *     The reconnectDelay
     */
    @JsonProperty("reconnect-delay")
    public Long getReconnectDelay() {
        return reconnectDelay;
    }

    /**
     * The duration, in seconds, to wait to reconnect to a broker after being disconnected.
     *
     * @param reconnectDelay
     *     The reconnect-delay
     */
    @JsonProperty("reconnect-delay")
    public void setReconnectDelay(Long reconnectDelay) {
        this.reconnectDelay = reconnectDelay;
    }

    public ShovelArguments withReconnectDelay(Long reconnectDelay) {
        this.reconnectDelay = reconnectDelay;
        return this;
    }

    /**
     * If true then add "x-shovelled" headers to each shovelled message.
     *
     * @return
     *     The addForwardHeaders
     */
    @JsonProperty("add-forward-headers")
    public Boolean getAddForwardHeaders() {
        return addForwardHeaders;
    }

    /**
     * If true then add "x-shovelled" headers to each shovelled message.
     *
     * @param addForwardHeaders
     *     The add-forward-headers
     */
    @JsonProperty("add-forward-headers")
    public void setAddForwardHeaders(Boolean addForwardHeaders) {
        this.addForwardHeaders = addForwardHeaders;
    }

    public ShovelArguments withAddForwardHeaders(Boolean addForwardHeaders) {
        this.addForwardHeaders = addForwardHeaders;
        return this;
    }

    /**
     * Determines how the shovel should acknowledge messages.
     *
     * @return
     *     The ackMode
     */
    @JsonProperty("ack-mode")
    public ShovelArguments.AckMode getAckMode() {
        return ackMode;
    }

    /**
     * Determines how the shovel should acknowledge messages.
     *
     * @param ackMode
     *     The ack-mode
     */
    @JsonProperty("ack-mode")
    public void setAckMode(ShovelArguments.AckMode ackMode) {
        this.ackMode = ackMode;
    }

    public ShovelArguments withAckMode(ShovelArguments.AckMode ackMode) {
        this.ackMode = ackMode;
        return this;
    }

    /**
     * Determines when (if ever) the shovel should delete itself.
     * If "never" then the shovel will never delete itself.
     * If "queue-length" the shovel transfers the number of
     * messages that existed in the queue when it started up.
     * An integer indicates the number of messages to transfer.
     *
     * @return
     *     The deleteAfter
     */
    @JsonProperty("delete-after")
    public String getDeleteAfter() {
        return deleteAfter;
    }

    /**
     * Determines when (if ever) the shovel should delete itself.
     * If "never" then the shovel will never delete itself.
     * If "queue-length" the shovel transfers the number of
     * messages that existed in the queue when it started up.
     * An integer indicates the number of messages to transfer.
     *
     * @param deleteAfter
     *     The delete-after
     */
    @JsonProperty("delete-after")
    public void setDeleteAfter(String deleteAfter) {
        this.deleteAfter = deleteAfter;
    }

    public ShovelArguments withDeleteAfter(String deleteAfter) {
        this.deleteAfter = deleteAfter;
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

    public ShovelArguments withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(srcUri).append(srcQueue).append(srcExchange).append(srcExchangeKey).append(destUri).append(destQueue).append(destExchange).append(destExchangeKey).append(prefetchCount).append(reconnectDelay).append(addForwardHeaders).append(ackMode).append(deleteAfter).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShovelArguments) == false) {
            return false;
        }
        ShovelArguments rhs = ((ShovelArguments) other);
        return new EqualsBuilder().append(srcUri, rhs.srcUri).append(srcQueue, rhs.srcQueue).append(srcExchange, rhs.srcExchange).append(srcExchangeKey, rhs.srcExchangeKey).append(destUri, rhs.destUri).append(destQueue, rhs.destQueue).append(destExchange, rhs.destExchange).append(destExchangeKey, rhs.destExchangeKey).append(prefetchCount, rhs.prefetchCount).append(reconnectDelay, rhs.reconnectDelay).append(addForwardHeaders, rhs.addForwardHeaders).append(ackMode, rhs.ackMode).append(deleteAfter, rhs.deleteAfter).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum AckMode {

        ON_CONFIRM("on-confirm"),
        ON_PUBLISH("on-publish"),
        NO_ACK("no-ack");
        private final String value;
        private static Map<String, ShovelArguments.AckMode> constants = new HashMap<String, ShovelArguments.AckMode>();

        static {
            for (ShovelArguments.AckMode c: values()) {
                constants.put(c.value, c);
            }
        }

        private AckMode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ShovelArguments.AckMode fromValue(String value) {
            ShovelArguments.AckMode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
