
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations related to the form of payment specific to reporting
 * 
 * <p>Java class for FormOfPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopCode" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopStatus" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentInformationType", propOrder = {
    "fopCode",
    "fopStatus"
})
public class FormOfPaymentInformationType {

    protected String fopCode;
    protected String fopStatus;

    /**
     * Gets the value of the fopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopCode() {
        return fopCode;
    }

    /**
     * Sets the value of the fopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopCode(String value) {
        this.fopCode = value;
    }

    /**
     * Gets the value of the fopStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopStatus() {
        return fopStatus;
    }

    /**
     * Sets the value of the fopStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopStatus(String value) {
        this.fopStatus = value;
    }

}
