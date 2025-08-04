
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Date and/or time, or period relevant to the specified date/time/period type.
 * 
 * <p>Java class for DateTimePeriodDetailsBatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimePeriodDetailsBatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTimeQualifier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriodDetailsBatchType", propOrder = {
    "dateTimeQualifier",
    "dateTimeDetails"
})
public class DateTimePeriodDetailsBatchType {

    protected String dateTimeQualifier;
    protected String dateTimeDetails;

    /**
     * Gets the value of the dateTimeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    /**
     * Sets the value of the dateTimeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeQualifier(String value) {
        this.dateTimeQualifier = value;
    }

    /**
     * Gets the value of the dateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeDetails() {
        return dateTimeDetails;
    }

    /**
     * Sets the value of the dateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeDetails(String value) {
        this.dateTimeDetails = value;
    }

}
