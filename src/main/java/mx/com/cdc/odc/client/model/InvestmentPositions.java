package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class InvestmentPositions {
  @SerializedName("lookup_id")
  private String lookupId = null;
  @SerializedName("portfolio_id")
  private String portfolioId = null;
  @SerializedName("position_id")
  private String positionId = null;
  @SerializedName("series")
  private String series = null;
  @SerializedName("term")
  private String term = null;
  @SerializedName("acquisition_price")
  private String acquisitionPrice = null;
  @SerializedName("titles_number")
  private Integer titlesNumber = null;
  @SerializedName("acquisition_rate")
  private Integer acquisitionRate = null;
  @SerializedName("invested_amount")
  private Integer investedAmount = null;
  @SerializedName("current_amount")
  private Integer currentAmount = null;
  public InvestmentPositions lookupId(String lookupId) {
    this.lookupId = lookupId;
    return this;
  }
   
  @ApiModelProperty(value = "Lookup ID given by UNNAX to the position for further reference.")
  public String getLookupId() {
    return lookupId;
  }
  public void setLookupId(String lookupId) {
    this.lookupId = lookupId;
  }
  public InvestmentPositions portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }
   
  @ApiModelProperty(value = "Portfolio ID related to the position.")
  public String getPortfolioId() {
    return portfolioId;
  }
  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }
  public InvestmentPositions positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }
   
  @ApiModelProperty(value = "Position ID for the position according the aggregated data source.")
  public String getPositionId() {
    return positionId;
  }
  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }
  public InvestmentPositions series(String series) {
    this.series = series;
    return this;
  }
   
  @ApiModelProperty(value = "If available series related to the investment product.")
  public String getSeries() {
    return series;
  }
  public void setSeries(String series) {
    this.series = series;
  }
  public InvestmentPositions term(String term) {
    this.term = term;
    return this;
  }
   
  @ApiModelProperty(value = "Duration of the investment product.")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }
  public InvestmentPositions acquisitionPrice(String acquisitionPrice) {
    this.acquisitionPrice = acquisitionPrice;
    return this;
  }
   
  @ApiModelProperty(value = "Ac  uisition price.")
  public String getAcquisitionPrice() {
    return acquisitionPrice;
  }
  public void setAcquisitionPrice(String acquisitionPrice) {
    this.acquisitionPrice = acquisitionPrice;
  }
  public InvestmentPositions titlesNumber(Integer titlesNumber) {
    this.titlesNumber = titlesNumber;
    return this;
  }
   
  @ApiModelProperty(value = "Number of titles available for the specific position.")
  public Integer getTitlesNumber() {
    return titlesNumber;
  }
  public void setTitlesNumber(Integer titlesNumber) {
    this.titlesNumber = titlesNumber;
  }
  public InvestmentPositions acquisitionRate(Integer acquisitionRate) {
    this.acquisitionRate = acquisitionRate;
    return this;
  }
   
  @ApiModelProperty(value = "Acquisition rate.")
  public Integer getAcquisitionRate() {
    return acquisitionRate;
  }
  public void setAcquisitionRate(Integer acquisitionRate) {
    this.acquisitionRate = acquisitionRate;
  }
  public InvestmentPositions investedAmount(Integer investedAmount) {
    this.investedAmount = investedAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Invested Amount.")
  public Integer getInvestedAmount() {
    return investedAmount;
  }
  public void setInvestedAmount(Integer investedAmount) {
    this.investedAmount = investedAmount;
  }
  public InvestmentPositions currentAmount(Integer currentAmount) {
    this.currentAmount = currentAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Current amount.")
  public Integer getCurrentAmount() {
    return currentAmount;
  }
  public void setCurrentAmount(Integer currentAmount) {
    this.currentAmount = currentAmount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentPositions investmentPositions = (InvestmentPositions) o;
    return Objects.equals(this.lookupId, investmentPositions.lookupId) &&
        Objects.equals(this.portfolioId, investmentPositions.portfolioId) &&
        Objects.equals(this.positionId, investmentPositions.positionId) &&
        Objects.equals(this.series, investmentPositions.series) &&
        Objects.equals(this.term, investmentPositions.term) &&
        Objects.equals(this.acquisitionPrice, investmentPositions.acquisitionPrice) &&
        Objects.equals(this.titlesNumber, investmentPositions.titlesNumber) &&
        Objects.equals(this.acquisitionRate, investmentPositions.acquisitionRate) &&
        Objects.equals(this.investedAmount, investmentPositions.investedAmount) &&
        Objects.equals(this.currentAmount, investmentPositions.currentAmount);
  }
  @Override
  public int hashCode() {
    return Objects.hash(lookupId, portfolioId, positionId, series, term, acquisitionPrice, titlesNumber, acquisitionRate, investedAmount, currentAmount);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentPositions {\n");
    
    sb.append("    lookupId: ").append(toIndentedString(lookupId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    acquisitionPrice: ").append(toIndentedString(acquisitionPrice)).append("\n");
    sb.append("    titlesNumber: ").append(toIndentedString(titlesNumber)).append("\n");
    sb.append("    acquisitionRate: ").append(toIndentedString(acquisitionRate)).append("\n");
    sb.append("    investedAmount: ").append(toIndentedString(investedAmount)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
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
