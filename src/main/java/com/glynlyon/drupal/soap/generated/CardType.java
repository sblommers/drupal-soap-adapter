
package com.glynlyon.drupal.soap.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="visa"/>
 *     &lt;enumeration value="mastercard"/>
 *     &lt;enumeration value="amex"/>
 *     &lt;enumeration value="discover"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardType")
@XmlEnum
public enum CardType {

    @XmlEnumValue("visa")
    VISA("visa"),
    @XmlEnumValue("mastercard")
    MASTERCARD("mastercard"),
    @XmlEnumValue("amex")
    AMEX("amex"),
    @XmlEnumValue("discover")
    DISCOVER("discover");
    private final String value;

    CardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardType fromValue(String v) {
        for (CardType c: CardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
