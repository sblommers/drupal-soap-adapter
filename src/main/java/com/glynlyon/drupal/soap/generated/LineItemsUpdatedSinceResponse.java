
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
 *         &lt;element name="lineItemsUpdatedSinceReturn" type="{http://soap.drupal.glynlyon.com}lineItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "lineItemsUpdatedSinceReturn"
})
@XmlRootElement(name = "lineItemsUpdatedSinceResponse")
public class LineItemsUpdatedSinceResponse {

    protected List<LineItem> lineItemsUpdatedSinceReturn;

    /**
     * Gets the value of the lineItemsUpdatedSinceReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemsUpdatedSinceReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemsUpdatedSinceReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem }
     * 
     * 
     */
    public List<LineItem> getLineItemsUpdatedSinceReturn() {
        if (lineItemsUpdatedSinceReturn == null) {
            lineItemsUpdatedSinceReturn = new ArrayList<LineItem>();
        }
        return this.lineItemsUpdatedSinceReturn;
    }

}
