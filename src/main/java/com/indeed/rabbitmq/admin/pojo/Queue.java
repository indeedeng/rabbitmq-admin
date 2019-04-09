
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
    "node",
    "vhost",
    "auto_delete",
    "durable",
    "policy",
    "state",
    "exclusive_consumer_tag",
    "consumers",
    "memory",
    "consumer_utilisation",
    "down_slave_nodes",
    "messages",
    "messages_details",
    "messages_ram",
    "message_bytes",
    "message_bytes_ram",
    "messages_ready",
    "messages_ready_details",
    "message_bytes_ready",
    "messages_ready_ram",
    "messages_unacknowledged",
    "messages_unacknowledged_details",
    "message_bytes_unacknowledged",
    "messages_unacknowledged_ram",
    "messages_persistent",
    "message_bytes_persistent",
    "idle_since",
    "arguments"
})
public class Queue {

    @JsonProperty("name")
    private String name;
    @JsonProperty("node")
    private String node;
    @JsonProperty("vhost")
    private String vhost;
    @JsonProperty("auto_delete")
    private Boolean autoDelete;
    @JsonProperty("durable")
    private Boolean durable;
    @JsonProperty("policy")
    private String policy;
    @JsonProperty("state")
    private String state;
    @JsonProperty("exclusive_consumer_tag")
    private String exclusiveConsumerTag;
    @JsonProperty("consumers")
    private Long consumers;
    @JsonProperty("memory")
    private Long memory;
    @JsonProperty("consumer_utilisation")
    private String consumerUtilisation;
    @JsonProperty("down_slave_nodes")
    private String downSlaveNodes;
    @JsonProperty("messages")
    private Long messages;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("messages_details")
    private Details messagesDetails;
    @JsonProperty("messages_ram")
    private Long messagesRam;
    @JsonProperty("message_bytes")
    private Long messageBytes;
    @JsonProperty("message_bytes_ram")
    private Long messageBytesRam;
    @JsonProperty("messages_ready")
    private Long messagesReady;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("messages_ready_details")
    private Details messagesReadyDetails;
    @JsonProperty("message_bytes_ready")
    private Long messageBytesReady;
    @JsonProperty("messages_ready_ram")
    private Long messagesReadyRam;
    @JsonProperty("messages_unacknowledged")
    private Long messagesUnacknowledged;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("messages_unacknowledged_details")
    private Details messagesUnacknowledgedDetails;
    @JsonProperty("message_bytes_unacknowledged")
    private Long messageBytesUnacknowledged;
    @JsonProperty("messages_unacknowledged_ram")
    private Long messagesUnacknowledgedRam;
    @JsonProperty("messages_persistent")
    private Long messagesPersistent;
    @JsonProperty("message_bytes_persistent")
    private Long messageBytesPersistent;
    @JsonProperty("idle_since")
    private String idleSince;
    @JsonProperty("arguments")
    private QueueArguments arguments;
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

