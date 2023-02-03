package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "Error")


public class Error {
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;
  public Error code(String code) {
    this.code = code;
    return this;
  }
   
  @ApiModelProperty(example = "400", value = "Error code.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public Error message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "External data source not available.", value = "Descriptive and human-readable error message.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message);
  }
  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
