package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class AggregationLoginEventData {
  @SerializedName("error_message")
  private String errorMessage = null;
  @SerializedName("error_code")
  private String errorCode = null;
  @SerializedName("product")
  private String product = null;
  @SerializedName("success")
  private Boolean success = null;
  public AggregationLoginEventData errorMessage(String errorMessage) {
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
  public AggregationLoginEventData errorCode(String errorCode) {
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
  public AggregationLoginEventData product(String product) {
    this.product = product;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public AggregationLoginEventData success(Boolean success) {
    this.success = success;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationLoginEventData aggregationLoginEventData = (AggregationLoginEventData) o;
    return Objects.equals(this.errorMessage, aggregationLoginEventData.errorMessage) &&
        Objects.equals(this.errorCode, aggregationLoginEventData.errorCode) &&
        Objects.equals(this.product, aggregationLoginEventData.product) &&
        Objects.equals(this.success, aggregationLoginEventData.success);
  }
  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorCode, product, success);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationLoginEventData {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
