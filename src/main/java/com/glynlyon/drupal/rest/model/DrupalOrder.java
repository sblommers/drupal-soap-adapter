package com.glynlyon.drupal.rest.model;

import com.glynlyon.drupal.soap.generated.Order;

/**
 * @author Preston Lee
 */
public class DrupalOrder extends Order implements IDrupalModel {

	@Override
	public String getPathId() {
		return this.getOrderId();
	}

	@Override
	public void setPathId(String id) {
		this.setOrderId(id);
	}

}
