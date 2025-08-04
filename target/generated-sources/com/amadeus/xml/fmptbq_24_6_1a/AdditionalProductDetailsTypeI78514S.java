
package com.amadeus.xml.fmptbq_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetailsTypeI_78514S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI_78514S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductTypeI" minOccurs="0"/>
 *         &lt;element name="departureStationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="arrivalStationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="mileageTimeDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MileageTimeDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI_78514S", propOrder = {
    "legDetails",
    "departureStationInfo",
    "arrivalStationInfo",
    "mileageTimeDetails"
})
public class AdditionalProductDetailsTypeI78514S {

    protected AdditionalProductTypeI legDetails;
    protected StationInformationTypeI departureStationInfo;
    protected StationInformationTypeI arrivalStationInfo;
    protected MileageTimeDetailsTypeI mileageTimeDetails;

    /**
     * Gets the value of the legDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public AdditionalProductTypeI getLegDetails() {
        return legDetails;
    }

    /**
     * Sets the value of the legDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public void setLegDetails(AdditionalProductTypeI value) {
        this.legDetails = value;
    }

    /**
     * Gets the value of the departureStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getDepartureStationInfo() {
        return departureStationInfo;
    }

    /**
     * Sets the value of the departureStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setDepartureStationInfo(StationInformationTypeI value) {
        this.departureStationInfo = value;
    }

    /**
     * Gets the value of the arrivalStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getArrivalStationInfo() {
        return arrivalStationInfo;
    }

    /**
     * Sets the value of the arrivalStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setArrivalStationInfo(StationInformationTypeI value) {
        this.arrivalStationInfo = value;
    }

    /**
     * Gets the value of the mileageTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public MileageTimeDetailsTypeI getMileageTimeDetails() {
        return mileageTimeDetails;
    }

    /**
     * Sets the value of the mileageTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public void setMileageTimeDetails(MileageTimeDetailsTypeI value) {
        this.mileageTimeDetails = value;
    }

}
