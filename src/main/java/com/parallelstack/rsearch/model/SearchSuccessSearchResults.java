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
import com.parallelstack.rsearch.model.SearchSuccessSearchResultsMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchSuccessSearchResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T12:24:06.006+05:30")
public class SearchSuccessSearchResults {
  @SerializedName("results")
  private List<Object> results = new ArrayList<Object>();

  @SerializedName("metadata")
  private SearchSuccessSearchResultsMetadata metadata = null;

  public SearchSuccessSearchResults results(List<Object> results) {
    this.results = results;
    return this;
  }

  public SearchSuccessSearchResults addResultsItem(Object resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }

  public SearchSuccessSearchResults metadata(SearchSuccessSearchResultsMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public SearchSuccessSearchResultsMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SearchSuccessSearchResultsMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSuccessSearchResults searchSuccessSearchResults = (SearchSuccessSearchResults) o;
    return Objects.equals(this.results, searchSuccessSearchResults.results) &&
        Objects.equals(this.metadata, searchSuccessSearchResults.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSuccessSearchResults {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

