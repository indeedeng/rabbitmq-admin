
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
    "product",
    "information",
    "platform",
    "capabilities",
    "copyright",
    "version"
})
public class ClientProperties {

    @JsonProperty("product")
    private String product;
    @JsonProperty("information")
    private String information;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("capabilities")
    private Capabilities capabilities;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The product
     */
    @JsonProperty("product")
    public String getProduct() {
        return product;
    }

    /**
     *
     * @param product
     *     The product
     */
    @JsonProperty("product")
    public void setProduct(String product) {
        this.product = product;
    }

    public ClientProperties withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     *
     * @return
     *     The information
     */
    @JsonProperty("information")
    public String getInformation() {
        return information;
    }

    /**
     *
     * @param information
     *     The information
     */
    @JsonProperty("information")
    public void setInformation(String information) {
        this.information = information;
    }

    public ClientProperties withInformation(String information) {
        this.information = information;
        return this;
    }

    /**
     *
     * @return
     *     The platform
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     *
     * @param platform
     *     The platform
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ClientProperties withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     *
     * @return
     *     The capabilities
     */
    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     *
     * @param capabilities
     *     The capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public ClientProperties withCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     *
     * @return
     *     The copyright
     */
    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    /**
     *
     * @param copyright
     *     The copyright
     */
    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ClientProperties withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    /**
     *
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public ClientProperties withVersion(String version) {
        this.version = version;
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

    public ClientProperties withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(product).append(information).append(platform).append(capabilities).append(copyright).append(version).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientProperties) == false) {
            return false;
        }
        ClientProperties rhs = ((ClientProperties) other);
        return new EqualsBuilder().append(product, rhs.product).append(information, rhs.information).append(platform, rhs.platform).append(capabilities, rhs.capabilities).append(copyright, rhs.copyright).append(version, rhs.version).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
