# rsearch

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.parallelstack</groupId>
    <artifactId>rsearch</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.parallelstack:rsearch:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rsearch-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.parallelstack.*;
import com.parallelstack.auth.*;
import com.parallelstack.rsearch.model.*;
import com.parallelstack.rsearch.RsearchApi;

import java.io.File;
import java.util.*;

public class RsearchApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.parallelstack.com/api/rsearch/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*RsearchApi* | [**addDocument**](docs/RsearchApi.md#addDocument) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
*RsearchApi* | [**addDocumentType**](docs/RsearchApi.md#addDocumentType) | **POST** /indexes/{index_name}/document_types/{doc_type_name} | 
*RsearchApi* | [**addIndex**](docs/RsearchApi.md#addIndex) | **POST** /indexes/{index_name} | 
*RsearchApi* | [**deleteDocument**](docs/RsearchApi.md#deleteDocument) | **DELETE** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
*RsearchApi* | [**deleteIndex**](docs/RsearchApi.md#deleteIndex) | **DELETE** /indexes/{index_name} | 
*RsearchApi* | [**getAdvancedSearchResults**](docs/RsearchApi.md#getAdvancedSearchResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/search | 
*RsearchApi* | [**getAllDocumentTypes**](docs/RsearchApi.md#getAllDocumentTypes) | **GET** /indexes/{index_name}/document_types | 
*RsearchApi* | [**getAllDocuments**](docs/RsearchApi.md#getAllDocuments) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents | 
*RsearchApi* | [**getAllIndexes**](docs/RsearchApi.md#getAllIndexes) | **GET** /indexes | 
*RsearchApi* | [**getBasicSearchResults**](docs/RsearchApi.md#getBasicSearchResults) | **GET** /indexes/{index_name}/search | 
*RsearchApi* | [**getDocument**](docs/RsearchApi.md#getDocument) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
*RsearchApi* | [**getDocumentType**](docs/RsearchApi.md#getDocumentType) | **GET** /indexes/{index_name}/document_types/{doc_type_name} | 
*RsearchApi* | [**getIndex**](docs/RsearchApi.md#getIndex) | **GET** /indexes/{index_name} | 
*RsearchApi* | [**getSuggestResults**](docs/RsearchApi.md#getSuggestResults) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 


## Documentation for Models

 - [DoctypesFailure](docs/DoctypesFailure.md)
 - [GetAllDoctypesSuccess](docs/GetAllDoctypesSuccess.md)
 - [GetDoctypeSuccess](docs/GetDoctypeSuccess.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Index](docs/InlineResponse2001Index.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Indexes](docs/InlineResponse2002Indexes.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003DocumentType](docs/InlineResponse2003DocumentType.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004Indexes](docs/InlineResponse2004Indexes.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005Document](docs/InlineResponse2005Document.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2008SearchResults](docs/InlineResponse2008SearchResults.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse2009SuggestResults](docs/InlineResponse2009SuggestResults.md)
 - [InlineResponse200Indexes](docs/InlineResponse200Indexes.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [InlineResponse201Index](docs/InlineResponse201Index.md)
 - [InlineResponse202](docs/InlineResponse202.md)
 - [InlineResponse202Index](docs/InlineResponse202Index.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse4001](docs/InlineResponse4001.md)
 - [InlineResponse4002](docs/InlineResponse4002.md)
 - [InlineResponse4003](docs/InlineResponse4003.md)
 - [InlineResponse4004](docs/InlineResponse4004.md)
 - [InlineResponse4005](docs/InlineResponse4005.md)
 - [InlineResponse4006](docs/InlineResponse4006.md)
 - [InlineResponse4006SearchResults](docs/InlineResponse4006SearchResults.md)
 - [InlineResponse4007](docs/InlineResponse4007.md)
 - [InlineResponse4007SearchResults](docs/InlineResponse4007SearchResults.md)
 - [InlineResponse400Indexes](docs/InlineResponse400Indexes.md)
 - [SearchSuccess](docs/SearchSuccess.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### authToken

- **Type**: API key
- **API key parameter name**: auth_token
- **Location**: URL query string

### readAppID

- **Type**: API key
- **API key parameter name**: X-RSearch-App-ID
- **Location**: HTTP header

### writeAppID

- **Type**: API key
- **API key parameter name**: X-RSearch-App-ID
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

team@parallelstack.com

