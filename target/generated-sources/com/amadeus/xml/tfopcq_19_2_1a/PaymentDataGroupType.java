
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * it will conveys all payment data
 * 
 * <p>Java class for PaymentDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantInformation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CompanyInformationType"/>
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MonetaryInformationType_202047S" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="currenciesRatesGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currenciesExchangeRate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CurrenciesType"/>
 *                   &lt;element name="rateType" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType_197625S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sliderConversion" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SliderConversionType" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ItemReferencesAndVersionsType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="extendedPaymentInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FrequencyTypeU" minOccurs="0"/>
 *         &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType_202239S" minOccurs="0"/>
 *         &lt;element name="expirationPeriod" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}QuantityType" minOccurs="0"/>
 *         &lt;element name="distributionChannelInformation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TerminalIdentificationDescriptionType" minOccurs="0"/>
 *         &lt;element name="purchaseDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FreeTextInformationType_202240S" minOccurs="0"/>
 *         &lt;element name="association" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType_202078S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="fraudScreeningData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FraudScreeningGroupType" minOccurs="0"/>
 *         &lt;element name="paymentDataMap" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataGroupType", propOrder = {
    "merchantInformation",
    "monetaryInformation",
    "currenciesRatesGroup",
    "sliderConversion",
    "paymentId",
    "extendedPaymentInfo",
    "transactionDateTime",
    "expirationPeriod",
    "distributionChannelInformation",
    "purchaseDescription",
    "association",
    "fraudScreeningData",
    "paymentDataMap"
})
public class PaymentDataGroupType {

    @XmlElement(required = true)
    protected CompanyInformationType merchantInformation;
    protected List<MonetaryInformationType202047S> monetaryInformation;
    protected List<PaymentDataGroupType.CurrenciesRatesGroup> currenciesRatesGroup;
    protected SliderConversionType sliderConversion;
    protected List<ItemReferencesAndVersionsType> paymentId;
    protected FrequencyTypeU extendedPaymentInfo;
    protected StructuredDateTimeInformationType202239S transactionDateTime;
    protected QuantityType expirationPeriod;
    protected TerminalIdentificationDescriptionType distributionChannelInformation;
    protected FreeTextInformationType202240S purchaseDescription;
    protected List<ReferenceInfoType202078S> association;
    protected FraudScreeningGroupType fraudScreeningData;
    protected List<AttributeType215546S> paymentDataMap;

    /**
     * Gets the value of the merchantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType }
     *     
     */
    public CompanyInformationType getMerchantInformation() {
        return merchantInformation;
    }

    /**
     * Sets the value of the merchantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType }
     *     
     */
    public void setMerchantInformation(CompanyInformationType value) {
        this.merchantInformation = value;
    }

    /**
     * Gets the value of the monetaryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationType202047S }
     * 
     * 
     */
    public List<MonetaryInformationType202047S> getMonetaryInformation() {
        if (monetaryInformation == null) {
            monetaryInformation = new ArrayList<MonetaryInformationType202047S>();
        }
        return this.monetaryInformation;
    }

    /**
     * Gets the value of the currenciesRatesGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currenciesRatesGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrenciesRatesGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDataGroupType.CurrenciesRatesGroup }
     * 
     * 
     */
    public List<PaymentDataGroupType.CurrenciesRatesGroup> getCurrenciesRatesGroup() {
        if (currenciesRatesGroup == null) {
            currenciesRatesGroup = new ArrayList<PaymentDataGroupType.CurrenciesRatesGroup>();
        }
        return this.currenciesRatesGroup;
    }

    /**
     * Gets the value of the sliderConversion property.
     * 
     * @return
     *     possible object is
     *     {@link SliderConversionType }
     *     
     */
    public SliderConversionType getSliderConversion() {
        return sliderConversion;
    }

    /**
     * Sets the value of the sliderConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SliderConversionType }
     *     
     */
    public void setSliderConversion(SliderConversionType value) {
        this.sliderConversion = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemReferencesAndVersionsType }
     * 
     * 
     */
    public List<ItemReferencesAndVersionsType> getPaymentId() {
        if (paymentId == null) {
            paymentId = new ArrayList<ItemReferencesAndVersionsType>();
        }
        return this.paymentId;
    }

    /**
     * Gets the value of the extendedPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyTypeU }
     *     
     */
    public FrequencyTypeU getExtendedPaymentInfo() {
        return extendedPaymentInfo;
    }

    /**
     * Sets the value of the extendedPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyTypeU }
     *     
     */
    public void setExtendedPaymentInfo(FrequencyTypeU value) {
        this.extendedPaymentInfo = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType202239S }
     *     
     */
    public StructuredDateTimeInformationType202239S getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType202239S }
     *     
     */
    public void setTransactionDateTime(StructuredDateTimeInformationType202239S value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the expirationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Sets the value of the expirationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setExpirationPeriod(QuantityType value) {
        this.expirationPeriod = value;
    }

    /**
     * Gets the value of the distributionChannelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentificationDescriptionType }
     *     
     */
    public TerminalIdentificationDescriptionType getDistributionChannelInformation() {
        return distributionChannelInformation;
    }

    /**
     * Sets the value of the distributionChannelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentificationDescriptionType }
     *     
     */
    public void setDistributionChannelInformation(TerminalIdentificationDescriptionType value) {
        this.distributionChannelInformation = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType202240S }
     *     
     */
    public FreeTextInformationType202240S getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType202240S }
     *     
     */
    public void setPurchaseDescription(FreeTextInformationType202240S value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType202078S }
     * 
     * 
     */
    public List<ReferenceInfoType202078S> getAssociation() {
        if (association == null) {
            association = new ArrayList<ReferenceInfoType202078S>();
        }
        return this.association;
    }

    /**
     * Gets the value of the fraudScreeningData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public FraudScreeningGroupType getFraudScreeningData() {
        return fraudScreeningData;
    }

    /**
     * Sets the value of the fraudScreeningData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public void setFraudScreeningData(FraudScreeningGroupType value) {
        this.fraudScreeningData = value;
    }

    /**
     * Gets the value of the paymentDataMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDataMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDataMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType215546S }
     * 
     * 
     */
    public List<AttributeType215546S> getPaymentDataMap() {
        if (paymentDataMap == null) {
            paymentDataMap = new ArrayList<AttributeType215546S>();
        }
        return this.paymentDataMap;
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
     *         &lt;element name="currenciesExchangeRate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CurrenciesType"/>
     *         &lt;element name="rateType" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType_197625S"/>
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
        "currenciesExchangeRate",
        "rateType"
    })
    public static class CurrenciesRatesGroup {

        @XmlElement(required = true)
        protected CurrenciesType currenciesExchangeRate;
        @XmlElement(required = true)
        protected CodedAttributeType197625S rateType;

        /**
         * Gets the value of the currenciesExchangeRate property.
         * 
         * @return
         *     possible object is
         *     {@link CurrenciesType }
         *     
         */
        public CurrenciesType getCurrenciesExchangeRate() {
            return currenciesExchangeRate;
        }

        /**
         * Sets the value of the currenciesExchangeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrenciesType }
         *     
         */
        public void setCurrenciesExchangeRate(CurrenciesType value) {
            this.currenciesExchangeRate = value;
        }

        /**
         * Gets the value of the rateType property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType197625S }
         *     
         */
        public CodedAttributeType197625S getRateType() {
            return rateType;
        }

        /**
         * Sets the value of the rateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType197625S }
         *     
         */
        public void setRateType(CodedAttributeType197625S value) {
            this.rateType = value;
        }

    }

}
