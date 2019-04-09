
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
 * Describes an existing exchange-to-exchange or exchange-to-queue binding.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "source",
    "vhost",
    "destination",
    "destination_type",
    "routing_key",
    "arguments",
    "properties_key"
})
public class Binding {

    /**
     * The name of the source from which messages are routed.
     * Will be the name of an exchange.
     *
     */
    @JsonProperty("source")
    private java.lang.String source;
    /**
     * The virtual host to which this binding belongs.
     *
     */
    @JsonProperty("vhost")
    private java.lang.String vhost;
    /**
     * The name of the destination to which messages are routed.
     * May be the name of an exchange or a queue.
     *
     */
    @JsonProperty("destination")
    private java.lang.String destination;
    /**
     * The RabbitMQ entity type of the destination.
     *
     */
    @JsonProperty("destination_type")
    private Binding.DestinationType destinationType;
    /**
     * The binding key to match against the message routing key to determine if this binding takes effect.
     *
     */
    @JsonProperty("routing_key")
    private java.lang.String routingKey;
    /**
     * Additional arguments that may apply to this binding.
     *
     */
    @JsonProperty("arguments")
    private Map<String, Object> arguments;
    /**
     * The properties key used to uniquely identify this binding for API calls.
     *
     */
    @JsonProperty("properties_key")
    private java.lang.String propertiesKey;
    @JsonIgnore
    private Map<java.lang.String, java.lang.Object> additionalProperties = new HashMap<java.lang.String, java.lang.Object>();

    /**
     * The name of the source from which messages are routed.
     * Will be the name of an exchange.
     *
     * @return
     *     The source
     */
    @JsonProperty("source")
    public java.lang.String getSource() {
        return source;
    }

    /**
     * The name of the source from which messages are routed.
     * Will be the name of an exchange.
     *
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public Binding withSource(java.lang.String source) {
        this.source = source;
        return this;
    }

    /**
     * The virtual host to which this binding belongs.
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public java.lang.String getVhost() {
        return vhost;
    }

    /**
     * The virtual host to which this binding belongs.
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(java.lang.String vhost) {
        this.vhost = vhost;
    }

    public Binding withVhost(java.lang.String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * The name of the destination to which messages are routed.
     * May be the name of an exchange or a queue.
     *
     * @return
     *     The destination
     */
    @JsonProperty("destination")
    public java.lang.String getDestination() {
        return destination;
    }

    /**
     * The name of the destination to which messages are routed.
     * May be the name of an exchange or a queue.
     *
     * @param destination
     *     The destination
     */
    @JsonProperty("destination")
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }

    public Binding withDestination(java.lang.String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * The RabbitMQ entity type of the destination.
     *
     * @return
     *     The destinationType
     */
    @JsonProperty("destination_type")
    public Binding.DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * The RabbitMQ entity type of the destination.
     *
     * @param destinationType
     *     The destination_type
     */
    @JsonProperty("destination_type")
    public void setDestinationType(Binding.DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    public Binding withDestinationType(Binding.DestinationType destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * The binding key to match against the message routing key to determine if this binding takes effect.
     *
     * @return
     *     The routingKey
     */
    @JsonProperty("routing_key")
    public java.lang.String getRoutingKey() {
        return routingKey;
    }

    /**
     * The binding key to match against the message routing key to determine if this binding takes effect.
     *
     * @param routingKey
     *     The routing_key
     */
    @JsonProperty("routing_key")
    public void setRoutingKey(java.lang.String routingKey) {
        this.routingKey = routingKey;
    }

    public Binding withRoutingKey(java.lang.String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    /**
     * Additional arguments that may apply to this binding.
     *
     * @return
     *     The arguments
     */
    @JsonProperty("arguments")
    public Map<String, Object> getArguments() {
        return arguments;
    }

    /**
     * Additional arguments that may apply to this binding.
     *
     * @param arguments
     *     The arguments
     */
    @JsonProperty("arguments")
    public void setArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
    }

    public Binding withArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * The properties key used to uniquely identify this binding for API calls.
     *
     * @return
     *     The propertiesKey
     */
    @JsonProperty("properties_key")
    public java.lang.String getPropertiesKey() {
        return propertiesKey;
    }

    /**
     * The properties key used to uniquely identify this binding for API calls.
     *
     * @param propertiesKey
     *     The properties_key
     */
    @JsonProperty("properties_key")
    public void setPropertiesKey(java.lang.String propertiesKey) {
        this.propertiesKey = propertiesKey;
    }

    public Binding withPropertiesKey(java.lang.String propertiesKey) {
        this.propertiesKey = propertiesKey;
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

    public Binding withAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source).append(vhost).append(destination).append(destinationType).append(routingKey).append(arguments).append(propertiesKey).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Binding) == false) {
            return false;
        }
        Binding rhs = ((Binding) other);
        return new EqualsBuilder().append(source, rhs.source).append(vhost, rhs.vhost).append(destination, rhs.destination).append(destinationType, rhs.destinationType).append(routingKey, rhs.routingKey).append(arguments, rhs.arguments).append(propertiesKey, rhs.propertiesKey).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum DestinationType {

        EXCHANGE("exchange"),
        QUEUE("queue");
        private final java.lang.String value;
        private static Map<java.lang.String, Binding.DestinationType> constants = new HashMap<java.lang.String, Binding.DestinationType>();

        static {
            for (Binding.DestinationType c: values()) {
                constants.put(c.value, c);
            }
        }

        private DestinationType(java.lang.String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public java.lang.String toString() {
            return this.value;
        }

        @JsonCreator
        public static Binding.DestinationType fromValue(java.lang.String value) {
            Binding.DestinationType constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
