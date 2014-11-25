package com.glynlyon.drupal.soap.service;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * A configuration object that allows the Jackson {@link ObjectMapper} to not
 * choke on "year" fields during data binding operations.
 * 
 * @author Preston Lee
 *
 */
public interface CalendarMixIn {

	@JsonIgnore
	public void setYear(BigInteger year);

}
