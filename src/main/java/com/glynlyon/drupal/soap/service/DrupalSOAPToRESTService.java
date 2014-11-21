package com.glynlyon.drupal.soap.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.xml.datatype.XMLGregorianCalendar;

import com.glynlyon.drupal.soap.generated.Customer;
import com.glynlyon.drupal.soap.generated.CustomerRetrieve;
import com.glynlyon.drupal.soap.generated.CustomerRetrieveResponse;
import com.glynlyon.drupal.soap.generated.DrupalSOAPAdapter;
import com.glynlyon.drupal.soap.generated.Order;
import com.glynlyon.drupal.soap.generated.Product;

/**
 * @author Preston Lee
 *
 */
@WebService
public class DrupalSOAPToRESTService implements DrupalSOAPAdapter {

	// FIXME Hard-coded URL.
	public final String DRUPAL_REST_URL = "http://updates2sub-aophs.gotpantheon.com/rest";
	public final String PRODUCT_PATH = "/product";

	@Override
	public Customer customerCreate(Customer customer) {
		// TODO Auto-generated method stub
		// Client c = ClientBuilder.newClient();
//		Customer c = new Customer();
		return customer;
	}

	@Override
	public Product productUpdate(Product product) {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public Order orderCreate(Order order) {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public Product productCreate(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderUpdate(Order order) {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public Product productRetrieve(String sku) {
		// TODO Auto-generated method stub
		return new Product();
	}

	@Override
	public CustomerRetrieveResponse customerRetrieve(CustomerRetrieve parameters) {
		// TODO Auto-generated method stub
		CustomerRetrieveResponse r = new CustomerRetrieveResponse();
//		r.
		return null;
	}

	@Override
	public Customer customerUpdate(Customer user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> productsUpdatedSince(XMLGregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> customersUpdatedSince(XMLGregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderRetrieve(String drupalId, String gpId, String assistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> ordersUpdatedSince(XMLGregorianCalendar date) {
		// TODO Auto-generated method stub
		ArrayList<Order> results = new ArrayList<Order>();
		results.add(new Order());
		return results;
	}

}
