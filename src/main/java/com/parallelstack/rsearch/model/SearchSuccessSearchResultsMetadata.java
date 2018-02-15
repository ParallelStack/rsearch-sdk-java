/*
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: team@parallelstack.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.parallelstack.rsearch.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SearchSuccessSearchResultsMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T12:33:34.869+05:30")
public class SearchSuccessSearchResultsMetadata {
  @SerializedName("number_search_results")
  private BigDecimal numberSearchResults = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("aggregated")
  private Object aggregated = null;

  public SearchSuccessSearchResultsMetadata numberSearchResults(BigDecimal numberSearchResults) {
    this.numberSearchResults = numberSearchResults;
    return this;
  }

   /**
   * Get numberSearchResults
   * @return numberSearchResults
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNumberSearchResults() {
    return numberSearchResults;
  }

  public void setNumberSearchResults(BigDecimal numberSearchResults) {
    this.numberSearchResults = numberSearchResults;
  }

  public SearchSuccessSearchResultsMetadata query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SearchSuccessSearchResultsMetadata aggregated(Object aggregated) {
    this.aggregated = aggregated;
    return this;
  }

   /**
   * Get aggregated
   * @return aggregated
  **/
  @ApiModelProperty(value = "")
  public Object getAggregated() {
    return aggregated;
  }

  public void setAggregated(Object aggregated) {
    this.aggregated = aggregated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSuccessSearchResultsMetadata searchSuccessSearchResultsMetadata = (SearchSuccessSearchResultsMetadata) o;
    return Objects.equals(this.numberSearchResults, searchSuccessSearchResultsMetadata.numberSearchResults) &&
        Objects.equals(this.query, searchSuccessSearchResultsMetadata.query) &&
        Objects.equals(this.aggregated, searchSuccessSearchResultsMetadata.aggregated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberSearchResults, query, aggregated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSuccessSearchResultsMetadata {\n");
    
    sb.append("    numberSearchResults: ").append(toIndentedString(numberSearchResults)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    aggregated: ").append(toIndentedString(aggregated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

