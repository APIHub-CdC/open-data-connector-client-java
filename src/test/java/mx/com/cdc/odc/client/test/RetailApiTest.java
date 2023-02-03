package mx.com.cdc.odc.client.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import mx.com.cdc.odc.client.ApiClient;
import mx.com.cdc.odc.client.api.RetailApi;
import mx.com.cdc.odc.client.model.AggregationServiceResponsePayload;
import mx.com.cdc.odc.client.model.RetailRequestPayload;
import okhttp3.OkHttpClient;

public class RetailApiTest {
    
	private String url                 = "";
	private String xApiKey             = "";
	private String username            = "";
	private String password            = "";
	private String keystoreFile        = "";
	private String cdcCertFile         = "";
	private String keystorePassword    = "";
	private String keyAlias            = "";
	private String keyPassword         = "";

	private ApiClient apiClient;
	
	private final RetailApi api = new RetailApi();
    
	@Before()
	public void setUp() {
	    
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
	  
	    OkHttpClient okHttpClient = new OkHttpClient()
	    .newBuilder()
	    .readTimeout(30, TimeUnit.SECONDS)
	    .addInterceptor(new SignerInterceptor(
	        keystoreFile,
	        cdcCertFile,
	        keystorePassword,
	        keyAlias,
	        keyPassword))
	    .build();
	  
	    this.apiClient.setHttpClient(okHttpClient);
	} 
    
    @Test
    public void getRetailTest() throws Exception {
        
    	String subscriptionId = "";
        
        RetailRequestPayload body = new RetailRequestPayload();
        body.setReadShopping(true);
        body.setReadShoppingCreditBilling(true);
        body.setReadShoppingCredits(true);
        body.setRequestCode("");
        body.setStartDate(LocalDate.parse(""));
        
        AggregationServiceResponsePayload response = api.getRetail(
        		xApiKey, 
        		subscriptionId, 
        		username, 
        		password, 
        		body);
        
        System.out.println(response);
    }
    
}
