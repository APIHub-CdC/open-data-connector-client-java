package mx.com.cdc.odc.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class AggregationServiceResponsePayload {
  @SerializedName("sid")
  private String sid = null;
  @SerializedName("widget_url")
  private String widgetUrl = null;
  @SerializedName("work_mode")
  private BigDecimal workMode = null;
  @SerializedName("data")
  private AggregationServiceResponsePayloadData data = null;
  public AggregationServiceResponsePayload sid(String sid) {
    this.sid = sid;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getSid() {
    return sid;
  }
  public void setSid(String sid) {
    this.sid = sid;
  }
  public AggregationServiceResponsePayload widgetUrl(String widgetUrl) {
    this.widgetUrl = widgetUrl;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getWidgetUrl() {
    return widgetUrl;
  }
  public void setWidgetUrl(String widgetUrl) {
    this.widgetUrl = widgetUrl;
  }
  public AggregationServiceResponsePayload workMode(BigDecimal workMode) {
    this.workMode = workMode;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public BigDecimal getWorkMode() {
    return workMode;
  }
  public void setWorkMode(BigDecimal workMode) {
    this.workMode = workMode;
  }
  public AggregationServiceResponsePayload data(AggregationServiceResponsePayloadData data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AggregationServiceResponsePayloadData getData() {
    return data;
  }
  public void setData(AggregationServiceResponsePayloadData data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationServiceResponsePayload aggregationServiceResponsePayload = (AggregationServiceResponsePayload) o;
    return Objects.equals(this.sid, aggregationServiceResponsePayload.sid) &&
        Objects.equals(this.widgetUrl, aggregationServiceResponsePayload.widgetUrl) &&
        Objects.equals(this.workMode, aggregationServiceResponsePayload.workMode) &&
        Objects.equals(this.data, aggregationServiceResponsePayload.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(sid, widgetUrl, workMode, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationServiceResponsePayload {\n");
    
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    widgetUrl: ").append(toIndentedString(widgetUrl)).append("\n");
    sb.append("    workMode: ").append(toIndentedString(workMode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
