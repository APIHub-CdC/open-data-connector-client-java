package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class EnergyCustomers {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("addresses")
  private List<Object> addresses = null;
  @SerializedName("names")
  private List<Object> names = null;
  public EnergyCustomers id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "ID assign to the customer.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public EnergyCustomers addresses(List<Object> addresses) {
    this.addresses = addresses;
    return this;
  }
  public EnergyCustomers addAddressesItem(Object addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Object>();
    }
    this.addresses.add(addressesItem);
    return this;
  }
   
  @ApiModelProperty(value = "Customer's address.")
  public List<Object> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Object> addresses) {
    this.addresses = addresses;
  }
  public EnergyCustomers names(List<Object> names) {
    this.names = names;
    return this;
  }
  public EnergyCustomers addNamesItem(Object namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<Object>();
    }
    this.names.add(namesItem);
    return this;
  }
   
  @ApiModelProperty(value = "Customer's names.")
  public List<Object> getNames() {
    return names;
  }
  public void setNames(List<Object> names) {
    this.names = names;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyCustomers energyCustomers = (EnergyCustomers) o;
    return Objects.equals(this.id, energyCustomers.id) &&
        Objects.equals(this.addresses, energyCustomers.addresses) &&
        Objects.equals(this.names, energyCustomers.names);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, addresses, names);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyCustomers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
