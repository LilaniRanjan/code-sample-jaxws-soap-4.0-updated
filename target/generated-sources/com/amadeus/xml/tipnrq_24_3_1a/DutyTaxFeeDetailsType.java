
package com.amadeus.xml.tipnrq_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify relevant duty/tax/fee information.
 * 
 * <p>Java class for DutyTaxFeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxQualifier" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="taxIdentification" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}DutyTaxFeeTypeDetailsType" minOccurs="0"/>
 *         &lt;element name="taxType" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}DutyTaxFeeAccountDetailType" minOccurs="0"/>
 *         &lt;element name="taxNature" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *         &lt;element name="taxData" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}DutyTaxFeeDetailType" minOccurs="0"/>
 *         &lt;element name="taxExempt" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="partyTaxId" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="calculationCode" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeDetailsType", propOrder = {
    "taxQualifier",
    "taxIdentification",
    "taxType",
    "taxNature",
    "taxData",
    "taxExempt",
    "partyTaxId",
    "calculationCode"
})
public class DutyTaxFeeDetailsType {

    @XmlElement(required = true)
    protected String taxQualifier;
    protected DutyTaxFeeTypeDetailsType taxIdentification;
    protected DutyTaxFeeAccountDetailType taxType;
    protected String taxNature;
    protected DutyTaxFeeDetailType taxData;
    protected String taxExempt;
    protected String partyTaxId;
    protected String calculationCode;

    /**
     * Gets the value of the taxQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxQualifier() {
        return taxQualifier;
    }

    /**
     * Sets the value of the taxQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxQualifier(String value) {
        this.taxQualifier = value;
    }

    /**
     * Gets the value of the taxIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeTypeDetailsType }
     *     
     */
    public DutyTaxFeeTypeDetailsType getTaxIdentification() {
        return taxIdentification;
    }

    /**
     * Sets the value of the taxIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeTypeDetailsType }
     *     
     */
    public void setTaxIdentification(DutyTaxFeeTypeDetailsType value) {
        this.taxIdentification = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeAccountDetailType }
     *     
     */
    public DutyTaxFeeAccountDetailType getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeAccountDetailType }
     *     
     */
    public void setTaxType(DutyTaxFeeAccountDetailType value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxNature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNature() {
        return taxNature;
    }

    /**
     * Sets the value of the taxNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNature(String value) {
        this.taxNature = value;
    }

    /**
     * Gets the value of the taxData property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeDetailType }
     *     
     */
    public DutyTaxFeeDetailType getTaxData() {
        return taxData;
    }

    /**
     * Sets the value of the taxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeDetailType }
     *     
     */
    public void setTaxData(DutyTaxFeeDetailType value) {
        this.taxData = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the partyTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTaxId() {
        return partyTaxId;
    }

    /**
     * Sets the value of the partyTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTaxId(String value) {
        this.partyTaxId = value;
    }

    /**
     * Gets the value of the calculationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationCode() {
        return calculationCode;
    }

    /**
     * Sets the value of the calculationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationCode(String value) {
        this.calculationCode = value;
    }

}
