
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
 * A description of a RabbitMQ user account.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "password",
    "password_hash",
    "hashing_algorithm",
    "tags"
})
public class User {

    /**
     * The user name.
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     * The user password in plain text.
     *
     */
    @JsonProperty("password")
    private String password;
    /**
     * A hashed representation of the user password.
     *
     */
    @JsonProperty("password_hash")
    private String passwordHash;
    /**
     * The hashing algorithm.
     *
     */
    @JsonProperty("hashing_algorithm")
    private String hashingAlgorithm;
    /**
     * Tags associated with this user.
     *
     */
    @JsonProperty("tags")
    private String tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The user name.
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The user name.
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The user password in plain text.
     *
     * @return
     *     The password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * The user password in plain text.
     *
     * @param password
     *     The password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * A hashed representation of the user password.
     *
     * @return
     *     The passwordHash
     */
    @JsonProperty("password_hash")
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * A hashed representation of the user password.
     *
     * @param passwordHash
     *     The password_hash
     */
    @JsonProperty("password_hash")
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public User withPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    /**
     * The hashing algorithm.
     *
     * @return
     *     The hashingAlgorithm
     */
    @JsonProperty("hashing_algorithm")
    public String getHashingAlgorithm() {
        return hashingAlgorithm;
    }

    /**
     * The hashing algorithm.
     *
     * @param hashingAlgorithm
     *     The hashing_algorithm
     */
    @JsonProperty("hashing_algorithm")
    public void setHashingAlgorithm(String hashingAlgorithm) {
        this.hashingAlgorithm = hashingAlgorithm;
    }

    public User withHashingAlgorithm(String hashingAlgorithm) {
        this.hashingAlgorithm = hashingAlgorithm;
        return this;
    }

    /**
     * Tags associated with this user.
     *
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * Tags associated with this user.
     *
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public User withTags(String tags) {
        this.tags = tags;
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

    public User withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(password).append(passwordHash).append(hashingAlgorithm).append(tags).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(name, rhs.name).append(password, rhs.password).append(passwordHash, rhs.passwordHash).append(hashingAlgorithm, rhs.hashingAlgorithm).append(tags, rhs.tags).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
