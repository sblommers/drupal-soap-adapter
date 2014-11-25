
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
 *         &lt;element name="customerUpdateReturn" type="{http://soap.drupal.glynlyon.com}customer"/>
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
    "customerUpdateReturn"
})
@XmlRootElement(name = "customerUpdateResponse")
public class CustomerUpdateResponse {

    @XmlElement(required = true)
    protected Customer customerUpdateReturn;

    /**
     * Gets the value of the customerUpdateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomerUpdateReturn() {
        return customerUpdateReturn;
    }

    /**
     * Sets the value of the customerUpdateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomerUpdateReturn(Customer value) {
        this.customerUpdateReturn = value;
    }

}
