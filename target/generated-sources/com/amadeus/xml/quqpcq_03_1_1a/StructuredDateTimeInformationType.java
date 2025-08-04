
package com.amadeus.xml.quqpcq_03_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeMode" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}StructuredDateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType", propOrder = {
    "timeMode",
    "dateTime"
})
public class StructuredDateTimeInformationType {

    protected BigInteger timeMode;
    protected StructuredDateTimeType dateTime;

    /**
     * Gets the value of the timeMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeMode() {
        return timeMode;
    }

    /**
     * Sets the value of the timeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeMode(BigInteger value) {
        this.timeMode = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setDateTime(StructuredDateTimeType value) {
        this.dateTime = value;
    }

}
