
package com.glynlyon.drupal.soap.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revisionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revisionUid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="log" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="revisionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="revisionHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldSalesRepId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldAopOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldActivationCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commerceOrderTotalFormatted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commerceDiscounts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "orderNumber",
    "revisionId",
    "revisionUid",
    "mail",
    "status",
    "log",
    "revisionTimestamp",
    "revisionHostname",
    "orderId",
    "type",
    "uid",
    "created",
    "changed",
    "hostname",
    "fieldSalesRepId",
    "fieldAopOrderNumber",
    "fieldActivationCodes",
    "commerceOrderTotalFormatted",
    "commerceDiscounts"
})
public class Order {

    protected int orderNumber;
    protected int revisionId;
    protected int revisionUid;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String log;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revisionTimestamp;
    @XmlElement(required = true)
    protected String revisionHostname;
    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected String type;
    protected int uid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlElement(required = true)
    protected String hostname;
    @XmlElement(nillable = true)
    protected List<String> fieldSalesRepId;
    @XmlElement(nillable = true)
    protected List<String> fieldAopOrderNumber;
    protected List<String> fieldActivationCodes;
    @XmlElement(required = true)
    protected String commerceOrderTotalFormatted;
    @XmlElement(nillable = true)
    protected List<String> commerceDiscounts;

    /**
     * Gets the value of the orderNumber property.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the revisionId property.
     * 
     */
    public int getRevisionId() {
        return revisionId;
    }

    /**
     * Sets the value of the revisionId property.
     * 
     */
    public void setRevisionId(int value) {
        this.revisionId = value;
    }

    /**
     * Gets the value of the revisionUid property.
     * 
     */
    public int getRevisionUid() {
        return revisionUid;
    }

    /**
     * Sets the value of the revisionUid property.
     * 
     */
    public void setRevisionUid(int value) {
        this.revisionUid = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Gets the value of the revisionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevisionTimestamp() {
        return revisionTimestamp;
    }

    /**
     * Sets the value of the revisionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevisionTimestamp(XMLGregorianCalendar value) {
        this.revisionTimestamp = value;
    }

    /**
     * Gets the value of the revisionHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionHostname() {
        return revisionHostname;
    }

    /**
     * Sets the value of the revisionHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionHostname(String value) {
        this.revisionHostname = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     */
    public int getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     */
    public void setUid(int value) {
        this.uid = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the fieldSalesRepId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldSalesRepId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldSalesRepId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldSalesRepId() {
        if (fieldSalesRepId == null) {
            fieldSalesRepId = new ArrayList<String>();
        }
        return this.fieldSalesRepId;
    }

    /**
     * Gets the value of the fieldAopOrderNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldAopOrderNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldAopOrderNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldAopOrderNumber() {
        if (fieldAopOrderNumber == null) {
            fieldAopOrderNumber = new ArrayList<String>();
        }
        return this.fieldAopOrderNumber;
    }

    /**
     * Gets the value of the fieldActivationCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldActivationCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldActivationCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldActivationCodes() {
        if (fieldActivationCodes == null) {
            fieldActivationCodes = new ArrayList<String>();
        }
        return this.fieldActivationCodes;
    }

    /**
     * Gets the value of the commerceOrderTotalFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceOrderTotalFormatted() {
        return commerceOrderTotalFormatted;
    }

    /**
     * Sets the value of the commerceOrderTotalFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceOrderTotalFormatted(String value) {
        this.commerceOrderTotalFormatted = value;
    }

    /**
     * Gets the value of the commerceDiscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commerceDiscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommerceDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommerceDiscounts() {
        if (commerceDiscounts == null) {
            commerceDiscounts = new ArrayList<String>();
        }
        return this.commerceDiscounts;
    }

}
