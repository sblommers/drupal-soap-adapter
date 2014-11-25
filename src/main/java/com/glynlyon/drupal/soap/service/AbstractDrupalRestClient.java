package com.glynlyon.drupal.soap.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glynlyon.drupal.jmx.IDrupalConfigurationMBean;
import com.glynlyon.drupal.rest.model.DrupalCustomer;
import com.glynlyon.drupal.rest.model.DrupalOrder;
import com.glynlyon.drupal.rest.model.DrupalProduct;
import com.glynlyon.drupal.rest.model.IDrupalModel;
import com.glynlyon.drupal.soap.generated.Customer;
import com.glynlyon.drupal.soap.generated.Order;
import com.glynlyon.drupal.soap.generated.Product;

/**
 * A base Drupal REST client, providing constants and methods to handle common
 * operations via Drupal's REST Server API endpoints.
 * 
 * Note that while the {@link #drupalConfiguration} is injected via Spring
 * during boot, the internal configuration parameters must be set for this class
 * to function properly!
 * 
 * @see IDrupalConfigurationMBean
 * 
 * @author Preston Lee
 *
 */
public abstract class AbstractDrupalRestClient {

	@Autowired
	protected IDrupalConfigurationMBean drupalConfiguration;

	/**
	 * The Jackson data binder wizardry that allows us to trivially bind JSON
	 * data from Drupal into the Java POJOs needed by Apache CXF's SOAP
	 * implementation.
	 */
	protected ObjectMapper mapper = new ObjectMapper();

	protected Logger log = Logger.getGlobal();

	public final static String SUFFIX = ".json";
	public final static String MIME_TYPE = "application/json";
	public final static String SINCE_KEY = "since";

	public final static String DRUPAL_PATH_CUSTOMER = "/user";
	public final static String DRUPAL_PATH_ORDER = "/order";
	public final static String DRUPAL_PATH_PRODUCT = "/product";

	/**
	 * Relative paths to Drupal endpoints are found here, keyed by both REST and
	 * SOAP class types. These are established at boot time, and the resultant
	 * {@link Map} will be _immutable_.
	 */
	public final static Map<Class<?>, String> TYPE_PATHS;

	static {
		HashMap<Class<? extends Object>, String> m = new HashMap<Class<? extends Object>, String>();

		// Register client object types.
		m.put(Customer.class, DRUPAL_PATH_CUSTOMER);
		m.put(Order.class, DRUPAL_PATH_ORDER);
		m.put(Product.class, DRUPAL_PATH_PRODUCT);

		// Also register the equivalent Drupal object types.
		m.put(DrupalCustomer.class, DRUPAL_PATH_CUSTOMER);
		m.put(DrupalOrder.class, DRUPAL_PATH_ORDER);
		m.put(DrupalProduct.class, DRUPAL_PATH_PRODUCT);
		TYPE_PATHS = Collections.unmodifiableMap(m);
	}

	/**
	 * Default constructor that initializes internal structures. Sub-types
	 * should call super() when subclassing.
	 */
	public AbstractDrupalRestClient() {
		mapper.addMixInAnnotations(XMLGregorianCalendar.class, CalendarMixIn.class);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
	}

	/**
	 * Rebuilds Drupal's response JSON in a way that works better with Apache
	 * CXF. For some reason, Drupal likes to use IDs as map keys, which is
	 * changed by this method to an "id" pair in the value data structure.
	 */
	public JsonNode restructureDrupalJsonForJackson(final String json) {
		JsonNode tree = null;
		try {
			tree = restructureDrupalJsonForJackson(mapper.readTree(json));
		} catch (final JsonProcessingException e) {
			log.severe("Failed to parse JSON string. Something is probably broken." + e);
		} catch (final IOException e) {
			log.severe("Failed to parse JSON string. Something is probably broken." + e);
		}
		return tree;
	}

	public JsonNode restructureDrupalJsonForJackson(final JsonNode tree) {
		for (JsonNode n : tree) {
			// if(n.isContainerNode()) {
			// @SuppressWarnings("rawtypes")
			// ContainerNode cn = (ContainerNode) n;
			// }
			// switch (n.getNodeType()) {
			// case OBJECT:
			// ObjectNode on = (ObjectNode)n;
			// Iterator<Entry<String, JsonNode>> fields = on.fields();
			// while(fields.hasNext()) {
			// Entry<String, JsonNode> next = fields.next();
			// // If the key name is "und" or an integer, we'll restructure.
			//
			// }
			// for (Map.Entry<String, JsonNode> e : on.fields()) {
			//
			// }
			// break;
			// case ARRAY:
			// // Remove empty arrays
			// ArrayNode an = (ArrayNode)n;
			// if(an.size() == 0) {
			// tree.
			// }
			// break;
			// default:
			// break;
			// }
			// System.out.println(n);
		}
		return tree;
	}

	public URI uriFor(final Class<? extends IDrupalModel> clazz, final String id) {
		URI uri = null;
		try {
			uri = new URL(drupalConfiguration.getUrl() + TYPE_PATHS.get(clazz) + "/" + id + SUFFIX).toURI();
		} catch (MalformedURLException e) {
			log.severe("Failed to create URL for " + clazz.getName() + " object. ID: " + id);
		} catch (URISyntaxException e) {
			log.severe("Failed to create URL for " + clazz.getName() + " object. ID: " + id);
		}
		return uri;
	}

