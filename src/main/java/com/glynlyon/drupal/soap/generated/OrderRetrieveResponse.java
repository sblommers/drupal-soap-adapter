
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderRetrieveReturn" type="{http://soap.drupal.glynlyon.com}order"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderRetrieveReturn"
})
@XmlRootElement(name = "orderRetrieveResponse")
public class OrderRetrieveResponse {

    @XmlElement(required = true)
    protected Order orderRetrieveReturn;

    /**
     * Gets the value of the orderRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrderRetrieveReturn() {
        return orderRetrieveReturn;
    }

    /**
     * Sets the value of the orderRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrderRetrieveReturn(Order value) {
        this.orderRetrieveReturn = value;
    }

}
