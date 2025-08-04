
package com.amadeus.xml.tpcbrr_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning baggage allowance details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bagAllowanceDetails" type="{http://xml.amadeus.com/TPCBRR_24_3_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="carryOnBaggageDetails" type="{http://xml.amadeus.com/TPCBRR_24_3_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "bagAllowanceDetails",
    "carryOnBaggageDetails"
})
public class ExcessBaggageTypeI {

    protected BaggageDetailsTypeI bagAllowanceDetails;
    protected BaggageDetailsTypeI carryOnBaggageDetails;

    /**
     * Gets the value of the bagAllowanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getBagAllowanceDetails() {
        return bagAllowanceDetails;
    }

    /**
     * Sets the value of the bagAllowanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setBagAllowanceDetails(BaggageDetailsTypeI value) {
        this.bagAllowanceDetails = value;
    }

    /**
     * Gets the value of the carryOnBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getCarryOnBaggageDetails() {
        return carryOnBaggageDetails;
    }

    /**
     * Sets the value of the carryOnBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setCarryOnBaggageDetails(BaggageDetailsTypeI value) {
        this.carryOnBaggageDetails = value;
    }

}
