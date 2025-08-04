
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify point of sale information by party identification or location identification.
 * 
 * <p>Java class for PointOfSaleInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfSaleInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pointOfSale" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PartyIdentifierType" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}LocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleInformationType", propOrder = {
    "pointOfSale",
    "locationDetails"
})
public class PointOfSaleInformationType {

    protected PartyIdentifierType pointOfSale;
    protected LocationType locationDetails;

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifierType }
     *     
     */
    public PartyIdentifierType getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifierType }
     *     
     */
    public void setPointOfSale(PartyIdentifierType value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocationDetails(LocationType value) {
        this.locationDetails = value;
    }

}
