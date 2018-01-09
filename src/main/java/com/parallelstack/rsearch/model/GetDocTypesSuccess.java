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
import com.parallelstack.rsearch.model.GetDocTypesSuccessDocumentTypes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetDocTypesSuccess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-09T14:15:41.783+05:30")
public class GetDocTypesSuccess {
  @SerializedName("document_types")
  private GetDocTypesSuccessDocumentTypes documentTypes = null;

  public GetDocTypesSuccess documentTypes(GetDocTypesSuccessDocumentTypes documentTypes) {
    this.documentTypes = documentTypes;
    return this;
  }

   /**
   * Get documentTypes
   * @return documentTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public GetDocTypesSuccessDocumentTypes getDocumentTypes() {
    return documentTypes;
  }

  public void setDocumentTypes(GetDocTypesSuccessDocumentTypes documentTypes) {
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
    GetDocTypesSuccess getDocTypesSuccess = (GetDocTypesSuccess) o;
    return Objects.equals(this.documentTypes, getDocTypesSuccess.documentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocTypesSuccess {\n");
    
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

