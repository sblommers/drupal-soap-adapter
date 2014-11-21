package com.glynlyon.drupal.soap.jmx;

/**
 * @author Preston Lee
 *
 */
public interface IDrupalConfigurationMBean {

	public String getUrl();

	/**
	 * Full URL including any base path, if needed. For example:
	 * @param url "http://drupal.example.com/rest"
	 */
	public void setUrl(final String url);

	public String getUsername();

	public void setUsername(final String username);

	public String getPassword();

	public void setPassword(final String password);

}
