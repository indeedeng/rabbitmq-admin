
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
    "vhost"
})
public class QueueDetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("vhost")
    private String vhost;
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

    public QueueDetails withName(String name) {
        this.name = name;
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

    public QueueDetails withVhost(String vhost) {
        this.vhost = vhost;
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

    public QueueDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(vhost).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueueDetails) == false) {
            return false;
        }
        QueueDetails rhs = ((QueueDetails) other);
        return new EqualsBuilder().append(name, rhs.name).append(vhost, rhs.vhost).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
