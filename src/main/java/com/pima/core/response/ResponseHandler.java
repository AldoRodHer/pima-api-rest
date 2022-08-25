package com.pima.core.response;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.pima.core.entity.DomainEmail;
import com.pima.core.entity.InfoEmail;
import com.pima.core.model.BreachInfoModel;

public class ResponseHandler {
	public static ResponseEntity<Object> generateResponseEmailVerify(String message, HttpStatus status, InfoEmail email, DomainEmail domain, BreachInfoModel breaches)throws JSONException{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", message);
		map.put("status", status.value());
		map.put("email_info", email);
		map.put("domain_info", domain);
		map.put("breach_info", breaches);
		return new ResponseEntity<Object>(map,status);
	}
}