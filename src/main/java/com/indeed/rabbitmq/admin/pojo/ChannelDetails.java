
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
    "connection_name",
    "peer_host",
    "peer_port",
    "user",
    "number"
})
public class ChannelDetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("connection_name")
    private String connectionName;
    @JsonProperty("peer_host")
    private String peerHost;
    @JsonProperty("peer_port")
    private Long peerPort;
    @JsonProperty("user")
    private String user;
    @JsonProperty("number")
    private Long number;
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

    public ChannelDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The connectionName
     */
    @JsonProperty("connection_name")
    public String getConnectionName() {
        return connectionName;
    }

    /**
     *
     * @param connectionName
     *     The connection_name
     */
    @JsonProperty("connection_name")
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public ChannelDetails withConnectionName(String connectionName) {
        this.connectionName = connectionName;
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

    public ChannelDetails withPeerHost(String peerHost) {
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

    public ChannelDetails withPeerPort(Long peerPort) {
        this.peerPort = peerPort;
        return this;
    }

    /**
     *
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public ChannelDetails withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     *
     * @return
     *     The number
     */
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    /**
     *
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(Long number) {
        this.number = number;
    }

    public ChannelDetails withNumber(Long number) {
        this.number = number;
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

    public ChannelDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(connectionName).append(peerHost).append(peerPort).append(user).append(number).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelDetails) == false) {
            return false;
        }
        ChannelDetails rhs = ((ChannelDetails) other);
        return new EqualsBuilder().append(name, rhs.name).append(connectionName, rhs.connectionName).append(peerHost, rhs.peerHost).append(peerPort, rhs.peerPort).append(user, rhs.user).append(number, rhs.number).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
