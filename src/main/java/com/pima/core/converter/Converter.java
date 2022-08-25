package com.pima.core.converter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import com.pima.core.entity.DomainEmail;
import com.pima.core.entity.InfoEmail;
import com.pima.core.model.BreachInfoModel;

@Component(value="Converter")
public class Converter {
	public InfoEmail convertJSONToInfoEmail(JSONObject data) throws JSONException{
		InfoEmail email = new InfoEmail();
		email.setEmail(data.getString("email"));
		email.setScore(data.getInt("score"));
		try {
			email.setExist(data.getBoolean("deliverable"));
		}catch(Exception e) {}
		String accounts = "";
		JSONObject accountsJSON = data.optJSONObject("account_details");
		String [] names = JSONObject.getNames(accountsJSON);
		for(int i=0;i<accountsJSON.length();i++) {
			JSONObject account = accountsJSON.optJSONObject(names[i]);
			try {
				if(account.getBoolean("registered")) {
					accounts += names[i] + ",";
				}
			}catch(Exception e) {
				continue;
			}
		}
		email.setAccounts(accounts);
		return email;
	}
	
	public DomainEmail convertJSONToDomainEmail(JSONObject data) throws JSONException{
		DomainEmail domain = new DomainEmail();
		domain.setDomain(data.getString("domain"));
		domain.setTld(data.getString("tld"));
		domain.setRegistered(data.getBoolean("registered"));
		try {
			domain.setCreated(LocalDateTime.parse(data.getString("created"),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			domain.setUpdated(LocalDateTime.parse(data.getString("updated"),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			domain.setExpires(LocalDateTime.parse(data.getString("expires"),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		}catch(Exception e) {}
		try {
			domain.setRegistrarName(data.getString("registrar_name"));
			domain.setRegisteredTo(data.getString("registered_to"));
			domain.setDisposable(data.getBoolean("disposable"));
			domain.setFree(data.getBoolean("free"));
			domain.setCustom(data.getBoolean("custom"));
			domain.setDmarcEnforced(data.getBoolean("dmarc_enforced"));
			domain.setSpfStrict(data.getBoolean("spf_strict"));
			domain.setValidMX(data.getBoolean("valid_mx"));
			domain.setAcceptAll(data.getBoolean("accept_all"));
			domain.setSuspiciousTLD(data.getBoolean("suspicious_tld"));
			domain.setWebsiteExists(data.getBoolean("website_exists"));
		}catch(Exception e) {}
		return domain;
	}
	
	public BreachInfoModel convertJSONToBreachInfoModel(JSONObject data) throws JSONException{
		BreachInfoModel breaches = new BreachInfoModel();
		breaches.setBreachUsed(data.getBoolean("haveibeenpwned_listed"));
		breaches.setNumberOfBreaches(data.getInt("number_of_breaches"));
		try {
			breaches.setFirstBreach(LocalDate.parse(data.getString("first_breach"),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		}catch(Exception e) {}
		if(breaches.getNumberOfBreaches() > 0) {
			JSONArray breachesJSON = data.getJSONArray("breaches");
			for(int i=0;i<breaches.getNumberOfBreaches();i++) {
				Map<String, Object> breach = new HashMap<String, Object>();
				JSONObject breachJSON = breachesJSON.optJSONObject(i);
				breach.put("name", breachJSON.getString("name"));
				breach.put("domain", breachJSON.getString("domain"));
				breach.put("date", LocalDate.parse(breachJSON.getString("date"),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
				breaches.addBreach(breach);
			}
		}
		return breaches;
	}
}
