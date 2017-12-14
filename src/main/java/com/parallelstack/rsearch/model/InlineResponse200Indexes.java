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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse200Indexes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-14T17:53:41.882+05:30")
public class InlineResponse200Indexes {
  @SerializedName("results")
  private List<String> results = new ArrayList<String>();

  @SerializedName("metadata")
  private Object metadata = null;

  public InlineResponse200Indexes results(List<String> results) {
    this.results = results;
    return this;
  }

  public InlineResponse200Indexes addResultsItem(String resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(example = "[\"test_index_1\",\"test_index_2\"]", required = true, value = "")
  public List<String> getResults() {
    return results;
  }

  public void setResults(List<String> results) {
    this.results = results;
  }

  public InlineResponse200Indexes metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"number_indexes\":2}", required = true, value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
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
    InlineResponse200Indexes inlineResponse200Indexes = (InlineResponse200Indexes) o;
    return Objects.equals(this.results, inlineResponse200Indexes.results) &&
        Objects.equals(this.metadata, inlineResponse200Indexes.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Indexes {\n");
    
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

