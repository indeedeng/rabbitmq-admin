
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
 * Rates and counts of incoming, delivered and published messages.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ack",
    "ack_details",
    "confirm",
    "confirm_details",
    "deliver",
    "deliver_details",
    "deliver_get",
    "deliver_get_details",
    "publish",
    "publish_details",
    "redeliver",
    "redeliver_details"
})
public class MessageStatistics {

    @JsonProperty("ack")
    private Long ack;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("ack_details")
    private Details ackDetails;
    @JsonProperty("confirm")
    private Long confirm;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("confirm_details")
    private Details confirmDetails;
    @JsonProperty("deliver")
    private Long deliver;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("deliver_details")
    private Details deliverDetails;
    @JsonProperty("deliver_get")
    private Long deliverGet;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("deliver_get_details")
    private Details deliverGetDetails;
    @JsonProperty("publish")
    private Long publish;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("publish_details")
    private Details publishDetails;
    @JsonProperty("redeliver")
    private Long redeliver;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("redeliver_details")
    private Details redeliverDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The ack
     */
    @JsonProperty("ack")
    public Long getAck() {
        return ack;
    }

    /**
     *
     * @param ack
     *     The ack
     */
    @JsonProperty("ack")
    public void setAck(Long ack) {
        this.ack = ack;
    }

    public MessageStatistics withAck(Long ack) {
        this.ack = ack;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ackDetails
     */
    @JsonProperty("ack_details")
    public Details getAckDetails() {
        return ackDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ackDetails
     *     The ack_details
     */
    @JsonProperty("ack_details")
    public void setAckDetails(Details ackDetails) {
        this.ackDetails = ackDetails;
    }

    public MessageStatistics withAckDetails(Details ackDetails) {
        this.ackDetails = ackDetails;
        return this;
    }

    /**
     *
     * @return
     *     The confirm
     */
    @JsonProperty("confirm")
    public Long getConfirm() {
        return confirm;
    }

    /**
     *
     * @param confirm
     *     The confirm
     */
    @JsonProperty("confirm")
    public void setConfirm(Long confirm) {
        this.confirm = confirm;
    }

    public MessageStatistics withConfirm(Long confirm) {
        this.confirm = confirm;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The confirmDetails
     */
    @JsonProperty("confirm_details")
    public Details getConfirmDetails() {
        return confirmDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param confirmDetails
     *     The confirm_details
     */
    @JsonProperty("confirm_details")
    public void setConfirmDetails(Details confirmDetails) {
        this.confirmDetails = confirmDetails;
    }

    public MessageStatistics withConfirmDetails(Details confirmDetails) {
        this.confirmDetails = confirmDetails;
        return this;
    }

    /**
     *
     * @return
     *     The deliver
     */
    @JsonProperty("deliver")
    public Long getDeliver() {
        return deliver;
    }

    /**
     *
     * @param deliver
     *     The deliver
     */
    @JsonProperty("deliver")
    public void setDeliver(Long deliver) {
        this.deliver = deliver;
    }

    public MessageStatistics withDeliver(Long deliver) {
        this.deliver = deliver;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The deliverDetails
     */
    @JsonProperty("deliver_details")
    public Details getDeliverDetails() {
        return deliverDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param deliverDetails
     *     The deliver_details
     */
    @JsonProperty("deliver_details")
    public void setDeliverDetails(Details deliverDetails) {
        this.deliverDetails = deliverDetails;
    }

    public MessageStatistics withDeliverDetails(Details deliverDetails) {
        this.deliverDetails = deliverDetails;
        return this;
    }

    /**
     *
     * @return
     *     The deliverGet
     */
    @JsonProperty("deliver_get")
    public Long getDeliverGet() {
        return deliverGet;
    }

    /**
     *
     * @param deliverGet
     *     The deliver_get
     */
    @JsonProperty("deliver_get")
    public void setDeliverGet(Long deliverGet) {
        this.deliverGet = deliverGet;
    }

    public MessageStatistics withDeliverGet(Long deliverGet) {
        this.deliverGet = deliverGet;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The deliverGetDetails
     */
    @JsonProperty("deliver_get_details")
    public Details getDeliverGetDetails() {
        return deliverGetDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param deliverGetDetails
     *     The deliver_get_details
     */
    @JsonProperty("deliver_get_details")
    public void setDeliverGetDetails(Details deliverGetDetails) {
        this.deliverGetDetails = deliverGetDetails;
    }

    public MessageStatistics withDeliverGetDetails(Details deliverGetDetails) {
        this.deliverGetDetails = deliverGetDetails;
        return this;
    }

    /**
     *
     * @return
     *     The publish
     */
    @JsonProperty("publish")
    public Long getPublish() {
        return publish;
    }

    /**
     *
     * @param publish
     *     The publish
     */
    @JsonProperty("publish")
    public void setPublish(Long publish) {
        this.publish = publish;
    }

    public MessageStatistics withPublish(Long publish) {
        this.publish = publish;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The publishDetails
     */
    @JsonProperty("publish_details")
    public Details getPublishDetails() {
        return publishDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param publishDetails
     *     The publish_details
     */
    @JsonProperty("publish_details")
    public void setPublishDetails(Details publishDetails) {
        this.publishDetails = publishDetails;
    }

    public MessageStatistics withPublishDetails(Details publishDetails) {
        this.publishDetails = publishDetails;
        return this;
    }

    /**
     *
     * @return
     *     The redeliver
     */
    @JsonProperty("redeliver")
    public Long getRedeliver() {
        return redeliver;
    }

    /**
     *
     * @param redeliver
     *     The redeliver
     */
    @JsonProperty("redeliver")
    public void setRedeliver(Long redeliver) {
        this.redeliver = redeliver;
    }

    public MessageStatistics withRedeliver(Long redeliver) {
        this.redeliver = redeliver;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The redeliverDetails
     */
    @JsonProperty("redeliver_details")
    public Details getRedeliverDetails() {
        return redeliverDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param redeliverDetails
     *     The redeliver_details
     */
    @JsonProperty("redeliver_details")
    public void setRedeliverDetails(Details redeliverDetails) {
        this.redeliverDetails = redeliverDetails;
    }

    public MessageStatistics withRedeliverDetails(Details redeliverDetails) {
        this.redeliverDetails = redeliverDetails;
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

    public MessageStatistics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ack).append(ackDetails).append(confirm).append(confirmDetails).append(deliver).append(deliverDetails).append(deliverGet).append(deliverGetDetails).append(publish).append(publishDetails).append(redeliver).append(redeliverDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessageStatistics) == false) {
            return false;
        }
        MessageStatistics rhs = ((MessageStatistics) other);
        return new EqualsBuilder().append(ack, rhs.ack).append(ackDetails, rhs.ackDetails).append(confirm, rhs.confirm).append(confirmDetails, rhs.confirmDetails).append(deliver, rhs.deliver).append(deliverDetails, rhs.deliverDetails).append(deliverGet, rhs.deliverGet).append(deliverGetDetails, rhs.deliverGetDetails).append(publish, rhs.publish).append(publishDetails, rhs.publishDetails).append(redeliver, rhs.redeliver).append(redeliverDetails, rhs.redeliverDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
