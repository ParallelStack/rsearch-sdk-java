/*
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.1.0
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
import com.parallelstack.rsearch.model.SearchFailureSuggestResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SearchFailure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T14:18:23.103+05:30")
public class SearchFailure {
  @SerializedName("suggest_results")
  private SearchFailureSuggestResults suggestResults = null;

  public SearchFailure suggestResults(SearchFailureSuggestResults suggestResults) {
    this.suggestResults = suggestResults;
    return this;
  }

   /**
   * Get suggestResults
   * @return suggestResults
  **/
  @ApiModelProperty(value = "")
  public SearchFailureSuggestResults getSuggestResults() {
    return suggestResults;
  }

  public void setSuggestResults(SearchFailureSuggestResults suggestResults) {
    this.suggestResults = suggestResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFailure searchFailure = (SearchFailure) o;
    return Objects.equals(this.suggestResults, searchFailure.suggestResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFailure {\n");
    
    sb.append("    suggestResults: ").append(toIndentedString(suggestResults)).append("\n");
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

