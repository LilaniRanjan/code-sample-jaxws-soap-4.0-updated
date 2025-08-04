
package com.amadeus.xml.fmpcar_20_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides Information on the Amentity Provider
 * 
 * <p>Java class for AmenityProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmenityProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amenityProvider" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmenityProvider", propOrder = {
    "amenityProvider"
})
public class AmenityProvider {

    protected String amenityProvider;

    /**
     * Gets the value of the amenityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityProvider() {
        return amenityProvider;
    }

    /**
     * Sets the value of the amenityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityProvider(String value) {
        this.amenityProvider = value;
    }

}
