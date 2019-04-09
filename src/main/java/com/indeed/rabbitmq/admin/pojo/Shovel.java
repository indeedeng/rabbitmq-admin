
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
 * Defines a dynamic shovel. See https://www.rabbitmq.com/shovel-dynamic.html.
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
public class Shovel {

    /**
     * The virtual host that contains this dynamic shovel.
     *
     */
    @JsonProperty("vhost")
    private String vhost;
    /**
     * This field will always contain "shovel".
     *
     */
    @JsonProperty("component")
    private String component;
    /**
     * The name of the dynamic shovel.
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     * The shovel declaration.
     *
     */
    @JsonProperty("value")
    private ShovelArguments value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The virtual host that contains this dynamic shovel.
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public String getVhost() {
        return vhost;
    }

    /**
     * The virtual host that contains this dynamic shovel.
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public Shovel withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * This field will always contain "shovel".
     *
     * @return
     *     The component
     */
    @JsonProperty("component")
    public String getComponent() {
        return component;
    }

    /**
     * This field will always contain "shovel".
     *
     * @param component
     *     The component
     */
    @JsonProperty("component")
    public void setComponent(String component) {
        this.component = component;
    }

    public Shovel withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * The name of the dynamic shovel.
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the dynamic shovel.
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Shovel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The shovel declaration.
     *
     * @return
     *     The value
     */
    @JsonProperty("value")
    public ShovelArguments getValue() {
        return value;
    }

    /**
     * The shovel declaration.
     *
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(ShovelArguments value) {
        this.value = value;
    }

    public Shovel withValue(ShovelArguments value) {
        this.value = value;
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

    public Shovel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vhost).append(component).append(name).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shovel) == false) {
            return false;
        }
        Shovel rhs = ((Shovel) other);
        return new EqualsBuilder().append(vhost, rhs.vhost).append(component, rhs.component).append(name, rhs.name).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
