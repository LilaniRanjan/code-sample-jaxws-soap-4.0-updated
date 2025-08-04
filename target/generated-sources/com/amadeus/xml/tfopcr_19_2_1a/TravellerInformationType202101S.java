
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType_202101S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType_202101S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TravellerSurnameInformationType_220907C"/>
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TravellerDetailsTypeI_107098C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType_202101S", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationType202101S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationType220907C paxDetails;
    protected TravellerDetailsTypeI107098C otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType220907C }
     *     
     */
    public TravellerSurnameInformationType220907C getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType220907C }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationType220907C value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI107098C }
     *     
     */
    public TravellerDetailsTypeI107098C getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /**
     * Sets the value of the otherPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI107098C }
     *     
     */
    public void setOtherPaxDetails(TravellerDetailsTypeI107098C value) {
        this.otherPaxDetails = value;
    }

}
