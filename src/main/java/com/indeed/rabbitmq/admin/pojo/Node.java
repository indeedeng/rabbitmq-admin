
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
 * Describes a node in the RabbitMQ cluster.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cluster_links",
    "disk_free",
    "disk_free_details",
    "fd_used",
    "fd_used_details",
    "io_read_avg_time",
    "io_read_avg_time_details",
    "io_read_bytes",
    "io_read_bytes_details",
    "io_read_count",
    "io_read_count_details",
    "io_seek_count",
    "io_seek_count_details",
    "io_sync_avg_time",
    "io_sync_avg_time_details",
    "io_write_avg_time",
    "io_write_avg_time_details",
    "mem_used",
    "mem_used_details",
    "mnesia_disk_tx_count",
    "mnesia_disk_tx_count_details",
    "mnesia_ram_tx_count",
    "mnesia_ram_tx_count_details",
    "proc_used",
    "proc_used_details",
    "sockets_used",
    "sockets_used_details",
    "partitions",
    "os_pid",
    "fd_total",
    "sockets_total",
    "mem_limit",
    "mem_alarm",
    "disk_free_limit",
    "disk_free_alarm",
    "proc_total",
    "rates_mode",
    "uptime",
    "run_queue",
    "processors",
    "exchange_types",
    "auth_mechanisms",
    "applications",
    "contexts",
    "log_file",
    "sasl_log_file",
    "db_dir",
    "config_files",
    "net_ticktime",
    "enabled_plugins",
    "name",
    "type",
    "running"
})
public class Node {

    @JsonProperty("cluster_links")
    private List<String> clusterLinks = new ArrayList<String>();
    @JsonProperty("disk_free")
    private Long diskFree;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("disk_free_details")
    private Details diskFreeDetails;
    @JsonProperty("fd_used")
    private Long fdUsed;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("fd_used_details")
    private Details fdUsedDetails;
    @JsonProperty("io_read_avg_time")
    private Long ioReadAvgTime;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("io_read_avg_time_details")
    private Details ioReadAvgTimeDetails;
    @JsonProperty("io_read_bytes")
    private Long ioReadBytes;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("io_read_bytes_details")
    private Details ioReadBytesDetails;
    @JsonProperty("io_read_count")
    private Long ioReadCount;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("io_read_count_details")
    private Details ioReadCountDetails;
    @JsonProperty("io_seek_count")
    private Long ioSeekCount;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("io_seek_count_details")
    private Details ioSeekCountDetails;
    @JsonProperty("io_sync_avg_time")
    private Long ioSyncAvgTime;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("io_sync_avg_time_details")
    private Details ioSyncAvgTimeDetails;
    @JsonProperty("io_write_avg_time")
    private Long ioWriteAvgTime;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("io_write_avg_time_details")
    private Details ioWriteAvgTimeDetails;
    @JsonProperty("mem_used")
    private Long memUsed;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("mem_used_details")
    private Details memUsedDetails;
    @JsonProperty("mnesia_disk_tx_count")
    private Long mnesiaDiskTxCount;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("mnesia_disk_tx_count_details")
    private Details mnesiaDiskTxCountDetails;
    @JsonProperty("mnesia_ram_tx_count")
    private Long mnesiaRamTxCount;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("mnesia_ram_tx_count_details")
    private Details mnesiaRamTxCountDetails;
    @JsonProperty("proc_used")
    private Long procUsed;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("proc_used_details")
    private Details procUsedDetails;
    @JsonProperty("sockets_used")
    private Long socketsUsed;
    /**
     * Details of RabbitMQ messaging rates.
     *
     */
    @JsonProperty("sockets_used_details")
    private Details socketsUsedDetails;
    @JsonProperty("partitions")
    private List<String> partitions = new ArrayList<String>();
    @JsonProperty("os_pid")
    private String osPid;
    @JsonProperty("fd_total")
    private Long fdTotal;
    @JsonProperty("sockets_total")
    private Long socketsTotal;
    @JsonProperty("mem_limit")
    private Long memLimit;
    @JsonProperty("mem_alarm")
    private Boolean memAlarm;
    @JsonProperty("disk_free_limit")
    private Long diskFreeLimit;
    @JsonProperty("disk_free_alarm")
    private Boolean diskFreeAlarm;
    @JsonProperty("proc_total")
    private Long procTotal;
    @JsonProperty("rates_mode")
    private Node.RatesMode ratesMode;
    @JsonProperty("uptime")
    private Long uptime;
    @JsonProperty("run_queue")
    private Long runQueue;
    @JsonProperty("processors")
    private Long processors;
    @JsonProperty("exchange_types")
    private List<Description> exchangeTypes = new ArrayList<Description>();
    @JsonProperty("auth_mechanisms")
    private List<Description> authMechanisms = new ArrayList<Description>();
    @JsonProperty("applications")
    private List<Application> applications = new ArrayList<Application>();
    @JsonProperty("contexts")
    private List<Context> contexts = new ArrayList<Context>();
    @JsonProperty("log_file")
    private String logFile;
    @JsonProperty("sasl_log_file")
    private String saslLogFile;
    @JsonProperty("db_dir")
    private String dbDir;
    @JsonProperty("config_files")
    private List<String> configFiles = new ArrayList<String>();
    @JsonProperty("net_ticktime")
    private Long netTicktime;
    @JsonProperty("enabled_plugins")
    private List<String> enabledPlugins = new ArrayList<String>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("running")
    private Boolean running;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The clusterLinks
     */
    @JsonProperty("cluster_links")
    public List<String> getClusterLinks() {
        return clusterLinks;
    }

