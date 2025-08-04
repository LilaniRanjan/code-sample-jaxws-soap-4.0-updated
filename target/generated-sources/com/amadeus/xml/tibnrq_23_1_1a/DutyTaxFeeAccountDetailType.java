
package com.amadeus.xml.tibnrq_23_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTaxFeeAccountDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeAccountDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isoCountry" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AlphaNumericString_Length1To6"/>
 *         &lt;element name="taxAccountCodeList" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="taxResponsibleAgency" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeAccountDetailType", propOrder = {
    "isoCountry",
    "taxAccountCodeList",
    "taxResponsibleAgency"
})
public class DutyTaxFeeAccountDetailType {

    @XmlElement(required = true)
    protected String isoCountry;
    protected String taxAccountCodeList;
    protected String taxResponsibleAgency;

    /**
     * Gets the value of the isoCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCountry() {
        return isoCountry;
    }

    /**
     * Sets the value of the isoCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * Gets the value of the taxAccountCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAccountCodeList() {
        return taxAccountCodeList;
    }

    /**
     * Sets the value of the taxAccountCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAccountCodeList(String value) {
        this.taxAccountCodeList = value;
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

}
