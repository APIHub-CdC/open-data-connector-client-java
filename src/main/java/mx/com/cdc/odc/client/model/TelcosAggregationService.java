package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosAggregationService {
  @SerializedName("data")
  private TelcosAggregationServiceData data = null;
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
  public TelcosAggregationService data(TelcosAggregationServiceData data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public TelcosAggregationServiceData getData() {
    return data;
  }
  public void setData(TelcosAggregationServiceData data) {
    this.data = data;
  }
  public TelcosAggregationService date(LocalDate date) {
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
  public TelcosAggregationService environment(String environment) {
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
  public TelcosAggregationService responseId(String responseId) {
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
  public TelcosAggregationService service(String service) {
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
  public TelcosAggregationService signature(String signature) {
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
  public TelcosAggregationService traceIdentifier(String traceIdentifier) {
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
  public TelcosAggregationService triggeredEvent(String triggeredEvent) {
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
    TelcosAggregationService telcosAggregationService = (TelcosAggregationService) o;
    return Objects.equals(this.data, telcosAggregationService.data) &&
        Objects.equals(this.date, telcosAggregationService.date) &&
        Objects.equals(this.environment, telcosAggregationService.environment) &&
        Objects.equals(this.responseId, telcosAggregationService.responseId) &&
        Objects.equals(this.service, telcosAggregationService.service) &&
        Objects.equals(this.signature, telcosAggregationService.signature) &&
        Objects.equals(this.traceIdentifier, telcosAggregationService.traceIdentifier) &&
        Objects.equals(this.triggeredEvent, telcosAggregationService.triggeredEvent);
  }
  @Override
  public int hashCode() {
    return Objects.hash(data, date, environment, responseId, service, signature, traceIdentifier, triggeredEvent);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosAggregationService {\n");
    
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
