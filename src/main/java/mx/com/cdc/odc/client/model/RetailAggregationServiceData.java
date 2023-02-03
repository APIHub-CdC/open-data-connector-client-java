package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class RetailAggregationServiceData {
  @SerializedName("request_code")
  private String requestCode = null;
  @SerializedName("customers")
  private List<RetailCustomers> customers = null;
  @SerializedName("shopping")
  private List<RetailShopping> shopping = null;
  @SerializedName("shopping_credits")
  private List<RetailShoppingCredits> shoppingCredits = null;
  @SerializedName("shopping_credit_billing")
  private List<RetailShoppingCreditBilling> shoppingCreditBilling = null;
  @SerializedName("errors")
  private List<Object> errors = null;
  public RetailAggregationServiceData requestCode(String requestCode) {
    this.requestCode = requestCode;
    return this;
  }
   
  @ApiModelProperty(value = "Unique alphanumeric identifier for the request.")
  public String getRequestCode() {
    return requestCode;
  }
  public void setRequestCode(String requestCode) {
    this.requestCode = requestCode;
  }
  public RetailAggregationServiceData customers(List<RetailCustomers> customers) {
    this.customers = customers;
    return this;
  }
  public RetailAggregationServiceData addCustomersItem(RetailCustomers customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<RetailCustomers>();
    }
    this.customers.add(customersItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information related to the customer owner of the account.")
  public List<RetailCustomers> getCustomers() {
    return customers;
  }
  public void setCustomers(List<RetailCustomers> customers) {
    this.customers = customers;
  }
  public RetailAggregationServiceData shopping(List<RetailShopping> shopping) {
    this.shopping = shopping;
    return this;
  }
  public RetailAggregationServiceData addShoppingItem(RetailShopping shoppingItem) {
    if (this.shopping == null) {
      this.shopping = new ArrayList<RetailShopping>();
    }
    this.shopping.add(shoppingItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information related to products bought by the customer in the store related to the account.")
  public List<RetailShopping> getShopping() {
    return shopping;
  }
  public void setShopping(List<RetailShopping> shopping) {
    this.shopping = shopping;
  }
  public RetailAggregationServiceData shoppingCredits(List<RetailShoppingCredits> shoppingCredits) {
    this.shoppingCredits = shoppingCredits;
    return this;
  }
  public RetailAggregationServiceData addShoppingCreditsItem(RetailShoppingCredits shoppingCreditsItem) {
    if (this.shoppingCredits == null) {
      this.shoppingCredits = new ArrayList<RetailShoppingCredits>();
    }
    this.shoppingCredits.add(shoppingCreditsItem);
    return this;
  }
   
  @ApiModelProperty(value = "This show the Loan or Credit tools that the customer has hired from the store. It could be Credit Cards or Loans for shopping goods.")
  public List<RetailShoppingCredits> getShoppingCredits() {
    return shoppingCredits;
  }
  public void setShoppingCredits(List<RetailShoppingCredits> shoppingCredits) {
    this.shoppingCredits = shoppingCredits;
  }
  public RetailAggregationServiceData shoppingCreditBilling(List<RetailShoppingCreditBilling> shoppingCreditBilling) {
    this.shoppingCreditBilling = shoppingCreditBilling;
    return this;
  }
  public RetailAggregationServiceData addShoppingCreditBillingItem(RetailShoppingCreditBilling shoppingCreditBillingItem) {
    if (this.shoppingCreditBilling == null) {
      this.shoppingCreditBilling = new ArrayList<RetailShoppingCreditBilling>();
    }
    this.shoppingCreditBilling.add(shoppingCreditBillingItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information about Loans or Credit Cards statements.")
  public List<RetailShoppingCreditBilling> getShoppingCreditBilling() {
    return shoppingCreditBilling;
  }
  public void setShoppingCreditBilling(List<RetailShoppingCreditBilling> shoppingCreditBilling) {
    this.shoppingCreditBilling = shoppingCreditBilling;
  }
  public RetailAggregationServiceData errors(List<Object> errors) {
    this.errors = errors;
    return this;
  }
  public RetailAggregationServiceData addErrorsItem(Object errorsItem) {
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
    RetailAggregationServiceData retailAggregationServiceData = (RetailAggregationServiceData) o;
    return Objects.equals(this.requestCode, retailAggregationServiceData.requestCode) &&
        Objects.equals(this.customers, retailAggregationServiceData.customers) &&
        Objects.equals(this.shopping, retailAggregationServiceData.shopping) &&
        Objects.equals(this.shoppingCredits, retailAggregationServiceData.shoppingCredits) &&
        Objects.equals(this.shoppingCreditBilling, retailAggregationServiceData.shoppingCreditBilling) &&
        Objects.equals(this.errors, retailAggregationServiceData.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(requestCode, customers, shopping, shoppingCredits, shoppingCreditBilling, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailAggregationServiceData {\n");
    
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    shopping: ").append(toIndentedString(shopping)).append("\n");
    sb.append("    shoppingCredits: ").append(toIndentedString(shoppingCredits)).append("\n");
    sb.append("    shoppingCreditBilling: ").append(toIndentedString(shoppingCreditBilling)).append("\n");
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
