
package com.amadeus.xml.tfopcq_19_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the information required to identify a reservation.
 * 
 * <p>Java class for ReservationControlInformationDetailsType_220877C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationDetailsType_220877C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="controlNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="controlType" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AMA_EDICodesetType_Length1" minOccurs="0"/>
 *         &lt;element name="date" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="time" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *         &lt;element name="bfeType" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationDetailsType_220877C", propOrder = {
    "companyId",
    "controlNumber",
    "controlType",
    "date",
    "time",
    "bfeType"
})
public class ReservationControlInformationDetailsType220877C {

    protected String companyId;
    protected String controlNumber;
    protected String controlType;
    protected String date;
    protected BigInteger time;
    protected String bfeType;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlType(String value) {
        this.controlType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTime(BigInteger value) {
        this.time = value;
    }

    /**
     * Gets the value of the bfeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBfeType() {
        return bfeType;
    }

    /**
     * Sets the value of the bfeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBfeType(String value) {
        this.bfeType = value;
    }

}
