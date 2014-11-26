package com.glynlyon.drupal.soap.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import com.glynlyon.drupal.rest.model.DrupalCustomer;
import com.glynlyon.drupal.rest.model.DrupalLineItem;
import com.glynlyon.drupal.rest.model.DrupalOrder;
import com.glynlyon.drupal.rest.model.DrupalProduct;
import com.glynlyon.drupal.soap.generated.Customer;
import com.glynlyon.drupal.soap.generated.CustomerRetrieve;
import com.glynlyon.drupal.soap.generated.CustomerRetrieveResponse;
import com.glynlyon.drupal.soap.generated.DrupalSOAPAdapter;
import com.glynlyon.drupal.soap.generated.LineItem;
import com.glynlyon.drupal.soap.generated.LineItemRetrieve;
import com.glynlyon.drupal.soap.generated.LineItemRetrieveResponse;
import com.glynlyon.drupal.soap.generated.Order;
import com.glynlyon.drupal.soap.generated.Product;

/**
 * 
 * Concrete implementation class of the SOAP-to-REST Drupal web services
 * adapter, which mainly just delegates to generic REST client methods in #
 * {@link AbstractDrupalRestClient}. This is the actual application-level entry
 * point for individual SOAP operations, however, so if you need to debug this
 * application, start here!
 * 
 * @author Preston Lee
 *
 */
@WebService
public class DrupalSOAPToRESTService extends AbstractDrupalRestClient implements DrupalSOAPAdapter {

	@Override
	public Customer customerCreate(final Customer customer) {
		DrupalCustomer c = drupalCreate(toSubType(customer, DrupalCustomer.class));
		return c;
	}

	@Override
	public CustomerRetrieveResponse customerRetrieve(final CustomerRetrieve parameters) {
		String id = parameters.getUserId();
		DrupalCustomer o = drupalRetrieve(DrupalCustomer.class, id);
		CustomerRetrieveResponse r = new CustomerRetrieveResponse();
		r.setCustomerRetrieveReturn(o);
		return r;
	}

	@Override
	public Customer customerUpdate(final Customer customer) {
		DrupalCustomer c = drupalUpdate(toSubType(customer, DrupalCustomer.class));
		return c;
	}

	@Override
	public List<Customer> customersUpdatedSince(final XMLGregorianCalendar date) {
		List<Customer> updated = drupalUpdatedSince(Customer.class, date);
		return updated;
	}

	@Override
	public LineItem lineItemCreate(final LineItem lineItem) {
		DrupalLineItem c = drupalCreate(toSubType(lineItem, DrupalLineItem.class));
		return c;
	}

	@Override
	public LineItemRetrieveResponse lineItemRetrieve(final LineItemRetrieve parameters) {
		String id = parameters.getUserId();
		DrupalLineItem o = drupalRetrieve(DrupalLineItem.class, id);
		LineItemRetrieveResponse r = new LineItemRetrieveResponse();
		r.setLineItemRetrieveReturn(o);
		return r;
	}

	@Override
	public LineItem lineItemUpdate(final LineItem lineItem) {
		DrupalLineItem c = drupalUpdate(toSubType(lineItem, DrupalLineItem.class));
		return c;
	}

	@Override
	public List<LineItem> lineItemsUpdatedSince(final XMLGregorianCalendar date) {
		List<LineItem> updated = drupalUpdatedSince(LineItem.class, date);
		return updated;
	}

	@Override
	public Order orderCreate(final Order order) {
		DrupalOrder o = drupalCreate(toSubType(order, DrupalOrder.class));
		return o;
	}

	@Override
	public Order orderRetrieve(final String orderId) {
		DrupalOrder o = drupalRetrieve(DrupalOrder.class, orderId);
		return o;
	}

	@Override
	public Order orderUpdate(final Order order) {
		DrupalOrder o = drupalUpdate(toSubType(order, DrupalOrder.class));
		return o;
	}

	@Override
	public List<Order> ordersUpdatedSince(final XMLGregorianCalendar date) {
		List<Order> list = drupalUpdatedSince(Order.class, date);
		return list;
	}

	@Override
	public Product productCreate(final Product product) {
		DrupalProduct p = drupalCreate(toSubType(product, DrupalProduct.class));
		return p;
	}

	@Override
	public Product productRetrieve(final String sku) {
		DrupalProduct p = drupalRetrieve(DrupalProduct.class, sku);
		return p;
	}

	@Override
	public Product productUpdate(final Product product) {
		DrupalProduct p = drupalUpdate(toSubType(product, DrupalProduct.class));
		return p;
	}

	@Override
	public List<Product> productsUpdatedSince(final XMLGregorianCalendar date) {
		List<Product> list = drupalUpdatedSince(Product.class, date);
		return list;
	}

}
