
package com.indeed.rabbitmq.admin.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Overview of the RabbitMQ cluster.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "node",
    "cluster_name",
    "rabbitmq_version",
    "management_version",
    "rates_mode",
    "exchange_types",
    "erlang_version",
    "erlang_full_version",
    "message_stats",
    "queue_totals",
    "object_totals",
    "statistics_db_event_queue",
    "statistics_db_node",
    "listeners",
    "contexts"
})
public class Overview {

    @JsonProperty("node")
    private String node;
    /**
     * The name of the RabbitMQ cluster.
     *
     */
    @JsonProperty("cluster_name")
    private String clusterName;
    /**
     * The version of this RabbitMQ service.
     *
     */
    @JsonProperty("rabbitmq_version")
    private String rabbitmqVersion;
    /**
     * The version of the RabbitMQ management API.
     *
     */
    @JsonProperty("management_version")
    private String managementVersion;
    @JsonProperty("rates_mode")
    private Overview.RatesMode ratesMode;
    @JsonProperty("exchange_types")
    private List<Description> exchangeTypes = new ArrayList<Description>();
    /**
     * The version of Erlang used to run this RabbitMQ service.
     *
     */
    @JsonProperty("erlang_version")
    private String erlangVersion;
    /**
     * The full version of Erlang used to run this RabbitMQ service.
     *
     */
    @JsonProperty("erlang_full_version")
    private String erlangFullVersion;
    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     */
    @JsonProperty("message_stats")
    private MessageStatistics messageStats;
    /**
     * Totals of how many messages can be found in each message state.
     *
     */
    @JsonProperty("queue_totals")
    private QueueTotals queueTotals;
    /**
     * Totals of various RabbitMQ entities.
     *
     */
    @JsonProperty("object_totals")
    private ObjectTotals objectTotals;
    @JsonProperty("statistics_db_event_queue")
    private Long statisticsDbEventQueue;
    @JsonProperty("statistics_db_node")
    private String statisticsDbNode;
    @JsonProperty("listeners")
    private List<Listener> listeners = new ArrayList<Listener>();
    @JsonProperty("contexts")
    private List<Context> contexts = new ArrayList<Context>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Overview withNode(String node) {
        this.node = node;
        return this;
    }

    /**
     * The name of the RabbitMQ cluster.
     *
     * @return
     *     The clusterName
     */
    @JsonProperty("cluster_name")
    public String getClusterName() {
        return clusterName;
    }

    /**
     * The name of the RabbitMQ cluster.
     *
     * @param clusterName
     *     The cluster_name
     */
    @JsonProperty("cluster_name")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Overview withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * The version of this RabbitMQ service.
     *
     * @return
     *     The rabbitmqVersion
     */
    @JsonProperty("rabbitmq_version")
    public String getRabbitmqVersion() {
        return rabbitmqVersion;
    }

    /**
     * The version of this RabbitMQ service.
     *
     * @param rabbitmqVersion
     *     The rabbitmq_version
     */
    @JsonProperty("rabbitmq_version")
    public void setRabbitmqVersion(String rabbitmqVersion) {
        this.rabbitmqVersion = rabbitmqVersion;
    }

    public Overview withRabbitmqVersion(String rabbitmqVersion) {
        this.rabbitmqVersion = rabbitmqVersion;
        return this;
    }

    /**
     * The version of the RabbitMQ management API.
     *
     * @return
     *     The managementVersion
     */
    @JsonProperty("management_version")
    public String getManagementVersion() {
        return managementVersion;
    }

    /**
     * The version of the RabbitMQ management API.
     *
     * @param managementVersion
     *     The management_version
     */
    @JsonProperty("management_version")
    public void setManagementVersion(String managementVersion) {
        this.managementVersion = managementVersion;
    }

    public Overview withManagementVersion(String managementVersion) {
        this.managementVersion = managementVersion;
        return this;
    }

