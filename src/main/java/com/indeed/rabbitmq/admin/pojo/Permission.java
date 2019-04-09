
package com.indeed.rabbitmq.admin.pojo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
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
 * Authorization rules for an authenticated user.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "user",
    "vhost",
    "configure",
    "read",
    "write"
})
public class Permission {

    /**
     * The username.
     *
     */
    @JsonProperty("user")
    private String user;
    /**
     * The virtual host to which these permissions apply.
     *
     */
    @JsonProperty("vhost")
    private String vhost;
    /**
     * A regular expression that matches RabbitMQ entities that the user can configure.
     *
     */
    @JsonProperty("configure")
    private Pattern configure;
    /**
     * A regular expression that matches RabbitMQ entities that the user can read from.
     *
     */
    @JsonProperty("read")
    private Pattern read;
    /**
     * A regular expression that matches RabbitMQ entities that the user can write to.
     *
     */
    @JsonProperty("write")
    private Pattern write;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The username.
     *
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * The username.
     *
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Permission withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * The virtual host to which these permissions apply.
     *
     * @return
     *     The vhost
     */
    @JsonProperty("vhost")
    public String getVhost() {
        return vhost;
    }

    /**
     * The virtual host to which these permissions apply.
     *
     * @param vhost
     *     The vhost
     */
    @JsonProperty("vhost")
    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public Permission withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * A regular expression that matches RabbitMQ entities that the user can configure.
     *
     * @return
     *     The configure
     */
    @JsonProperty("configure")
    public Pattern getConfigure() {
        return configure;
    }

    /**
     * A regular expression that matches RabbitMQ entities that the user can configure.
     *
     * @param configure
     *     The configure
     */
    @JsonProperty("configure")
    public void setConfigure(Pattern configure) {
        this.configure = configure;
    }

    public Permission withConfigure(Pattern configure) {
        this.configure = configure;
        return this;
    }

    /**
     * A regular expression that matches RabbitMQ entities that the user can read from.
     *
     * @return
     *     The read
     */
    @JsonProperty("read")
    public Pattern getRead() {
        return read;
    }

    /**
     * A regular expression that matches RabbitMQ entities that the user can read from.
     *
     * @param read
     *     The read
     */
    @JsonProperty("read")
    public void setRead(Pattern read) {
        this.read = read;
    }

    public Permission withRead(Pattern read) {
        this.read = read;
        return this;
    }

    /**
     * A regular expression that matches RabbitMQ entities that the user can write to.
     *
     * @return
     *     The write
     */
    @JsonProperty("write")
    public Pattern getWrite() {
        return write;
    }

    /**
     * A regular expression that matches RabbitMQ entities that the user can write to.
     *
     * @param write
     *     The write
     */
    @JsonProperty("write")
    public void setWrite(Pattern write) {
        this.write = write;
    }

    public Permission withWrite(Pattern write) {
        this.write = write;
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

    public Permission withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(user).append(vhost).append(configure).append(read).append(write).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permission) == false) {
            return false;
        }
        Permission rhs = ((Permission) other);
        return new EqualsBuilder().append(user, rhs.user).append(vhost, rhs.vhost).append(configure, rhs.configure).append(read, rhs.read).append(write, rhs.write).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
