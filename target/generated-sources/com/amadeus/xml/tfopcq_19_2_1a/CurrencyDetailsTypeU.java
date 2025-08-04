
package com.amadeus.xml.tfopcq_19_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The usage to which a currency relates
 * 
 * <p>Java class for CurrencyDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyQualifier" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="currencyIsoCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currencyType" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currencyRate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericDecimal_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDetailsTypeU", propOrder = {
    "currencyQualifier",
    "currencyIsoCode",
    "currencyType",
    "currencyRate"
})
public class CurrencyDetailsTypeU {

    @XmlElement(required = true)
    protected String currencyQualifier;
    protected String currencyIsoCode;
    protected String currencyType;
    protected BigDecimal currencyRate;

    /**
     * Gets the value of the currencyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyQualifier() {
        return currencyQualifier;
    }

    /**
     * Sets the value of the currencyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyQualifier(String value) {
        this.currencyQualifier = value;
    }

    /**
     * Gets the value of the currencyIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    /**
     * Sets the value of the currencyIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIsoCode(String value) {
        this.currencyIsoCode = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
    }

}
