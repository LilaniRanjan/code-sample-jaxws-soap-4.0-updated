
package com.amadeus.xml.fmptbr_24_6_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Displays penalty type, amount, currency, applicability and related duration
 * 
 * <p>Java class for PenaltyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="isApplicable" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length1To1"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericDecimal_Length1To35" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfMonths" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length0To3" minOccurs="0"/>
 *         &lt;element name="numberOfDays" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length0To3" minOccurs="0"/>
 *         &lt;element name="numberOfHours" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length0To3" minOccurs="0"/>
 *         &lt;element name="numberOfMinutes" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length0To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyDetailsType", propOrder = {
    "qualifier",
    "isApplicable",
    "amount",
    "currency",
    "numberOfMonths",
    "numberOfDays",
    "numberOfHours",
    "numberOfMinutes"
})
public class PenaltyDetailsType {

    @XmlElement(required = true)
    protected String qualifier;
    @XmlElement(required = true)
    protected BigInteger isApplicable;
    protected BigDecimal amount;
    protected String currency;
    protected BigInteger numberOfMonths;
    protected BigInteger numberOfDays;
    protected BigInteger numberOfHours;
    protected BigInteger numberOfMinutes;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the isApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsApplicable() {
        return isApplicable;
    }

    /**
     * Sets the value of the isApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsApplicable(BigInteger value) {
        this.isApplicable = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the numberOfMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMonths() {
        return numberOfMonths;
    }

    /**
     * Sets the value of the numberOfMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMonths(BigInteger value) {
        this.numberOfMonths = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDays(BigInteger value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the numberOfHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHours() {
        return numberOfHours;
    }

    /**
     * Sets the value of the numberOfHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHours(BigInteger value) {
        this.numberOfHours = value;
    }

    /**
     * Gets the value of the numberOfMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMinutes() {
        return numberOfMinutes;
    }

    /**
     * Sets the value of the numberOfMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMinutes(BigInteger value) {
        this.numberOfMinutes = value;
    }

}