	public URI uriForUpdatedSince(final Class<?> clazz) {
		URI uri = null;
		try {
			uri = new URL(drupalConfiguration.getUrl() + TYPE_PATHS.get(clazz) + SUFFIX).toURI();
		} catch (MalformedURLException e) {
			log.severe("Failed to create updated since URL for class type: " + clazz.toString());
		} catch (URISyntaxException e) {
			log.severe("Failed to create updated since URL for class type: " + clazz.toString());
		}
		return uri;
	}

	public <T extends IDrupalModel> T executeRequest(final Request request, final Class<T> clazz) {
		T model = null;
		try {
			String s = request.execute().returnContent().asString();
			JsonNode tree = restructureDrupalJsonForJackson(s);
			model = mapper.treeToValue(tree, clazz);
		} catch (final ClientProtocolException e) {
			log.severe("Unexpected problem talking to Drupal. " + e);
		} catch (final IOException e) {
			log.severe("Unexpected problem talking to Drupal. " + e);
		}
		return model;
	}

	/**
	 * Deep clones the provided object to the provided sub-types. The original
	 * object is not modified.
	 */
	public <T extends IDrupalModel> T toSubType(final Object o, final Class<T> clazz) {
		JsonNode tree = mapper.valueToTree(o);
		T t = null;
		try {
			t = mapper.treeToValue(tree, clazz);
		} catch (final JsonProcessingException e) {
			log.severe("Fatal error creating Drupal model object instance. " + o);
		}
		return t;
	}

	/**
	 * Generic "create" method for Drupal's RESTful services. The endpoint URL
	 * is automatically determined from the provided object. At HTTP "POST" is
	 * always used for the call to Drupal.
	 */
	public <T extends IDrupalModel> T drupalCreate(final T record) {
		log.fine("Attempting to create Drupal " + record.getClass().getName() + " record: " + record.getPathId());
		String s = mapper.valueToTree(record).toString();
		Request request = Request.Post(uriFor(record.getClass(), record.getPathId())).bodyString(s, ContentType.APPLICATION_JSON);
		T t = (T) executeRequest(request, record.getClass());
		return t;
	}

	/**
	 * Generic "get" method for Drupal's RESTful services. The endpoint URL is
	 * automatically determined from the provided object. At HTTP "GET" is
	 * always used for the call to Drupal.
	 */
	public <T extends IDrupalModel> T drupalRetrieve(final Class<T> clazz, final String id) {
		log.fine("Attempting to retrieve Drupal " + clazz.getName() + " record: " + id);
		return executeRequest(Request.Get(uriFor(clazz, id)), clazz);
	}

	/**
	 * Generic "update" method for Drupal's RESTful services. The endpoint URL
	 * is automatically determined from the provided object. At HTTP "PUT" is
	 * always used for the call to Drupal.
	 */
	public <T extends IDrupalModel> T drupalUpdate(final T record) {
		log.fine("Attempting to update Drupal " + record.getClass().getName() + " record: " + record.getPathId());
		String s = mapper.valueToTree(record).toString();
		Request request = Request.Put(uriFor(record.getClass(), record.getPathId())).bodyString(s, ContentType.APPLICATION_JSON);
		T t = (T) executeRequest(request, record.getClass());
		return t;
	}

	/**
	 * Generic "delete" method for Drupal's RESTful services. The endpoint URL
	 * is automatically determined from the provided object. At HTTP "DELETE" is
	 * always used for the call to Drupal.
	 */
	public <T extends IDrupalModel> T drupalDelete(final T record) {
		log.fine("Attempting to delete Drupal " + record.getClass().getName() + " record: " + record.getPathId());
		Request request = Request.Delete(uriFor(record.getClass(), record.getPathId()));
		T t = (T) executeRequest(request, record.getClass());
		return t;
	}

	/**
	 * Generic method to retrieve records updated since some provided date. At
	 * HTTP "GET" is always used for the call to Drupal with a query parameter
	 * key of {@link AbstractDrupalRestClient#SINCE_KEY}.
	 * 
	 */
	public <T> List<T> drupalUpdatedSince(final Class<T> clazz, final XMLGregorianCalendar date) {
		List<T> results = null;
		URI uri = uriForUpdatedSince(clazz);
		try {
			URIBuilder uriBuilder = new URIBuilder(uri);
			uriBuilder.setParameter(SINCE_KEY, date.toString());
			uri = uriBuilder.build();
			String json = Request.Get(uri).execute().returnContent().toString();
			JsonNode tree = restructureDrupalJsonForJackson(json);
			results = new ArrayList<T>();
			for (JsonNode jsonNode : tree) {
				JsonNodeType nodeType = tree.getNodeType();
				switch (nodeType) {
				case OBJECT:
				case ARRAY:
					T model = mapper.treeToValue(jsonNode, clazz);
					results.add(model);
					break;
				default:
					log.warning("Hmm.. Drupal returned a non-object where one was expected. It will be ignored. Returned JSON type: " + nodeType);
					break;
				}
//				System.out.println(nodeType);
			}
		} catch (final Exception e) {
			log.severe("Fatal error attempting to fetch updated " + clazz.getName() + " records. Provided 'since' date: " + date.toString());
			log.severe(e.getMessage());
		}
		return results;
	}
}
