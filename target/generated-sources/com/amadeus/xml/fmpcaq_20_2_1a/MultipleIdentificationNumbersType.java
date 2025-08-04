
package com.amadeus.xml.fmpcaq_20_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify more than one identification number.
 * 
 * <p>Java class for MultipleIdentificationNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleIdentificationNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateNumberIdentifier" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleIdentificationNumbersType", propOrder = {
    "corporateNumberIdentifier"
})
public class MultipleIdentificationNumbersType {

    protected String corporateNumberIdentifier;

    /**
     * Gets the value of the corporateNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateNumberIdentifier() {
        return corporateNumberIdentifier;
    }

    /**
     * Sets the value of the corporateNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateNumberIdentifier(String value) {
        this.corporateNumberIdentifier = value;
    }

}
