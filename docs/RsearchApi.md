# RsearchApi

All URIs are relative to *https://api.parallelstack.com/api/rsearch/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocument**](RsearchApi.md#addDocument) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**addDocumentType**](RsearchApi.md#addDocumentType) | **POST** /indexes/{index_name}/document_types/{doc_type_name} | 
[**addIndex**](RsearchApi.md#addIndex) | **POST** /indexes/{index_name} | 
[**deleteDocument**](RsearchApi.md#deleteDocument) | **DELETE** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**deleteIndex**](RsearchApi.md#deleteIndex) | **DELETE** /indexes/{index_name} | 
[**getAdvancedDocTypeSuggestResults**](RsearchApi.md#getAdvancedDocTypeSuggestResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 
[**getAdvancedIndexSuggestResults**](RsearchApi.md#getAdvancedIndexSuggestResults) | **POST** /indexes/{index_name}/suggest | 
[**getAdvancedSearchResults**](RsearchApi.md#getAdvancedSearchResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/search | 
[**getAllDocumentTypes**](RsearchApi.md#getAllDocumentTypes) | **GET** /indexes/{index_name}/document_types | 
[**getAllDocuments**](RsearchApi.md#getAllDocuments) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents | 
[**getAllIndexes**](RsearchApi.md#getAllIndexes) | **GET** /indexes | 
[**getBasicSearchResults**](RsearchApi.md#getBasicSearchResults) | **GET** /indexes/{index_name}/search | 
[**getDocTypeSuggestResults**](RsearchApi.md#getDocTypeSuggestResults) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 
[**getDocument**](RsearchApi.md#getDocument) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**getDocumentType**](RsearchApi.md#getDocumentType) | **GET** /indexes/{index_name}/document_types/{doc_type_name} | 
[**getIndex**](RsearchApi.md#getIndex) | **GET** /indexes/{index_name} | 


<a name="addDocument"></a>
# **addDocument**
> CreateDocumentSuccess addDocument(indexNamedocTypeNamedocId)



Creates &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the document_type
String docId = Arrays.asList("docId_example"); // String | Document ID
try {
    CreateDocumentSuccess result = apiInstance.addDocument(indexNamedocTypeNamedocId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the document_type |
 **docId** | [**String**](.md)| Document ID |

### Return type

[**CreateDocumentSuccess**](CreateDocumentSuccess.md)

### Authorization

[authToken](../README.md#authToken)[writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="addDocumentType"></a>
# **addDocumentType**
> CreateDocTypeSuccess addDocumentType(indexNamedocTypeName)



Creates specific &#x60;document_type&#x60; in &#x60;index_name&#x60; with specified parameters. You should define the parameters correctly as per the getting started guide, else getting the right structure might be an issue.

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the document_type
try {
    CreateDocTypeSuccess result = apiInstance.addDocumentType(indexNamedocTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addDocumentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the document_type |

### Return type

[**CreateDocTypeSuccess**](CreateDocTypeSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="addIndex"></a>
# **addIndex**
> CreateIndexSuccess addIndex(indexName)



Creates &#x60;a new index&#x60;.

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
try {
    CreateIndexSuccess result = apiInstance.addIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |

### Return type

[**CreateIndexSuccess**](CreateIndexSuccess.md)

### Authorization

[authToken](../README.md#authToken)[writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="deleteDocument"></a>
# **deleteDocument**
> DeleteDocumentSuccess deleteDocument(indexNamedocTypeNamedocId)



Deletes &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the document_type
String docId = Arrays.asList("docId_example"); // String | Document ID
try {
    DeleteDocumentSuccess result = apiInstance.deleteDocument(indexNamedocTypeNamedocId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the document_type |
 **docId** | [**String**](.md)| Document ID |

### Return type

[**DeleteDocumentSuccess**](DeleteDocumentSuccess.md)

### Authorization

[authToken](../README.md#authToken)[writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="deleteIndex"></a>
# **deleteIndex**
> DeleteIndexSuccess deleteIndex(indexName)



Deletes &#x60;an index&#x60; {index_name}

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
try {
    DeleteIndexSuccess result = apiInstance.deleteIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#deleteIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |

### Return type

[**DeleteIndexSuccess**](DeleteIndexSuccess.md)

### Authorization

[authToken](../README.md#authToken)[writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getAdvancedDocTypeSuggestResults"></a>
# **getAdvancedDocTypeSuggestResults**
> SuggestSuccess getAdvancedDocTypeSuggestResults(indexNamedocTypeName)



Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60; limited by the body params. Please ensure you refer the getting started guides, to get the format of the query right.

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the Document_type
try {
    SuggestSuccess result = apiInstance.getAdvancedDocTypeSuggestResults(indexNamedocTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedDocTypeSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the Document_type |

### Return type

[**SuggestSuccess**](SuggestSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getAdvancedIndexSuggestResults"></a>
# **getAdvancedIndexSuggestResults**
> SuggestSuccess getAdvancedIndexSuggestResults(indexName)



Gets Suggestions in &#x60;index_name&#x60; limited by the request body fields

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
try {
    SuggestSuccess result = apiInstance.getAdvancedIndexSuggestResults(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedIndexSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |

### Return type

[**SuggestSuccess**](SuggestSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getAdvancedSearchResults"></a>
# **getAdvancedSearchResults**
> SearchSuccess getAdvancedSearchResults(indexNamedocTypeName)



Advanced Search which gets all documents in &#x60;index_name&#x60; for provided search criteria. Please ensure you refer the getting started guides, to get the format of the query right.

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the Document_type
try {
    SearchSuccess result = apiInstance.getAdvancedSearchResults(indexNamedocTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the Document_type |

### Return type

[**SearchSuccess**](SearchSuccess.md)

### Authorization

[authToken](../README.md#authToken)[writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getAllDocumentTypes"></a>
# **getAllDocumentTypes**
> GetDocTypesSuccess getAllDocumentTypes(indexName)



Gets &#x60;All document_types&#x60; present in &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
try {
    GetDocTypesSuccess result = apiInstance.getAllDocumentTypes(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllDocumentTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |

### Return type

[**GetDocTypesSuccess**](GetDocTypesSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getAllDocuments"></a>
# **getAllDocuments**
> GetDocumentsSuccess getAllDocuments(indexNamedocTypeName)



Fetches all documents in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;. All the documents and hence careful with its use.

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the document_type
try {
    GetDocumentsSuccess result = apiInstance.getAllDocuments(indexNamedocTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the document_type |

### Return type

[**GetDocumentsSuccess**](GetDocumentsSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getAllIndexes"></a>
# **getAllIndexes**
> GetIndexesSuccess getAllIndexes()



Fetches &#x60;All indexes&#x60; that the user has. Not recommended to be used in production code, as there isn&#39;t that big a Use case for listing all indexes!

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
try {
    GetIndexesSuccess result = apiInstance.getAllIndexes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllIndexes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetIndexesSuccess**](GetIndexesSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getBasicSearchResults"></a>
# **getBasicSearchResults**
> SearchSuccess getBasicSearchResults(indexNameq)



Basic Search which gets all documents in &#x60;index_name&#x60; for provided search criteria

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String q = Arrays.asList("q_example"); // String | Search Query
try {
    SearchSuccess result = apiInstance.getBasicSearchResults(indexNameq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getBasicSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **q** | [**String**](.md)| Search Query |

### Return type

[**SearchSuccess**](SearchSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getDocTypeSuggestResults"></a>
# **getDocTypeSuggestResults**
> SuggestSuccess getDocTypeSuggestResults(indexNamedocTypeNameq)



Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60;. Please ensure you refer the getting started guides, to get the format of the query right.

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the Document_type
String q = Arrays.asList("q_example"); // String | Details of the suggest query
try {
    SuggestSuccess result = apiInstance.getDocTypeSuggestResults(indexNamedocTypeNameq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocTypeSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the Document_type |
 **q** | [**String**](.md)| Details of the suggest query |

### Return type

[**SuggestSuccess**](SuggestSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getDocument"></a>
# **getDocument**
> GetDocumentSuccess getDocument(indexNamedocTypeNamedocId)



Fetches the document referenced by &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the document_type
String docId = Arrays.asList("docId_example"); // String | Document ID
try {
    GetDocumentSuccess result = apiInstance.getDocument(indexNamedocTypeNamedocId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the document_type |
 **docId** | [**String**](.md)| Document ID |

### Return type

[**GetDocumentSuccess**](GetDocumentSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getDocumentType"></a>
# **getDocumentType**
> GetDocTypeSuccess getDocumentType(indexNamedocTypeName)



Checks whether &#x60;document_type&#x60; in &#x60;index_name&#x60; exists

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
String docTypeName = Arrays.asList("docTypeName_example"); // String | Name of the document_type
try {
    GetDocTypeSuccess result = apiInstance.getDocumentType(indexNamedocTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocumentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |
 **docTypeName** | [**String**](.md)| Name of the document_type |

### Return type

[**GetDocTypeSuccess**](GetDocTypeSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

<a name="getIndex"></a>
# **getIndex**
> GetIndexSuccess getIndex(indexName)



Checks whether &#x60;a particular index&#x60; {index_name} exists

### Example
```java
// Import classes:
//import com.parallelstack.ApiException;
//import com.parallelstack.rsearch.RsearchApi;


RsearchApi apiInstance = new RsearchApi();
String indexName = Arrays.asList("indexName_example"); // String | Name of the index
try {
    GetIndexSuccess result = apiInstance.getIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | [**String**](.md)| Name of the index |

### Return type

[**GetIndexSuccess**](GetIndexSuccess.md)

### Authorization

[authToken](../README.md#authToken)[readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/jsonapplication/jsonapplication/json

