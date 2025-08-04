
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify country and related information, i.e. date and time of summer or winter time transition and related time variation, currency and language(s).
 * 
 * <p>Java class for CountryInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryNameCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryInformationTypeU", propOrder = {
    "countryNameCode"
})
public class CountryInformationTypeU {

    @XmlElement(required = true)
    protected String countryNameCode;

    /**
     * Gets the value of the countryNameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameCode() {
        return countryNameCode;
    }

    /**
     * Sets the value of the countryNameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameCode(String value) {
        this.countryNameCode = value;
    }

}
