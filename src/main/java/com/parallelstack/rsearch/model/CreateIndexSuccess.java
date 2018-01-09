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
import com.parallelstack.rsearch.model.CreateIndexSuccessIndexes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateIndexSuccess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-09T14:15:41.783+05:30")
public class CreateIndexSuccess {
  @SerializedName("indexes")
  private CreateIndexSuccessIndexes indexes = null;

  public CreateIndexSuccess indexes(CreateIndexSuccessIndexes indexes) {
    this.indexes = indexes;
    return this;
  }

   /**
   * Get indexes
   * @return indexes
  **/
  @ApiModelProperty(value = "")
  public CreateIndexSuccessIndexes getIndexes() {
    return indexes;
  }

  public void setIndexes(CreateIndexSuccessIndexes indexes) {
    this.indexes = indexes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndexSuccess createIndexSuccess = (CreateIndexSuccess) o;
    return Objects.equals(this.indexes, createIndexSuccess.indexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIndexSuccess {\n");
    
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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

