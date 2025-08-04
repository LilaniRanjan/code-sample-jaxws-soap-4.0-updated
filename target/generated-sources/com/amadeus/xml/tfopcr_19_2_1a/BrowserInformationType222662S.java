
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys browser properties
 * 
 * <p>Java class for BrowserInformationType_222662S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrowserInformationType_222662S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceCategory" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="userAgentHeader" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To2048" minOccurs="0"/>
 *         &lt;element name="acceptHeader" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To2048" minOccurs="0"/>
 *         &lt;element name="ietfLanguageTag" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="screenDimensions" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}DimensionsDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="colorDepth" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ValueRangeTypeI" minOccurs="0"/>
 *         &lt;element name="localDateTime" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeType" minOccurs="0"/>
 *         &lt;element name="isCookieEnabled" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="isJavaScriptEnabled" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="isJavaEnabled" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowserInformationType_222662S", propOrder = {
    "deviceCategory",
    "userAgentHeader",
    "acceptHeader",
    "ietfLanguageTag",
    "screenDimensions",
    "colorDepth",
    "localDateTime",
    "isCookieEnabled",
    "isJavaScriptEnabled",
    "isJavaEnabled"
})
public class BrowserInformationType222662S {

    @XmlElement(required = true)
    protected String deviceCategory;
    protected String userAgentHeader;
    protected String acceptHeader;
    protected String ietfLanguageTag;
    protected DimensionsDetailsTypeI screenDimensions;
    protected ValueRangeTypeI colorDepth;
    protected StructuredDateTimeType localDateTime;
    protected String isCookieEnabled;
    protected String isJavaScriptEnabled;
    protected String isJavaEnabled;

    /**
     * Gets the value of the deviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCategory() {
        return deviceCategory;
    }

    /**
     * Sets the value of the deviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCategory(String value) {
        this.deviceCategory = value;
    }

    /**
     * Gets the value of the userAgentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgentHeader() {
        return userAgentHeader;
    }

    /**
     * Sets the value of the userAgentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgentHeader(String value) {
        this.userAgentHeader = value;
    }

    /**
     * Gets the value of the acceptHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptHeader() {
        return acceptHeader;
    }

    /**
     * Sets the value of the acceptHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptHeader(String value) {
        this.acceptHeader = value;
    }

    /**
     * Gets the value of the ietfLanguageTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIetfLanguageTag() {
        return ietfLanguageTag;
    }

    /**
     * Sets the value of the ietfLanguageTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIetfLanguageTag(String value) {
        this.ietfLanguageTag = value;
    }

    /**
     * Gets the value of the screenDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsDetailsTypeI }
     *     
     */
    public DimensionsDetailsTypeI getScreenDimensions() {
        return screenDimensions;
    }

    /**
     * Sets the value of the screenDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsDetailsTypeI }
     *     
     */
    public void setScreenDimensions(DimensionsDetailsTypeI value) {
        this.screenDimensions = value;
    }

    /**
     * Gets the value of the colorDepth property.
     * 
     * @return
     *     possible object is
     *     {@link ValueRangeTypeI }
     *     
     */
    public ValueRangeTypeI getColorDepth() {
        return colorDepth;
    }

    /**
     * Sets the value of the colorDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueRangeTypeI }
     *     
     */
    public void setColorDepth(ValueRangeTypeI value) {
        this.colorDepth = value;
    }

    /**
     * Gets the value of the localDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getLocalDateTime() {
        return localDateTime;
    }

    /**
     * Sets the value of the localDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setLocalDateTime(StructuredDateTimeType value) {
        this.localDateTime = value;
    }

    /**
     * Gets the value of the isCookieEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCookieEnabled() {
        return isCookieEnabled;
    }

    /**
     * Sets the value of the isCookieEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCookieEnabled(String value) {
        this.isCookieEnabled = value;
    }

    /**
     * Gets the value of the isJavaScriptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsJavaScriptEnabled() {
        return isJavaScriptEnabled;
    }

    /**
     * Sets the value of the isJavaScriptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsJavaScriptEnabled(String value) {
        this.isJavaScriptEnabled = value;
    }

    /**
     * Gets the value of the isJavaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsJavaEnabled() {
        return isJavaEnabled;
    }

    /**
     * Sets the value of the isJavaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsJavaEnabled(String value) {
        this.isJavaEnabled = value;
    }

}
