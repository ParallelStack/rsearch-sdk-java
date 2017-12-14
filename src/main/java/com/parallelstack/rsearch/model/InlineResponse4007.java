/*
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.0.0
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
import com.parallelstack.rsearch.model.InlineResponse4007SearchResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse4007
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-14T17:55:51.642+05:30")
public class InlineResponse4007 {
  @SerializedName("search_results")
  private InlineResponse4007SearchResults searchResults = null;

  public InlineResponse4007 searchResults(InlineResponse4007SearchResults searchResults) {
    this.searchResults = searchResults;
    return this;
  }

   /**
   * Get searchResults
   * @return searchResults
  **/
  @ApiModelProperty(value = "")
  public InlineResponse4007SearchResults getSearchResults() {
    return searchResults;
  }

  public void setSearchResults(InlineResponse4007SearchResults searchResults) {
    this.searchResults = searchResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4007 inlineResponse4007 = (InlineResponse4007) o;
    return Objects.equals(this.searchResults, inlineResponse4007.searchResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4007 {\n");
    
    sb.append("    searchResults: ").append(toIndentedString(searchResults)).append("\n");
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

