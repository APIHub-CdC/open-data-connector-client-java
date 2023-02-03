package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class AggregationLoginEvent {
  @SerializedName("data")
  private AggregationLoginEventData data = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("environment")
  private String environment = null;
  @SerializedName("response_id")
  private String responseId = null;
  @SerializedName("service")
  private String service = null;
  @SerializedName("signature")
  private String signature = null;
  @SerializedName("trace_identifier")
  private String traceIdentifier = null;
  @SerializedName("triggered_event")
  private String triggeredEvent = null;
  public AggregationLoginEvent data(AggregationLoginEventData data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AggregationLoginEventData getData() {
    return data;
  }
  public void setData(AggregationLoginEventData data) {
    this.data = data;
  }
  public AggregationLoginEvent date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public AggregationLoginEvent environment(String environment) {
    this.environment = environment;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getEnvironment() {
    return environment;
  }
  public void setEnvironment(String environment) {
    this.environment = environment;
  }
  public AggregationLoginEvent responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }
  public AggregationLoginEvent service(String service) {
    this.service = service;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getService() {
    return service;
  }
  public void setService(String service) {
    this.service = service;
  }
  public AggregationLoginEvent signature(String signature) {
    this.signature = signature;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
  }
  public AggregationLoginEvent traceIdentifier(String traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getTraceIdentifier() {
    return traceIdentifier;
  }
  public void setTraceIdentifier(String traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
  }
  public AggregationLoginEvent triggeredEvent(String triggeredEvent) {
    this.triggeredEvent = triggeredEvent;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getTriggeredEvent() {
    return triggeredEvent;
  }
  public void setTriggeredEvent(String triggeredEvent) {
    this.triggeredEvent = triggeredEvent;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationLoginEvent aggregationLoginEvent = (AggregationLoginEvent) o;
    return Objects.equals(this.data, aggregationLoginEvent.data) &&
        Objects.equals(this.date, aggregationLoginEvent.date) &&
        Objects.equals(this.environment, aggregationLoginEvent.environment) &&
        Objects.equals(this.responseId, aggregationLoginEvent.responseId) &&
        Objects.equals(this.service, aggregationLoginEvent.service) &&
        Objects.equals(this.signature, aggregationLoginEvent.signature) &&
        Objects.equals(this.traceIdentifier, aggregationLoginEvent.traceIdentifier) &&
        Objects.equals(this.triggeredEvent, aggregationLoginEvent.triggeredEvent);
  }
  @Override
  public int hashCode() {
    return Objects.hash(data, date, environment, responseId, service, signature, traceIdentifier, triggeredEvent);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationLoginEvent {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    traceIdentifier: ").append(toIndentedString(traceIdentifier)).append("\n");
    sb.append("    triggeredEvent: ").append(toIndentedString(triggeredEvent)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
