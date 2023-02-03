package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosAggregationServiceData {
  @SerializedName("request_code")
  private String requestCode = null;
  @SerializedName("client_data")
  private List<TelcosClientData> clientData = null;
  @SerializedName("summaries")
  private List<TelcosSummaries> summaries = null;
  @SerializedName("plan_details")
  private List<TelcosPlanDetails> planDetails = null;
  @SerializedName("billing")
  private List<TelcosBilling> billing = null;
  @SerializedName("payment_history")
  private List<TelcosPaymentHistory> paymentHistory = null;
  @SerializedName("credit_payments")
  private List<TelcosCreditPayments> creditPayments = null;
  @SerializedName("errors")
  private List<Object> errors = null;
  public TelcosAggregationServiceData requestCode(String requestCode) {
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
  public TelcosAggregationServiceData clientData(List<TelcosClientData> clientData) {
    this.clientData = clientData;
    return this;
  }
  public TelcosAggregationServiceData addClientDataItem(TelcosClientData clientDataItem) {
    if (this.clientData == null) {
      this.clientData = new ArrayList<TelcosClientData>();
    }
    this.clientData.add(clientDataItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information related to the customer owner of the account.")
  public List<TelcosClientData> getClientData() {
    return clientData;
  }
  public void setClientData(List<TelcosClientData> clientData) {
    this.clientData = clientData;
  }
  public TelcosAggregationServiceData summaries(List<TelcosSummaries> summaries) {
    this.summaries = summaries;
    return this;
  }
  public TelcosAggregationServiceData addSummariesItem(TelcosSummaries summariesItem) {
    if (this.summaries == null) {
      this.summaries = new ArrayList<TelcosSummaries>();
    }
    this.summaries.add(summariesItem);
    return this;
  }
   
  @ApiModelProperty(value = "Summaries of the differente plans hired in this account.")
  public List<TelcosSummaries> getSummaries() {
    return summaries;
  }
  public void setSummaries(List<TelcosSummaries> summaries) {
    this.summaries = summaries;
  }
  public TelcosAggregationServiceData planDetails(List<TelcosPlanDetails> planDetails) {
    this.planDetails = planDetails;
    return this;
  }
  public TelcosAggregationServiceData addPlanDetailsItem(TelcosPlanDetails planDetailsItem) {
    if (this.planDetails == null) {
      this.planDetails = new ArrayList<TelcosPlanDetails>();
    }
    this.planDetails.add(planDetailsItem);
    return this;
  }
   
  @ApiModelProperty(value = "It has the details or description of the hired plan for the account.")
  public List<TelcosPlanDetails> getPlanDetails() {
    return planDetails;
  }
  public void setPlanDetails(List<TelcosPlanDetails> planDetails) {
    this.planDetails = planDetails;
  }
  public TelcosAggregationServiceData billing(List<TelcosBilling> billing) {
    this.billing = billing;
    return this;
  }
  public TelcosAggregationServiceData addBillingItem(TelcosBilling billingItem) {
    if (this.billing == null) {
      this.billing = new ArrayList<TelcosBilling>();
    }
    this.billing.add(billingItem);
    return this;
  }
   
  @ApiModelProperty(value = "Account balance and billing information.")
  public List<TelcosBilling> getBilling() {
    return billing;
  }
  public void setBilling(List<TelcosBilling> billing) {
    this.billing = billing;
  }
  public TelcosAggregationServiceData paymentHistory(List<TelcosPaymentHistory> paymentHistory) {
    this.paymentHistory = paymentHistory;
    return this;
  }
  public TelcosAggregationServiceData addPaymentHistoryItem(TelcosPaymentHistory paymentHistoryItem) {
    if (this.paymentHistory == null) {
      this.paymentHistory = new ArrayList<TelcosPaymentHistory>();
    }
    this.paymentHistory.add(paymentHistoryItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information related to previous bills and payments.")
  public List<TelcosPaymentHistory> getPaymentHistory() {
    return paymentHistory;
  }
  public void setPaymentHistory(List<TelcosPaymentHistory> paymentHistory) {
    this.paymentHistory = paymentHistory;
  }
  public TelcosAggregationServiceData creditPayments(List<TelcosCreditPayments> creditPayments) {
    this.creditPayments = creditPayments;
    return this;
  }
  public TelcosAggregationServiceData addCreditPaymentsItem(TelcosCreditPayments creditPaymentsItem) {
    if (this.creditPayments == null) {
      this.creditPayments = new ArrayList<TelcosCreditPayments>();
    }
    this.creditPayments.add(creditPaymentsItem);
    return this;
  }
   
  @ApiModelProperty(value = "Shows information about air time and credits sent from the account to another phone or account.")
  public List<TelcosCreditPayments> getCreditPayments() {
    return creditPayments;
  }
  public void setCreditPayments(List<TelcosCreditPayments> creditPayments) {
    this.creditPayments = creditPayments;
  }
  public TelcosAggregationServiceData errors(List<Object> errors) {
    this.errors = errors;
    return this;
  }
  public TelcosAggregationServiceData addErrorsItem(Object errorsItem) {
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
    TelcosAggregationServiceData telcosAggregationServiceData = (TelcosAggregationServiceData) o;
    return Objects.equals(this.requestCode, telcosAggregationServiceData.requestCode) &&
        Objects.equals(this.clientData, telcosAggregationServiceData.clientData) &&
        Objects.equals(this.summaries, telcosAggregationServiceData.summaries) &&
        Objects.equals(this.planDetails, telcosAggregationServiceData.planDetails) &&
        Objects.equals(this.billing, telcosAggregationServiceData.billing) &&
        Objects.equals(this.paymentHistory, telcosAggregationServiceData.paymentHistory) &&
        Objects.equals(this.creditPayments, telcosAggregationServiceData.creditPayments) &&
        Objects.equals(this.errors, telcosAggregationServiceData.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(requestCode, clientData, summaries, planDetails, billing, paymentHistory, creditPayments, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosAggregationServiceData {\n");
    
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    clientData: ").append(toIndentedString(clientData)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    planDetails: ").append(toIndentedString(planDetails)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    paymentHistory: ").append(toIndentedString(paymentHistory)).append("\n");
    sb.append("    creditPayments: ").append(toIndentedString(creditPayments)).append("\n");
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
