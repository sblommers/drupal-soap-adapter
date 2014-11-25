
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="uhh_not_sure" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "uhhNotSure"
})
public class LineItem {

    @XmlElement(name = "uhh_not_sure", required = true)
    protected String uhhNotSure;

    /**
     * Gets the value of the uhhNotSure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUhhNotSure() {
        return uhhNotSure;
    }

    /**
     * Sets the value of the uhhNotSure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUhhNotSure(String value) {
        this.uhhNotSure = value;
    }

}
