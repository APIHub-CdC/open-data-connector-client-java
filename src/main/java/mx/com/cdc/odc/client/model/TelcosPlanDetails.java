package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosPlanDetails {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("account")
  private String account = null;
  @SerializedName("plan_type")
  private String planType = null;
  @SerializedName("period")
  private String period = null;
  @SerializedName("usernanme")
  private String usernanme = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("calls")
  private List<TelcosCalls> calls = null;
  @SerializedName("sms")
  private List<TelcosSms> sms = null;
  @SerializedName("statements")
  private String statements = null;
  public TelcosPlanDetails id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public TelcosPlanDetails account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(value = "Account Number. This is given by the telco company.")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  public TelcosPlanDetails planType(String planType) {
    this.planType = planType;
    return this;
  }
   
  @ApiModelProperty(value = "If it is prepaid or postpaid plan.")
  public String getPlanType() {
    return planType;
  }
  public void setPlanType(String planType) {
    this.planType = planType;
  }
  public TelcosPlanDetails period(String period) {
    this.period = period;
    return this;
  }
   
  @ApiModelProperty(value = "Current billing period by date.")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }
  public TelcosPlanDetails usernanme(String usernanme) {
    this.usernanme = usernanme;
    return this;
  }
   
  @ApiModelProperty(value = "If avilable we bring the names(s) of the customer.")
  public String getUsernanme() {
    return usernanme;
  }
  public void setUsernanme(String usernanme) {
    this.usernanme = usernanme;
  }
  public TelcosPlanDetails address(String address) {
    this.address = address;
    return this;
  }
   
  @ApiModelProperty(value = "If available the billing address fo the customer.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public TelcosPlanDetails calls(List<TelcosCalls> calls) {
    this.calls = calls;
    return this;
  }
  public TelcosPlanDetails addCallsItem(TelcosCalls callsItem) {
    if (this.calls == null) {
      this.calls = new ArrayList<TelcosCalls>();
    }
    this.calls.add(callsItem);
    return this;
  }
   
  @ApiModelProperty(value = "List of calls made.")
  public List<TelcosCalls> getCalls() {
    return calls;
  }
  public void setCalls(List<TelcosCalls> calls) {
    this.calls = calls;
  }
  public TelcosPlanDetails sms(List<TelcosSms> sms) {
    this.sms = sms;
    return this;
  }
  public TelcosPlanDetails addSmsItem(TelcosSms smsItem) {
    if (this.sms == null) {
      this.sms = new ArrayList<TelcosSms>();
    }
    this.sms.add(smsItem);
    return this;
  }
   
  @ApiModelProperty(value = "List of SMS sent.")
  public List<TelcosSms> getSms() {
    return sms;
  }
  public void setSms(List<TelcosSms> sms) {
    this.sms = sms;
  }
  public TelcosPlanDetails statements(String statements) {
    this.statements = statements;
    return this;
  }
   
  @ApiModelProperty(value = "If available, the list of statements found in the account. Related to the services hired.")
  public String getStatements() {
    return statements;
  }
  public void setStatements(String statements) {
    this.statements = statements;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosPlanDetails telcosPlanDetails = (TelcosPlanDetails) o;
    return Objects.equals(this.id, telcosPlanDetails.id) &&
        Objects.equals(this.account, telcosPlanDetails.account) &&
        Objects.equals(this.planType, telcosPlanDetails.planType) &&
        Objects.equals(this.period, telcosPlanDetails.period) &&
        Objects.equals(this.usernanme, telcosPlanDetails.usernanme) &&
        Objects.equals(this.address, telcosPlanDetails.address) &&
        Objects.equals(this.calls, telcosPlanDetails.calls) &&
        Objects.equals(this.sms, telcosPlanDetails.sms) &&
        Objects.equals(this.statements, telcosPlanDetails.statements);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, account, planType, period, usernanme, address, calls, sms, statements);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosPlanDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    usernanme: ").append(toIndentedString(usernanme)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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
