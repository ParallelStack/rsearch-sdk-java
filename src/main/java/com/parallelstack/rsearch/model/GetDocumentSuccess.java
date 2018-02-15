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
import com.parallelstack.rsearch.model.GetDocumentSuccessDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetDocumentSuccess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T12:24:06.006+05:30")
public class GetDocumentSuccess {
  @SerializedName("document")
  private GetDocumentSuccessDocument document = null;

  public GetDocumentSuccess document(GetDocumentSuccessDocument document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(required = true, value = "")
  public GetDocumentSuccessDocument getDocument() {
    return document;
  }

  public void setDocument(GetDocumentSuccessDocument document) {
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
    GetDocumentSuccess getDocumentSuccess = (GetDocumentSuccess) o;
    return Objects.equals(this.document, getDocumentSuccess.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentSuccess {\n");
    
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

