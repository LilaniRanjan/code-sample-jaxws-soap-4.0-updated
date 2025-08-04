
package com.amadeus.xml.tipnrq_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTaxFeeDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateCode" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To7" minOccurs="0"/>
 *         &lt;element name="identificationCode" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="responsibleAgency" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="taxValueQualifier" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="codeListId" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeDetailType", propOrder = {
    "rateCode",
    "identificationCode",
    "responsibleAgency",
    "taxRate",
    "taxValueQualifier",
    "codeListId",
    "agency"
})
public class DutyTaxFeeDetailType {

    protected String rateCode;
    protected String identificationCode;
    protected String responsibleAgency;
    protected String taxRate;
    protected String taxValueQualifier;
    protected String codeListId;
    protected String agency;

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the identificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationCode() {
        return identificationCode;
    }

    /**
     * Sets the value of the identificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationCode(String value) {
        this.identificationCode = value;
    }

    /**
     * Gets the value of the responsibleAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleAgency() {
        return responsibleAgency;
    }

    /**
     * Sets the value of the responsibleAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleAgency(String value) {
        this.responsibleAgency = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxValueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxValueQualifier() {
        return taxValueQualifier;
    }

    /**
     * Sets the value of the taxValueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxValueQualifier(String value) {
        this.taxValueQualifier = value;
    }

    /**
     * Gets the value of the codeListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListId() {
        return codeListId;
    }

    /**
     * Sets the value of the codeListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListId(String value) {
        this.codeListId = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

}
