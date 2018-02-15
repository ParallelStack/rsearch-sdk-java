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
import com.parallelstack.rsearch.model.SearchQuerySearchAggregations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchQuerySearch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T12:33:34.869+05:30")
public class SearchQuerySearch {
  @SerializedName("query")
  private String query = null;

  @SerializedName("fuzzy")
  private BigDecimal fuzzy = null;

  @SerializedName("result_fields")
  private List<String> resultFields = null;

  @SerializedName("search_fields")
  private List<String> searchFields = null;

  @SerializedName("page_num")
  private BigDecimal pageNum = null;

  @SerializedName("page_count")
  private BigDecimal pageCount = null;

  @SerializedName("filters")
  private Object filters = null;

  @SerializedName("aggregations")
  private List<SearchQuerySearchAggregations> aggregations = null;

  public SearchQuerySearch query(String query) {
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

  public SearchQuerySearch fuzzy(BigDecimal fuzzy) {
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

  public SearchQuerySearch resultFields(List<String> resultFields) {
    this.resultFields = resultFields;
    return this;
  }

  public SearchQuerySearch addResultFieldsItem(String resultFieldsItem) {
    if (this.resultFields == null) {
      this.resultFields = new ArrayList<String>();
    }
    this.resultFields.add(resultFieldsItem);
    return this;
  }

   /**
   * Get resultFields
   * @return resultFields
  **/
  @ApiModelProperty(value = "")
  public List<String> getResultFields() {
    return resultFields;
  }

  public void setResultFields(List<String> resultFields) {
    this.resultFields = resultFields;
  }

  public SearchQuerySearch searchFields(List<String> searchFields) {
    this.searchFields = searchFields;
    return this;
  }

  public SearchQuerySearch addSearchFieldsItem(String searchFieldsItem) {
    if (this.searchFields == null) {
      this.searchFields = new ArrayList<String>();
    }
    this.searchFields.add(searchFieldsItem);
    return this;
  }

   /**
   * Get searchFields
   * @return searchFields
  **/
  @ApiModelProperty(value = "")
  public List<String> getSearchFields() {
    return searchFields;
  }

  public void setSearchFields(List<String> searchFields) {
    this.searchFields = searchFields;
  }

  public SearchQuerySearch pageNum(BigDecimal pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPageNum() {
    return pageNum;
  }

  public void setPageNum(BigDecimal pageNum) {
    this.pageNum = pageNum;
  }

  public SearchQuerySearch pageCount(BigDecimal pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPageCount() {
    return pageCount;
  }

  public void setPageCount(BigDecimal pageCount) {
    this.pageCount = pageCount;
  }

  public SearchQuerySearch filters(Object filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(value = "")
  public Object getFilters() {
    return filters;
  }

  public void setFilters(Object filters) {
    this.filters = filters;
  }

  public SearchQuerySearch aggregations(List<SearchQuerySearchAggregations> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public SearchQuerySearch addAggregationsItem(SearchQuerySearchAggregations aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<SearchQuerySearchAggregations>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Get aggregations
   * @return aggregations
  **/
  @ApiModelProperty(value = "")
  public List<SearchQuerySearchAggregations> getAggregations() {
    return aggregations;
  }

  public void setAggregations(List<SearchQuerySearchAggregations> aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuerySearch searchQuerySearch = (SearchQuerySearch) o;
    return Objects.equals(this.query, searchQuerySearch.query) &&
        Objects.equals(this.fuzzy, searchQuerySearch.fuzzy) &&
        Objects.equals(this.resultFields, searchQuerySearch.resultFields) &&
        Objects.equals(this.searchFields, searchQuerySearch.searchFields) &&
        Objects.equals(this.pageNum, searchQuerySearch.pageNum) &&
        Objects.equals(this.pageCount, searchQuerySearch.pageCount) &&
        Objects.equals(this.filters, searchQuerySearch.filters) &&
        Objects.equals(this.aggregations, searchQuerySearch.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, fuzzy, resultFields, searchFields, pageNum, pageCount, filters, aggregations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuerySearch {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    fuzzy: ").append(toIndentedString(fuzzy)).append("\n");
    sb.append("    resultFields: ").append(toIndentedString(resultFields)).append("\n");
    sb.append("    searchFields: ").append(toIndentedString(searchFields)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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

