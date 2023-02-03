package mx.com.cdc.odc.client.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import mx.com.cdc.odc.client.ApiClient;
import mx.com.cdc.odc.client.api.EnergyApi;
import mx.com.cdc.odc.client.model.AggregationServiceResponsePayload;
import mx.com.cdc.odc.client.model.EnergyRequestPayload;
import okhttp3.OkHttpClient;

public class EnergyApiTest {
    
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
	
	private final EnergyApi api = new EnergyApi();
      
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
    public void getEnergyTest() throws Exception {
        
    	String subscriptionId = "";
        
        EnergyRequestPayload body = new EnergyRequestPayload();
        body.setReadAccountDetails(true);
        body.setReadCustomer(true);
        body.setRequestCode("");
        body.setStartDate(LocalDate.parse(""));
        
        AggregationServiceResponsePayload response = api.getEnergy(
        		xApiKey, 
        		subscriptionId, 
        		username, 
        		password, 
        		body);
        
        System.out.println(response);
    }
    
}
