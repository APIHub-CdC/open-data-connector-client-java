package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class EnergyAccountDetails {
  @SerializedName("account_id")
  private String accountId = null;
  @SerializedName("payment_amount")
  private String paymentAmount = null;
  @SerializedName("payment_period")
  private List<Object> paymentPeriod = null;
  @SerializedName("payment_due")
  private String paymentDue = null;
  @SerializedName("payment_status")
  private String paymentStatus = null;
  @SerializedName("payment_history")
  private List<EnergyPaymentHistory> paymentHistory = null;
  public EnergyAccountDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }
   
  @ApiModelProperty(value = "Account ID associated to the customer.")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public EnergyAccountDetails paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Bill total amount.")
  public String getPaymentAmount() {
    return paymentAmount;
  }
  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }
  public EnergyAccountDetails paymentPeriod(List<Object> paymentPeriod) {
    this.paymentPeriod = paymentPeriod;
    return this;
  }
  public EnergyAccountDetails addPaymentPeriodItem(Object paymentPeriodItem) {
    if (this.paymentPeriod == null) {
      this.paymentPeriod = new ArrayList<Object>();
    }
    this.paymentPeriod.add(paymentPeriodItem);
    return this;
  }
   
  @ApiModelProperty(value = "Billing period.")
  public List<Object> getPaymentPeriod() {
    return paymentPeriod;
  }
  public void setPaymentPeriod(List<Object> paymentPeriod) {
    this.paymentPeriod = paymentPeriod;
  }
  public EnergyAccountDetails paymentDue(String paymentDue) {
    this.paymentDue = paymentDue;
    return this;
  }
   
  @ApiModelProperty(value = "Payment due date.")
  public String getPaymentDue() {
    return paymentDue;
  }
  public void setPaymentDue(String paymentDue) {
    this.paymentDue = paymentDue;
  }
  public EnergyAccountDetails paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }
   
  @ApiModelProperty(value = "Payment status according to the service platform.")
  public String getPaymentStatus() {
    return paymentStatus;
  }
  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }
  public EnergyAccountDetails paymentHistory(List<EnergyPaymentHistory> paymentHistory) {
    this.paymentHistory = paymentHistory;
    return this;
  }
  public EnergyAccountDetails addPaymentHistoryItem(EnergyPaymentHistory paymentHistoryItem) {
    if (this.paymentHistory == null) {
      this.paymentHistory = new ArrayList<EnergyPaymentHistory>();
    }
    this.paymentHistory.add(paymentHistoryItem);
    return this;
  }
   
  @ApiModelProperty(value = "History of payments for this account.")
  public List<EnergyPaymentHistory> getPaymentHistory() {
    return paymentHistory;
  }
  public void setPaymentHistory(List<EnergyPaymentHistory> paymentHistory) {
    this.paymentHistory = paymentHistory;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyAccountDetails energyAccountDetails = (EnergyAccountDetails) o;
    return Objects.equals(this.accountId, energyAccountDetails.accountId) &&
        Objects.equals(this.paymentAmount, energyAccountDetails.paymentAmount) &&
        Objects.equals(this.paymentPeriod, energyAccountDetails.paymentPeriod) &&
        Objects.equals(this.paymentDue, energyAccountDetails.paymentDue) &&
        Objects.equals(this.paymentStatus, energyAccountDetails.paymentStatus) &&
        Objects.equals(this.paymentHistory, energyAccountDetails.paymentHistory);
  }
  @Override
  public int hashCode() {
    return Objects.hash(accountId, paymentAmount, paymentPeriod, paymentDue, paymentStatus, paymentHistory);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyAccountDetails {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentPeriod: ").append(toIndentedString(paymentPeriod)).append("\n");
    sb.append("    paymentDue: ").append(toIndentedString(paymentDue)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentHistory: ").append(toIndentedString(paymentHistory)).append("\n");
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
