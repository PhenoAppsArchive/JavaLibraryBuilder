package org.wheatgenetics.javalibrarybuilder;

/**
 * Uses:
 * org.junit.Test
 *
 * io.swagger.client.ApiException
 * io.swagger.client.api.CallsApi
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class CallsApiTest extends java.lang.Object
{
    private io.swagger.client.api.CallsApi callsApiInstance = null;

    private io.swagger.client.api.CallsApi callsApi()
    {
        if (null == this.callsApiInstance)
            this.callsApiInstance = new io.swagger.client.api.CallsApi();
        return this.callsApiInstance;
    }

    @org.junit.Test() public void callsGetAsync() throws io.swagger.client.ApiException
    {
        this.callsApi().callsGetAsync(
            /* datatype      => */null,
            /* dataType      => */null,
            /* page          => */null,
            /* pageSize      => */null,
            /* authorization => */null,
            /* callback      => */null);
    }
}