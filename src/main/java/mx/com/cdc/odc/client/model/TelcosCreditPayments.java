package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosCreditPayments {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("destination_number")
  private String destinationNumber = null;
  @SerializedName("status")
  private Boolean status = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("method")
  private String method = null;
  public TelcosCreditPayments id(String id) {
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
  public TelcosCreditPayments date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Payment date.")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public TelcosCreditPayments folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(value = "Payment identifier.")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public TelcosCreditPayments amount(Integer amount) {
    this.amount = amount;
    return this;
  }
   
  @ApiModelProperty(value = "Amount paid/transferred.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  public TelcosCreditPayments destinationNumber(String destinationNumber) {
    this.destinationNumber = destinationNumber;
    return this;
  }
   
  @ApiModelProperty(value = "Phone number that received the transference.")
  public String getDestinationNumber() {
    return destinationNumber;
  }
  public void setDestinationNumber(String destinationNumber) {
    this.destinationNumber = destinationNumber;
  }
  public TelcosCreditPayments status(Boolean status) {
    this.status = status;
    return this;
  }
   
  @ApiModelProperty(value = "Transaction status. true for completed transaction.")
  public Boolean isStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }
  public TelcosCreditPayments type(String type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(value = "Transaction type description literal from the data source.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public TelcosCreditPayments method(String method) {
    this.method = method;
    return this;
  }
   
  @ApiModelProperty(value = "Method or channel used for the transference.")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosCreditPayments telcosCreditPayments = (TelcosCreditPayments) o;
    return Objects.equals(this.id, telcosCreditPayments.id) &&
        Objects.equals(this.date, telcosCreditPayments.date) &&
        Objects.equals(this.folio, telcosCreditPayments.folio) &&
        Objects.equals(this.amount, telcosCreditPayments.amount) &&
        Objects.equals(this.destinationNumber, telcosCreditPayments.destinationNumber) &&
        Objects.equals(this.status, telcosCreditPayments.status) &&
        Objects.equals(this.type, telcosCreditPayments.type) &&
        Objects.equals(this.method, telcosCreditPayments.method);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, date, folio, amount, destinationNumber, status, type, method);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosCreditPayments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    destinationNumber: ").append(toIndentedString(destinationNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
