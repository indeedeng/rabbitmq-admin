
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
 * A context under which a RabbitMQ node is executing.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "node",
    "description",
    "path",
    "port"
})
public class Context {

    /**
     * The node to which this context applies.
     *
     */
    @JsonProperty("node")
    private String node;
    /**
     * A description of this context.
     *
     */
    @JsonProperty("description")
    private String description;
    /**
     * The context path.
     *
     */
    @JsonProperty("path")
    private String path;
    /**
     * The context port.
     *
     */
    @JsonProperty("port")
    private String port;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The node to which this context applies.
     *
     * @return
     *     The node
     */
    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    /**
     * The node to which this context applies.
     *
     * @param node
     *     The node
     */
    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    public Context withNode(String node) {
        this.node = node;
        return this;
    }

    /**
     * A description of this context.
     *
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description of this context.
     *
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Context withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The context path.
     *
     * @return
     *     The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * The context path.
     *
     * @param path
     *     The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public Context withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The context port.
     *
     * @return
     *     The port
     */
    @JsonProperty("port")
    public String getPort() {
        return port;
    }

    /**
     * The context port.
     *
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(String port) {
        this.port = port;
    }

    public Context withPort(String port) {
        this.port = port;
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

    public Context withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(node).append(description).append(path).append(port).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Context) == false) {
            return false;
        }
        Context rhs = ((Context) other);
        return new EqualsBuilder().append(node, rhs.node).append(description, rhs.description).append(path, rhs.path).append(port, rhs.port).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
