package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosSms {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("origin")
  private String origin = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("destination")
  private String destination = null;
  @SerializedName("cost")
  private Integer cost = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("plan_detail")
  private String planDetail = null;
  @SerializedName("statements")
  private String statements = null;
  public TelcosSms id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "If available, id of the smss in the source.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public TelcosSms origin(String origin) {
    this.origin = origin;
    return this;
  }
   
  @ApiModelProperty(value = "SMS origin location.")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }
  public TelcosSms phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
   
  @ApiModelProperty(value = "Destination phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public TelcosSms destination(String destination) {
    this.destination = destination;
    return this;
  }
   
  @ApiModelProperty(value = "SMS destination location.")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }
  public TelcosSms cost(Integer cost) {
    this.cost = cost;
    return this;
  }
   
  @ApiModelProperty(value = "SMS cost.")
  public Integer getCost() {
    return cost;
  }
  public void setCost(Integer cost) {
    this.cost = cost;
  }
  public TelcosSms type(String type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(value = "If available type of SMS.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public TelcosSms date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Date of message sent.")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public TelcosSms planDetail(String planDetail) {
    this.planDetail = planDetail;
    return this;
  }
   
  @ApiModelProperty(value = "If available billing plan linked to the call.")
  public String getPlanDetail() {
    return planDetail;
  }
  public void setPlanDetail(String planDetail) {
    this.planDetail = planDetail;
  }
  public TelcosSms statements(String statements) {
    this.statements = statements;
    return this;
  }
   
  @ApiModelProperty(value = "If available, the list of statement found in the account. Related to the services hired.")
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
    TelcosSms telcosSms = (TelcosSms) o;
    return Objects.equals(this.id, telcosSms.id) &&
        Objects.equals(this.origin, telcosSms.origin) &&
        Objects.equals(this.phoneNumber, telcosSms.phoneNumber) &&
        Objects.equals(this.destination, telcosSms.destination) &&
        Objects.equals(this.cost, telcosSms.cost) &&
        Objects.equals(this.type, telcosSms.type) &&
        Objects.equals(this.date, telcosSms.date) &&
        Objects.equals(this.planDetail, telcosSms.planDetail) &&
        Objects.equals(this.statements, telcosSms.statements);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, origin, phoneNumber, destination, cost, type, date, planDetail, statements);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosSms {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    planDetail: ").append(toIndentedString(planDetail)).append("\n");
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
