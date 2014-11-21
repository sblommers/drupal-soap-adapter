package com.glynlyon.drupal.soap.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.glynlyon.drupal.soap.generated.Customer;
import com.glynlyon.drupal.soap.generated.CustomerRetrieve;
import com.glynlyon.drupal.soap.generated.CustomerRetrieveResponse;
import com.glynlyon.drupal.soap.generated.DrupalSOAPAdapter;
import com.glynlyon.drupal.soap.generated.Order;
import com.glynlyon.drupal.soap.generated.Product;
import com.glynlyon.drupal.soap.jmx.IDrupalConfigurationMBean;

/**
 * @author Preston Lee
 *
 */
@WebService
public class DrupalSOAPToRESTService implements DrupalSOAPAdapter {

	@Autowired
	protected IDrupalConfigurationMBean drupalConfiguration;

	public final static String ORDER_PATH = "/order";
	public final static String SUFFIX = ".json";
	public final static String MIME_TYPE = "application/json";

	public URL orderUrlFor(String id) throws MalformedURLException {
		return new URL(drupalConfiguration.getUrl() + ORDER_PATH + "/" + id + SUFFIX);
	}

	@Override
	public Customer customerCreate(Customer customer) {
		// System.err.println(drupalConfiguration.getUrl());
		return customer;
	}

	@Override
	public CustomerRetrieveResponse customerRetrieve(CustomerRetrieve parameters) {
		// TODO Auto-generated method stub
		CustomerRetrieveResponse r = new CustomerRetrieveResponse();
		// r.
		return r;
	}

	@Override
	public Customer customerUpdate(Customer user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> customersUpdatedSince(XMLGregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderCreate(Order order) {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public Order orderRetrieve(String orderId) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.addMixInAnnotations(XMLGregorianCalendar.class, CalendarMixIn.class);
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
		Order o = null;
		try {
			URL url = orderUrlFor(orderId);
			o = mapper.readValue(url, Order.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public Order orderUpdate(Order order) {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public List<Order> ordersUpdatedSince(XMLGregorianCalendar date) {
		// TODO Auto-generated method stub
		ArrayList<Order> results = new ArrayList<Order>();
		results.add(new Order());
		return results;
	}

	@Override
	public Product productCreate(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product productRetrieve(String sku) {
		// TODO Auto-generated method stub
		return new Product();
	}

	@Override
	public Product productUpdate(Product product) {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public List<Product> productsUpdatedSince(XMLGregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}

}
