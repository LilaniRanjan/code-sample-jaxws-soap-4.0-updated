
package com.amadeus.xml.tfopcq_19_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations related to the form of payment specific to reporting
 * 
 * <p>Java class for FormOfPaymentInformationType_282478C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentInformationType_282478C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopMapTable" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopBillingCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="accountHolderNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="saleIndicator" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="dealNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="collectingAgencyIataNum" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericInteger_Length8To9" minOccurs="0"/>
 *         &lt;element name="serviceChargeIndicator" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="fopStatus" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fopEdiCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="fopReportingCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="fopPrintedCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopElecTicketingCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentInformationType_282478C", propOrder = {
    "fopCode",
    "fopMapTable",
    "fopBillingCode",
    "accountHolderNumber",
    "saleIndicator",
    "dealNumber",
    "collectingAgencyIataNum",
    "serviceChargeIndicator",
    "fopStatus",
    "fopEdiCode",
    "fopReportingCode",
    "fopPrintedCode",
    "fopElecTicketingCode"
})
public class FormOfPaymentInformationType282478C {

    protected String fopCode;
    protected String fopMapTable;
    protected String fopBillingCode;
    protected String accountHolderNumber;
    protected String saleIndicator;
    protected String dealNumber;
    protected BigInteger collectingAgencyIataNum;
    protected String serviceChargeIndicator;
    protected String fopStatus;
    protected String fopEdiCode;
    protected String fopReportingCode;
    protected String fopPrintedCode;
    protected String fopElecTicketingCode;

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
     * Gets the value of the fopMapTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopMapTable() {
        return fopMapTable;
    }

    /**
     * Sets the value of the fopMapTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopMapTable(String value) {
        this.fopMapTable = value;
    }

    /**
     * Gets the value of the fopBillingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopBillingCode() {
        return fopBillingCode;
    }

    /**
     * Sets the value of the fopBillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopBillingCode(String value) {
        this.fopBillingCode = value;
    }

    /**
     * Gets the value of the accountHolderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderNumber() {
        return accountHolderNumber;
    }

    /**
     * Sets the value of the accountHolderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderNumber(String value) {
        this.accountHolderNumber = value;
    }

    /**
     * Gets the value of the saleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleIndicator() {
        return saleIndicator;
    }

    /**
     * Sets the value of the saleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleIndicator(String value) {
        this.saleIndicator = value;
    }

    /**
     * Gets the value of the dealNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealNumber() {
        return dealNumber;
    }

    /**
     * Sets the value of the dealNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealNumber(String value) {
        this.dealNumber = value;
    }

    /**
     * Gets the value of the collectingAgencyIataNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCollectingAgencyIataNum() {
        return collectingAgencyIataNum;
    }

    /**
     * Sets the value of the collectingAgencyIataNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCollectingAgencyIataNum(BigInteger value) {
        this.collectingAgencyIataNum = value;
    }

    /**
     * Gets the value of the serviceChargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceChargeIndicator() {
        return serviceChargeIndicator;
    }

    /**
     * Sets the value of the serviceChargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceChargeIndicator(String value) {
        this.serviceChargeIndicator = value;
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

    /**
     * Gets the value of the fopEdiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopEdiCode() {
        return fopEdiCode;
    }

    /**
     * Sets the value of the fopEdiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopEdiCode(String value) {
        this.fopEdiCode = value;
    }

    /**
     * Gets the value of the fopReportingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopReportingCode() {
        return fopReportingCode;
    }

    /**
     * Sets the value of the fopReportingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopReportingCode(String value) {
        this.fopReportingCode = value;
    }

    /**
     * Gets the value of the fopPrintedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopPrintedCode() {
        return fopPrintedCode;
    }

    /**
     * Sets the value of the fopPrintedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopPrintedCode(String value) {
        this.fopPrintedCode = value;
    }

    /**
     * Gets the value of the fopElecTicketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopElecTicketingCode() {
        return fopElecTicketingCode;
    }

    /**
     * Sets the value of the fopElecTicketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopElecTicketingCode(String value) {
        this.fopElecTicketingCode = value;
    }

}
