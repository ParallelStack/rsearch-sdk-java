/*
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.3.0
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
import com.parallelstack.rsearch.model.IndexesSuggestQuerySuggest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IndexesSuggestQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-13T13:49:01.854+05:30")
public class IndexesSuggestQuery {
  @SerializedName("suggest")
  private IndexesSuggestQuerySuggest suggest = null;

  public IndexesSuggestQuery suggest(IndexesSuggestQuerySuggest suggest) {
    this.suggest = suggest;
    return this;
  }

   /**
   * Get suggest
   * @return suggest
  **/
  @ApiModelProperty(required = true, value = "")
  public IndexesSuggestQuerySuggest getSuggest() {
    return suggest;
  }

  public void setSuggest(IndexesSuggestQuerySuggest suggest) {
    this.suggest = suggest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexesSuggestQuery indexesSuggestQuery = (IndexesSuggestQuery) o;
    return Objects.equals(this.suggest, indexesSuggestQuery.suggest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexesSuggestQuery {\n");
    
    sb.append("    suggest: ").append(toIndentedString(suggest)).append("\n");
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
