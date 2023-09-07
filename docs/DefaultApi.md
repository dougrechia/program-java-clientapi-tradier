# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/dougrechia/Tradier/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountsAccountIdBalancesGet**](DefaultApi.md#v1AccountsAccountIdBalancesGet) | **GET** /v1/accounts/{accountId}/balances | 
[**v1AccountsAccountIdOrdersGet**](DefaultApi.md#v1AccountsAccountIdOrdersGet) | **GET** /v1/accounts/{accountId}/orders | 
[**v1AccountsAccountIdOrdersPost**](DefaultApi.md#v1AccountsAccountIdOrdersPost) | **POST** /v1/accounts/{accountId}/orders | 
[**v1AccountsAccountIdPositionsGet**](DefaultApi.md#v1AccountsAccountIdPositionsGet) | **GET** /v1/accounts/{accountId}/positions | 
[**v1MarketsLookupGet**](DefaultApi.md#v1MarketsLookupGet) | **GET** /v1/markets/lookup | 
[**v1MarketsQuotesGet**](DefaultApi.md#v1MarketsQuotesGet) | **GET** /v1/markets/quotes | 
[**v1UserProfileGet**](DefaultApi.md#v1UserProfileGet) | **GET** /v1/user/profile | 

<a name="v1AccountsAccountIdBalancesGet"></a>
# **v1AccountsAccountIdBalancesGet**
> Balances v1AccountsAccountIdBalancesGet(accountId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | Account number
try {
    Balances result = apiInstance.v1AccountsAccountIdBalancesGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1AccountsAccountIdBalancesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account number |

### Return type

[**Balances**](Balances.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1AccountsAccountIdOrdersGet"></a>
# **v1AccountsAccountIdOrdersGet**
> InlineResponse2001 v1AccountsAccountIdOrdersGet(accountId, includeTags)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | Account number
String includeTags = "includeTags_example"; // String | Includes the tag field in the returned data set.
try {
    InlineResponse2001 result = apiInstance.v1AccountsAccountIdOrdersGet(accountId, includeTags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1AccountsAccountIdOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account number |
 **includeTags** | **String**| Includes the tag field in the returned data set. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1AccountsAccountIdOrdersPost"></a>
# **v1AccountsAccountIdOrdersPost**
> OrderPost v1AccountsAccountIdOrdersPost(propertyClass, symbol, side, quantity, type, duration, tag, accountId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String propertyClass = "propertyClass_example"; // String | 
String symbol = "symbol_example"; // String | 
String side = "side_example"; // String | 
BigDecimal quantity = new BigDecimal(); // BigDecimal | 
String type = "type_example"; // String | 
String duration = "duration_example"; // String | 
String tag = "tag_example"; // String | 
String accountId = "accountId_example"; // String | Account number
try {
    OrderPost result = apiInstance.v1AccountsAccountIdOrdersPost(propertyClass, symbol, side, quantity, type, duration, tag, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1AccountsAccountIdOrdersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyClass** | **String**|  |
 **symbol** | **String**|  |
 **side** | **String**|  |
 **quantity** | **BigDecimal**|  |
 **type** | **String**|  |
 **duration** | **String**|  |
 **tag** | **String**|  |
 **accountId** | **String**| Account number |

### Return type

[**OrderPost**](OrderPost.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="v1AccountsAccountIdPositionsGet"></a>
# **v1AccountsAccountIdPositionsGet**
> InlineResponse200 v1AccountsAccountIdPositionsGet(accountId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | Account number
try {
    InlineResponse200 result = apiInstance.v1AccountsAccountIdPositionsGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1AccountsAccountIdPositionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account number |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1MarketsLookupGet"></a>
# **v1MarketsLookupGet**
> InlineResponse2002 v1MarketsLookupGet(q, types)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String q = "q_example"; // String | Query tip filter
String types = "types_example"; // String | symbol types, comma separated
try {
    InlineResponse2002 result = apiInstance.v1MarketsLookupGet(q, types);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1MarketsLookupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Query tip filter | [optional]
 **types** | **String**| symbol types, comma separated | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1MarketsQuotesGet"></a>
# **v1MarketsQuotesGet**
> InlineResponse2003 v1MarketsQuotesGet(symbols)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String symbols = "symbols_example"; // String | symbols to get quotes; comma separated
try {
    InlineResponse2003 result = apiInstance.v1MarketsQuotesGet(symbols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1MarketsQuotesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols** | **String**| symbols to get quotes; comma separated | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1UserProfileGet"></a>
# **v1UserProfileGet**
> Profile v1UserProfileGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Profile result = apiInstance.v1UserProfileGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1UserProfileGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Profile**](Profile.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

