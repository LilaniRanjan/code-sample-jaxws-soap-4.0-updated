
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDateTimeDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ProductDateTimeTypeI_247911C" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}LocationDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsTypeI", propOrder = {
    "productDateTimeDetails",
    "locationDetails"
})
public class PricingTicketingDetailsTypeI {

    protected ProductDateTimeTypeI247911C productDateTimeDetails;
    protected LocationDetailsTypeI locationDetails;

    /**
     * Gets the value of the productDateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI247911C }
     *     
     */
    public ProductDateTimeTypeI247911C getProductDateTimeDetails() {
        return productDateTimeDetails;
    }

    /**
     * Sets the value of the productDateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI247911C }
     *     
     */
    public void setProductDateTimeDetails(ProductDateTimeTypeI247911C value) {
        this.productDateTimeDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setLocationDetails(LocationDetailsTypeI value) {
        this.locationDetails = value;
    }

}
