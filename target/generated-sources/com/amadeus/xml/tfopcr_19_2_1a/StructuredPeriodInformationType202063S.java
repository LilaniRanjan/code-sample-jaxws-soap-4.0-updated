
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType_202063S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType_202063S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="timeMode" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeType_220873C" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeType_220873C" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FrequencyType" minOccurs="0"/>
 *         &lt;element name="timeZoneInfo" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TimeZoneIinformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformationType_202063S", propOrder = {
    "businessSemantic",
    "timeMode",
    "beginDateTime",
    "endDateTime",
    "frequency",
    "timeZoneInfo"
})
public class StructuredPeriodInformationType202063S {

    protected String businessSemantic;
    protected String timeMode;
    protected StructuredDateTimeType220873C beginDateTime;
    protected StructuredDateTimeType220873C endDateTime;
    protected FrequencyType frequency;
    protected TimeZoneIinformationType timeZoneInfo;

    /**
     * Gets the value of the businessSemantic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /**
     * Sets the value of the businessSemantic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSemantic(String value) {
        this.businessSemantic = value;
    }

    /**
     * Gets the value of the timeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeMode() {
        return timeMode;
    }

    /**
     * Sets the value of the timeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeMode(String value) {
        this.timeMode = value;
    }

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType220873C }
     *     
     */
    public StructuredDateTimeType220873C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType220873C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType220873C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType220873C }
     *     
     */
    public StructuredDateTimeType220873C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType220873C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType220873C value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setFrequency(FrequencyType value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the timeZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneIinformationType }
     *     
     */
    public TimeZoneIinformationType getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * Sets the value of the timeZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneIinformationType }
     *     
     */
    public void setTimeZoneInfo(TimeZoneIinformationType value) {
        this.timeZoneInfo = value;
    }

}
