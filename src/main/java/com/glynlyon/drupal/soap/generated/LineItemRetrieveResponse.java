
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
 *         &lt;element name="lineItemRetrieveReturn" type="{http://soap.drupal.glynlyon.com}lineItem"/>
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
    "lineItemRetrieveReturn"
})
@XmlRootElement(name = "lineItemRetrieveResponse")
public class LineItemRetrieveResponse {

    @XmlElement(required = true)
    protected LineItem lineItemRetrieveReturn;

    /**
     * Gets the value of the lineItemRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem }
     *     
     */
    public LineItem getLineItemRetrieveReturn() {
        return lineItemRetrieveReturn;
    }

    /**
     * Sets the value of the lineItemRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem }
     *     
     */
    public void setLineItemRetrieveReturn(LineItem value) {
        this.lineItemRetrieveReturn = value;
    }

}
