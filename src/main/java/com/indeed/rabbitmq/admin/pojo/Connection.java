
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
 * Describes a client connection to the RabbitMQ service.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "node",
    "user",
    "host",
    "port",
    "peer_host",
    "peer_port",
    "protocol",
    "vhost",
    "channels",
    "channel_max",
    "connected_at",
    "state",
    "type",
    "recv_cnt",
    "recv_oct",
    "recv_oct_details",
    "send_cnt",
    "send_oct",
    "send_oct_details",
    "send_pend",
    "frame_max",
    "timeout",
    "auth_mechanism",
    "peer_cert_issuer",
    "peer_cert_subject",
    "peer_cert_validity",
    "ssl",
    "ssl_cipher",
    "ssl_hash",
    "ssl_key_exchange",
    "ssl_protocol",
    "client_properties"
})
public class Connection {

    @JsonProperty("name")
    private String name;
    @JsonProperty("node")
    private String node;
    @JsonProperty("user")
    private String user;
    @JsonProperty("host")
    private String host;
    @JsonProperty("port")
    private Long port;
    @JsonProperty("peer_host")
    private String peerHost;
    @JsonProperty("peer_port")
    private Long peerPort;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("vhost")
    private String vhost;
    @JsonProperty("channels")
    private Long channels;
    @JsonProperty("channel_max")
    private Long channelMax;
    @JsonProperty("connected_at")
    private Long connectedAt;
    @JsonProperty("state")
    private String state;
    @JsonProperty("type")
    private String type;
    @JsonProperty("recv_cnt")
    private Long recvCnt;
    @JsonProperty("recv_oct")
    private Long recvOct;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("recv_oct_details")
    private Details recvOctDetails;
    @JsonProperty("send_cnt")
    private Long sendCnt;
    @JsonProperty("send_oct")
    private Long sendOct;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("send_oct_details")
    private Details sendOctDetails;
    @JsonProperty("send_pend")
    private Long sendPend;
    @JsonProperty("frame_max")
    private Long frameMax;
    @JsonProperty("timeout")
    private Long timeout;
    @JsonProperty("auth_mechanism")
    private String authMechanism;
    @JsonProperty("peer_cert_issuer")
    private String peerCertIssuer;
    @JsonProperty("peer_cert_subject")
    private String peerCertSubject;
    @JsonProperty("peer_cert_validity")
    private String peerCertValidity;
    @JsonProperty("ssl")
    private Boolean ssl;
    @JsonProperty("ssl_cipher")
    private String sslCipher;
    @JsonProperty("ssl_hash")
    private String sslHash;
    @JsonProperty("ssl_key_exchange")
    private String sslKeyExchange;
    @JsonProperty("ssl_protocol")
    private String sslProtocol;
    @JsonProperty("client_properties")
    private ClientProperties clientProperties;
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

    public Connection withName(String name) {
        this.name = name;
        return this;
    }

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

