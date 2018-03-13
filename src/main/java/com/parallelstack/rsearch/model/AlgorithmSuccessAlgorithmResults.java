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
import com.parallelstack.rsearch.model.AlgorithmSuccessAlgorithmResultsMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AlgorithmSuccessAlgorithmResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-13T13:49:01.854+05:30")
public class AlgorithmSuccessAlgorithmResults {
  @SerializedName("results")
  private List<Object> results = new ArrayList<Object>();

  @SerializedName("metadata")
  private AlgorithmSuccessAlgorithmResultsMetadata metadata = null;

  public AlgorithmSuccessAlgorithmResults results(List<Object> results) {
    this.results = results;
    return this;
  }

  public AlgorithmSuccessAlgorithmResults addResultsItem(Object resultsItem) {
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

  public AlgorithmSuccessAlgorithmResults metadata(AlgorithmSuccessAlgorithmResultsMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public AlgorithmSuccessAlgorithmResultsMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(AlgorithmSuccessAlgorithmResultsMetadata metadata) {
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
    AlgorithmSuccessAlgorithmResults algorithmSuccessAlgorithmResults = (AlgorithmSuccessAlgorithmResults) o;
    return Objects.equals(this.results, algorithmSuccessAlgorithmResults.results) &&
        Objects.equals(this.metadata, algorithmSuccessAlgorithmResults.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlgorithmSuccessAlgorithmResults {\n");
    
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
