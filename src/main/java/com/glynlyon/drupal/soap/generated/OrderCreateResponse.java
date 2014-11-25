
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
 *         &lt;element name="orderCreateReturn" type="{http://soap.drupal.glynlyon.com}order"/>
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
    "orderCreateReturn"
})
@XmlRootElement(name = "orderCreateResponse")
public class OrderCreateResponse {

    @XmlElement(required = true)
    protected Order orderCreateReturn;

    /**
     * Gets the value of the orderCreateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrderCreateReturn() {
        return orderCreateReturn;
    }

    /**
     * Sets the value of the orderCreateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrderCreateReturn(Order value) {
        this.orderCreateReturn = value;
    }

}
