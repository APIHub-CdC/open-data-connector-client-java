package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class AggregationCompleteEventData {
  @SerializedName("request_code")
  private String requestCode = null;
  @SerializedName("error_code")
  private String errorCode = null;
  @SerializedName("error_message")
  private String errorMessage = null;
  public AggregationCompleteEventData requestCode(String requestCode) {
    this.requestCode = requestCode;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getRequestCode() {
    return requestCode;
  }
  public void setRequestCode(String requestCode) {
    this.requestCode = requestCode;
  }
  public AggregationCompleteEventData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }
  public AggregationCompleteEventData errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationCompleteEventData aggregationCompleteEventData = (AggregationCompleteEventData) o;
    return Objects.equals(this.requestCode, aggregationCompleteEventData.requestCode) &&
        Objects.equals(this.errorCode, aggregationCompleteEventData.errorCode) &&
        Objects.equals(this.errorMessage, aggregationCompleteEventData.errorMessage);
  }
  @Override
  public int hashCode() {
    return Objects.hash(requestCode, errorCode, errorMessage);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationCompleteEventData {\n");
    
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
