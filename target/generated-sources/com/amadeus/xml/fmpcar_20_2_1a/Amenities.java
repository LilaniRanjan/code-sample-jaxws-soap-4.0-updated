
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey Amenities information
 * 
 * <p>Java class for Amenities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Amenities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amentityContentSourceDetails" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AmenityProvider" minOccurs="0"/>
 *         &lt;element name="amenityDetails" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AmenityDescription" maxOccurs="500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amenities", propOrder = {
    "amentityContentSourceDetails",
    "amenityDetails"
})
public class Amenities {

    protected AmenityProvider amentityContentSourceDetails;
    protected List<AmenityDescription> amenityDetails;

    /**
     * Gets the value of the amentityContentSourceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AmenityProvider }
     *     
     */
    public AmenityProvider getAmentityContentSourceDetails() {
        return amentityContentSourceDetails;
    }

    /**
     * Sets the value of the amentityContentSourceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmenityProvider }
     *     
     */
    public void setAmentityContentSourceDetails(AmenityProvider value) {
        this.amentityContentSourceDetails = value;
    }

    /**
     * Gets the value of the amenityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenityDescription }
     * 
     * 
     */
    public List<AmenityDescription> getAmenityDetails() {
        if (amenityDetails == null) {
            amenityDetails = new ArrayList<AmenityDescription>();
        }
        return this.amenityDetails;
    }

}
