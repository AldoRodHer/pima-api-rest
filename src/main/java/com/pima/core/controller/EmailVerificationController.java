package com.pima.core.controller;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pima.core.converter.Converter;
import com.pima.core.entity.DomainEmail;
import com.pima.core.entity.InfoEmail;
import com.pima.core.model.BreachInfoModel;
import com.pima.core.response.ResponseHandler;
import com.pima.core.service.DomainEmailService;
import com.pima.core.service.InfoEmailService;

@RestController
@RequestMapping("/v1")
public class EmailVerificationController {
	@Autowired
	@Qualifier(value="InfoEmailService")
	private InfoEmailService serviceInfo;
	
	@Autowired
	@Qualifier(value="DomainEmailService")
	private DomainEmailService serviceDomain;
	
	@Autowired
	@Qualifier("Converter")
	private Converter converter;
	
	private HttpClient client = HttpClient.newHttpClient();
	
	@PutMapping("/emailVerification/{email}")
	public ResponseEntity<Object> verifyEmail(@PathVariable("email") String email) throws IOException, InterruptedException, JSONException{
		HttpRequest request = HttpRequest.newBuilder()
		          .GET()
		          .uri(URI.create("https://api.seon.io/SeonRestService/email-api/v2.2/"+email))
		          .setHeader("X-API-KEY", "21263f79-7c62-48a7-b48c-72fe53d4d35f")
		          .build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("response status: " + response.statusCode());
		System.out.println("response body: \n" + response.body());
		JSONObject resp = new JSONObject(response.body());
		JSONObject data = resp.optJSONObject("data");
		InfoEmail emailObj = converter.convertJSONToInfoEmail(data);
		DomainEmail domainObj = converter.convertJSONToDomainEmail(data.optJSONObject("domain_details"));
		BreachInfoModel breachObj = converter.convertJSONToBreachInfoModel(data.optJSONObject("breach_details"));
		serviceInfo.create(emailObj);
		serviceDomain.create(domainObj);
		return ResponseHandler.generateResponseEmailVerify("Email verificado", HttpStatus.OK, emailObj, domainObj, breachObj);
	}
}
