package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class InvestmentCustomers {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("full_name")
  private String fullName = null;
  public InvestmentCustomers id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "ID assigned to the customer by the data source.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public InvestmentCustomers fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
   
  @ApiModelProperty(value = "Customer full name.")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentCustomers investmentCustomers = (InvestmentCustomers) o;
    return Objects.equals(this.id, investmentCustomers.id) &&
        Objects.equals(this.fullName, investmentCustomers.fullName);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, fullName);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentCustomers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
