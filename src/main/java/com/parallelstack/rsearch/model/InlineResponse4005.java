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
 * InlineResponse4005
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-14T17:53:41.882+05:30")
public class InlineResponse4005 {
  @SerializedName("document")
  private InlineResponse400Indexes document = null;

  public InlineResponse4005 document(InlineResponse400Indexes document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public InlineResponse400Indexes getDocument() {
    return document;
  }

  public void setDocument(InlineResponse400Indexes document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4005 inlineResponse4005 = (InlineResponse4005) o;
    return Objects.equals(this.document, inlineResponse4005.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4005 {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

