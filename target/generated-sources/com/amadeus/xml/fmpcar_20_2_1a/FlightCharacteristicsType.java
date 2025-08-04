
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey flight characteristics
 * 
 * <p>Java class for FlightCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCharacteristicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="onTimePerformance" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}OnTimePerformanceType" minOccurs="0"/>
 *         &lt;element name="inFlightSrv" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To3" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicsType", propOrder = {
    "onTimePerformance",
    "inFlightSrv"
})
public class FlightCharacteristicsType {

    protected OnTimePerformanceType onTimePerformance;
    protected List<String> inFlightSrv;

    /**
     * Gets the value of the onTimePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link OnTimePerformanceType }
     *     
     */
    public OnTimePerformanceType getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnTimePerformanceType }
     *     
     */
    public void setOnTimePerformance(OnTimePerformanceType value) {
        this.onTimePerformance = value;
    }

    /**
     * Gets the value of the inFlightSrv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFlightSrv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFlightSrv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInFlightSrv() {
        if (inFlightSrv == null) {
            inFlightSrv = new ArrayList<String>();
        }
        return this.inFlightSrv;
    }

}
