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


package com.parallelstack.rsearch;

import com.parallelstack.ApiException;
import com.parallelstack.rsearch.model.AlgorithmFailure;
import com.parallelstack.rsearch.model.AlgorithmSimilarDocsQuery;
import com.parallelstack.rsearch.model.AlgorithmSuccess;
import com.parallelstack.rsearch.model.CreateDocTypeFailure;
import com.parallelstack.rsearch.model.CreateDocTypeSuccess;
import com.parallelstack.rsearch.model.CreateDocumentFailure;
import com.parallelstack.rsearch.model.CreateDocumentSuccess;
import com.parallelstack.rsearch.model.CreateIndexFailure;
import com.parallelstack.rsearch.model.CreateIndexSuccess;
import com.parallelstack.rsearch.model.DeleteDocumentFailure;
import com.parallelstack.rsearch.model.DeleteDocumentSuccess;
import com.parallelstack.rsearch.model.DeleteIndexFailure;
import com.parallelstack.rsearch.model.DeleteIndexSuccess;
import com.parallelstack.rsearch.model.Document;
import com.parallelstack.rsearch.model.DocumentType;
import com.parallelstack.rsearch.model.GetDocTypeFailure;
import com.parallelstack.rsearch.model.GetDocTypeSuccess;
import com.parallelstack.rsearch.model.GetDocTypesFailure;
import com.parallelstack.rsearch.model.GetDocTypesSuccess;
import com.parallelstack.rsearch.model.GetDocumentFailure;
import com.parallelstack.rsearch.model.GetDocumentSuccess;
import com.parallelstack.rsearch.model.GetIndexFailure;
import com.parallelstack.rsearch.model.GetIndexSuccess;
import com.parallelstack.rsearch.model.GetIndexesFailure;
import com.parallelstack.rsearch.model.GetIndexesSuccess;
import com.parallelstack.rsearch.model.IndexesSearchQuery;
import com.parallelstack.rsearch.model.IndexesSuggestQuery;
import com.parallelstack.rsearch.model.SearchFailure;
import com.parallelstack.rsearch.model.SearchQuery;
import com.parallelstack.rsearch.model.SearchSuccess;
import com.parallelstack.rsearch.model.SuggestFailure;
import com.parallelstack.rsearch.model.SuggestQuery;
import com.parallelstack.rsearch.model.SuggestSuccess;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RsearchApi
 */
@Ignore
public class RsearchApiTest {

    private final RsearchApi api = new RsearchApi();

    
    /**
     * 
     *
     * Creates &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDocumentTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        String docId = null;
        Document documentDetails = null;
        CreateDocumentSuccess response = api.addDocument(indexName, docTypeName, docId, documentDetails);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates specific &#x60;document_type&#x60; in &#x60;index_name&#x60; with specified parameters. You should define the parameters correctly as per the getting started guide, else getting the right structure might be an issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDocumentTypeTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        DocumentType docTypeDetails = null;
        CreateDocTypeSuccess response = api.addDocumentType(indexName, docTypeName, docTypeDetails);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates &#x60;a new index&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addIndexTest() throws ApiException {
        String indexName = null;
        CreateIndexSuccess response = api.addIndex(indexName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        String docId = null;
        DeleteDocumentSuccess response = api.deleteDocument(indexName, docTypeName, docId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes &#x60;an index&#x60; {index_name}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIndexTest() throws ApiException {
        String indexName = null;
        DeleteIndexSuccess response = api.deleteIndex(indexName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60; based on body params. Please ensure you refer the getting started guides, to get the format of the query right.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdvancedDocTypeSuggestResultsTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        SuggestQuery suggest = null;
        SuggestSuccess response = api.getAdvancedDocTypeSuggestResults(indexName, docTypeName, suggest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets Suggestions in &#x60;index_name&#x60; limited by the request body fields
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdvancedIndexSuggestResultsTest() throws ApiException {
        String indexName = null;
        SuggestQuery search = null;
        SuggestSuccess response = api.getAdvancedIndexSuggestResults(indexName, search);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Advanced Search across multiple indexes specified as a part of the search criteria. Please ensure you refer the getting started guides, to get the format of the query right.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdvancedMultiIndexSearchResultsTest() throws ApiException {
        IndexesSearchQuery search = null;
        SearchSuccess response = api.getAdvancedMultiIndexSearchResults(search);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets Suggestions across multiple indexes. Please ensure you refer the getting started guides, to get the format of the query right.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdvancedMultiIndexSuggestResultsTest() throws ApiException {
        IndexesSuggestQuery suggest = null;
        SuggestSuccess response = api.getAdvancedMultiIndexSuggestResults(suggest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Advanced Search which gets all documents in &#x60;index_name&#x60; for provided search criteria. Please ensure you refer the getting started guides, to get the format of the query right.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdvancedSearchResultsTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        SearchQuery search = null;
        SearchSuccess response = api.getAdvancedSearchResults(indexName, docTypeName, search);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets &#x60;All document_types&#x60; present in &#x60;index_name&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDocumentTypesTest() throws ApiException {
        String indexName = null;
        GetDocTypesSuccess response = api.getAllDocumentTypes(indexName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetches &#x60;All indexes&#x60; that the user has. Not recommended to be used in production code, as there isn&#39;t that big a Use case for listing all indexes!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllIndexesTest() throws ApiException {
        GetIndexesSuccess response = api.getAllIndexes();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Basic Search which gets all documents in &#x60;index_name&#x60; for provided search criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBasicSearchResultsTest() throws ApiException {
        String indexName = null;
        String q = null;
        SearchSuccess response = api.getBasicSearchResults(indexName, q);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60;. Please ensure you refer the getting started guides, to get the format of the query right.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocTypeSuggestResultsTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        String q = null;
        SuggestSuccess response = api.getDocTypeSuggestResults(indexName, docTypeName, q);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetches the document referenced by &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        String docId = null;
        GetDocumentSuccess response = api.getDocument(indexName, docTypeName, docId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Checks whether &#x60;document_type&#x60; in &#x60;index_name&#x60; exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTypeTest() throws ApiException {
        String indexName = null;
        String docTypeName = null;
        GetDocTypeSuccess response = api.getDocumentType(indexName, docTypeName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Checks whether &#x60;a particular index&#x60; {index_name} exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndexTest() throws ApiException {
        String indexName = null;
        GetIndexSuccess response = api.getIndex(indexName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns Similar Documents based on the provided document(s) details. Please ensure you refer the getting started guides, to get the format of the query right.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSimilarDocsResultsTest() throws ApiException {
        AlgorithmSimilarDocsQuery algorithm = null;
        AlgorithmSuccess response = api.getSimilarDocsResults(algorithm);

        // TODO: test validations
    }
    
}
