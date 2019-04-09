
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
 * Overview of a RabbitMQ virtual host.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "tracing",
    "messages",
    "messages_details",
    "messages_ready",
    "messages_ready_details",
    "messages_unacknowledged",
    "messages_unacknowledged_details",
    "recv_oct",
    "recv_oct_details",
    "send_oct",
    "send_oct_details",
    "message_stats"
})
public class VirtualHost {

    @JsonProperty("name")
    private String name;
    @JsonProperty("tracing")
    private Boolean tracing;
    @JsonProperty("messages")
    private Long messages;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("messages_details")
    private Details messagesDetails;
    @JsonProperty("messages_ready")
    private Long messagesReady;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("messages_ready_details")
    private Details messagesReadyDetails;
    @JsonProperty("messages_unacknowledged")
    private Long messagesUnacknowledged;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("messages_unacknowledged_details")
    private Details messagesUnacknowledgedDetails;
    @JsonProperty("recv_oct")
    private Long recvOct;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("recv_oct_details")
    private Details recvOctDetails;
    @JsonProperty("send_oct")
    private Long sendOct;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("send_oct_details")
    private Details sendOctDetails;
    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     */
    @JsonProperty("message_stats")
    private MessageStatistics messageStats;
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

    public VirtualHost withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The tracing
     */
    @JsonProperty("tracing")
    public Boolean getTracing() {
        return tracing;
    }

    /**
     *
     * @param tracing
     *     The tracing
     */
    @JsonProperty("tracing")
    public void setTracing(Boolean tracing) {
        this.tracing = tracing;
    }

    public VirtualHost withTracing(Boolean tracing) {
        this.tracing = tracing;
        return this;
    }

    /**
     *
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public Long getMessages() {
        return messages;
    }

    /**
     *
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(Long messages) {
        this.messages = messages;
    }

    public VirtualHost withMessages(Long messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The messagesDetails
     */
    @JsonProperty("messages_details")
    public Details getMessagesDetails() {
        return messagesDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param messagesDetails
     *     The messages_details
     */
    @JsonProperty("messages_details")
    public void setMessagesDetails(Details messagesDetails) {
        this.messagesDetails = messagesDetails;
    }

    public VirtualHost withMessagesDetails(Details messagesDetails) {
        this.messagesDetails = messagesDetails;
        return this;
    }

    /**
     *
     * @return
     *     The messagesReady
     */
    @JsonProperty("messages_ready")
    public Long getMessagesReady() {
        return messagesReady;
    }

    /**
     *
     * @param messagesReady
     *     The messages_ready
     */
    @JsonProperty("messages_ready")
    public void setMessagesReady(Long messagesReady) {
        this.messagesReady = messagesReady;
    }

    public VirtualHost withMessagesReady(Long messagesReady) {
        this.messagesReady = messagesReady;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The messagesReadyDetails
     */
    @JsonProperty("messages_ready_details")
    public Details getMessagesReadyDetails() {
        return messagesReadyDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param messagesReadyDetails
     *     The messages_ready_details
     */
    @JsonProperty("messages_ready_details")
    public void setMessagesReadyDetails(Details messagesReadyDetails) {
        this.messagesReadyDetails = messagesReadyDetails;
    }

    public VirtualHost withMessagesReadyDetails(Details messagesReadyDetails) {
        this.messagesReadyDetails = messagesReadyDetails;
        return this;
    }

    /**
     *
     * @return
     *     The messagesUnacknowledged
     */
    @JsonProperty("messages_unacknowledged")
    public Long getMessagesUnacknowledged() {
        return messagesUnacknowledged;
    }

    /**
     *
     * @param messagesUnacknowledged
     *     The messages_unacknowledged
     */
    @JsonProperty("messages_unacknowledged")
    public void setMessagesUnacknowledged(Long messagesUnacknowledged) {
        this.messagesUnacknowledged = messagesUnacknowledged;
    }

    public VirtualHost withMessagesUnacknowledged(Long messagesUnacknowledged) {
        this.messagesUnacknowledged = messagesUnacknowledged;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The messagesUnacknowledgedDetails
     */
    @JsonProperty("messages_unacknowledged_details")
    public Details getMessagesUnacknowledgedDetails() {
        return messagesUnacknowledgedDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param messagesUnacknowledgedDetails
     *     The messages_unacknowledged_details
     */
    @JsonProperty("messages_unacknowledged_details")
    public void setMessagesUnacknowledgedDetails(Details messagesUnacknowledgedDetails) {
        this.messagesUnacknowledgedDetails = messagesUnacknowledgedDetails;
    }

    public VirtualHost withMessagesUnacknowledgedDetails(Details messagesUnacknowledgedDetails) {
        this.messagesUnacknowledgedDetails = messagesUnacknowledgedDetails;
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

    public VirtualHost withRecvOct(Long recvOct) {
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

    public VirtualHost withRecvOctDetails(Details recvOctDetails) {
        this.recvOctDetails = recvOctDetails;
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

    public VirtualHost withSendOct(Long sendOct) {
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

    public VirtualHost withSendOctDetails(Details sendOctDetails) {
        this.sendOctDetails = sendOctDetails;
        return this;
    }

    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     * @return
     *     The messageStats
     */
    @JsonProperty("message_stats")
    public MessageStatistics getMessageStats() {
        return messageStats;
    }

    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     * @param messageStats
     *     The message_stats
     */
    @JsonProperty("message_stats")
    public void setMessageStats(MessageStatistics messageStats) {
        this.messageStats = messageStats;
    }

    public VirtualHost withMessageStats(MessageStatistics messageStats) {
        this.messageStats = messageStats;
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

    public VirtualHost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(tracing).append(messages).append(messagesDetails).append(messagesReady).append(messagesReadyDetails).append(messagesUnacknowledged).append(messagesUnacknowledgedDetails).append(recvOct).append(recvOctDetails).append(sendOct).append(sendOctDetails).append(messageStats).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualHost) == false) {
            return false;
        }
        VirtualHost rhs = ((VirtualHost) other);
        return new EqualsBuilder().append(name, rhs.name).append(tracing, rhs.tracing).append(messages, rhs.messages).append(messagesDetails, rhs.messagesDetails).append(messagesReady, rhs.messagesReady).append(messagesReadyDetails, rhs.messagesReadyDetails).append(messagesUnacknowledged, rhs.messagesUnacknowledged).append(messagesUnacknowledgedDetails, rhs.messagesUnacknowledgedDetails).append(recvOct, rhs.recvOct).append(recvOctDetails, rhs.recvOctDetails).append(sendOct, rhs.sendOct).append(sendOctDetails, rhs.sendOctDetails).append(messageStats, rhs.messageStats).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
