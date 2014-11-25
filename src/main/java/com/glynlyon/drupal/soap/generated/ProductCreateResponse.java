
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
 *         &lt;element name="productCreateReturn" type="{http://soap.drupal.glynlyon.com}product"/>
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
    "productCreateReturn"
})
@XmlRootElement(name = "productCreateResponse")
public class ProductCreateResponse {

    @XmlElement(required = true)
    protected Product productCreateReturn;

    /**
     * Gets the value of the productCreateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductCreateReturn() {
        return productCreateReturn;
    }

    /**
     * Sets the value of the productCreateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductCreateReturn(Product value) {
        this.productCreateReturn = value;
    }

}
