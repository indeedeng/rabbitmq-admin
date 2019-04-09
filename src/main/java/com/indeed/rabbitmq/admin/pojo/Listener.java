
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
 * Describes services that are listening to a RabbitMQ node.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "node",
    "protocol",
    "ip_address",
    "port"
})
public class Listener {

    @JsonProperty("node")
    private String node;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("port")
    private Long port;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Listener withNode(String node) {
        this.node = node;
        return this;
    }

    /**
     *
     * @return
     *     The protocol
     */
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     *
     * @param protocol
     *     The protocol
     */
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     *
     * @return
     *     The ipAddress
     */
    @JsonProperty("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     *
     * @param ipAddress
     *     The ip_address
     */
    @JsonProperty("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Listener withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     *
     * @return
     *     The port
     */
    @JsonProperty("port")
    public Long getPort() {
        return port;
    }

    /**
     *
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(Long port) {
        this.port = port;
    }

    public Listener withPort(Long port) {
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

    public Listener withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(node).append(protocol).append(ipAddress).append(port).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listener) == false) {
            return false;
        }
        Listener rhs = ((Listener) other);
        return new EqualsBuilder().append(node, rhs.node).append(protocol, rhs.protocol).append(ipAddress, rhs.ipAddress).append(port, rhs.port).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
