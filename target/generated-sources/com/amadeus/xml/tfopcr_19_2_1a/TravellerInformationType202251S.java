
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType_202251S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType_202251S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccHolderNameDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TravellerSurnameInformationType_220923C"/>
 *         &lt;element name="otherNameDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TravellerDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType_202251S", propOrder = {
    "ccHolderNameDetails",
    "otherNameDetails"
})
public class TravellerInformationType202251S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationType220923C ccHolderNameDetails;
    protected TravellerDetailsTypeI otherNameDetails;

    /**
     * Gets the value of the ccHolderNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType220923C }
     *     
     */
    public TravellerSurnameInformationType220923C getCcHolderNameDetails() {
        return ccHolderNameDetails;
    }

    /**
     * Sets the value of the ccHolderNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType220923C }
     *     
     */
    public void setCcHolderNameDetails(TravellerSurnameInformationType220923C value) {
        this.ccHolderNameDetails = value;
    }

    /**
     * Gets the value of the otherNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI }
     *     
     */
    public TravellerDetailsTypeI getOtherNameDetails() {
        return otherNameDetails;
    }

    /**
     * Sets the value of the otherNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI }
     *     
     */
    public void setOtherNameDetails(TravellerDetailsTypeI value) {
        this.otherNameDetails = value;
    }

}
