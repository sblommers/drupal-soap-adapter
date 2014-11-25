package com.glynlyon.drupal.rest.model;

import com.glynlyon.drupal.soap.generated.Customer;

/**
 * @author Preston Lee
 *
 */
public class DrupalCustomer extends Customer implements IDrupalModel {

	@Override
	public String getPathId() {
		return "" + this.getUid();
	}

	@Override
	public void setPathId(final String id) {
		this.setUid(Integer.parseInt(id));
	}

}
