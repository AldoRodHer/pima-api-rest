package com.pima.core.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Table(name="INFOEMAIL")
@Entity
public class InfoEmail {
	public InfoEmail() {}
	public InfoEmail(long id, String email, int score, boolean exist, String accounts) {
		super();
		this.id = id;
		this.email = email;
		this.score = score;
		this.exist = exist;
		this.accounts = accounts;
	}
	@GeneratedValue
	@Id
	@Column(name="ID_EMAIL")
	private long id;
	@Column(name="EMAIL")
	private String email;
	@Column(name="SCORE")
	private int score;
	@Column(name="EXIST")
	private boolean exist;
	@Column(name="ACCOUNTS")
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
