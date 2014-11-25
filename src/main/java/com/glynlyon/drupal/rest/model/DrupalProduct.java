package com.glynlyon.drupal.rest.model;

import com.glynlyon.drupal.soap.generated.Product;

/**
 * @author Preston Lee
 *
 */
public class DrupalProduct extends Product implements IDrupalModel {

	@Override
	public String getPathId() {
		return getSku();
	}

	@Override
	public void setPathId(String id) {
		this.setSku(id);
	}

}