    /**
     *
     * @return
     *     The ratesMode
     */
    @JsonProperty("rates_mode")
    public Overview.RatesMode getRatesMode() {
        return ratesMode;
    }

    /**
     *
     * @param ratesMode
     *     The rates_mode
     */
    @JsonProperty("rates_mode")
    public void setRatesMode(Overview.RatesMode ratesMode) {
        this.ratesMode = ratesMode;
    }

    public Overview withRatesMode(Overview.RatesMode ratesMode) {
        this.ratesMode = ratesMode;
        return this;
    }

    /**
     *
     * @return
     *     The exchangeTypes
     */
    @JsonProperty("exchange_types")
    public List<Description> getExchangeTypes() {
        return exchangeTypes;
    }

    /**
     *
     * @param exchangeTypes
     *     The exchange_types
     */
    @JsonProperty("exchange_types")
    public void setExchangeTypes(List<Description> exchangeTypes) {
        this.exchangeTypes = exchangeTypes;
    }

    public Overview withExchangeTypes(List<Description> exchangeTypes) {
        this.exchangeTypes = exchangeTypes;
        return this;
    }

    /**
     * The version of Erlang used to run this RabbitMQ service.
     *
     * @return
     *     The erlangVersion
     */
    @JsonProperty("erlang_version")
    public String getErlangVersion() {
        return erlangVersion;
    }

    /**
     * The version of Erlang used to run this RabbitMQ service.
     *
     * @param erlangVersion
     *     The erlang_version
     */
    @JsonProperty("erlang_version")
    public void setErlangVersion(String erlangVersion) {
        this.erlangVersion = erlangVersion;
    }

    public Overview withErlangVersion(String erlangVersion) {
        this.erlangVersion = erlangVersion;
        return this;
    }

    /**
     * The full version of Erlang used to run this RabbitMQ service.
     *
     * @return
     *     The erlangFullVersion
     */
    @JsonProperty("erlang_full_version")
    public String getErlangFullVersion() {
        return erlangFullVersion;
    }

    /**
     * The full version of Erlang used to run this RabbitMQ service.
     *
     * @param erlangFullVersion
     *     The erlang_full_version
     */
    @JsonProperty("erlang_full_version")
    public void setErlangFullVersion(String erlangFullVersion) {
        this.erlangFullVersion = erlangFullVersion;
    }

    public Overview withErlangFullVersion(String erlangFullVersion) {
        this.erlangFullVersion = erlangFullVersion;
        return this;
    }

    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     * @return
     *     The messageStats
     */
    @JsonProperty("message_stats")
    public MessageStatistics getMessageStats() {
        return messageStats;
    }

    /**
     * Rates and counts of incoming, delivered and published messages.
     *
     * @param messageStats
     *     The message_stats
     */
    @JsonProperty("message_stats")
    public void setMessageStats(MessageStatistics messageStats) {
        this.messageStats = messageStats;
    }

    public Overview withMessageStats(MessageStatistics messageStats) {
        this.messageStats = messageStats;
        return this;
    }

    /**
     * Totals of how many messages can be found in each message state.
     *
     * @return
     *     The queueTotals
     */
    @JsonProperty("queue_totals")
    public QueueTotals getQueueTotals() {
        return queueTotals;
    }

    /**
     * Totals of how many messages can be found in each message state.
     *
     * @param queueTotals
     *     The queue_totals
     */
    @JsonProperty("queue_totals")
    public void setQueueTotals(QueueTotals queueTotals) {
        this.queueTotals = queueTotals;
    }

    public Overview withQueueTotals(QueueTotals queueTotals) {
        this.queueTotals = queueTotals;
        return this;
    }

    /**
     * Totals of various RabbitMQ entities.
     *
     * @return
     *     The objectTotals
     */
    @JsonProperty("object_totals")
    public ObjectTotals getObjectTotals() {
        return objectTotals;
    }

