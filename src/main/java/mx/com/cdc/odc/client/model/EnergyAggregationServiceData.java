package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class EnergyAggregationServiceData {
  @SerializedName("request_code")
  private String requestCode = null;
  @SerializedName("customers")
  private List<EnergyCustomers> customers = null;
  @SerializedName("account_details")
  private List<EnergyAccountDetails> accountDetails = null;
  @SerializedName("errors")
  private List<Object> errors = null;
  public EnergyAggregationServiceData requestCode(String requestCode) {
    this.requestCode = requestCode;
    return this;
  }
   
  @ApiModelProperty(value = "Request code used to identify this order. Must be unique.")
  public String getRequestCode() {
    return requestCode;
  }
  public void setRequestCode(String requestCode) {
    this.requestCode = requestCode;
  }
  public EnergyAggregationServiceData customers(List<EnergyCustomers> customers) {
    this.customers = customers;
    return this;
  }
  public EnergyAggregationServiceData addCustomersItem(EnergyCustomers customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<EnergyCustomers>();
    }
    this.customers.add(customersItem);
    return this;
  }
   
  @ApiModelProperty(value = "Customers list.")
  public List<EnergyCustomers> getCustomers() {
    return customers;
  }
  public void setCustomers(List<EnergyCustomers> customers) {
    this.customers = customers;
  }
  public EnergyAggregationServiceData accountDetails(List<EnergyAccountDetails> accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }
  public EnergyAggregationServiceData addAccountDetailsItem(EnergyAccountDetails accountDetailsItem) {
    if (this.accountDetails == null) {
      this.accountDetails = new ArrayList<EnergyAccountDetails>();
    }
    this.accountDetails.add(accountDetailsItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information about the services account.")
  public List<EnergyAccountDetails> getAccountDetails() {
    return accountDetails;
  }
  public void setAccountDetails(List<EnergyAccountDetails> accountDetails) {
    this.accountDetails = accountDetails;
  }
  public EnergyAggregationServiceData errors(List<Object> errors) {
    this.errors = errors;
    return this;
  }
  public EnergyAggregationServiceData addErrorsItem(Object errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Object>();
    }
    this.errors.add(errorsItem);
    return this;
  }
   
  @ApiModelProperty(value = "Shows errors related to the aggregation process.")
  public List<Object> getErrors() {
    return errors;
  }
  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyAggregationServiceData energyAggregationServiceData = (EnergyAggregationServiceData) o;
    return Objects.equals(this.requestCode, energyAggregationServiceData.requestCode) &&
        Objects.equals(this.customers, energyAggregationServiceData.customers) &&
        Objects.equals(this.accountDetails, energyAggregationServiceData.accountDetails) &&
        Objects.equals(this.errors, energyAggregationServiceData.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(requestCode, customers, accountDetails, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyAggregationServiceData {\n");
    
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
