
package com.amadeus.xml.tfopcr_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all the detailed payment status related to credit Card
 * 
 * <p>Java class for CreditCardStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardStatusGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorisationSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SpecificVisaLinkCreditCardInformationType"/>
 *         &lt;element name="approvalDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}GenericAuthorisationResultType" minOccurs="0"/>
 *         &lt;element name="localDateTime" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeInformationType_202270S" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="authorisationInformation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TransactionInformationForTicketingType" minOccurs="0"/>
 *         &lt;element name="browserData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="browserProperties" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}BrowserInformationType"/>
 *                   &lt;element name="freeFlowBrowserData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_215562S" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tdsInformation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ThreeDomainSecureGroupType" minOccurs="0"/>
 *         &lt;element name="cardSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AttributeType_202252S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType_253648G" maxOccurs="7" minOccurs="0"/>
 *         &lt;element name="schemeAuthenticationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schemeCompany" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CompanyInformationType_40602S"/>
 *                   &lt;element name="schemeDataElement" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AttributeType_215546S" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardStatusGroupType", propOrder = {
    "authorisationSupplementaryData",
    "approvalDetails",
    "localDateTime",
    "authorisationInformation",
    "browserData",
    "tdsInformation",
    "cardSupplementaryData",
    "transactionStatus",
    "schemeAuthenticationData"
})
public class CreditCardStatusGroupType {

    @XmlElement(required = true)
    protected SpecificVisaLinkCreditCardInformationType authorisationSupplementaryData;
    protected GenericAuthorisationResultType approvalDetails;
    protected List<StructuredDateTimeInformationType202270S> localDateTime;
    protected TransactionInformationForTicketingType authorisationInformation;
    protected CreditCardStatusGroupType.BrowserData browserData;
    protected ThreeDomainSecureGroupType tdsInformation;
    protected List<AttributeType202252S> cardSupplementaryData;
    protected List<ErrorGroupType253648G> transactionStatus;
    protected CreditCardStatusGroupType.SchemeAuthenticationData schemeAuthenticationData;

    /**
     * Gets the value of the authorisationSupplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificVisaLinkCreditCardInformationType }
     *     
     */
    public SpecificVisaLinkCreditCardInformationType getAuthorisationSupplementaryData() {
        return authorisationSupplementaryData;
    }

    /**
     * Sets the value of the authorisationSupplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificVisaLinkCreditCardInformationType }
     *     
     */
    public void setAuthorisationSupplementaryData(SpecificVisaLinkCreditCardInformationType value) {
        this.authorisationSupplementaryData = value;
    }

    /**
     * Gets the value of the approvalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public GenericAuthorisationResultType getApprovalDetails() {
        return approvalDetails;
    }

    /**
     * Sets the value of the approvalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public void setApprovalDetails(GenericAuthorisationResultType value) {
        this.approvalDetails = value;
    }

    /**
     * Gets the value of the localDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformationType202270S }
     * 
     * 
     */
    public List<StructuredDateTimeInformationType202270S> getLocalDateTime() {
        if (localDateTime == null) {
            localDateTime = new ArrayList<StructuredDateTimeInformationType202270S>();
        }
        return this.localDateTime;
    }

    /**
     * Gets the value of the authorisationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public TransactionInformationForTicketingType getAuthorisationInformation() {
        return authorisationInformation;
    }

    /**
     * Sets the value of the authorisationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public void setAuthorisationInformation(TransactionInformationForTicketingType value) {
        this.authorisationInformation = value;
    }

    /**
     * Gets the value of the browserData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType.BrowserData }
     *     
     */
    public CreditCardStatusGroupType.BrowserData getBrowserData() {
        return browserData;
    }

    /**
     * Sets the value of the browserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType.BrowserData }
     *     
     */
    public void setBrowserData(CreditCardStatusGroupType.BrowserData value) {
        this.browserData = value;
    }

    /**
     * Gets the value of the tdsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDomainSecureGroupType }
     *     
     */
    public ThreeDomainSecureGroupType getTdsInformation() {
        return tdsInformation;
    }

    /**
     * Sets the value of the tdsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDomainSecureGroupType }
     *     
     */
    public void setTdsInformation(ThreeDomainSecureGroupType value) {
        this.tdsInformation = value;
    }

    /**
     * Gets the value of the cardSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType202252S }
     * 
     * 
     */
    public List<AttributeType202252S> getCardSupplementaryData() {
        if (cardSupplementaryData == null) {
            cardSupplementaryData = new ArrayList<AttributeType202252S>();
        }
        return this.cardSupplementaryData;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType253648G }
     * 
     * 
     */
    public List<ErrorGroupType253648G> getTransactionStatus() {
        if (transactionStatus == null) {
            transactionStatus = new ArrayList<ErrorGroupType253648G>();
        }
        return this.transactionStatus;
    }

    /**
     * Gets the value of the schemeAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType.SchemeAuthenticationData }
     *     
     */
    public CreditCardStatusGroupType.SchemeAuthenticationData getSchemeAuthenticationData() {
        return schemeAuthenticationData;
    }

    /**
     * Sets the value of the schemeAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType.SchemeAuthenticationData }
     *     
     */
    public void setSchemeAuthenticationData(CreditCardStatusGroupType.SchemeAuthenticationData value) {
        this.schemeAuthenticationData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="browserProperties" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}BrowserInformationType"/>
     *         &lt;element name="freeFlowBrowserData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_215562S" maxOccurs="2" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "browserProperties",
        "freeFlowBrowserData"
    })
    public static class BrowserData {

        @XmlElement(required = true)
        protected BrowserInformationType browserProperties;
        protected List<FreeTextInformationType215562S> freeFlowBrowserData;

        /**
         * Gets the value of the browserProperties property.
         * 
         * @return
         *     possible object is
         *     {@link BrowserInformationType }
         *     
         */
        public BrowserInformationType getBrowserProperties() {
            return browserProperties;
        }

        /**
         * Sets the value of the browserProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrowserInformationType }
         *     
         */
        public void setBrowserProperties(BrowserInformationType value) {
            this.browserProperties = value;
        }

        /**
         * Gets the value of the freeFlowBrowserData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeFlowBrowserData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeFlowBrowserData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType215562S }
         * 
         * 
         */
        public List<FreeTextInformationType215562S> getFreeFlowBrowserData() {
            if (freeFlowBrowserData == null) {
                freeFlowBrowserData = new ArrayList<FreeTextInformationType215562S>();
            }
            return this.freeFlowBrowserData;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="schemeCompany" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CompanyInformationType_40602S"/>
     *         &lt;element name="schemeDataElement" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AttributeType_215546S" maxOccurs="99"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "schemeCompany",
        "schemeDataElement"
    })
    public static class SchemeAuthenticationData {

        @XmlElement(required = true)
        protected CompanyInformationType40602S schemeCompany;
        @XmlElement(required = true)
        protected List<AttributeType215546S> schemeDataElement;

        /**
         * Gets the value of the schemeCompany property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformationType40602S }
         *     
         */
        public CompanyInformationType40602S getSchemeCompany() {
            return schemeCompany;
        }

        /**
         * Sets the value of the schemeCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformationType40602S }
         *     
         */
        public void setSchemeCompany(CompanyInformationType40602S value) {
            this.schemeCompany = value;
        }

        /**
         * Gets the value of the schemeDataElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schemeDataElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchemeDataElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType215546S }
         * 
         * 
         */
        public List<AttributeType215546S> getSchemeDataElement() {
            if (schemeDataElement == null) {
                schemeDataElement = new ArrayList<AttributeType215546S>();
            }
            return this.schemeDataElement;
        }

    }

}