    public Connection withNode(String node) {
        this.node = node;
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

    public Connection withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     *
     * @return
     *     The host
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     *
     * @param host
     *     The host
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public Connection withHost(String host) {
        this.host = host;
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

    public Connection withPort(Long port) {
        this.port = port;
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

    public Connection withPeerHost(String peerHost) {
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

    public Connection withPeerPort(Long peerPort) {
        this.peerPort = peerPort;
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

    public Connection withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public String getVhost() {
        return vhost;
    }

    /**
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public Connection withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     *
     * @return
     *     The channels
     */
    @JsonProperty("channels")
    public Long getChannels() {
        return channels;
    }

    /**
     *
     * @param channels
     *     The channels
     */
    @JsonProperty("channels")
    public void setChannels(Long channels) {
        this.channels = channels;
    }

    public Connection withChannels(Long channels) {
        this.channels = channels;
        return this;
    }

    /**
     *
     * @return
     *     The channelMax
     */
    @JsonProperty("channel_max")
    public Long getChannelMax() {
        return channelMax;
    }

    /**
     *
     * @param channelMax
     *     The channel_max
     */
    @JsonProperty("channel_max")
    public void setChannelMax(Long channelMax) {
        this.channelMax = channelMax;
    }

    public Connection withChannelMax(Long channelMax) {
        this.channelMax = channelMax;
        return this;
    }

    /**
     *
     * @return
     *     The connectedAt
     */
    @JsonProperty("connected_at")
    public Long getConnectedAt() {
        return connectedAt;
    }

    /**
     *
     * @param connectedAt
     *     The connected_at
     */
    @JsonProperty("connected_at")
    public void setConnectedAt(Long connectedAt) {
        this.connectedAt = connectedAt;
    }

    public Connection withConnectedAt(Long connectedAt) {
        this.connectedAt = connectedAt;
        return this;
    }

    /**
     *
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Connection withState(String state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Connection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The recvCnt
     */
    @JsonProperty("recv_cnt")
    public Long getRecvCnt() {
        return recvCnt;
    }

    /**
     *
     * @param recvCnt
     *     The recv_cnt
     */
    @JsonProperty("recv_cnt")
    public void setRecvCnt(Long recvCnt) {
        this.recvCnt = recvCnt;
    }

    public Connection withRecvCnt(Long recvCnt) {
        this.recvCnt = recvCnt;
        return this;
    }

    /**
     *
     * @return
     *     The recvOct
     */
    @JsonProperty("recv_oct")
    public Long getRecvOct() {
        return recvOct;
    }

    /**
     *
     * @param recvOct
     *     The recv_oct
     */
    @JsonProperty("recv_oct")
    public void setRecvOct(Long recvOct) {
        this.recvOct = recvOct;
    }

    public Connection withRecvOct(Long recvOct) {
        this.recvOct = recvOct;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The recvOctDetails
     */
    @JsonProperty("recv_oct_details")
    public Details getRecvOctDetails() {
        return recvOctDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param recvOctDetails
     *     The recv_oct_details
     */
    @JsonProperty("recv_oct_details")
    public void setRecvOctDetails(Details recvOctDetails) {
        this.recvOctDetails = recvOctDetails;
    }

    public Connection withRecvOctDetails(Details recvOctDetails) {
        this.recvOctDetails = recvOctDetails;
        return this;
    }

    /**
     *
     * @return
     *     The sendCnt
     */
    @JsonProperty("send_cnt")
    public Long getSendCnt() {
        return sendCnt;
    }

    /**
     *
     * @param sendCnt
     *     The send_cnt
     */
    @JsonProperty("send_cnt")
    public void setSendCnt(Long sendCnt) {
        this.sendCnt = sendCnt;
    }

    public Connection withSendCnt(Long sendCnt) {
        this.sendCnt = sendCnt;
        return this;
    }

    /**
     *
     * @return
     *     The sendOct
     */
    @JsonProperty("send_oct")
    public Long getSendOct() {
        return sendOct;
    }

    /**
     *
     * @param sendOct
     *     The send_oct
     */
    @JsonProperty("send_oct")
    public void setSendOct(Long sendOct) {
        this.sendOct = sendOct;
    }

    public Connection withSendOct(Long sendOct) {
        this.sendOct = sendOct;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The sendOctDetails
     */
    @JsonProperty("send_oct_details")
    public Details getSendOctDetails() {
        return sendOctDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param sendOctDetails
     *     The send_oct_details
     */
    @JsonProperty("send_oct_details")
    public void setSendOctDetails(Details sendOctDetails) {
        this.sendOctDetails = sendOctDetails;
    }

    public Connection withSendOctDetails(Details sendOctDetails) {
        this.sendOctDetails = sendOctDetails;
        return this;
    }

    /**
     *
     * @return
     *     The sendPend
     */
    @JsonProperty("send_pend")
    public Long getSendPend() {
        return sendPend;
    }

    /**
     *
     * @param sendPend
     *     The send_pend
     */
    @JsonProperty("send_pend")
    public void setSendPend(Long sendPend) {
        this.sendPend = sendPend;
    }

    public Connection withSendPend(Long sendPend) {
        this.sendPend = sendPend;
        return this;
    }

    /**
     *
     * @return
     *     The frameMax
     */
    @JsonProperty("frame_max")
    public Long getFrameMax() {
        return frameMax;
    }

    /**
     *
     * @param frameMax
     *     The frame_max
     */
    @JsonProperty("frame_max")
    public void setFrameMax(Long frameMax) {
        this.frameMax = frameMax;
    }

    public Connection withFrameMax(Long frameMax) {
        this.frameMax = frameMax;
        return this;
    }

    /**
     *
     * @return
     *     The timeout
     */
    @JsonProperty("timeout")
    public Long getTimeout() {
        return timeout;
    }

    /**
     *
     * @param timeout
     *     The timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public Connection withTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     *
     * @return
     *     The authMechanism
     */
    @JsonProperty("auth_mechanism")
    public String getAuthMechanism() {
        return authMechanism;
    }

    /**
     *
     * @param authMechanism
     *     The auth_mechanism
     */
    @JsonProperty("auth_mechanism")
    public void setAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
    }

    public Connection withAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
        return this;
    }

    /**
     *
     * @return
     *     The peerCertIssuer
     */
    @JsonProperty("peer_cert_issuer")
    public String getPeerCertIssuer() {
        return peerCertIssuer;
    }

    /**
     *
     * @param peerCertIssuer
     *     The peer_cert_issuer
     */
    @JsonProperty("peer_cert_issuer")
    public void setPeerCertIssuer(String peerCertIssuer) {
        this.peerCertIssuer = peerCertIssuer;
    }

    public Connection withPeerCertIssuer(String peerCertIssuer) {
        this.peerCertIssuer = peerCertIssuer;
        return this;
    }

    /**
     *
     * @return
     *     The peerCertSubject
     */
    @JsonProperty("peer_cert_subject")
    public String getPeerCertSubject() {
        return peerCertSubject;
    }

    /**
     *
     * @param peerCertSubject
     *     The peer_cert_subject
     */
    @JsonProperty("peer_cert_subject")
    public void setPeerCertSubject(String peerCertSubject) {
        this.peerCertSubject = peerCertSubject;
    }

    public Connection withPeerCertSubject(String peerCertSubject) {
        this.peerCertSubject = peerCertSubject;
        return this;
    }

    /**
     *
     * @return
     *     The peerCertValidity
     */
    @JsonProperty("peer_cert_validity")
    public String getPeerCertValidity() {
        return peerCertValidity;
    }

    /**
     *
     * @param peerCertValidity
     *     The peer_cert_validity
     */
    @JsonProperty("peer_cert_validity")
    public void setPeerCertValidity(String peerCertValidity) {
        this.peerCertValidity = peerCertValidity;
    }

    public Connection withPeerCertValidity(String peerCertValidity) {
        this.peerCertValidity = peerCertValidity;
        return this;
    }

    /**
     *
     * @return
     *     The ssl
     */
    @JsonProperty("ssl")
    public Boolean getSsl() {
        return ssl;
    }

    /**
     *
     * @param ssl
     *     The ssl
     */
    @JsonProperty("ssl")
    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

    public Connection withSsl(Boolean ssl) {
        this.ssl = ssl;
        return this;
    }

    /**
     *
     * @return
     *     The sslCipher
     */
    @JsonProperty("ssl_cipher")
    public String getSslCipher() {
        return sslCipher;
    }

    /**
     *
     * @param sslCipher
     *     The ssl_cipher
     */
    @JsonProperty("ssl_cipher")
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public Connection withSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
        return this;
    }

    /**
     *
     * @return
     *     The sslHash
     */
    @JsonProperty("ssl_hash")
    public String getSslHash() {
        return sslHash;
    }

    /**
     *
     * @param sslHash
     *     The ssl_hash
     */
    @JsonProperty("ssl_hash")
    public void setSslHash(String sslHash) {
        this.sslHash = sslHash;
    }

    public Connection withSslHash(String sslHash) {
        this.sslHash = sslHash;
        return this;
    }

    /**
     *
     * @return
     *     The sslKeyExchange
     */
    @JsonProperty("ssl_key_exchange")
    public String getSslKeyExchange() {
        return sslKeyExchange;
    }

    /**
     *
     * @param sslKeyExchange
     *     The ssl_key_exchange
     */
    @JsonProperty("ssl_key_exchange")
    public void setSslKeyExchange(String sslKeyExchange) {
        this.sslKeyExchange = sslKeyExchange;
    }

    public Connection withSslKeyExchange(String sslKeyExchange) {
        this.sslKeyExchange = sslKeyExchange;
        return this;
    }

    /**
     *
     * @return
     *     The sslProtocol
     */
    @JsonProperty("ssl_protocol")
    public String getSslProtocol() {
        return sslProtocol;
    }

    /**
     *
     * @param sslProtocol
     *     The ssl_protocol
     */
    @JsonProperty("ssl_protocol")
    public void setSslProtocol(String sslProtocol) {
        this.sslProtocol = sslProtocol;
    }

    public Connection withSslProtocol(String sslProtocol) {
        this.sslProtocol = sslProtocol;
        return this;
    }

    /**
     *
     * @return
     *     The clientProperties
     */
    @JsonProperty("client_properties")
    public ClientProperties getClientProperties() {
        return clientProperties;
    }

    /**
     *
     * @param clientProperties
     *     The client_properties
     */
    @JsonProperty("client_properties")
    public void setClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    public Connection withClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
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

    public Connection withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(node).append(user).append(host).append(port).append(peerHost).append(peerPort).append(protocol).append(vhost).append(channels).append(channelMax).append(connectedAt).append(state).append(type).append(recvCnt).append(recvOct).append(recvOctDetails).append(sendCnt).append(sendOct).append(sendOctDetails).append(sendPend).append(frameMax).append(timeout).append(authMechanism).append(peerCertIssuer).append(peerCertSubject).append(peerCertValidity).append(ssl).append(sslCipher).append(sslHash).append(sslKeyExchange).append(sslProtocol).append(clientProperties).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connection) == false) {
            return false;
        }
        Connection rhs = ((Connection) other);
        return new EqualsBuilder().append(name, rhs.name).append(node, rhs.node).append(user, rhs.user).append(host, rhs.host).append(port, rhs.port).append(peerHost, rhs.peerHost).append(peerPort, rhs.peerPort).append(protocol, rhs.protocol).append(vhost, rhs.vhost).append(channels, rhs.channels).append(channelMax, rhs.channelMax).append(connectedAt, rhs.connectedAt).append(state, rhs.state).append(type, rhs.type).append(recvCnt, rhs.recvCnt).append(recvOct, rhs.recvOct).append(recvOctDetails, rhs.recvOctDetails).append(sendCnt, rhs.sendCnt).append(sendOct, rhs.sendOct).append(sendOctDetails, rhs.sendOctDetails).append(sendPend, rhs.sendPend).append(frameMax, rhs.frameMax).append(timeout, rhs.timeout).append(authMechanism, rhs.authMechanism).append(peerCertIssuer, rhs.peerCertIssuer).append(peerCertSubject, rhs.peerCertSubject).append(peerCertValidity, rhs.peerCertValidity).append(ssl, rhs.ssl).append(sslCipher, rhs.sslCipher).append(sslHash, rhs.sslHash).append(sslKeyExchange, rhs.sslKeyExchange).append(sslProtocol, rhs.sslProtocol).append(clientProperties, rhs.clientProperties).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
