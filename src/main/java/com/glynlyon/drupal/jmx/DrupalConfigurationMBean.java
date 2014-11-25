package com.glynlyon.drupal.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * 
 *
 * @author Preston Lee
 *
 */
@Component
@ManagedResource(objectName = "Drupal:name=Drupal REST Services", log = true)
public class DrupalConfigurationMBean implements IDrupalConfigurationMBean {

	/** Intended to be set an run-time via JMX. */
//	protected String url = "http://localhost/rest";
	protected String url = "http://dynamics-aophs.gotpantheon.com/gp";


	/** Intended to be set an run-time via JMX. */
	protected String username = "admin";

	/** Intended to be set an run-time via JMX. */
	protected String password = "password";

	@ManagedAttribute(description = "The Drupal REST endpoint URL.")
	public String getUrl() {
		return url;
	}

	@ManagedAttribute
	public void setUrl(final String url) {
		this.url = url;
	}

	@ManagedAttribute(description = "Username used to authenticate with Drupal.")
	public String getUsername() {
		return username;
	}

	@ManagedAttribute
	public void setUsername(final String username) {
		this.username = username;
	}

	@ManagedAttribute(description = "Password used to authenticate with Drupal.")
	public String getPassword() {
		return password;
	}

	@ManagedAttribute
	public void setPassword(final String password) {
		this.password = password;
	}

}
