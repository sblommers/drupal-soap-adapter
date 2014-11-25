package com.glynlyon.drupal.rest.model;

import com.glynlyon.drupal.soap.generated.Product;

/**
 * @author Preston Lee
 *
 */
public class DrupalProduct extends Product implements IDrupalModel {

	@Override
	public String getPathId() {
		return "" + this.getProductId();
	}

	@Override
	public void setPathId(final String id) {
		this.setProductId(Integer.parseInt(id));
	}

}
