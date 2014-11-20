package com.glynlyon.drupal.soap.service;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.glynlyon.drupal.soap.generated.Customer;
import com.glynlyon.drupal.soap.generated.CustomerRetrieve;
import com.glynlyon.drupal.soap.generated.CustomerRetrieveResponse;
import com.glynlyon.drupal.soap.generated.DrupalSOAPAdapter;
import com.glynlyon.drupal.soap.generated.Order;
import com.glynlyon.drupal.soap.generated.Product;

public class DrupalSOAPToRESTService implements DrupalSOAPAdapter {

	@Override
	public Customer customerCreate(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product productUpdate(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderCreate(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product productCreate(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderUpdate(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product productRetrieve(String sku) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerRetrieveResponse customerRetrieve(CustomerRetrieve parameters) {
		// TODO Auto-generated method stub
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
		return null;
	}

}
