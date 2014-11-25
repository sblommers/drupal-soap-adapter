
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="card">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payment_method" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instance_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remote_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="card_type" type="{http://soap.drupal.glynlyon.com}cardType"/>
 *         &lt;element name="card_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="card_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="card_exp_month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="card_exp_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="profile_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "card", propOrder = {

})
public class Card {

    protected int id;
    @XmlElement(name = "payment_method", required = true)
    protected String paymentMethod;
    @XmlElement(name = "instance_id", required = true)
    protected String instanceId;
    @XmlElement(name = "remote_id", required = true)
    protected String remoteId;
    @XmlElement(name = "card_type", required = true)
    @XmlSchemaType(name = "string")
    protected CardType cardType;
    @XmlElement(name = "card_name", required = true)
    protected String cardName;
    @XmlElement(name = "card_number")
    protected int cardNumber;
    @XmlElement(name = "card_exp_month")
    protected int cardExpMonth;
    @XmlElement(name = "card_exp_year")
    protected int cardExpYear;
    protected int status;
    @XmlElement(name = "profile_id")
    protected int profileId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the remoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteId() {
        return remoteId;
    }

    /**
     * Sets the value of the remoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteId(String value) {
        this.remoteId = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setCardType(CardType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     */
    public void setCardNumber(int value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardExpMonth property.
     * 
     */
    public int getCardExpMonth() {
        return cardExpMonth;
    }

    /**
     * Sets the value of the cardExpMonth property.
     * 
     */
    public void setCardExpMonth(int value) {
        this.cardExpMonth = value;
    }

    /**
     * Gets the value of the cardExpYear property.
     * 
     */
    public int getCardExpYear() {
        return cardExpYear;
    }

    /**
     * Sets the value of the cardExpYear property.
     * 
     */
    public void setCardExpYear(int value) {
        this.cardExpYear = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     */
    public int getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     */
    public void setProfileId(int value) {
        this.profileId = value;
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
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

}
