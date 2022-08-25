package com.pima.core.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Table(name="DOMAINEMAIL")
@Entity
public class DomainEmail {
	public DomainEmail() {}
	public DomainEmail(long id, String domain, String tld, boolean registered, LocalDateTime created,
			LocalDateTime updated, LocalDateTime expires, String registrarName, String registeredTo, boolean disposable,
			boolean free, boolean custom, boolean dmarcEnforced, boolean spfStrict, boolean validMX, boolean acceptAll,
			boolean suspiciousTLD, boolean websiteExists) {
		super();
		this.id = id;
		this.domain = domain;
		this.tld = tld;
		this.registered = registered;
		this.created = created;
		this.updated = updated;
		this.expires = expires;
		this.registrarName = registrarName;
		this.registeredTo = registeredTo;
		this.disposable = disposable;
		this.free = free;
		this.custom = custom;
		this.dmarcEnforced = dmarcEnforced;
		this.spfStrict = spfStrict;
		this.validMX = validMX;
		this.acceptAll = acceptAll;
		this.suspiciousTLD = suspiciousTLD;
		this.websiteExists = websiteExists;
	}
	@GeneratedValue
	@Id
	@Column(name="ID_DOMAIN")
	private long id;
	@Column(name="DOMAIN")
	private String domain;
	@Column(name="TLD")
	private String tld;
	@Column(name="REGISTERED")
	private boolean registered;
	@Column(name="CREATED")
	private LocalDateTime created;
	@Column(name="UPDATED")
	private LocalDateTime updated;
	@Column(name="EXPIRES")
	private LocalDateTime expires;
	@Column(name="REGISTRAR_NAME")
	private String registrarName;
	@Column(name="REGISTERED_TO")
	private String registeredTo;
	@Column(name="DISPOSABLE")
	private boolean disposable;
	@Column(name="FREE")
	private boolean free;
	@Column(name="CUSTOM")
	private boolean custom;
	@Column(name="DMARC_ENFORCED")
	private boolean dmarcEnforced;
	@Column(name="SPF_STRICT")
	private boolean spfStrict;
	@Column(name="VALID_MX")
	private boolean validMX;
	@Column(name="ACCEPT_ALL")
	private boolean acceptAll;
	@Column(name="SUSPICIOUS_TLD")
	private boolean suspiciousTLD;
	@Column(name="WEBSITE_EXISTS")
	private boolean websiteExists;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getTld() {
		return tld;
	}
	public void setTld(String tld) {
		this.tld = tld;
	}
	public boolean isRegistered() {
		return registered;
	}
	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getUpdated() {
		return updated;
	}
	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}
	public LocalDateTime getExpires() {
		return expires;
	}
	public void setExpires(LocalDateTime expires) {
		this.expires = expires;
	}
	public String getRegistrarName() {
		return registrarName;
	}
	public void setRegistrarName(String registrarName) {
		this.registrarName = registrarName;
	}
	public String getRegisteredTo() {
		return registeredTo;
	}
	public void setRegisteredTo(String registeredTo) {
		this.registeredTo = registeredTo;
	}
	public boolean isDisposable() {
		return disposable;
	}
	public void setDisposable(boolean disposable) {
		this.disposable = disposable;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public boolean isCustom() {
		return custom;
	}
	public void setCustom(boolean custom) {
		this.custom = custom;
	}
	public boolean isDmarcEnforced() {
		return dmarcEnforced;
	}
	public void setDmarcEnforced(boolean dmarcEnforced) {
		this.dmarcEnforced = dmarcEnforced;
	}
	public boolean isSpfStrict() {
		return spfStrict;
	}
	public void setSpfStrict(boolean spfStrict) {
		this.spfStrict = spfStrict;
	}
	public boolean isValidMX() {
		return validMX;
	}
	public void setValidMX(boolean validMX) {
		this.validMX = validMX;
	}
	public boolean isAcceptAll() {
		return acceptAll;
	}
	public void setAcceptAll(boolean acceptAll) {
		this.acceptAll = acceptAll;
	}
	public boolean isSuspiciousTLD() {
		return suspiciousTLD;
	}
	public void setSuspiciousTLD(boolean suspiciousTLD) {
		this.suspiciousTLD = suspiciousTLD;
	}
	public boolean isWebsiteExists() {
		return websiteExists;
	}
	public void setWebsiteExists(boolean websiteExists) {
		this.websiteExists = websiteExists;
	}
}
