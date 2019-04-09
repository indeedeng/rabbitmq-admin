
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
    "confirm",
    "confirm_details",
    "publish_in",
    "publish_in_details",
    "publish_out",
    "publish_out_details"
})
public class ExchangeStatistics {

    @JsonProperty("confirm")
    private Long confirm;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("confirm_details")
    private Details confirmDetails;
    @JsonProperty("publish_in")
    private Long publishIn;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("publish_in_details")
    private Details publishInDetails;
    @JsonProperty("publish_out")
    private Long publishOut;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("publish_out_details")
    private Details publishOutDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ExchangeStatistics withConfirm(Long confirm) {
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

    public ExchangeStatistics withConfirmDetails(Details confirmDetails) {
        this.confirmDetails = confirmDetails;
        return this;
    }

    /**
     *
     * @return
     *     The publishIn
     */
    @JsonProperty("publish_in")
    public Long getPublishIn() {
        return publishIn;
    }

    /**
     *
     * @param publishIn
     *     The publish_in
     */
    @JsonProperty("publish_in")
    public void setPublishIn(Long publishIn) {
        this.publishIn = publishIn;
    }

    public ExchangeStatistics withPublishIn(Long publishIn) {
        this.publishIn = publishIn;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The publishInDetails
     */
    @JsonProperty("publish_in_details")
    public Details getPublishInDetails() {
        return publishInDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param publishInDetails
     *     The publish_in_details
     */
    @JsonProperty("publish_in_details")
    public void setPublishInDetails(Details publishInDetails) {
        this.publishInDetails = publishInDetails;
    }

    public ExchangeStatistics withPublishInDetails(Details publishInDetails) {
        this.publishInDetails = publishInDetails;
        return this;
    }

    /**
     *
     * @return
     *     The publishOut
     */
    @JsonProperty("publish_out")
    public Long getPublishOut() {
        return publishOut;
    }

    /**
     *
     * @param publishOut
     *     The publish_out
     */
    @JsonProperty("publish_out")
    public void setPublishOut(Long publishOut) {
        this.publishOut = publishOut;
    }

    public ExchangeStatistics withPublishOut(Long publishOut) {
        this.publishOut = publishOut;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The publishOutDetails
     */
    @JsonProperty("publish_out_details")
    public Details getPublishOutDetails() {
        return publishOutDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param publishOutDetails
     *     The publish_out_details
     */
    @JsonProperty("publish_out_details")
    public void setPublishOutDetails(Details publishOutDetails) {
        this.publishOutDetails = publishOutDetails;
    }

    public ExchangeStatistics withPublishOutDetails(Details publishOutDetails) {
        this.publishOutDetails = publishOutDetails;
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

    public ExchangeStatistics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(confirm).append(confirmDetails).append(publishIn).append(publishInDetails).append(publishOut).append(publishOutDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExchangeStatistics) == false) {
            return false;
        }
        ExchangeStatistics rhs = ((ExchangeStatistics) other);
        return new EqualsBuilder().append(confirm, rhs.confirm).append(confirmDetails, rhs.confirmDetails).append(publishIn, rhs.publishIn).append(publishInDetails, rhs.publishInDetails).append(publishOut, rhs.publishOut).append(publishOutDetails, rhs.publishOutDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
