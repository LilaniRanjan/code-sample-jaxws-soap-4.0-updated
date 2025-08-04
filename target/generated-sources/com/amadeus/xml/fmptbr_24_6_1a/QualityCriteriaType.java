
package com.amadeus.xml.fmptbr_24_6_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="risk" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="convenience" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityCriteriaType", propOrder = {
    "risk",
    "convenience",
    "value"
})
public class QualityCriteriaType {

    protected String risk;
    protected BigDecimal convenience;
    protected BigDecimal value;

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisk(String value) {
        this.risk = value;
    }

    /**
     * Gets the value of the convenience property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConvenience() {
        return convenience;
    }

    /**
     * Sets the value of the convenience property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConvenience(BigDecimal value) {
        this.convenience = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