    /**
     * Totals of various RabbitMQ entities.
     *
     * @param objectTotals
     *     The object_totals
     */
    @JsonProperty("object_totals")
    public void setObjectTotals(ObjectTotals objectTotals) {
        this.objectTotals = objectTotals;
    }

    public Overview withObjectTotals(ObjectTotals objectTotals) {
        this.objectTotals = objectTotals;
        return this;
    }

    /**
     *
     * @return
     *     The statisticsDbEventQueue
     */
    @JsonProperty("statistics_db_event_queue")
    public Long getStatisticsDbEventQueue() {
        return statisticsDbEventQueue;
    }

    /**
     *
     * @param statisticsDbEventQueue
     *     The statistics_db_event_queue
     */
    @JsonProperty("statistics_db_event_queue")
    public void setStatisticsDbEventQueue(Long statisticsDbEventQueue) {
        this.statisticsDbEventQueue = statisticsDbEventQueue;
    }

    public Overview withStatisticsDbEventQueue(Long statisticsDbEventQueue) {
        this.statisticsDbEventQueue = statisticsDbEventQueue;
        return this;
    }

    /**
     *
     * @return
     *     The statisticsDbNode
     */
    @JsonProperty("statistics_db_node")
    public String getStatisticsDbNode() {
        return statisticsDbNode;
    }

    /**
     *
     * @param statisticsDbNode
     *     The statistics_db_node
     */
    @JsonProperty("statistics_db_node")
    public void setStatisticsDbNode(String statisticsDbNode) {
        this.statisticsDbNode = statisticsDbNode;
    }

    public Overview withStatisticsDbNode(String statisticsDbNode) {
        this.statisticsDbNode = statisticsDbNode;
        return this;
    }

    /**
     *
     * @return
     *     The listeners
     */
    @JsonProperty("listeners")
    public List<Listener> getListeners() {
        return listeners;
    }

    /**
     *
     * @param listeners
     *     The listeners
     */
    @JsonProperty("listeners")
    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

    public Overview withListeners(List<Listener> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     *
     * @return
     *     The contexts
     */
    @JsonProperty("contexts")
    public List<Context> getContexts() {
        return contexts;
    }

    /**
     *
     * @param contexts
     *     The contexts
     */
    @JsonProperty("contexts")
    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }

    public Overview withContexts(List<Context> contexts) {
        this.contexts = contexts;
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

    public Overview withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(node).append(clusterName).append(rabbitmqVersion).append(managementVersion).append(ratesMode).append(exchangeTypes).append(erlangVersion).append(erlangFullVersion).append(messageStats).append(queueTotals).append(objectTotals).append(statisticsDbEventQueue).append(statisticsDbNode).append(listeners).append(contexts).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Overview) == false) {
            return false;
        }
        Overview rhs = ((Overview) other);
        return new EqualsBuilder().append(node, rhs.node).append(clusterName, rhs.clusterName).append(rabbitmqVersion, rhs.rabbitmqVersion).append(managementVersion, rhs.managementVersion).append(ratesMode, rhs.ratesMode).append(exchangeTypes, rhs.exchangeTypes).append(erlangVersion, rhs.erlangVersion).append(erlangFullVersion, rhs.erlangFullVersion).append(messageStats, rhs.messageStats).append(queueTotals, rhs.queueTotals).append(objectTotals, rhs.objectTotals).append(statisticsDbEventQueue, rhs.statisticsDbEventQueue).append(statisticsDbNode, rhs.statisticsDbNode).append(listeners, rhs.listeners).append(contexts, rhs.contexts).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum RatesMode {

        BASIC("basic"),
        DETAILED("detailed"),
        NONE("none");
        private final String value;
        private static Map<String, Overview.RatesMode> constants = new HashMap<String, Overview.RatesMode>();

        static {
            for (Overview.RatesMode c: values()) {
                constants.put(c.value, c);
            }
        }

        private RatesMode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Overview.RatesMode fromValue(String value) {
            Overview.RatesMode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
