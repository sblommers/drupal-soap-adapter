package com.glynlyon.drupal.rest.model;

import com.glynlyon.drupal.soap.generated.LineItem;

/**
 * @author Preston Lee
 *
 */
public class DrupalLineItem extends LineItem implements IDrupalModel {

	@Override
	public String getPathId() {
		return "" + this.getLineItemId();
	}

	@Override
	public void setPathId(String id) {
		this.setLineItemId(Integer.parseInt(id));
	}

}
