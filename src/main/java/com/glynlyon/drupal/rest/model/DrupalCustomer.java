package com.glynlyon.drupal.rest.model;

import com.glynlyon.drupal.soap.generated.Customer;

/**
 * @author Preston Lee
 *
 */
public class DrupalCustomer extends Customer implements IDrupalModel {

	@Override
	public String getPathId() {
		return "" + this.getId();
	}

	@Override
	public void setPathId(final String id) {
		this.setId(Integer.parseInt(id));
	}

}
