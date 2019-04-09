
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
 * Totals of how many messages can be found in each message state.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "messages",
    "messages_details",
    "messages_ready",
    "messages_ready_details",
    "messages_unacknowledged",
    "messages_unacknowledged_details"
})
public class QueueTotals {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public QueueTotals withMessages(Long messages) {
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

    public QueueTotals withMessagesDetails(Details messagesDetails) {
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

    public QueueTotals withMessagesReady(Long messagesReady) {
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

    public QueueTotals withMessagesReadyDetails(Details messagesReadyDetails) {
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

    public QueueTotals withMessagesUnacknowledged(Long messagesUnacknowledged) {
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

    public QueueTotals withMessagesUnacknowledgedDetails(Details messagesUnacknowledgedDetails) {
        this.messagesUnacknowledgedDetails = messagesUnacknowledgedDetails;
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

    public QueueTotals withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(messages).append(messagesDetails).append(messagesReady).append(messagesReadyDetails).append(messagesUnacknowledged).append(messagesUnacknowledgedDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueueTotals) == false) {
            return false;
        }
        QueueTotals rhs = ((QueueTotals) other);
        return new EqualsBuilder().append(messages, rhs.messages).append(messagesDetails, rhs.messagesDetails).append(messagesReady, rhs.messagesReady).append(messagesReadyDetails, rhs.messagesReadyDetails).append(messagesUnacknowledged, rhs.messagesUnacknowledged).append(messagesUnacknowledgedDetails, rhs.messagesUnacknowledgedDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
