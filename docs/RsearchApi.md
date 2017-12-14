# RsearchApi

All URIs are relative to *https://api.parallelstack.com/api/rsearch/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocument**](RsearchApi.md#addDocument) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**addDocumentType**](RsearchApi.md#addDocumentType) | **POST** /indexes/{index_name}/document_types/{doc_type_name} | 
[**addIndex**](RsearchApi.md#addIndex) | **POST** /indexes/{index_name} | 
[**deleteDocument**](RsearchApi.md#deleteDocument) | **DELETE** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**deleteIndex**](RsearchApi.md#deleteIndex) | **DELETE** /indexes/{index_name} | 
[**getAdvancedSearchResults**](RsearchApi.md#getAdvancedSearchResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/search | 
[**getAllDocumentTypes**](RsearchApi.md#getAllDocumentTypes) | **GET** /indexes/{index_name}/document_types | 
[**getAllDocuments**](RsearchApi.md#getAllDocuments) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents | 
[**getAllIndexes**](RsearchApi.md#getAllIndexes) | **GET** /indexes | 
[**getBasicSearchResults**](RsearchApi.md#getBasicSearchResults) | **GET** /indexes/{index_name}/search | 
[**getDocument**](RsearchApi.md#getDocument) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
[**getDocumentType**](RsearchApi.md#getDocumentType) | **GET** /indexes/{index_name}/document_types/{doc_type_name} | 
[**getIndex**](RsearchApi.md#getIndex) | **GET** /indexes/{index_name} | 
[**getSuggestResults**](RsearchApi.md#getSuggestResults) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 


<a name="addDocument"></a>
# **addDocument**
> InlineResponse2006 addDocument(indexName, docTypeName, docId, documentDetails)



Creates &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: writeAppID
ApiKeyAuth writeAppID = (ApiKeyAuth) defaultClient.getAuthentication("writeAppID");
writeAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//writeAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
String docId = "docId_example"; // String | Document ID
Object documentDetails = null; // Object | Details of the document
try {
    InlineResponse2006 result = apiInstance.addDocument(indexName, docTypeName, docId, documentDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docId** | **String**| Document ID |
 **documentDetails** | **Object**| Details of the document |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDocumentType"></a>
# **addDocumentType**
> InlineResponse2011 addDocumentType(indexName, docTypeName, docTypeDetails)



Creates specific &#x60;document_type&#x60; in &#x60;index_name&#x60; with specified parameters

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
Object docTypeDetails = null; // Object | Details of the document_type
try {
    InlineResponse2011 result = apiInstance.addDocumentType(indexName, docTypeName, docTypeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addDocumentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docTypeDetails** | **Object**| Details of the document_type |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addIndex"></a>
# **addIndex**
> InlineResponse201 addIndex(indexName)



Creates &#x60;a new index&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: writeAppID
ApiKeyAuth writeAppID = (ApiKeyAuth) defaultClient.getAuthentication("writeAppID");
writeAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//writeAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    InlineResponse201 result = apiInstance.addIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#addIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> InlineResponse2007 deleteDocument(indexName, docTypeName, docId)



Deletes &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: writeAppID
ApiKeyAuth writeAppID = (ApiKeyAuth) defaultClient.getAuthentication("writeAppID");
writeAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//writeAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
String docId = "docId_example"; // String | Document ID
try {
    InlineResponse2007 result = apiInstance.deleteDocument(indexName, docTypeName, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docId** | **String**| Document ID |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIndex"></a>
# **deleteIndex**
> InlineResponse202 deleteIndex(indexName)



Deletes &#x60;an index&#x60; {index_name}

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: writeAppID
ApiKeyAuth writeAppID = (ApiKeyAuth) defaultClient.getAuthentication("writeAppID");
writeAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//writeAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    InlineResponse202 result = apiInstance.deleteIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#deleteIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAdvancedSearchResults"></a>
# **getAdvancedSearchResults**
> InlineResponse2008 getAdvancedSearchResults(indexName, docTypeName, search)



Advanced Search which gets all documents in &#x60;index_name&#x60; for provided search criteria

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: writeAppID
ApiKeyAuth writeAppID = (ApiKeyAuth) defaultClient.getAuthentication("writeAppID");
writeAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//writeAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the Document)type
Object search = null; // Object | Details of the search query
try {
    InlineResponse2008 result = apiInstance.getAdvancedSearchResults(indexName, docTypeName, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAdvancedSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the Document)type |
 **search** | **Object**| Details of the search query |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[authToken](../README.md#authToken), [writeAppID](../README.md#writeAppID)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllDocumentTypes"></a>
# **getAllDocumentTypes**
> InlineResponse2002 getAllDocumentTypes(indexName)



Gets &#x60;All document_types&#x60; present in &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    InlineResponse2002 result = apiInstance.getAllDocumentTypes(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllDocumentTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDocuments"></a>
# **getAllDocuments**
> InlineResponse2004 getAllDocuments(indexName, docTypeName)



Fetches all documents in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
try {
    InlineResponse2004 result = apiInstance.getAllDocuments(indexName, docTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllIndexes"></a>
# **getAllIndexes**
> InlineResponse200 getAllIndexes()



Fetches &#x60;All indexes&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
try {
    InlineResponse200 result = apiInstance.getAllIndexes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getAllIndexes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBasicSearchResults"></a>
# **getBasicSearchResults**
> InlineResponse2008 getBasicSearchResults(indexName, q)



Basic Search which gets all documents in &#x60;index_name&#x60; for provided search criteria

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String q = "q_example"; // String | Search Query
try {
    InlineResponse2008 result = apiInstance.getBasicSearchResults(indexName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getBasicSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **q** | **String**| Search Query |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> InlineResponse2005 getDocument(indexName, docTypeName, docId)



Fetches details of &#x60;doc_id&#x60; in &#x60;doc_type_name&#x60; for &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
String docId = "docId_example"; // String | Document ID
try {
    InlineResponse2005 result = apiInstance.getDocument(indexName, docTypeName, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |
 **docId** | **String**| Document ID |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentType"></a>
# **getDocumentType**
> InlineResponse2003 getDocumentType(indexName, docTypeName)



Checks whether &#x60;document_type&#x60; in &#x60;index_name&#x60; exists

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the document_type
try {
    InlineResponse2003 result = apiInstance.getDocumentType(indexName, docTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getDocumentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the document_type |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIndex"></a>
# **getIndex**
> InlineResponse2001 getIndex(indexName)



Checks whether &#x60;a particular index&#x60; {index_name} exists

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
try {
    InlineResponse2001 result = apiInstance.getIndex(indexName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSuggestResults"></a>
# **getSuggestResults**
> InlineResponse2009 getSuggestResults(indexName, docTypeName, q)



Basic Search - Gets Suggestions from &#x60;doc_type_name&#x60; in &#x60;index_name&#x60;

### Example
```java
// Import classes:
//import com.parallelstack.ApiClient;
//import com.parallelstack.ApiException;
//import com.parallelstack.Configuration;
//import com.parallelstack.auth.*;
//import com.parallelstack.rsearch.RsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authToken
ApiKeyAuth authToken = (ApiKeyAuth) defaultClient.getAuthentication("authToken");
authToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authToken.setApiKeyPrefix("Token");

// Configure API key authorization: readAppID
ApiKeyAuth readAppID = (ApiKeyAuth) defaultClient.getAuthentication("readAppID");
readAppID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//readAppID.setApiKeyPrefix("Token");

RsearchApi apiInstance = new RsearchApi();
String indexName = "indexName_example"; // String | Name of the index
String docTypeName = "docTypeName_example"; // String | Name of the Document_type
String q = "q_example"; // String | Details of the suggest query
try {
    InlineResponse2009 result = apiInstance.getSuggestResults(indexName, docTypeName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RsearchApi#getSuggestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **indexName** | **String**| Name of the index |
 **docTypeName** | **String**| Name of the Document_type |
 **q** | **String**| Details of the suggest query |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[authToken](../README.md#authToken), [readAppID](../README.md#readAppID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

