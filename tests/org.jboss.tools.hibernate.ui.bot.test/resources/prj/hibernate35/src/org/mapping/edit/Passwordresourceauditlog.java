package org.mapping.edit;

// Generated Mar 7, 2012 1:42:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Passwordresourceauditlog generated by hbm2java
 */
public class Passwordresourceauditlog implements java.io.Serializable {

	private String id;
	private Date timestamp;
	private Passwordattributes passwordattributes;
	private String datasourcename;
	private String username;
	private Long version;

	public Passwordresourceauditlog() {
	}

	public Passwordresourceauditlog(String id) {
		this.id = id;
	}

	public Passwordresourceauditlog(String id,
			Passwordattributes passwordattributes, String datasourcename,
			String username, Long version) {
		this.id = id;
		this.passwordattributes = passwordattributes;
		this.datasourcename = datasourcename;
		this.username = username;
		this.version = version;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Passwordattributes getPasswordattributes() {
		return this.passwordattributes;
	}

	public void setPasswordattributes(Passwordattributes passwordattributes) {
		this.passwordattributes = passwordattributes;
	}

	public String getDatasourcename() {
		return this.datasourcename;
	}

	public void setDatasourcename(String datasourcename) {
		this.datasourcename = datasourcename;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
