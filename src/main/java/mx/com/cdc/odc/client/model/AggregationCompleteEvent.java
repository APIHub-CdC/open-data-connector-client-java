package mx.com.cdc.odc.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class AggregationCompleteEvent {
  @SerializedName("data")
  private AggregationCompleteEventData data = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("enviroment")
  private String enviroment = null;
  @SerializedName("response_id")
  private String responseId = null;
  @SerializedName("service")
  private String service = null;
  @SerializedName("signature")
  private String signature = null;
  @SerializedName("trace_identifier")
  private BigDecimal traceIdentifier = null;
  @SerializedName("triggered_event")
  private String triggeredEvent = null;
  public AggregationCompleteEvent data(AggregationCompleteEventData data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AggregationCompleteEventData getData() {
    return data;
  }
  public void setData(AggregationCompleteEventData data) {
    this.data = data;
  }
  public AggregationCompleteEvent date(LocalDate date) {
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
  public AggregationCompleteEvent enviroment(String enviroment) {
    this.enviroment = enviroment;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getEnviroment() {
    return enviroment;
  }
  public void setEnviroment(String enviroment) {
    this.enviroment = enviroment;
  }
  public AggregationCompleteEvent responseId(String responseId) {
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
  public AggregationCompleteEvent service(String service) {
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
  public AggregationCompleteEvent signature(String signature) {
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
  public AggregationCompleteEvent traceIdentifier(BigDecimal traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public BigDecimal getTraceIdentifier() {
    return traceIdentifier;
  }
  public void setTraceIdentifier(BigDecimal traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
  }
  public AggregationCompleteEvent triggeredEvent(String triggeredEvent) {
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
    AggregationCompleteEvent aggregationCompleteEvent = (AggregationCompleteEvent) o;
    return Objects.equals(this.data, aggregationCompleteEvent.data) &&
        Objects.equals(this.date, aggregationCompleteEvent.date) &&
        Objects.equals(this.enviroment, aggregationCompleteEvent.enviroment) &&
        Objects.equals(this.responseId, aggregationCompleteEvent.responseId) &&
        Objects.equals(this.service, aggregationCompleteEvent.service) &&
        Objects.equals(this.signature, aggregationCompleteEvent.signature) &&
        Objects.equals(this.traceIdentifier, aggregationCompleteEvent.traceIdentifier) &&
        Objects.equals(this.triggeredEvent, aggregationCompleteEvent.triggeredEvent);
  }
  @Override
  public int hashCode() {
    return Objects.hash(data, date, enviroment, responseId, service, signature, traceIdentifier, triggeredEvent);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationCompleteEvent {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    enviroment: ").append(toIndentedString(enviroment)).append("\n");
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
