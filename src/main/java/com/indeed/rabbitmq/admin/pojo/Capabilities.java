
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
    "exchange_exchange_bindings",
    "consumer_cancel_notify",
    "publisher_confirms",
    "basic.nack"
})
public class Capabilities {

    @JsonProperty("exchange_exchange_bindings")
    private Boolean exchangeExchangeBindings;
    @JsonProperty("consumer_cancel_notify")
    private Boolean consumerCancelNotify;
    @JsonProperty("publisher_confirms")
    private Boolean publisherConfirms;
    @JsonProperty("basic.nack")
    private Boolean basicNack;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The exchangeExchangeBindings
     */
    @JsonProperty("exchange_exchange_bindings")
    public Boolean getExchangeExchangeBindings() {
        return exchangeExchangeBindings;
    }

    /**
     *
     * @param exchangeExchangeBindings
     *     The exchange_exchange_bindings
     */
    @JsonProperty("exchange_exchange_bindings")
    public void setExchangeExchangeBindings(Boolean exchangeExchangeBindings) {
        this.exchangeExchangeBindings = exchangeExchangeBindings;
    }

    public Capabilities withExchangeExchangeBindings(Boolean exchangeExchangeBindings) {
        this.exchangeExchangeBindings = exchangeExchangeBindings;
        return this;
    }

    /**
     *
     * @return
     *     The consumerCancelNotify
     */
    @JsonProperty("consumer_cancel_notify")
    public Boolean getConsumerCancelNotify() {
        return consumerCancelNotify;
    }

    /**
     *
     * @param consumerCancelNotify
     *     The consumer_cancel_notify
     */
    @JsonProperty("consumer_cancel_notify")
    public void setConsumerCancelNotify(Boolean consumerCancelNotify) {
        this.consumerCancelNotify = consumerCancelNotify;
    }

    public Capabilities withConsumerCancelNotify(Boolean consumerCancelNotify) {
        this.consumerCancelNotify = consumerCancelNotify;
        return this;
    }

    /**
     *
     * @return
     *     The publisherConfirms
     */
    @JsonProperty("publisher_confirms")
    public Boolean getPublisherConfirms() {
        return publisherConfirms;
    }

    /**
     *
     * @param publisherConfirms
     *     The publisher_confirms
     */
    @JsonProperty("publisher_confirms")
    public void setPublisherConfirms(Boolean publisherConfirms) {
        this.publisherConfirms = publisherConfirms;
    }

    public Capabilities withPublisherConfirms(Boolean publisherConfirms) {
        this.publisherConfirms = publisherConfirms;
        return this;
    }

    /**
     *
     * @return
     *     The basicNack
     */
    @JsonProperty("basic.nack")
    public Boolean getBasicNack() {
        return basicNack;
    }

    /**
     *
     * @param basicNack
     *     The basic.nack
     */
    @JsonProperty("basic.nack")
    public void setBasicNack(Boolean basicNack) {
        this.basicNack = basicNack;
    }

    public Capabilities withBasicNack(Boolean basicNack) {
        this.basicNack = basicNack;
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

    public Capabilities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exchangeExchangeBindings).append(consumerCancelNotify).append(publisherConfirms).append(basicNack).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Capabilities) == false) {
            return false;
        }
        Capabilities rhs = ((Capabilities) other);
        return new EqualsBuilder().append(exchangeExchangeBindings, rhs.exchangeExchangeBindings).append(consumerCancelNotify, rhs.consumerCancelNotify).append(publisherConfirms, rhs.publisherConfirms).append(basicNack, rhs.basicNack).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
