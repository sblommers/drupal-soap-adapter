
package com.glynlyon.drupal.soap.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="productsUpdatedSinceReturn" type="{http://soap.drupal.glynlyon.com}product" maxOccurs="unbounded" minOccurs="0"/>
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
    "productsUpdatedSinceReturn"
})
@XmlRootElement(name = "productsUpdatedSinceResponse")
public class ProductsUpdatedSinceResponse {

    protected List<Product> productsUpdatedSinceReturn;

    /**
     * Gets the value of the productsUpdatedSinceReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productsUpdatedSinceReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductsUpdatedSinceReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProductsUpdatedSinceReturn() {
        if (productsUpdatedSinceReturn == null) {
            productsUpdatedSinceReturn = new ArrayList<Product>();
        }
        return this.productsUpdatedSinceReturn;
    }

}
