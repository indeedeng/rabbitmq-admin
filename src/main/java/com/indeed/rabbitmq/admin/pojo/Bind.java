
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
 * Definition of a binding to create from an exchange to an exchange or queue.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "routing_key",
    "arguments"
})
public class Bind {

    /**
     * The binding key or binding pattern.
     * <p>
     * How this value is applied to the message routing key is dependent on the type of the source exchange.
     *
     */
    @JsonProperty("routing_key")
    private java.lang.String routingKey;
    /**
     * Additional arguments to apply to the binding being created.
     *
     */
    @JsonProperty("arguments")
    private Map<String, Object> arguments;
    @JsonIgnore
    private Map<java.lang.String, java.lang.Object> additionalProperties = new HashMap<java.lang.String, java.lang.Object>();

    /**
     * The binding key or binding pattern.
     * <p>
     * How this value is applied to the message routing key is dependent on the type of the source exchange.
     *
     * @return
     *     The routingKey
     */
    @JsonProperty("routing_key")
    public java.lang.String getRoutingKey() {
        return routingKey;
    }

    /**
     * The binding key or binding pattern.
     * <p>
     * How this value is applied to the message routing key is dependent on the type of the source exchange.
     *
     * @param routingKey
     *     The routing_key
     */
    @JsonProperty("routing_key")
    public void setRoutingKey(java.lang.String routingKey) {
        this.routingKey = routingKey;
    }

    public Bind withRoutingKey(java.lang.String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    /**
     * Additional arguments to apply to the binding being created.
     *
     * @return
     *     The arguments
     */
    @JsonProperty("arguments")
    public Map<String, Object> getArguments() {
        return arguments;
    }

    /**
     * Additional arguments to apply to the binding being created.
     *
     * @param arguments
     *     The arguments
     */
    @JsonProperty("arguments")
    public void setArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
    }

    public Bind withArguments(Map<String, Object> arguments) {
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

    public Bind withAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(routingKey).append(arguments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bind) == false) {
            return false;
        }
        Bind rhs = ((Bind) other);
        return new EqualsBuilder().append(routingKey, rhs.routingKey).append(arguments, rhs.arguments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
