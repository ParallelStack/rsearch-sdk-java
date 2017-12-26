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
    <version>1.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.parallelstack:rsearch:1.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rsearch-1.1.0.jar
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
*RsearchApi* | [**getAdvancedDocTypeSuggestResults**](docs/RsearchApi.md#getAdvancedDocTypeSuggestResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 
*RsearchApi* | [**getAdvancedIndexSuggestResults**](docs/RsearchApi.md#getAdvancedIndexSuggestResults) | **POST** /indexes/{index_name}/suggest | 
*RsearchApi* | [**getAdvancedSearchResults**](docs/RsearchApi.md#getAdvancedSearchResults) | **POST** /indexes/{index_name}/document_types/{doc_type_name}/search | 
*RsearchApi* | [**getAllDocumentTypes**](docs/RsearchApi.md#getAllDocumentTypes) | **GET** /indexes/{index_name}/document_types | 
*RsearchApi* | [**getAllDocuments**](docs/RsearchApi.md#getAllDocuments) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents | 
*RsearchApi* | [**getAllIndexes**](docs/RsearchApi.md#getAllIndexes) | **GET** /indexes | 
*RsearchApi* | [**getBasicSearchResults**](docs/RsearchApi.md#getBasicSearchResults) | **GET** /indexes/{index_name}/search | 
*RsearchApi* | [**getDocTypeSuggestResults**](docs/RsearchApi.md#getDocTypeSuggestResults) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/suggest | 
*RsearchApi* | [**getDocument**](docs/RsearchApi.md#getDocument) | **GET** /indexes/{index_name}/document_types/{doc_type_name}/documents/{doc_id} | 
*RsearchApi* | [**getDocumentType**](docs/RsearchApi.md#getDocumentType) | **GET** /indexes/{index_name}/document_types/{doc_type_name} | 
*RsearchApi* | [**getIndex**](docs/RsearchApi.md#getIndex) | **GET** /indexes/{index_name} | 


## Documentation for Models

 - [CreateDocTypeFailure](docs/CreateDocTypeFailure.md)
 - [CreateDocTypeSuccess](docs/CreateDocTypeSuccess.md)
 - [CreateDocumentFailure](docs/CreateDocumentFailure.md)
 - [CreateDocumentSuccess](docs/CreateDocumentSuccess.md)
 - [CreateIndexFailure](docs/CreateIndexFailure.md)
 - [CreateIndexSuccess](docs/CreateIndexSuccess.md)
 - [DeleteDocumentFailure](docs/DeleteDocumentFailure.md)
 - [DeleteDocumentSuccess](docs/DeleteDocumentSuccess.md)
 - [DeleteIndexFailure](docs/DeleteIndexFailure.md)
 - [DeleteIndexSuccess](docs/DeleteIndexSuccess.md)
 - [Document](docs/Document.md)
 - [DocumentType](docs/DocumentType.md)
 - [GetDocTypeFailure](docs/GetDocTypeFailure.md)
 - [GetDocTypeSuccess](docs/GetDocTypeSuccess.md)
 - [GetDocTypesFailure](docs/GetDocTypesFailure.md)
 - [GetDocTypesSuccess](docs/GetDocTypesSuccess.md)
 - [GetDocumentFailure](docs/GetDocumentFailure.md)
 - [GetDocumentSuccess](docs/GetDocumentSuccess.md)
 - [GetDocumentsFailure](docs/GetDocumentsFailure.md)
 - [GetDocumentsSuccess](docs/GetDocumentsSuccess.md)
 - [GetIndexFailure](docs/GetIndexFailure.md)
 - [GetIndexSuccess](docs/GetIndexSuccess.md)
 - [GetIndexesFailure](docs/GetIndexesFailure.md)
 - [GetIndexesSuccess](docs/GetIndexesSuccess.md)
 - [SearchFailure](docs/SearchFailure.md)
 - [SearchQuery](docs/SearchQuery.md)
 - [SearchSuccess](docs/SearchSuccess.md)
 - [SuggestFailure](docs/SuggestFailure.md)
 - [SuggestQuery](docs/SuggestQuery.md)
 - [SuggestSuccess](docs/SuggestSuccess.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### authToken


### readAppID


### writeAppID



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

team@parallelstack.com

