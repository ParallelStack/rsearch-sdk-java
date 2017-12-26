/*
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetDocTypesFailure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-26T18:37:15.033+05:30")
public class GetDocTypesFailure {
  @SerializedName("document_types")
  private Object documentTypes = null;

  public GetDocTypesFailure documentTypes(Object documentTypes) {
    this.documentTypes = documentTypes;
    return this;
  }

   /**
   * Get documentTypes
   * @return documentTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getDocumentTypes() {
    return documentTypes;
  }

  public void setDocumentTypes(Object documentTypes) {
    this.documentTypes = documentTypes;
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
    return Objects.hash(documentTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocTypesFailure {\n");
    
    sb.append("    documentTypes: ").append(toIndentedString(documentTypes)).append("\n");
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

