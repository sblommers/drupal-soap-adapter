
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
 *         &lt;element name="drupal_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assist_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "drupalId",
    "gpId",
    "assistId"
})
@XmlRootElement(name = "orderRetrieve")
public class OrderRetrieve {

    @XmlElement(name = "drupal_id", required = true)
    protected String drupalId;
    @XmlElement(name = "gp_id", required = true)
    protected String gpId;
    @XmlElement(name = "assist_id", required = true)
    protected String assistId;

    /**
     * Gets the value of the drupalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrupalId() {
        return drupalId;
    }

    /**
     * Sets the value of the drupalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrupalId(String value) {
        this.drupalId = value;
    }

    /**
     * Gets the value of the gpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpId() {
        return gpId;
    }

    /**
     * Sets the value of the gpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpId(String value) {
        this.gpId = value;
    }

    /**
     * Gets the value of the assistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistId() {
        return assistId;
    }

    /**
     * Sets the value of the assistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistId(String value) {
        this.assistId = value;
    }

}
