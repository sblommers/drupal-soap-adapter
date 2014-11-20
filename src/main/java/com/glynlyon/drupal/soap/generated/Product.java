
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sku" type="{http://soap.drupal.glynlyon.com}string16"/>
 *         &lt;element name="title" type="{http://soap.drupal.glynlyon.com}string256"/>
 *         &lt;element name="status" type="{http://soap.drupal.glynlyon.com}productStatus"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="product_type" type="{http://soap.drupal.glynlyon.com}productType"/>
 *         &lt;element name="subject" type="{http://soap.drupal.glynlyon.com}string32"/>
 *         &lt;element name="grade_level" type="{http://soap.drupal.glynlyon.com}string16"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="msrp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="long_description" type="{http://soap.drupal.glynlyon.com}string128"/>
 *         &lt;element name="product_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="free_shipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dimension_length" type="{http://soap.drupal.glynlyon.com}string8"/>
 *         &lt;element name="dimension_width" type="{http://soap.drupal.glynlyon.com}string8"/>
 *         &lt;element name="dimension_height" type="{http://soap.drupal.glynlyon.com}string8"/>
 *         &lt;element name="dimension_unit" type="{http://soap.drupal.glynlyon.com}string8"/>
 *         &lt;element name="weight" type="{http://soap.drupal.glynlyon.com}positiveFloat"/>
 *         &lt;element name="weight_unit" type="{http://soap.drupal.glynlyon.com}string8"/>
 *         &lt;element name="virtual_only" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tax_exempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="has_demo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="on_demand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scope_sequence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="science_supply" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sample_pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="video_clips" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audio_clips" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="published" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="avatax_code" type="{http://soap.drupal.glynlyon.com}string16"/>
 *         &lt;element name="upc" type="{http://soap.drupal.glynlyon.com}string32"/>
 *         &lt;element name="isbn" type="{http://soap.drupal.glynlyon.com}string16"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "sku",
    "title",
    "status",
    "productId",
    "productType",
    "subject",
    "gradeLevel",
    "price",
    "msrp",
    "longDescription",
    "productImageUrl",
    "freeShipping",
    "dimensionLength",
    "dimensionWidth",
    "dimensionHeight",
    "dimensionUnit",
    "weight",
    "weightUnit",
    "virtualOnly",
    "taxExempt",
    "hasDemo",
    "onDemand",
    "scopeSequence",
    "scienceSupply",
    "samplePages",
    "videoClips",
    "audioClips",
    "published",
    "avataxCode",
    "upc",
    "isbn",
    "created",
    "updated"
})
public class Product {

    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductStatus status;
    @XmlElement(name = "product_id", required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(name = "product_type", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ProductType productType;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(name = "grade_level", required = true)
    protected String gradeLevel;
    protected int price;
    protected int msrp;
    @XmlElement(name = "long_description", required = true)
    protected String longDescription;
    @XmlElement(name = "product_image_url", required = true, nillable = true)
    protected String productImageUrl;
    @XmlElement(name = "free_shipping")
    protected boolean freeShipping;
    @XmlElement(name = "dimension_length", required = true, nillable = true)
    protected String dimensionLength;
    @XmlElement(name = "dimension_width", required = true, nillable = true)
    protected String dimensionWidth;
    @XmlElement(name = "dimension_height", required = true, nillable = true)
    protected String dimensionHeight;
    @XmlElement(name = "dimension_unit", required = true, nillable = true)
    protected String dimensionUnit;
    protected float weight;
    @XmlElement(name = "weight_unit", required = true, nillable = true)
    protected String weightUnit;
    @XmlElement(name = "virtual_only")
    protected boolean virtualOnly;
    @XmlElement(name = "tax_exempt")
    protected boolean taxExempt;
    @XmlElement(name = "has_demo")
    protected boolean hasDemo;
    @XmlElement(name = "on_demand", required = true, nillable = true)
    protected String onDemand;
    @XmlElement(name = "scope_sequence", required = true, nillable = true)
    protected String scopeSequence;
    @XmlElement(name = "science_supply", required = true, nillable = true)
    protected String scienceSupply;
    @XmlElement(name = "sample_pages", required = true, nillable = true)
    protected String samplePages;
    @XmlElement(name = "video_clips", required = true, nillable = true)
    protected String videoClips;
    @XmlElement(name = "audio_clips", required = true, nillable = true)
    protected String audioClips;
    protected boolean published;
    @XmlElement(name = "avatax_code", required = true, nillable = true)
    protected String avataxCode;
    @XmlElement(required = true, nillable = true)
    protected String upc;
    @XmlElement(required = true, nillable = true)
    protected String isbn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setStatus(ProductStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeLevel(String value) {
        this.gradeLevel = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the msrp property.
     * 
     */
    public int getMsrp() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     */
    public void setMsrp(int value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the productImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductImageUrl() {
        return productImageUrl;
    }

    /**
     * Sets the value of the productImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductImageUrl(String value) {
        this.productImageUrl = value;
    }

    /**
     * Gets the value of the freeShipping property.
     * 
     */
    public boolean isFreeShipping() {
        return freeShipping;
    }

    /**
     * Sets the value of the freeShipping property.
     * 
     */
    public void setFreeShipping(boolean value) {
        this.freeShipping = value;
    }

    /**
     * Gets the value of the dimensionLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionLength() {
        return dimensionLength;
    }

    /**
     * Sets the value of the dimensionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionLength(String value) {
        this.dimensionLength = value;
    }

    /**
     * Gets the value of the dimensionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionWidth() {
        return dimensionWidth;
    }

    /**
     * Sets the value of the dimensionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionWidth(String value) {
        this.dimensionWidth = value;
    }

    /**
     * Gets the value of the dimensionHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionHeight() {
        return dimensionHeight;
    }

    /**
     * Sets the value of the dimensionHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionHeight(String value) {
        this.dimensionHeight = value;
    }

    /**
     * Gets the value of the dimensionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionUnit() {
        return dimensionUnit;
    }

    /**
     * Sets the value of the dimensionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionUnit(String value) {
        this.dimensionUnit = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets the value of the weightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnit(String value) {
        this.weightUnit = value;
    }

    /**
     * Gets the value of the virtualOnly property.
     * 
     */
    public boolean isVirtualOnly() {
        return virtualOnly;
    }

    /**
     * Sets the value of the virtualOnly property.
     * 
     */
    public void setVirtualOnly(boolean value) {
        this.virtualOnly = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     */
    public boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     */
    public void setTaxExempt(boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the hasDemo property.
     * 
     */
    public boolean isHasDemo() {
        return hasDemo;
    }

    /**
     * Sets the value of the hasDemo property.
     * 
     */
    public void setHasDemo(boolean value) {
        this.hasDemo = value;
    }

    /**
     * Gets the value of the onDemand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnDemand() {
        return onDemand;
    }

    /**
     * Sets the value of the onDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnDemand(String value) {
        this.onDemand = value;
    }

    /**
     * Gets the value of the scopeSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeSequence() {
        return scopeSequence;
    }

    /**
     * Sets the value of the scopeSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeSequence(String value) {
        this.scopeSequence = value;
    }

    /**
     * Gets the value of the scienceSupply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSupply() {
        return scienceSupply;
    }

    /**
     * Sets the value of the scienceSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSupply(String value) {
        this.scienceSupply = value;
    }

    /**
     * Gets the value of the samplePages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplePages() {
        return samplePages;
    }

    /**
     * Sets the value of the samplePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplePages(String value) {
        this.samplePages = value;
    }

    /**
     * Gets the value of the videoClips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoClips() {
        return videoClips;
    }

    /**
     * Sets the value of the videoClips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoClips(String value) {
        this.videoClips = value;
    }

    /**
     * Gets the value of the audioClips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioClips() {
        return audioClips;
    }

    /**
     * Sets the value of the audioClips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioClips(String value) {
        this.audioClips = value;
    }

    /**
     * Gets the value of the published property.
     * 
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Sets the value of the published property.
     * 
     */
    public void setPublished(boolean value) {
        this.published = value;
    }

    /**
     * Gets the value of the avataxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvataxCode() {
        return avataxCode;
    }

    /**
     * Sets the value of the avataxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvataxCode(String value) {
        this.avataxCode = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpc() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpc(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

}
