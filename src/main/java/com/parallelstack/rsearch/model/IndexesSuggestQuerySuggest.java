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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * IndexesSuggestQuerySuggest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-13T13:49:01.854+05:30")
public class IndexesSuggestQuerySuggest {
  @SerializedName("query")
  private String query = null;

  @SerializedName("indexes")
  private List<String> indexes = new ArrayList<String>();

  @SerializedName("fields")
  private List<String> fields = new ArrayList<String>();

  @SerializedName("fuzzy")
  private BigDecimal fuzzy = null;

  @SerializedName("size")
  private BigDecimal size = null;

  public IndexesSuggestQuerySuggest query(String query) {
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

  public IndexesSuggestQuerySuggest indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public IndexesSuggestQuerySuggest addIndexesItem(String indexesItem) {
    this.indexes.add(indexesItem);
    return this;
  }

   /**
   * Get indexes
   * @return indexes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public IndexesSuggestQuerySuggest fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public IndexesSuggestQuerySuggest addFieldsItem(String fieldsItem) {
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

  public IndexesSuggestQuerySuggest fuzzy(BigDecimal fuzzy) {
    this.fuzzy = fuzzy;
    return this;
  }

   /**
   * Get fuzzy
   * @return fuzzy
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFuzzy() {
    return fuzzy;
  }

  public void setFuzzy(BigDecimal fuzzy) {
    this.fuzzy = fuzzy;
  }

  public IndexesSuggestQuerySuggest size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
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
    IndexesSuggestQuerySuggest indexesSuggestQuerySuggest = (IndexesSuggestQuerySuggest) o;
    return Objects.equals(this.query, indexesSuggestQuerySuggest.query) &&
        Objects.equals(this.indexes, indexesSuggestQuerySuggest.indexes) &&
        Objects.equals(this.fields, indexesSuggestQuerySuggest.fields) &&
        Objects.equals(this.fuzzy, indexesSuggestQuerySuggest.fuzzy) &&
        Objects.equals(this.size, indexesSuggestQuerySuggest.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, indexes, fields, fuzzy, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexesSuggestQuerySuggest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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

