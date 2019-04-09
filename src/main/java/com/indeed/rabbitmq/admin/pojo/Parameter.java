
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
 * Defines a parameter on a RabbitMQ component.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "vhost",
    "component",
    "name",
    "value"
})
public class Parameter {

    /**
     * The virtual host that contains this parameter.
     *
     */
    @JsonProperty("vhost")
    private java.lang.String vhost;
    /**
     * The component to which this parameter applies.
     *
     */
    @JsonProperty("component")
    private java.lang.String component;
    /**
     * The parameter name.
     *
     */
    @JsonProperty("name")
    private java.lang.String name;
    /**
     * The parameter value represented as a Map.
     *
     */
    @JsonProperty("value")
    private Map<String, Object> value;
    @JsonIgnore
    private Map<java.lang.String, java.lang.Object> additionalProperties = new HashMap<java.lang.String, java.lang.Object>();

    /**
     * The virtual host that contains this parameter.
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public java.lang.String getVhost() {
        return vhost;
    }

    /**
     * The virtual host that contains this parameter.
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(java.lang.String vhost) {
        this.vhost = vhost;
    }

    public Parameter withVhost(java.lang.String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * The component to which this parameter applies.
     *
     * @return
     *     The component
     */
    @JsonProperty("component")
    public java.lang.String getComponent() {
        return component;
    }

    /**
     * The component to which this parameter applies.
     *
     * @param component
     *     The component
     */
    @JsonProperty("component")
    public void setComponent(java.lang.String component) {
        this.component = component;
    }

    public Parameter withComponent(java.lang.String component) {
        this.component = component;
        return this;
    }

    /**
     * The parameter name.
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * The parameter name.
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Parameter withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
     * The parameter value represented as a Map.
     *
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Map<String, Object> getValue() {
        return value;
    }

    /**
     * The parameter value represented as a Map.
     *
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Map<String, Object> value) {
        this.value = value;
    }

    public Parameter withValue(Map<String, Object> value) {
        this.value = value;
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

    public Parameter withAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vhost).append(component).append(name).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameter) == false) {
            return false;
        }
        Parameter rhs = ((Parameter) other);
        return new EqualsBuilder().append(vhost, rhs.vhost).append(component, rhs.component).append(name, rhs.name).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
