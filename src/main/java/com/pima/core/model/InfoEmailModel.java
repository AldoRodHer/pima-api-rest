package com.pima.core.model;
import com.pima.core.entity.InfoEmail;

public class InfoEmailModel {
	public InfoEmailModel() {}
	public InfoEmailModel(InfoEmail email) {
		this.id = email.getId();
		this.email = email.getEmail();
		this.score = email.getScore();
		this.exist = email.isExist();
		this.accounts = email.getAccounts();
	}
	public InfoEmailModel(long id, String email, int score, boolean exist, String accounts) {
		this.id = id;
		this.email = email;
		this.score = score;
		this.exist = exist;
		this.accounts = accounts;
	}
	private long id;
	private String email;
	private int score;
	private boolean exist;
	private String accounts;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isExist() {
		return exist;
	}
	public void setExist(boolean exist) {
		this.exist = exist;
	}
	public String getAccounts() {
		return accounts;
	}
	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
}
