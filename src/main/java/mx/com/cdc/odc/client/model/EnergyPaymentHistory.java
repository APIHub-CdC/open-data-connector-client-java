package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class EnergyPaymentHistory {
  @SerializedName("payment_due_date")
  private String paymentDueDate = null;
  @SerializedName("payment_complete_date")
  private LocalDate paymentCompleteDate = null;
  @SerializedName("power_consumed")
  private Integer powerConsumed = null;
  @SerializedName("bill_total")
  private Integer billTotal = null;
  @SerializedName("amount_paid")
  private Integer amountPaid = null;
  public EnergyPaymentHistory paymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }
   
  @ApiModelProperty(value = "Payment due date.")
  public String getPaymentDueDate() {
    return paymentDueDate;
  }
  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }
  public EnergyPaymentHistory paymentCompleteDate(LocalDate paymentCompleteDate) {
    this.paymentCompleteDate = paymentCompleteDate;
    return this;
  }
   
  @ApiModelProperty(value = "Payment completed date.")
  public LocalDate getPaymentCompleteDate() {
    return paymentCompleteDate;
  }
  public void setPaymentCompleteDate(LocalDate paymentCompleteDate) {
    this.paymentCompleteDate = paymentCompleteDate;
  }
  public EnergyPaymentHistory powerConsumed(Integer powerConsumed) {
    this.powerConsumed = powerConsumed;
    return this;
  }
   
  @ApiModelProperty(value = "Total power consumed or service consumed.")
  public Integer getPowerConsumed() {
    return powerConsumed;
  }
  public void setPowerConsumed(Integer powerConsumed) {
    this.powerConsumed = powerConsumed;
  }
  public EnergyPaymentHistory billTotal(Integer billTotal) {
    this.billTotal = billTotal;
    return this;
  }
   
  @ApiModelProperty(value = "Bill total amount to be paid.")
  public Integer getBillTotal() {
    return billTotal;
  }
  public void setBillTotal(Integer billTotal) {
    this.billTotal = billTotal;
  }
  public EnergyPaymentHistory amountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }
   
  @ApiModelProperty(value = "Amount paid.")
  public Integer getAmountPaid() {
    return amountPaid;
  }
  public void setAmountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyPaymentHistory energyPaymentHistory = (EnergyPaymentHistory) o;
    return Objects.equals(this.paymentDueDate, energyPaymentHistory.paymentDueDate) &&
        Objects.equals(this.paymentCompleteDate, energyPaymentHistory.paymentCompleteDate) &&
        Objects.equals(this.powerConsumed, energyPaymentHistory.powerConsumed) &&
        Objects.equals(this.billTotal, energyPaymentHistory.billTotal) &&
        Objects.equals(this.amountPaid, energyPaymentHistory.amountPaid);
  }
  @Override
  public int hashCode() {
    return Objects.hash(paymentDueDate, paymentCompleteDate, powerConsumed, billTotal, amountPaid);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyPaymentHistory {\n");
    
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    paymentCompleteDate: ").append(toIndentedString(paymentCompleteDate)).append("\n");
    sb.append("    powerConsumed: ").append(toIndentedString(powerConsumed)).append("\n");
    sb.append("    billTotal: ").append(toIndentedString(billTotal)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
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
