
package com.amadeus.xml.tipnrq_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTaxFeeTypeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeTypeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxIdentifier" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxCodeList" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="taxResponsibleAgency" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxName" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeTypeDetailsType", propOrder = {
    "taxIdentifier",
    "taxCodeList",
    "taxResponsibleAgency",
    "taxName"
})
public class DutyTaxFeeTypeDetailsType {

    protected String taxIdentifier;
    protected String taxCodeList;
    protected String taxResponsibleAgency;
    protected String taxName;

    /**
     * Gets the value of the taxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentifier() {
        return taxIdentifier;
    }

    /**
     * Sets the value of the taxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentifier(String value) {
        this.taxIdentifier = value;
    }

    /**
     * Gets the value of the taxCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCodeList() {
        return taxCodeList;
    }

    /**
     * Sets the value of the taxCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCodeList(String value) {
        this.taxCodeList = value;
    }

    /**
     * Gets the value of the taxResponsibleAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxResponsibleAgency() {
        return taxResponsibleAgency;
    }

    /**
     * Sets the value of the taxResponsibleAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxResponsibleAgency(String value) {
        this.taxResponsibleAgency = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

}
