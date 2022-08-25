package com.pima.core.model;
import java.time.LocalDateTime;
import com.pima.core.entity.DomainEmail;

public class DomainEmailModel {
	public DomainEmailModel() {}
	public DomainEmailModel(DomainEmail domain) {
		this.id = domain.getId();
		this.domain = domain.getDomain();
		this.tld = domain.getTld();
		this.registered = domain.isRegistered();
		this.created = domain.getCreated();
		this.updated = domain.getUpdated();
		this.expires = domain.getExpires();
		this.registrarName = domain.getRegistrarName();
		this.registeredTo = domain.getRegisteredTo();
		this.disposable = domain.isDisposable();
		this.free = domain.isFree();
		this.custom = domain.isCustom();
		this.dmarcEnforced = domain.isDmarcEnforced();
		this.spfStrict = domain.isSpfStrict();
		this.validMX = domain.isValidMX();
		this.acceptAll = domain.isAcceptAll();
		this.suspiciousTLD = domain.isSuspiciousTLD();
		this.websiteExists = domain.isWebsiteExists();
	}
	public DomainEmailModel(long id, String domain, String tld, boolean registered, LocalDateTime created,
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
	private long id;
	private String domain;
	private String tld;
	private boolean registered;
	private LocalDateTime created;
	private LocalDateTime updated;
	private LocalDateTime expires;
	private String registrarName;
	private String registeredTo;
	private boolean disposable;
	private boolean free;
	private boolean custom;
	private boolean dmarcEnforced;
	private boolean spfStrict;
	private boolean validMX;
	private boolean acceptAll;
	private boolean suspiciousTLD;
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
