
package com.amadeus.xml.tmrxrr_23_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify flight product information detail
 * 
 * <p>Java class for FareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalFareDetails" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}AdditionalFareQualifierDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsType", propOrder = {
    "additionalFareDetails"
})
public class FareQualifierDetailsType {

    @XmlElement(required = true)
    protected AdditionalFareQualifierDetailsType additionalFareDetails;

    /**
     * Gets the value of the additionalFareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsType }
     *     
     */
    public AdditionalFareQualifierDetailsType getAdditionalFareDetails() {
        return additionalFareDetails;
    }

    /**
     * Sets the value of the additionalFareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsType }
     *     
     */
    public void setAdditionalFareDetails(AdditionalFareQualifierDetailsType value) {
        this.additionalFareDetails = value;
    }

}
