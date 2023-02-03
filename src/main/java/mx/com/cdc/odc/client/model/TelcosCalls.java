package mx.com.cdc.odc.client.model;

import java.io.IOException;
import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;


public class TelcosCalls {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("origin")
  private String origin = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("destination")
  private String destination = null;
  @SerializedName("minutes")
  private String minutes = null;
  @SerializedName("cost")
  private Integer cost = null;
  
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _1("1"),
    
    _2("2");
    private String value;
    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("plan_detail")
  private String planDetail = null;
  public TelcosCalls id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "If available, id of the call in the source.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public TelcosCalls origin(String origin) {
    this.origin = origin;
    return this;
  }
   
  @ApiModelProperty(value = "Call origin location.")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }
  public TelcosCalls phoneNumber(String phoneNumber) {
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
  public TelcosCalls destination(String destination) {
    this.destination = destination;
    return this;
  }
   
  @ApiModelProperty(value = "Destination call location.")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }
  public TelcosCalls minutes(String minutes) {
    this.minutes = minutes;
    return this;
  }
   
  @ApiModelProperty(value = "Duration of the call in minutes.")
  public String getMinutes() {
    return minutes;
  }
  public void setMinutes(String minutes) {
    this.minutes = minutes;
  }
  public TelcosCalls cost(Integer cost) {
    this.cost = cost;
    return this;
  }
   
  @ApiModelProperty(value = "Cost of the call in cents.")
  public Integer getCost() {
    return cost;
  }
  public void setCost(Integer cost) {
    this.cost = cost;
  }
  public TelcosCalls type(TypeEnum type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(value = "If available the type of the call, where 1 correspond to incomming call and 2 correspond to outgoing call.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public TelcosCalls date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Date of the call.")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public TelcosCalls planDetail(String planDetail) {
    this.planDetail = planDetail;
    return this;
  }
   
  @ApiModelProperty(value = "If available, billing plan linked to the call.")
  public String getPlanDetail() {
    return planDetail;
  }
  public void setPlanDetail(String planDetail) {
    this.planDetail = planDetail;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosCalls telcosCalls = (TelcosCalls) o;
    return Objects.equals(this.id, telcosCalls.id) &&
        Objects.equals(this.origin, telcosCalls.origin) &&
        Objects.equals(this.phoneNumber, telcosCalls.phoneNumber) &&
        Objects.equals(this.destination, telcosCalls.destination) &&
        Objects.equals(this.minutes, telcosCalls.minutes) &&
        Objects.equals(this.cost, telcosCalls.cost) &&
        Objects.equals(this.type, telcosCalls.type) &&
        Objects.equals(this.date, telcosCalls.date) &&
        Objects.equals(this.planDetail, telcosCalls.planDetail);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, origin, phoneNumber, destination, minutes, cost, type, date, planDetail);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosCalls {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    planDetail: ").append(toIndentedString(planDetail)).append("\n");
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
