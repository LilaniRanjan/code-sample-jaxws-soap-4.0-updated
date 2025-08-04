
package com.amadeus.xml.fmptbr_24_6_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnTimePerformanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnTimePerformanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTimePeriod" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="percentage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericDecimal_Length1To8" minOccurs="0"/>
 *         &lt;element name="accuracy" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnTimePerformanceType", propOrder = {
    "dateTimePeriod",
    "percentage",
    "accuracy"
})
public class OnTimePerformanceType {

    protected String dateTimePeriod;
    protected BigDecimal percentage;
    protected String accuracy;

    /**
     * Gets the value of the dateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimePeriod() {
        return dateTimePeriod;
    }

    /**
     * Sets the value of the dateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimePeriod(String value) {
        this.dateTimePeriod = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracy(String value) {
        this.accuracy = value;
    }

}
