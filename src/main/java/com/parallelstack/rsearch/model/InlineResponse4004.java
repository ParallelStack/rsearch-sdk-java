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
import com.parallelstack.rsearch.model.InlineResponse400Indexes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse4004
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-14T17:53:41.882+05:30")
public class InlineResponse4004 {
  @SerializedName("documents")
  private InlineResponse400Indexes documents = null;

  public InlineResponse4004 documents(InlineResponse400Indexes documents) {
    this.documents = documents;
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")
  public InlineResponse400Indexes getDocuments() {
    return documents;
  }

  public void setDocuments(InlineResponse400Indexes documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4004 inlineResponse4004 = (InlineResponse4004) o;
    return Objects.equals(this.documents, inlineResponse4004.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4004 {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

