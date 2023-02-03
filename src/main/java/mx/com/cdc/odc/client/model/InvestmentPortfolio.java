package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class InvestmentPortfolio {
  @SerializedName("product_name")
  private String productName = null;
  @SerializedName("product_shortname")
  private String productShortname = null;
  @SerializedName("product_id")
  private String productId = null;
  @SerializedName("current_amount")
  private Integer currentAmount = null;
  @SerializedName("titles_total")
  private Integer titlesTotal = null;
  @SerializedName("invested_amount")
  private Integer investedAmount = null;
  @SerializedName("weigthed_rate")
  private Integer weigthedRate = null;
  @SerializedName("positions")
  private List<InvestmentPositions> positions = null;
  public InvestmentPortfolio productName(String productName) {
    this.productName = productName;
    return this;
  }
   
  @ApiModelProperty(value = "Product name.")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public InvestmentPortfolio productShortname(String productShortname) {
    this.productShortname = productShortname;
    return this;
  }
   
  @ApiModelProperty(value = "Product short name.")
  public String getProductShortname() {
    return productShortname;
  }
  public void setProductShortname(String productShortname) {
    this.productShortname = productShortname;
  }
  public InvestmentPortfolio productId(String productId) {
    this.productId = productId;
    return this;
  }
   
  @ApiModelProperty(value = "Product ID given  by the data source.")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }
  public InvestmentPortfolio currentAmount(Integer currentAmount) {
    this.currentAmount = currentAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Current amount inverted in the product.")
  public Integer getCurrentAmount() {
    return currentAmount;
  }
  public void setCurrentAmount(Integer currentAmount) {
    this.currentAmount = currentAmount;
  }
  public InvestmentPortfolio titlesTotal(Integer titlesTotal) {
    this.titlesTotal = titlesTotal;
    return this;
  }
   
  @ApiModelProperty(value = "Number of titles hired.")
  public Integer getTitlesTotal() {
    return titlesTotal;
  }
  public void setTitlesTotal(Integer titlesTotal) {
    this.titlesTotal = titlesTotal;
  }
  public InvestmentPortfolio investedAmount(Integer investedAmount) {
    this.investedAmount = investedAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Initial investment.")
  public Integer getInvestedAmount() {
    return investedAmount;
  }
  public void setInvestedAmount(Integer investedAmount) {
    this.investedAmount = investedAmount;
  }
  public InvestmentPortfolio weigthedRate(Integer weigthedRate) {
    this.weigthedRate = weigthedRate;
    return this;
  }
   
  @ApiModelProperty(value = "Weighted rate among the same product positions.")
  public Integer getWeigthedRate() {
    return weigthedRate;
  }
  public void setWeigthedRate(Integer weigthedRate) {
    this.weigthedRate = weigthedRate;
  }
  public InvestmentPortfolio positions(List<InvestmentPositions> positions) {
    this.positions = positions;
    return this;
  }
  public InvestmentPortfolio addPositionsItem(InvestmentPositions positionsItem) {
    if (this.positions == null) {
      this.positions = new ArrayList<InvestmentPositions>();
    }
    this.positions.add(positionsItem);
    return this;
  }
   
  @ApiModelProperty(value = "List of positions available for the product.")
  public List<InvestmentPositions> getPositions() {
    return positions;
  }
  public void setPositions(List<InvestmentPositions> positions) {
    this.positions = positions;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentPortfolio investmentPortfolio = (InvestmentPortfolio) o;
    return Objects.equals(this.productName, investmentPortfolio.productName) &&
        Objects.equals(this.productShortname, investmentPortfolio.productShortname) &&
        Objects.equals(this.productId, investmentPortfolio.productId) &&
        Objects.equals(this.currentAmount, investmentPortfolio.currentAmount) &&
        Objects.equals(this.titlesTotal, investmentPortfolio.titlesTotal) &&
        Objects.equals(this.investedAmount, investmentPortfolio.investedAmount) &&
        Objects.equals(this.weigthedRate, investmentPortfolio.weigthedRate) &&
        Objects.equals(this.positions, investmentPortfolio.positions);
  }
  @Override
  public int hashCode() {
    return Objects.hash(productName, productShortname, productId, currentAmount, titlesTotal, investedAmount, weigthedRate, positions);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentPortfolio {\n");
    
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productShortname: ").append(toIndentedString(productShortname)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    titlesTotal: ").append(toIndentedString(titlesTotal)).append("\n");
    sb.append("    investedAmount: ").append(toIndentedString(investedAmount)).append("\n");
    sb.append("    weigthedRate: ").append(toIndentedString(weigthedRate)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
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