    /**
     *
     * @param clusterLinks
     *     The cluster_links
     */
    @JsonProperty("cluster_links")
    public void setClusterLinks(List<String> clusterLinks) {
        this.clusterLinks = clusterLinks;
    }

    public Node withClusterLinks(List<String> clusterLinks) {
        this.clusterLinks = clusterLinks;
        return this;
    }

    /**
     *
     * @return
     *     The diskFree
     */
    @JsonProperty("disk_free")
    public Long getDiskFree() {
        return diskFree;
    }

    /**
     *
     * @param diskFree
     *     The disk_free
     */
    @JsonProperty("disk_free")
    public void setDiskFree(Long diskFree) {
        this.diskFree = diskFree;
    }

    public Node withDiskFree(Long diskFree) {
        this.diskFree = diskFree;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The diskFreeDetails
     */
    @JsonProperty("disk_free_details")
    public Details getDiskFreeDetails() {
        return diskFreeDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param diskFreeDetails
     *     The disk_free_details
     */
    @JsonProperty("disk_free_details")
    public void setDiskFreeDetails(Details diskFreeDetails) {
        this.diskFreeDetails = diskFreeDetails;
    }

    public Node withDiskFreeDetails(Details diskFreeDetails) {
        this.diskFreeDetails = diskFreeDetails;
        return this;
    }

    /**
     *
     * @return
     *     The fdUsed
     */
    @JsonProperty("fd_used")
    public Long getFdUsed() {
        return fdUsed;
    }

    /**
     *
     * @param fdUsed
     *     The fd_used
     */
    @JsonProperty("fd_used")
    public void setFdUsed(Long fdUsed) {
        this.fdUsed = fdUsed;
    }

    public Node withFdUsed(Long fdUsed) {
        this.fdUsed = fdUsed;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The fdUsedDetails
     */
    @JsonProperty("fd_used_details")
    public Details getFdUsedDetails() {
        return fdUsedDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param fdUsedDetails
     *     The fd_used_details
     */
    @JsonProperty("fd_used_details")
    public void setFdUsedDetails(Details fdUsedDetails) {
        this.fdUsedDetails = fdUsedDetails;
    }

    public Node withFdUsedDetails(Details fdUsedDetails) {
        this.fdUsedDetails = fdUsedDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ioReadAvgTime
     */
    @JsonProperty("io_read_avg_time")
    public Long getIoReadAvgTime() {
        return ioReadAvgTime;
    }

    /**
     *
     * @param ioReadAvgTime
     *     The io_read_avg_time
     */
    @JsonProperty("io_read_avg_time")
    public void setIoReadAvgTime(Long ioReadAvgTime) {
        this.ioReadAvgTime = ioReadAvgTime;
    }

    public Node withIoReadAvgTime(Long ioReadAvgTime) {
        this.ioReadAvgTime = ioReadAvgTime;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ioReadAvgTimeDetails
     */
    @JsonProperty("io_read_avg_time_details")
    public Details getIoReadAvgTimeDetails() {
        return ioReadAvgTimeDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ioReadAvgTimeDetails
     *     The io_read_avg_time_details
     */
    @JsonProperty("io_read_avg_time_details")
    public void setIoReadAvgTimeDetails(Details ioReadAvgTimeDetails) {
        this.ioReadAvgTimeDetails = ioReadAvgTimeDetails;
    }

    public Node withIoReadAvgTimeDetails(Details ioReadAvgTimeDetails) {
        this.ioReadAvgTimeDetails = ioReadAvgTimeDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ioReadBytes
     */
    @JsonProperty("io_read_bytes")
    public Long getIoReadBytes() {
        return ioReadBytes;
    }

    /**
     *
     * @param ioReadBytes
     *     The io_read_bytes
     */
    @JsonProperty("io_read_bytes")
    public void setIoReadBytes(Long ioReadBytes) {
        this.ioReadBytes = ioReadBytes;
    }

    public Node withIoReadBytes(Long ioReadBytes) {
        this.ioReadBytes = ioReadBytes;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ioReadBytesDetails
     */
    @JsonProperty("io_read_bytes_details")
    public Details getIoReadBytesDetails() {
        return ioReadBytesDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ioReadBytesDetails
     *     The io_read_bytes_details
     */
    @JsonProperty("io_read_bytes_details")
    public void setIoReadBytesDetails(Details ioReadBytesDetails) {
        this.ioReadBytesDetails = ioReadBytesDetails;
    }

    public Node withIoReadBytesDetails(Details ioReadBytesDetails) {
        this.ioReadBytesDetails = ioReadBytesDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ioReadCount
     */
    @JsonProperty("io_read_count")
    public Long getIoReadCount() {
        return ioReadCount;
    }

    /**
     *
     * @param ioReadCount
     *     The io_read_count
     */
    @JsonProperty("io_read_count")
    public void setIoReadCount(Long ioReadCount) {
        this.ioReadCount = ioReadCount;
    }

    public Node withIoReadCount(Long ioReadCount) {
        this.ioReadCount = ioReadCount;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ioReadCountDetails
     */
    @JsonProperty("io_read_count_details")
    public Details getIoReadCountDetails() {
        return ioReadCountDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ioReadCountDetails
     *     The io_read_count_details
     */
    @JsonProperty("io_read_count_details")
    public void setIoReadCountDetails(Details ioReadCountDetails) {
        this.ioReadCountDetails = ioReadCountDetails;
    }

    public Node withIoReadCountDetails(Details ioReadCountDetails) {
        this.ioReadCountDetails = ioReadCountDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ioSeekCount
     */
    @JsonProperty("io_seek_count")
    public Long getIoSeekCount() {
        return ioSeekCount;
    }

    /**
     *
     * @param ioSeekCount
     *     The io_seek_count
     */
    @JsonProperty("io_seek_count")
    public void setIoSeekCount(Long ioSeekCount) {
        this.ioSeekCount = ioSeekCount;
    }

    public Node withIoSeekCount(Long ioSeekCount) {
        this.ioSeekCount = ioSeekCount;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ioSeekCountDetails
     */
    @JsonProperty("io_seek_count_details")
    public Details getIoSeekCountDetails() {
        return ioSeekCountDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ioSeekCountDetails
     *     The io_seek_count_details
     */
    @JsonProperty("io_seek_count_details")
    public void setIoSeekCountDetails(Details ioSeekCountDetails) {
        this.ioSeekCountDetails = ioSeekCountDetails;
    }

    public Node withIoSeekCountDetails(Details ioSeekCountDetails) {
        this.ioSeekCountDetails = ioSeekCountDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ioSyncAvgTime
     */
    @JsonProperty("io_sync_avg_time")
    public Long getIoSyncAvgTime() {
        return ioSyncAvgTime;
    }

    /**
     *
     * @param ioSyncAvgTime
     *     The io_sync_avg_time
     */
    @JsonProperty("io_sync_avg_time")
    public void setIoSyncAvgTime(Long ioSyncAvgTime) {
        this.ioSyncAvgTime = ioSyncAvgTime;
    }

    public Node withIoSyncAvgTime(Long ioSyncAvgTime) {
        this.ioSyncAvgTime = ioSyncAvgTime;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ioSyncAvgTimeDetails
     */
    @JsonProperty("io_sync_avg_time_details")
    public Details getIoSyncAvgTimeDetails() {
        return ioSyncAvgTimeDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ioSyncAvgTimeDetails
     *     The io_sync_avg_time_details
     */
    @JsonProperty("io_sync_avg_time_details")
    public void setIoSyncAvgTimeDetails(Details ioSyncAvgTimeDetails) {
        this.ioSyncAvgTimeDetails = ioSyncAvgTimeDetails;
    }

    public Node withIoSyncAvgTimeDetails(Details ioSyncAvgTimeDetails) {
        this.ioSyncAvgTimeDetails = ioSyncAvgTimeDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ioWriteAvgTime
     */
    @JsonProperty("io_write_avg_time")
    public Long getIoWriteAvgTime() {
        return ioWriteAvgTime;
    }

    /**
     *
     * @param ioWriteAvgTime
     *     The io_write_avg_time
     */
    @JsonProperty("io_write_avg_time")
    public void setIoWriteAvgTime(Long ioWriteAvgTime) {
        this.ioWriteAvgTime = ioWriteAvgTime;
    }

    public Node withIoWriteAvgTime(Long ioWriteAvgTime) {
        this.ioWriteAvgTime = ioWriteAvgTime;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The ioWriteAvgTimeDetails
     */
    @JsonProperty("io_write_avg_time_details")
    public Details getIoWriteAvgTimeDetails() {
        return ioWriteAvgTimeDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param ioWriteAvgTimeDetails
     *     The io_write_avg_time_details
     */
    @JsonProperty("io_write_avg_time_details")
    public void setIoWriteAvgTimeDetails(Details ioWriteAvgTimeDetails) {
        this.ioWriteAvgTimeDetails = ioWriteAvgTimeDetails;
    }

    public Node withIoWriteAvgTimeDetails(Details ioWriteAvgTimeDetails) {
        this.ioWriteAvgTimeDetails = ioWriteAvgTimeDetails;
        return this;
    }

    /**
     *
     * @return
     *     The memUsed
     */
    @JsonProperty("mem_used")
    public Long getMemUsed() {
        return memUsed;
    }

    /**
     *
     * @param memUsed
     *     The mem_used
     */
    @JsonProperty("mem_used")
    public void setMemUsed(Long memUsed) {
        this.memUsed = memUsed;
    }

    public Node withMemUsed(Long memUsed) {
        this.memUsed = memUsed;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The memUsedDetails
     */
    @JsonProperty("mem_used_details")
    public Details getMemUsedDetails() {
        return memUsedDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param memUsedDetails
     *     The mem_used_details
     */
    @JsonProperty("mem_used_details")
    public void setMemUsedDetails(Details memUsedDetails) {
        this.memUsedDetails = memUsedDetails;
    }

    public Node withMemUsedDetails(Details memUsedDetails) {
        this.memUsedDetails = memUsedDetails;
        return this;
    }

    /**
     *
     * @return
     *     The mnesiaDiskTxCount
     */
    @JsonProperty("mnesia_disk_tx_count")
    public Long getMnesiaDiskTxCount() {
        return mnesiaDiskTxCount;
    }

    /**
     *
     * @param mnesiaDiskTxCount
     *     The mnesia_disk_tx_count
     */
    @JsonProperty("mnesia_disk_tx_count")
    public void setMnesiaDiskTxCount(Long mnesiaDiskTxCount) {
        this.mnesiaDiskTxCount = mnesiaDiskTxCount;
    }

    public Node withMnesiaDiskTxCount(Long mnesiaDiskTxCount) {
        this.mnesiaDiskTxCount = mnesiaDiskTxCount;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The mnesiaDiskTxCountDetails
     */
    @JsonProperty("mnesia_disk_tx_count_details")
    public Details getMnesiaDiskTxCountDetails() {
        return mnesiaDiskTxCountDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param mnesiaDiskTxCountDetails
     *     The mnesia_disk_tx_count_details
     */
    @JsonProperty("mnesia_disk_tx_count_details")
    public void setMnesiaDiskTxCountDetails(Details mnesiaDiskTxCountDetails) {
        this.mnesiaDiskTxCountDetails = mnesiaDiskTxCountDetails;
    }

    public Node withMnesiaDiskTxCountDetails(Details mnesiaDiskTxCountDetails) {
        this.mnesiaDiskTxCountDetails = mnesiaDiskTxCountDetails;
        return this;
    }

    /**
     *
     * @return
     *     The mnesiaRamTxCount
     */
    @JsonProperty("mnesia_ram_tx_count")
    public Long getMnesiaRamTxCount() {
        return mnesiaRamTxCount;
    }

    /**
     *
     * @param mnesiaRamTxCount
     *     The mnesia_ram_tx_count
     */
    @JsonProperty("mnesia_ram_tx_count")
    public void setMnesiaRamTxCount(Long mnesiaRamTxCount) {
        this.mnesiaRamTxCount = mnesiaRamTxCount;
    }

    public Node withMnesiaRamTxCount(Long mnesiaRamTxCount) {
        this.mnesiaRamTxCount = mnesiaRamTxCount;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The mnesiaRamTxCountDetails
     */
    @JsonProperty("mnesia_ram_tx_count_details")
    public Details getMnesiaRamTxCountDetails() {
        return mnesiaRamTxCountDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param mnesiaRamTxCountDetails
     *     The mnesia_ram_tx_count_details
     */
    @JsonProperty("mnesia_ram_tx_count_details")
    public void setMnesiaRamTxCountDetails(Details mnesiaRamTxCountDetails) {
        this.mnesiaRamTxCountDetails = mnesiaRamTxCountDetails;
    }

    public Node withMnesiaRamTxCountDetails(Details mnesiaRamTxCountDetails) {
        this.mnesiaRamTxCountDetails = mnesiaRamTxCountDetails;
        return this;
    }

    /**
     *
     * @return
     *     The procUsed
     */
    @JsonProperty("proc_used")
    public Long getProcUsed() {
        return procUsed;
    }

    /**
     *
     * @param procUsed
     *     The proc_used
     */
    @JsonProperty("proc_used")
    public void setProcUsed(Long procUsed) {
        this.procUsed = procUsed;
    }

    public Node withProcUsed(Long procUsed) {
        this.procUsed = procUsed;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The procUsedDetails
     */
    @JsonProperty("proc_used_details")
    public Details getProcUsedDetails() {
        return procUsedDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param procUsedDetails
     *     The proc_used_details
     */
    @JsonProperty("proc_used_details")
    public void setProcUsedDetails(Details procUsedDetails) {
        this.procUsedDetails = procUsedDetails;
    }

    public Node withProcUsedDetails(Details procUsedDetails) {
        this.procUsedDetails = procUsedDetails;
        return this;
    }

    /**
     *
     * @return
     *     The socketsUsed
     */
    @JsonProperty("sockets_used")
    public Long getSocketsUsed() {
        return socketsUsed;
    }

    /**
     *
     * @param socketsUsed
     *     The sockets_used
     */
    @JsonProperty("sockets_used")
    public void setSocketsUsed(Long socketsUsed) {
        this.socketsUsed = socketsUsed;
    }

    public Node withSocketsUsed(Long socketsUsed) {
        this.socketsUsed = socketsUsed;
        return this;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @return
     *     The socketsUsedDetails
     */
    @JsonProperty("sockets_used_details")
    public Details getSocketsUsedDetails() {
        return socketsUsedDetails;
    }

    /**
     * Details of RabbitMQ messaging rates.
     *
     * @param socketsUsedDetails
     *     The sockets_used_details
     */
    @JsonProperty("sockets_used_details")
    public void setSocketsUsedDetails(Details socketsUsedDetails) {
        this.socketsUsedDetails = socketsUsedDetails;
    }

    public Node withSocketsUsedDetails(Details socketsUsedDetails) {
        this.socketsUsedDetails = socketsUsedDetails;
        return this;
    }

    /**
     *
     * @return
     *     The partitions
     */
    @JsonProperty("partitions")
    public List<String> getPartitions() {
        return partitions;
    }

    /**
     *
     * @param partitions
     *     The partitions
     */
    @JsonProperty("partitions")
    public void setPartitions(List<String> partitions) {
        this.partitions = partitions;
    }

    public Node withPartitions(List<String> partitions) {
        this.partitions = partitions;
        return this;
    }

    /**
     *
     * @return
     *     The osPid
     */
    @JsonProperty("os_pid")
    public String getOsPid() {
        return osPid;
    }

    /**
     *
     * @param osPid
     *     The os_pid
     */
    @JsonProperty("os_pid")
    public void setOsPid(String osPid) {
        this.osPid = osPid;
    }

    public Node withOsPid(String osPid) {
        this.osPid = osPid;
        return this;
    }

    /**
     *
     * @return
     *     The fdTotal
     */
    @JsonProperty("fd_total")
    public Long getFdTotal() {
        return fdTotal;
    }

    /**
     *
     * @param fdTotal
     *     The fd_total
     */
    @JsonProperty("fd_total")
    public void setFdTotal(Long fdTotal) {
        this.fdTotal = fdTotal;
    }

    public Node withFdTotal(Long fdTotal) {
        this.fdTotal = fdTotal;
        return this;
    }

    /**
     *
     * @return
     *     The socketsTotal
     */
    @JsonProperty("sockets_total")
    public Long getSocketsTotal() {
        return socketsTotal;
    }

    /**
     *
     * @param socketsTotal
     *     The sockets_total
     */
    @JsonProperty("sockets_total")
    public void setSocketsTotal(Long socketsTotal) {
        this.socketsTotal = socketsTotal;
    }

    public Node withSocketsTotal(Long socketsTotal) {
        this.socketsTotal = socketsTotal;
        return this;
    }

    /**
     *
     * @return
     *     The memLimit
     */
    @JsonProperty("mem_limit")
    public Long getMemLimit() {
        return memLimit;
    }

    /**
     *
     * @param memLimit
     *     The mem_limit
     */
    @JsonProperty("mem_limit")
    public void setMemLimit(Long memLimit) {
        this.memLimit = memLimit;
    }

    public Node withMemLimit(Long memLimit) {
        this.memLimit = memLimit;
        return this;
    }

    /**
     *
     * @return
     *     The memAlarm
     */
    @JsonProperty("mem_alarm")
    public Boolean getMemAlarm() {
        return memAlarm;
    }

    /**
     *
     * @param memAlarm
     *     The mem_alarm
     */
    @JsonProperty("mem_alarm")
    public void setMemAlarm(Boolean memAlarm) {
        this.memAlarm = memAlarm;
    }

    public Node withMemAlarm(Boolean memAlarm) {
        this.memAlarm = memAlarm;
        return this;
    }

    /**
     *
     * @return
     *     The diskFreeLimit
     */
    @JsonProperty("disk_free_limit")
    public Long getDiskFreeLimit() {
        return diskFreeLimit;
    }

    /**
     *
     * @param diskFreeLimit
     *     The disk_free_limit
     */
    @JsonProperty("disk_free_limit")
    public void setDiskFreeLimit(Long diskFreeLimit) {
        this.diskFreeLimit = diskFreeLimit;
    }

    public Node withDiskFreeLimit(Long diskFreeLimit) {
        this.diskFreeLimit = diskFreeLimit;
        return this;
    }

    /**
     *
     * @return
     *     The diskFreeAlarm
     */
    @JsonProperty("disk_free_alarm")
    public Boolean getDiskFreeAlarm() {
        return diskFreeAlarm;
    }

    /**
     *
     * @param diskFreeAlarm
     *     The disk_free_alarm
     */
    @JsonProperty("disk_free_alarm")
    public void setDiskFreeAlarm(Boolean diskFreeAlarm) {
        this.diskFreeAlarm = diskFreeAlarm;
    }

    public Node withDiskFreeAlarm(Boolean diskFreeAlarm) {
        this.diskFreeAlarm = diskFreeAlarm;
        return this;
    }

    /**
     *
     * @return
     *     The procTotal
     */
    @JsonProperty("proc_total")
    public Long getProcTotal() {
        return procTotal;
    }

    /**
     *
     * @param procTotal
     *     The proc_total
     */
    @JsonProperty("proc_total")
    public void setProcTotal(Long procTotal) {
        this.procTotal = procTotal;
    }

    public Node withProcTotal(Long procTotal) {
        this.procTotal = procTotal;
        return this;
    }

    /**
     *
     * @return
     *     The ratesMode
     */
    @JsonProperty("rates_mode")
    public Node.RatesMode getRatesMode() {
        return ratesMode;
    }

    /**
     *
     * @param ratesMode
     *     The rates_mode
     */
    @JsonProperty("rates_mode")
    public void setRatesMode(Node.RatesMode ratesMode) {
        this.ratesMode = ratesMode;
    }

    public Node withRatesMode(Node.RatesMode ratesMode) {
        this.ratesMode = ratesMode;
        return this;
    }

    /**
     *
     * @return
     *     The uptime
     */
    @JsonProperty("uptime")
    public Long getUptime() {
        return uptime;
    }

    /**
     *
     * @param uptime
     *     The uptime
     */
    @JsonProperty("uptime")
    public void setUptime(Long uptime) {
        this.uptime = uptime;
    }

    public Node withUptime(Long uptime) {
        this.uptime = uptime;
        return this;
    }

    /**
     *
     * @return
     *     The runQueue
     */
    @JsonProperty("run_queue")
    public Long getRunQueue() {
        return runQueue;
    }

    /**
     *
     * @param runQueue
     *     The run_queue
     */
    @JsonProperty("run_queue")
    public void setRunQueue(Long runQueue) {
        this.runQueue = runQueue;
    }

    public Node withRunQueue(Long runQueue) {
        this.runQueue = runQueue;
        return this;
    }

    /**
     *
     * @return
     *     The processors
     */
    @JsonProperty("processors")
    public Long getProcessors() {
        return processors;
    }

    /**
     *
     * @param processors
     *     The processors
     */
    @JsonProperty("processors")
    public void setProcessors(Long processors) {
        this.processors = processors;
    }

    public Node withProcessors(Long processors) {
        this.processors = processors;
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

    public Node withExchangeTypes(List<Description> exchangeTypes) {
        this.exchangeTypes = exchangeTypes;
        return this;
    }

    /**
     *
     * @return
     *     The authMechanisms
     */
    @JsonProperty("auth_mechanisms")
    public List<Description> getAuthMechanisms() {
        return authMechanisms;
    }

    /**
     *
     * @param authMechanisms
     *     The auth_mechanisms
     */
    @JsonProperty("auth_mechanisms")
    public void setAuthMechanisms(List<Description> authMechanisms) {
        this.authMechanisms = authMechanisms;
    }

    public Node withAuthMechanisms(List<Description> authMechanisms) {
        this.authMechanisms = authMechanisms;
        return this;
    }

    /**
     *
     * @return
     *     The applications
     */
    @JsonProperty("applications")
    public List<Application> getApplications() {
        return applications;
    }

    /**
     *
     * @param applications
     *     The applications
     */
    @JsonProperty("applications")
    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public Node withApplications(List<Application> applications) {
        this.applications = applications;
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

    public Node withContexts(List<Context> contexts) {
        this.contexts = contexts;
        return this;
    }

    /**
     *
     * @return
     *     The logFile
     */
    @JsonProperty("log_file")
    public String getLogFile() {
        return logFile;
    }

    /**
     *
     * @param logFile
     *     The log_file
     */
    @JsonProperty("log_file")
    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    public Node withLogFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    /**
     *
     * @return
     *     The saslLogFile
     */
    @JsonProperty("sasl_log_file")
    public String getSaslLogFile() {
        return saslLogFile;
    }

    /**
     *
     * @param saslLogFile
     *     The sasl_log_file
     */
    @JsonProperty("sasl_log_file")
    public void setSaslLogFile(String saslLogFile) {
        this.saslLogFile = saslLogFile;
    }

    public Node withSaslLogFile(String saslLogFile) {
        this.saslLogFile = saslLogFile;
        return this;
    }

    /**
     *
     * @return
     *     The dbDir
     */
    @JsonProperty("db_dir")
    public String getDbDir() {
        return dbDir;
    }

    /**
     *
     * @param dbDir
     *     The db_dir
     */
    @JsonProperty("db_dir")
    public void setDbDir(String dbDir) {
        this.dbDir = dbDir;
    }

    public Node withDbDir(String dbDir) {
        this.dbDir = dbDir;
        return this;
    }

    /**
     *
     * @return
     *     The configFiles
     */
    @JsonProperty("config_files")
    public List<String> getConfigFiles() {
        return configFiles;
    }

    /**
     *
     * @param configFiles
     *     The config_files
     */
    @JsonProperty("config_files")
    public void setConfigFiles(List<String> configFiles) {
        this.configFiles = configFiles;
    }

    public Node withConfigFiles(List<String> configFiles) {
        this.configFiles = configFiles;
        return this;
    }

    /**
     *
     * @return
     *     The netTicktime
     */
    @JsonProperty("net_ticktime")
    public Long getNetTicktime() {
        return netTicktime;
    }

    /**
     *
     * @param netTicktime
     *     The net_ticktime
     */
    @JsonProperty("net_ticktime")
    public void setNetTicktime(Long netTicktime) {
        this.netTicktime = netTicktime;
    }

    public Node withNetTicktime(Long netTicktime) {
        this.netTicktime = netTicktime;
        return this;
    }

    /**
     *
     * @return
     *     The enabledPlugins
     */
    @JsonProperty("enabled_plugins")
    public List<String> getEnabledPlugins() {
        return enabledPlugins;
    }

    /**
     *
     * @param enabledPlugins
     *     The enabled_plugins
     */
    @JsonProperty("enabled_plugins")
    public void setEnabledPlugins(List<String> enabledPlugins) {
        this.enabledPlugins = enabledPlugins;
    }

    public Node withEnabledPlugins(List<String> enabledPlugins) {
        this.enabledPlugins = enabledPlugins;
        return this;
    }

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

    public Node withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Node withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The running
     */
    @JsonProperty("running")
    public Boolean getRunning() {
        return running;
    }

    /**
     *
     * @param running
     *     The running
     */
    @JsonProperty("running")
    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Node withRunning(Boolean running) {
        this.running = running;
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

    public Node withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clusterLinks).append(diskFree).append(diskFreeDetails).append(fdUsed).append(fdUsedDetails).append(ioReadAvgTime).append(ioReadAvgTimeDetails).append(ioReadBytes).append(ioReadBytesDetails).append(ioReadCount).append(ioReadCountDetails).append(ioSeekCount).append(ioSeekCountDetails).append(ioSyncAvgTime).append(ioSyncAvgTimeDetails).append(ioWriteAvgTime).append(ioWriteAvgTimeDetails).append(memUsed).append(memUsedDetails).append(mnesiaDiskTxCount).append(mnesiaDiskTxCountDetails).append(mnesiaRamTxCount).append(mnesiaRamTxCountDetails).append(procUsed).append(procUsedDetails).append(socketsUsed).append(socketsUsedDetails).append(partitions).append(osPid).append(fdTotal).append(socketsTotal).append(memLimit).append(memAlarm).append(diskFreeLimit).append(diskFreeAlarm).append(procTotal).append(ratesMode).append(uptime).append(runQueue).append(processors).append(exchangeTypes).append(authMechanisms).append(applications).append(contexts).append(logFile).append(saslLogFile).append(dbDir).append(configFiles).append(netTicktime).append(enabledPlugins).append(name).append(type).append(running).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Node) == false) {
            return false;
        }
        Node rhs = ((Node) other);
        return new EqualsBuilder().append(clusterLinks, rhs.clusterLinks).append(diskFree, rhs.diskFree).append(diskFreeDetails, rhs.diskFreeDetails).append(fdUsed, rhs.fdUsed).append(fdUsedDetails, rhs.fdUsedDetails).append(ioReadAvgTime, rhs.ioReadAvgTime).append(ioReadAvgTimeDetails, rhs.ioReadAvgTimeDetails).append(ioReadBytes, rhs.ioReadBytes).append(ioReadBytesDetails, rhs.ioReadBytesDetails).append(ioReadCount, rhs.ioReadCount).append(ioReadCountDetails, rhs.ioReadCountDetails).append(ioSeekCount, rhs.ioSeekCount).append(ioSeekCountDetails, rhs.ioSeekCountDetails).append(ioSyncAvgTime, rhs.ioSyncAvgTime).append(ioSyncAvgTimeDetails, rhs.ioSyncAvgTimeDetails).append(ioWriteAvgTime, rhs.ioWriteAvgTime).append(ioWriteAvgTimeDetails, rhs.ioWriteAvgTimeDetails).append(memUsed, rhs.memUsed).append(memUsedDetails, rhs.memUsedDetails).append(mnesiaDiskTxCount, rhs.mnesiaDiskTxCount).append(mnesiaDiskTxCountDetails, rhs.mnesiaDiskTxCountDetails).append(mnesiaRamTxCount, rhs.mnesiaRamTxCount).append(mnesiaRamTxCountDetails, rhs.mnesiaRamTxCountDetails).append(procUsed, rhs.procUsed).append(procUsedDetails, rhs.procUsedDetails).append(socketsUsed, rhs.socketsUsed).append(socketsUsedDetails, rhs.socketsUsedDetails).append(partitions, rhs.partitions).append(osPid, rhs.osPid).append(fdTotal, rhs.fdTotal).append(socketsTotal, rhs.socketsTotal).append(memLimit, rhs.memLimit).append(memAlarm, rhs.memAlarm).append(diskFreeLimit, rhs.diskFreeLimit).append(diskFreeAlarm, rhs.diskFreeAlarm).append(procTotal, rhs.procTotal).append(ratesMode, rhs.ratesMode).append(uptime, rhs.uptime).append(runQueue, rhs.runQueue).append(processors, rhs.processors).append(exchangeTypes, rhs.exchangeTypes).append(authMechanisms, rhs.authMechanisms).append(applications, rhs.applications).append(contexts, rhs.contexts).append(logFile, rhs.logFile).append(saslLogFile, rhs.saslLogFile).append(dbDir, rhs.dbDir).append(configFiles, rhs.configFiles).append(netTicktime, rhs.netTicktime).append(enabledPlugins, rhs.enabledPlugins).append(name, rhs.name).append(type, rhs.type).append(running, rhs.running).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum RatesMode {

        BASIC("basic"),
        DETAILED("detailed"),
        NONE("none");
        private final String value;
        private static Map<String, Node.RatesMode> constants = new HashMap<String, Node.RatesMode>();

        static {
            for (Node.RatesMode c: values()) {
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
        public static Node.RatesMode fromValue(String value) {
            Node.RatesMode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
