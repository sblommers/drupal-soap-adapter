
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
 *         &lt;element name="lineItemUpdateReturn" type="{http://soap.drupal.glynlyon.com}lineItem"/>
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
    "lineItemUpdateReturn"
})
@XmlRootElement(name = "lineItemUpdateResponse")
public class LineItemUpdateResponse {

    @XmlElement(required = true)
    protected LineItem lineItemUpdateReturn;

    /**
     * Gets the value of the lineItemUpdateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem }
     *     
     */
    public LineItem getLineItemUpdateReturn() {
        return lineItemUpdateReturn;
    }

    /**
     * Sets the value of the lineItemUpdateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem }
     *     
     */
    public void setLineItemUpdateReturn(LineItem value) {
        this.lineItemUpdateReturn = value;
    }

}
