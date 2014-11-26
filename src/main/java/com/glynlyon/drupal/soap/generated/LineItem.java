
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for lineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line_item_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="line_item_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="line_item_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commerce_unit_price_formatted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commerce_total_formatted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineItem", propOrder = {
    "lineItemId",
    "orderId",
    "type",
    "lineItemLabel",
    "quantity",
    "created",
    "changed",
    "lineItemTitle",
    "commerceUnitPriceFormatted",
    "commerceTotalFormatted"
})
public class LineItem {

    @XmlElement(name = "line_item_id")
    protected int lineItemId;
    @XmlElement(name = "order_id")
    protected int orderId;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "line_item_label", required = true)
    protected String lineItemLabel;
    @XmlElement(required = true)
    protected String quantity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlElement(name = "line_item_title", required = true)
    protected String lineItemTitle;
    @XmlElement(name = "commerce_unit_price_formatted", required = true)
    protected String commerceUnitPriceFormatted;
    @XmlElement(name = "commerce_total_formatted", required = true)
    protected String commerceTotalFormatted;

    /**
     * Gets the value of the lineItemId property.
     * 
     */
    public int getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     */
    public void setLineItemId(int value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
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
     * Gets the value of the lineItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemLabel() {
        return lineItemLabel;
    }

    /**
     * Sets the value of the lineItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemLabel(String value) {
        this.lineItemLabel = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
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
     * Gets the value of the lineItemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemTitle() {
        return lineItemTitle;
    }

    /**
     * Sets the value of the lineItemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemTitle(String value) {
        this.lineItemTitle = value;
    }

    /**
     * Gets the value of the commerceUnitPriceFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceUnitPriceFormatted() {
        return commerceUnitPriceFormatted;
    }

    /**
     * Sets the value of the commerceUnitPriceFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceUnitPriceFormatted(String value) {
        this.commerceUnitPriceFormatted = value;
    }

    /**
     * Gets the value of the commerceTotalFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceTotalFormatted() {
        return commerceTotalFormatted;
    }

    /**
     * Sets the value of the commerceTotalFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceTotalFormatted(String value) {
        this.commerceTotalFormatted = value;
    }

}
