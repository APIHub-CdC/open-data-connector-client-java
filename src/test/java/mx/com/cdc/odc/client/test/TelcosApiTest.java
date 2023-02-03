package mx.com.cdc.odc.client.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.LocalDate;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import mx.com.cdc.odc.client.ApiClient;
import mx.com.cdc.odc.client.ApiException;
import mx.com.cdc.odc.client.api.TelcosApi;
import mx.com.cdc.odc.client.model.AggregationServiceResponsePayload;
import mx.com.cdc.odc.client.model.TelcosRequestPayload;
import okhttp3.OkHttpClient;

public class TelcosApiTest {

	private static final Logger log = LoggerFactory.getLogger(TelcosApiTest.class);
	
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
	
	private final TelcosApi api = new TelcosApi();
    
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
    public void getTelcosTest() throws Exception {
    	
        String subscriptionId = "";
        
        TelcosRequestPayload body = new TelcosRequestPayload();
        body.setReadBilling(true);
        body.setReadCreditPayments(true);
        body.setReadPaymentHistory(true);
        body.setReadPlanDetails(true);
        body.setReadSummary(true);
        body.setRequestCode("");
        body.setStartDate(LocalDate.parse(""));
        
        try {
			AggregationServiceResponsePayload response = api.getTelcos(
					xApiKey, 
					subscriptionId, 
					username, 
					password,
					body);
			
			log.info(response.toString());
			
		} catch (ApiException exception) {
			
			log.error(exception.getResponseBody());
		}
    }
    
}
