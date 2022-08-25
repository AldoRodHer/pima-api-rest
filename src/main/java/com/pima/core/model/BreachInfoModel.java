package com.pima.core.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BreachInfoModel {
	public BreachInfoModel() {}
	public BreachInfoModel(boolean breachUsed, int numberOfBreaches, LocalDate firstBreach,
			List<Map<String, Object>> breaches) {
		this.breachUsed = breachUsed;
		this.numberOfBreaches = numberOfBreaches;
		this.firstBreach = firstBreach;
		this.breaches = breaches;
	}
	private boolean breachUsed;
	private int numberOfBreaches;
	private LocalDate firstBreach;
	private List<Map<String, Object>> breaches = new ArrayList<Map<String, Object>>();
	public boolean isBreachUsed() {
		return breachUsed;
	}
	public void setBreachUsed(boolean breachUsed) {
		this.breachUsed = breachUsed;
	}
	public int getNumberOfBreaches() {
		return numberOfBreaches;
	}
	public void setNumberOfBreaches(int numberOfBreaches) {
		this.numberOfBreaches = numberOfBreaches;
	}
	public LocalDate getFirstBreach() {
		return firstBreach;
	}
	public void setFirstBreach(LocalDate firstBreach) {
		this.firstBreach = firstBreach;
	}
	public List<Map<String, Object>> getBreaches() {
		return breaches;
	}
	public void setBreaches(List<Map<String, Object>> breaches) {
		this.breaches = breaches;
	}
	public void addBreach(Map<String, Object> breach) {
		this.breaches.add(breach);
	}
}
