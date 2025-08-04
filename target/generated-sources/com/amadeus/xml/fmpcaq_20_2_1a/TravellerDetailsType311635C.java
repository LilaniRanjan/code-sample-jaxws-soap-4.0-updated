
package com.amadeus.xml.fmpcaq_20_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * <p>Java class for TravellerDetailsType_311635C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDetailsType_311635C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniqueCustomerIdentifier" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="infantIndicator" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDetailsType_311635C", propOrder = {
    "uniqueCustomerIdentifier",
    "infantIndicator"
})
public class TravellerDetailsType311635C {

    protected String uniqueCustomerIdentifier;
    protected String infantIndicator;

    /**
     * Gets the value of the uniqueCustomerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /**
     * Sets the value of the uniqueCustomerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCustomerIdentifier(String value) {
        this.uniqueCustomerIdentifier = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

}
