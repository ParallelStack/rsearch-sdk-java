/*
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SearchFailure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-26T18:13:54.122+05:30")
public class SearchFailure {
  @SerializedName("suggest_results")
  private Object suggestResults = null;

  public SearchFailure suggestResults(Object suggestResults) {
    this.suggestResults = suggestResults;
    return this;
  }

   /**
   * Get suggestResults
   * @return suggestResults
  **/
  @ApiModelProperty(value = "")
  public Object getSuggestResults() {
    return suggestResults;
  }

  public void setSuggestResults(Object suggestResults) {
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
    return true;
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
