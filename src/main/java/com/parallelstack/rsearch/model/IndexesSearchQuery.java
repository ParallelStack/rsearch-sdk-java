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
import com.parallelstack.rsearch.model.IndexesSearchQuerySearch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IndexesSearchQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-13T13:49:01.854+05:30")
public class IndexesSearchQuery {
  @SerializedName("search")
  private IndexesSearchQuerySearch search = null;

  public IndexesSearchQuery search(IndexesSearchQuerySearch search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @ApiModelProperty(required = true, value = "")
  public IndexesSearchQuerySearch getSearch() {
    return search;
  }

  public void setSearch(IndexesSearchQuerySearch search) {
    this.search = search;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexesSearchQuery indexesSearchQuery = (IndexesSearchQuery) o;
    return Objects.equals(this.search, indexesSearchQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexesSearchQuery {\n");
    
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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

