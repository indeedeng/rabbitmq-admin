
package com.indeed.rabbitmq.admin.pojo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Describes a RabbitMQ policy on a set of exchanges or queues.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "vhost",
    "name",
    "pattern",
    "apply-to",
    "definition",
    "priority"
})
public class Policy {

    /**
     * The virtual host that contains this policy.
     *
     */
    @JsonProperty("vhost")
    private String vhost;
    /**
     * The unique name of this policy.
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     * A pattern that matches the RabbitMQ entities to which this policy applies.
     *
     */
    @JsonProperty("pattern")
    private Pattern pattern;
    /**
     * Indicates whether this policy applies to exchanges, queues or both.
     *
     */
    @JsonProperty("apply-to")
    private Policy.ApplyTo applyTo;
    /**
     * The definitions to apply to a RabbitMQ policy.
     *
     */
    @JsonProperty("definition")
    private Definition definition;
    /**
     * The policy priority level.
     *
     */
    @JsonProperty("priority")
    private Long priority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The virtual host that contains this policy.
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public String getVhost() {
        return vhost;
    }

    /**
     * The virtual host that contains this policy.
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public Policy withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * The unique name of this policy.
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The unique name of this policy.
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Policy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A pattern that matches the RabbitMQ entities to which this policy applies.
     *
     * @return
     *     The pattern
     */
    @JsonProperty("pattern")
    public Pattern getPattern() {
        return pattern;
    }

    /**
     * A pattern that matches the RabbitMQ entities to which this policy applies.
     *
     * @param pattern
     *     The pattern
     */
    @JsonProperty("pattern")
    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Policy withPattern(Pattern pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Indicates whether this policy applies to exchanges, queues or both.
     *
     * @return
     *     The applyTo
     */
    @JsonProperty("apply-to")
    public Policy.ApplyTo getApplyTo() {
        return applyTo;
    }

    /**
     * Indicates whether this policy applies to exchanges, queues or both.
     *
     * @param applyTo
     *     The apply-to
     */
    @JsonProperty("apply-to")
    public void setApplyTo(Policy.ApplyTo applyTo) {
        this.applyTo = applyTo;
    }

    public Policy withApplyTo(Policy.ApplyTo applyTo) {
        this.applyTo = applyTo;
        return this;
    }

    /**
     * The definitions to apply to a RabbitMQ policy.
     *
     * @return
     *     The definition
     */
    @JsonProperty("definition")
    public Definition getDefinition() {
        return definition;
    }

    /**
     * The definitions to apply to a RabbitMQ policy.
     *
     * @param definition
     *     The definition
     */
    @JsonProperty("definition")
    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public Policy withDefinition(Definition definition) {
        this.definition = definition;
        return this;
    }

    /**
     * The policy priority level.
     *
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public Long getPriority() {
        return priority;
    }

    /**
     * The policy priority level.
     *
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Policy withPriority(Long priority) {
        this.priority = priority;
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

    public Policy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vhost).append(name).append(pattern).append(applyTo).append(definition).append(priority).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Policy) == false) {
            return false;
        }
        Policy rhs = ((Policy) other);
        return new EqualsBuilder().append(vhost, rhs.vhost).append(name, rhs.name).append(pattern, rhs.pattern).append(applyTo, rhs.applyTo).append(definition, rhs.definition).append(priority, rhs.priority).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum ApplyTo {

        ALL("all"),
        EXCHANGES("exchanges"),
        QUEUES("queues");
        private final String value;
        private static Map<String, Policy.ApplyTo> constants = new HashMap<String, Policy.ApplyTo>();

        static {
            for (Policy.ApplyTo c: values()) {
                constants.put(c.value, c);
            }
        }

        private ApplyTo(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Policy.ApplyTo fromValue(String value) {
            Policy.ApplyTo constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
