
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in_stock"/>
 *     &lt;enumeration value="out_of_stock"/>
 *     &lt;enumeration value="limited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productStatus")
@XmlEnum
public enum ProductStatus {

    @XmlEnumValue("in_stock")
    IN_STOCK("in_stock"),
    @XmlEnumValue("out_of_stock")
    OUT_OF_STOCK("out_of_stock"),
    @XmlEnumValue("limited")
    LIMITED("limited");
    private final String value;

    ProductStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductStatus fromValue(String v) {
        for (ProductStatus c: ProductStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
