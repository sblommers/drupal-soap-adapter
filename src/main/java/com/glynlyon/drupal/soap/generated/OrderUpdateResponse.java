
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
 *         &lt;element name="orderUpdateReturn" type="{http://soap.drupal.glynlyon.com}order"/>
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
    "orderUpdateReturn"
})
@XmlRootElement(name = "orderUpdateResponse")
public class OrderUpdateResponse {

    @XmlElement(required = true)
    protected Order orderUpdateReturn;

    /**
     * Gets the value of the orderUpdateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrderUpdateReturn() {
        return orderUpdateReturn;
    }

    /**
     * Sets the value of the orderUpdateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrderUpdateReturn(Order value) {
        this.orderUpdateReturn = value;
    }

}