    public Queue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The node
     */
    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    /**
     *
     * @param node
     *     The node
     */
    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    public Queue withNode(String node) {
        this.node = node;
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

    public Queue withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     *
     * @return
     *     The autoDelete
     */
    @JsonProperty("auto_delete")
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     *
     * @param autoDelete
     *     The auto_delete
     */
    @JsonProperty("auto_delete")
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public Queue withAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     *
     * @return
     *     The durable
     */
    @JsonProperty("durable")
    public Boolean getDurable() {
        return durable;
    }

    /**
     *
     * @param durable
     *     The durable
     */
    @JsonProperty("durable")
    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public Queue withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     *
     * @return
     *     The policy
     */
    @JsonProperty("policy")
    public String getPolicy() {
        return policy;
    }

    /**
     *
     * @param policy
     *     The policy
     */
    @JsonProperty("policy")
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Queue withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     *
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Queue withState(String state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @return
     *     The exclusiveConsumerTag
     */
    @JsonProperty("exclusive_consumer_tag")
    public String getExclusiveConsumerTag() {
        return exclusiveConsumerTag;
    }

    /**
     *
     * @param exclusiveConsumerTag
     *     The exclusive_consumer_tag
     */
    @JsonProperty("exclusive_consumer_tag")
    public void setExclusiveConsumerTag(String exclusiveConsumerTag) {
        this.exclusiveConsumerTag = exclusiveConsumerTag;
    }

    public Queue withExclusiveConsumerTag(String exclusiveConsumerTag) {
        this.exclusiveConsumerTag = exclusiveConsumerTag;
        return this;
    }

    /**
     *
     * @return
     *     The consumers
     */
    @JsonProperty("consumers")
    public Long getConsumers() {
        return consumers;
    }

    /**
     *
     * @param consumers
     *     The consumers
     */
    @JsonProperty("consumers")
    public void setConsumers(Long consumers) {
        this.consumers = consumers;
    }

    public Queue withConsumers(Long consumers) {
        this.consumers = consumers;
        return this;
    }

    /**
     *
     * @return
     *     The memory
     */
    @JsonProperty("memory")
    public Long getMemory() {
        return memory;
    }

    /**
     *
     * @param memory
     *     The memory
     */
    @JsonProperty("memory")
    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Queue withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     *
     * @return
     *     The consumerUtilisation
     */
    @JsonProperty("consumer_utilisation")
    public String getConsumerUtilisation() {
        return consumerUtilisation;
    }

    /**
     *
     * @param consumerUtilisation
     *     The consumer_utilisation
     */
    @JsonProperty("consumer_utilisation")
    public void setConsumerUtilisation(String consumerUtilisation) {
        this.consumerUtilisation = consumerUtilisation;
    }

    public Queue withConsumerUtilisation(String consumerUtilisation) {
        this.consumerUtilisation = consumerUtilisation;
        return this;
    }

    /**
     *
     * @return
     *     The downSlaveNodes
     */
    @JsonProperty("down_slave_nodes")
    public String getDownSlaveNodes() {
        return downSlaveNodes;
    }

    /**
     *
     * @param downSlaveNodes
     *     The down_slave_nodes
     */
    @JsonProperty("down_slave_nodes")
    public void setDownSlaveNodes(String downSlaveNodes) {
        this.downSlaveNodes = downSlaveNodes;
    }

    public Queue withDownSlaveNodes(String downSlaveNodes) {
        this.downSlaveNodes = downSlaveNodes;
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

    public Queue withMessages(Long messages) {
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

    public Queue withMessagesDetails(Details messagesDetails) {
        this.messagesDetails = messagesDetails;
        return this;
    }

    /**
     *
     * @return
     *     The messagesRam
     */
    @JsonProperty("messages_ram")
    public Long getMessagesRam() {
        return messagesRam;
    }

    /**
     *
     * @param messagesRam
     *     The messages_ram
     */
    @JsonProperty("messages_ram")
    public void setMessagesRam(Long messagesRam) {
        this.messagesRam = messagesRam;
    }

    public Queue withMessagesRam(Long messagesRam) {
        this.messagesRam = messagesRam;
        return this;
    }

    /**
     *
     * @return
     *     The messageBytes
     */
    @JsonProperty("message_bytes")
    public Long getMessageBytes() {
        return messageBytes;
    }

    /**
     *
     * @param messageBytes
     *     The message_bytes
     */
    @JsonProperty("message_bytes")
    public void setMessageBytes(Long messageBytes) {
        this.messageBytes = messageBytes;
    }

    public Queue withMessageBytes(Long messageBytes) {
        this.messageBytes = messageBytes;
        return this;
    }

    /**
     *
     * @return
     *     The messageBytesRam
     */
    @JsonProperty("message_bytes_ram")
    public Long getMessageBytesRam() {
        return messageBytesRam;
    }

    /**
     *
     * @param messageBytesRam
     *     The message_bytes_ram
     */
    @JsonProperty("message_bytes_ram")
    public void setMessageBytesRam(Long messageBytesRam) {
        this.messageBytesRam = messageBytesRam;
    }

    public Queue withMessageBytesRam(Long messageBytesRam) {
        this.messageBytesRam = messageBytesRam;
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

    public Queue withMessagesReady(Long messagesReady) {
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

    public Queue withMessagesReadyDetails(Details messagesReadyDetails) {
        this.messagesReadyDetails = messagesReadyDetails;
        return this;
    }

    /**
     *
     * @return
     *     The messageBytesReady
     */
    @JsonProperty("message_bytes_ready")
    public Long getMessageBytesReady() {
        return messageBytesReady;
    }

    /**
     *
     * @param messageBytesReady
     *     The message_bytes_ready
     */
    @JsonProperty("message_bytes_ready")
    public void setMessageBytesReady(Long messageBytesReady) {
        this.messageBytesReady = messageBytesReady;
    }

    public Queue withMessageBytesReady(Long messageBytesReady) {
        this.messageBytesReady = messageBytesReady;
        return this;
    }

    /**
     *
     * @return
     *     The messagesReadyRam
     */
    @JsonProperty("messages_ready_ram")
    public Long getMessagesReadyRam() {
        return messagesReadyRam;
    }

    /**
     *
     * @param messagesReadyRam
     *     The messages_ready_ram
     */
    @JsonProperty("messages_ready_ram")
    public void setMessagesReadyRam(Long messagesReadyRam) {
        this.messagesReadyRam = messagesReadyRam;
    }

    public Queue withMessagesReadyRam(Long messagesReadyRam) {
        this.messagesReadyRam = messagesReadyRam;
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

    public Queue withMessagesUnacknowledged(Long messagesUnacknowledged) {
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

    public Queue withMessagesUnacknowledgedDetails(Details messagesUnacknowledgedDetails) {
        this.messagesUnacknowledgedDetails = messagesUnacknowledgedDetails;
        return this;
    }

    /**
     *
     * @return
     *     The messageBytesUnacknowledged
     */
    @JsonProperty("message_bytes_unacknowledged")
    public Long getMessageBytesUnacknowledged() {
        return messageBytesUnacknowledged;
    }

    /**
     *
     * @param messageBytesUnacknowledged
     *     The message_bytes_unacknowledged
     */
    @JsonProperty("message_bytes_unacknowledged")
    public void setMessageBytesUnacknowledged(Long messageBytesUnacknowledged) {
        this.messageBytesUnacknowledged = messageBytesUnacknowledged;
    }

    public Queue withMessageBytesUnacknowledged(Long messageBytesUnacknowledged) {
        this.messageBytesUnacknowledged = messageBytesUnacknowledged;
        return this;
    }

    /**
     *
     * @return
     *     The messagesUnacknowledgedRam
     */
    @JsonProperty("messages_unacknowledged_ram")
    public Long getMessagesUnacknowledgedRam() {
        return messagesUnacknowledgedRam;
    }

    /**
     *
     * @param messagesUnacknowledgedRam
     *     The messages_unacknowledged_ram
     */
    @JsonProperty("messages_unacknowledged_ram")
    public void setMessagesUnacknowledgedRam(Long messagesUnacknowledgedRam) {
        this.messagesUnacknowledgedRam = messagesUnacknowledgedRam;
    }

    public Queue withMessagesUnacknowledgedRam(Long messagesUnacknowledgedRam) {
        this.messagesUnacknowledgedRam = messagesUnacknowledgedRam;
        return this;
    }

    /**
     *
     * @return
     *     The messagesPersistent
     */
    @JsonProperty("messages_persistent")
    public Long getMessagesPersistent() {
        return messagesPersistent;
    }

    /**
     *
     * @param messagesPersistent
     *     The messages_persistent
     */
    @JsonProperty("messages_persistent")
    public void setMessagesPersistent(Long messagesPersistent) {
        this.messagesPersistent = messagesPersistent;
    }

    public Queue withMessagesPersistent(Long messagesPersistent) {
        this.messagesPersistent = messagesPersistent;
        return this;
    }

    /**
     *
     * @return
     *     The messageBytesPersistent
     */
    @JsonProperty("message_bytes_persistent")
    public Long getMessageBytesPersistent() {
        return messageBytesPersistent;
    }

    /**
     *
     * @param messageBytesPersistent
     *     The message_bytes_persistent
     */
    @JsonProperty("message_bytes_persistent")
    public void setMessageBytesPersistent(Long messageBytesPersistent) {
        this.messageBytesPersistent = messageBytesPersistent;
    }

    public Queue withMessageBytesPersistent(Long messageBytesPersistent) {
        this.messageBytesPersistent = messageBytesPersistent;
        return this;
    }

    /**
     *
     * @return
     *     The idleSince
     */
    @JsonProperty("idle_since")
    public String getIdleSince() {
        return idleSince;
    }

    /**
     *
     * @param idleSince
     *     The idle_since
     */
    @JsonProperty("idle_since")
    public void setIdleSince(String idleSince) {
        this.idleSince = idleSince;
    }

    public Queue withIdleSince(String idleSince) {
        this.idleSince = idleSince;
        return this;
    }

    /**
     *
     * @return
     *     The arguments
     */
    @JsonProperty("arguments")
    public QueueArguments getArguments() {
        return arguments;
    }

    /**
     *
     * @param arguments
     *     The arguments
     */
    @JsonProperty("arguments")
    public void setArguments(QueueArguments arguments) {
        this.arguments = arguments;
    }

    public Queue withArguments(QueueArguments arguments) {
        this.arguments = arguments;
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

    public Queue withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(node).append(vhost).append(autoDelete).append(durable).append(policy).append(state).append(exclusiveConsumerTag).append(consumers).append(memory).append(consumerUtilisation).append(downSlaveNodes).append(messages).append(messagesDetails).append(messagesRam).append(messageBytes).append(messageBytesRam).append(messagesReady).append(messagesReadyDetails).append(messageBytesReady).append(messagesReadyRam).append(messagesUnacknowledged).append(messagesUnacknowledgedDetails).append(messageBytesUnacknowledged).append(messagesUnacknowledgedRam).append(messagesPersistent).append(messageBytesPersistent).append(idleSince).append(arguments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Queue) == false) {
            return false;
        }
        Queue rhs = ((Queue) other);
        return new EqualsBuilder().append(name, rhs.name).append(node, rhs.node).append(vhost, rhs.vhost).append(autoDelete, rhs.autoDelete).append(durable, rhs.durable).append(policy, rhs.policy).append(state, rhs.state).append(exclusiveConsumerTag, rhs.exclusiveConsumerTag).append(consumers, rhs.consumers).append(memory, rhs.memory).append(consumerUtilisation, rhs.consumerUtilisation).append(downSlaveNodes, rhs.downSlaveNodes).append(messages, rhs.messages).append(messagesDetails, rhs.messagesDetails).append(messagesRam, rhs.messagesRam).append(messageBytes, rhs.messageBytes).append(messageBytesRam, rhs.messageBytesRam).append(messagesReady, rhs.messagesReady).append(messagesReadyDetails, rhs.messagesReadyDetails).append(messageBytesReady, rhs.messageBytesReady).append(messagesReadyRam, rhs.messagesReadyRam).append(messagesUnacknowledged, rhs.messagesUnacknowledged).append(messagesUnacknowledgedDetails, rhs.messagesUnacknowledgedDetails).append(messageBytesUnacknowledged, rhs.messageBytesUnacknowledged).append(messagesUnacknowledgedRam, rhs.messagesUnacknowledgedRam).append(messagesPersistent, rhs.messagesPersistent).append(messageBytesPersistent, rhs.messageBytesPersistent).append(idleSince, rhs.idleSince).append(arguments, rhs.arguments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
