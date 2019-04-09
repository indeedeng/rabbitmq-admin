
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "peer_host",
    "peer_port"
})
public class ConnectionDetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("peer_host")
    private String peerHost;
    @JsonProperty("peer_port")
    private Long peerPort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ConnectionDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The peerHost
     */
    @JsonProperty("peer_host")
    public String getPeerHost() {
        return peerHost;
    }

    /**
     *
     * @param peerHost
     *     The peer_host
     */
    @JsonProperty("peer_host")
    public void setPeerHost(String peerHost) {
        this.peerHost = peerHost;
    }

    public ConnectionDetails withPeerHost(String peerHost) {
        this.peerHost = peerHost;
        return this;
    }

    /**
     *
     * @return
     *     The peerPort
     */
    @JsonProperty("peer_port")
    public Long getPeerPort() {
        return peerPort;
    }

    /**
     *
     * @param peerPort
     *     The peer_port
     */
    @JsonProperty("peer_port")
    public void setPeerPort(Long peerPort) {
        this.peerPort = peerPort;
    }

    public ConnectionDetails withPeerPort(Long peerPort) {
        this.peerPort = peerPort;
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

    public ConnectionDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(peerHost).append(peerPort).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionDetails) == false) {
            return false;
        }
        ConnectionDetails rhs = ((ConnectionDetails) other);
        return new EqualsBuilder().append(name, rhs.name).append(peerHost, rhs.peerHost).append(peerPort, rhs.peerPort).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
