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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SuggestQuerySuggest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T12:24:06.006+05:30")
public class SuggestQuerySuggest {
  @SerializedName("query")
  private String query = null;

  @SerializedName("fields")
  private List<String> fields = new ArrayList<String>();

  @SerializedName("fuzzy")
  private BigDecimal fuzzy = null;

  @SerializedName("size")
  private BigDecimal size = null;

  public SuggestQuerySuggest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SuggestQuerySuggest fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public SuggestQuerySuggest addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public SuggestQuerySuggest fuzzy(BigDecimal fuzzy) {
    this.fuzzy = fuzzy;
    return this;
  }

   /**
   * Get fuzzy
   * @return fuzzy
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getFuzzy() {
    return fuzzy;
  }

  public void setFuzzy(BigDecimal fuzzy) {
    this.fuzzy = fuzzy;
  }

  public SuggestQuerySuggest size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestQuerySuggest suggestQuerySuggest = (SuggestQuerySuggest) o;
    return Objects.equals(this.query, suggestQuerySuggest.query) &&
        Objects.equals(this.fields, suggestQuerySuggest.fields) &&
        Objects.equals(this.fuzzy, suggestQuerySuggest.fuzzy) &&
        Objects.equals(this.size, suggestQuerySuggest.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, fields, fuzzy, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestQuerySuggest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    fuzzy: ").append(toIndentedString(fuzzy)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

