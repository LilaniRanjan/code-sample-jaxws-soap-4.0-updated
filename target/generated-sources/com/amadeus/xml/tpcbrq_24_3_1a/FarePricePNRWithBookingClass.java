
package com.amadeus.xml.tpcbrq_24_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="stakeholder" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}StakeholderGroup" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="pricingOptionGroup" maxOccurs="999">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}PricingOptionKeyType"/>
 *                   &lt;element name="optionDetail" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}AttributeType" minOccurs="0"/>
 *                   &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}TransportIdentifierType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}CurrenciesType" minOccurs="0"/>
 *                   &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}MonetaryInformationType" minOccurs="0"/>
 *                   &lt;element name="taxInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}DutyTaxFeeDetailsType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="dateInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="frequentFlyerInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
 *                   &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}FormOfPaymentType" minOccurs="0"/>
 *                   &lt;element name="locationInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}PlaceLocationIdentificationType" minOccurs="0"/>
 *                   &lt;element name="paxSegTstReference" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}ReferenceInfoType" minOccurs="0"/>
 *                   &lt;element name="offerReferences" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}OfferReferencesType" minOccurs="0"/>
 *                   &lt;element name="elementManagementData" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}ElementManagementSegmentType" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "stakeholder",
    "pricingOptionGroup"
})
@XmlRootElement(name = "Fare_PricePNRWithBookingClass")
public class FarePricePNRWithBookingClass {

    protected List<StakeholderGroup> stakeholder;
    @XmlElement(required = true)
    protected List<FarePricePNRWithBookingClass.PricingOptionGroup> pricingOptionGroup;

    /**
     * Gets the value of the stakeholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StakeholderGroup }
     * 
     * 
     */
    public List<StakeholderGroup> getStakeholder() {
        if (stakeholder == null) {
            stakeholder = new ArrayList<StakeholderGroup>();
        }
        return this.stakeholder;
    }

    /**
     * Gets the value of the pricingOptionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingOptionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingOptionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.PricingOptionGroup }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.PricingOptionGroup> getPricingOptionGroup() {
        if (pricingOptionGroup == null) {
            pricingOptionGroup = new ArrayList<FarePricePNRWithBookingClass.PricingOptionGroup>();
        }
        return this.pricingOptionGroup;
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
     *         &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}PricingOptionKeyType"/>
     *         &lt;element name="optionDetail" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}AttributeType" minOccurs="0"/>
     *         &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}TransportIdentifierType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}CurrenciesType" minOccurs="0"/>
     *         &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
     *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}MonetaryInformationType" minOccurs="0"/>
     *         &lt;element name="taxInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}DutyTaxFeeDetailsType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="dateInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="frequentFlyerInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
     *         &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}FormOfPaymentType" minOccurs="0"/>
     *         &lt;element name="locationInformation" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}PlaceLocationIdentificationType" minOccurs="0"/>
     *         &lt;element name="paxSegTstReference" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}ReferenceInfoType" minOccurs="0"/>
     *         &lt;element name="offerReferences" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}OfferReferencesType" minOccurs="0"/>
     *         &lt;element name="elementManagementData" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}ElementManagementSegmentType" maxOccurs="99" minOccurs="0"/>
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
        "pricingOptionKey",
        "optionDetail",
        "carrierInformation",
        "currency",
        "penDisInformation",
        "monetaryInformation",
        "taxInformation",
        "dateInformation",
        "frequentFlyerInformation",
        "formOfPaymentInformation",
        "locationInformation",
        "paxSegTstReference",
        "offerReferences",
        "elementManagementData"
    })
    public static class PricingOptionGroup {

        @XmlElement(required = true)
        protected PricingOptionKeyType pricingOptionKey;
        protected AttributeType optionDetail;
        protected TransportIdentifierType carrierInformation;
        protected CurrenciesType currency;
        protected DiscountAndPenaltyInformationType penDisInformation;
        protected MonetaryInformationType monetaryInformation;
        protected List<DutyTaxFeeDetailsType> taxInformation;
        protected List<StructuredDateTimeInformationType> dateInformation;
        protected FrequentTravellerIdentificationCodeType frequentFlyerInformation;
        protected FormOfPaymentType formOfPaymentInformation;
        protected PlaceLocationIdentificationType locationInformation;
        protected ReferenceInfoType paxSegTstReference;
        protected OfferReferencesType offerReferences;
        protected List<ElementManagementSegmentType> elementManagementData;

        /**
         * Gets the value of the pricingOptionKey property.
         * 
         * @return
         *     possible object is
         *     {@link PricingOptionKeyType }
         *     
         */
        public PricingOptionKeyType getPricingOptionKey() {
            return pricingOptionKey;
        }

        /**
         * Sets the value of the pricingOptionKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingOptionKeyType }
         *     
         */
        public void setPricingOptionKey(PricingOptionKeyType value) {
            this.pricingOptionKey = value;
        }

        /**
         * Gets the value of the optionDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType }
         *     
         */
        public AttributeType getOptionDetail() {
            return optionDetail;
        }

        /**
         * Sets the value of the optionDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType }
         *     
         */
        public void setOptionDetail(AttributeType value) {
            this.optionDetail = value;
        }

        /**
         * Gets the value of the carrierInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TransportIdentifierType }
         *     
         */
        public TransportIdentifierType getCarrierInformation() {
            return carrierInformation;
        }

        /**
         * Sets the value of the carrierInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportIdentifierType }
         *     
         */
        public void setCarrierInformation(TransportIdentifierType value) {
            this.carrierInformation = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrenciesType }
         *     
         */
        public CurrenciesType getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrenciesType }
         *     
         */
        public void setCurrency(CurrenciesType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the penDisInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public DiscountAndPenaltyInformationType getPenDisInformation() {
            return penDisInformation;
        }

        /**
         * Sets the value of the penDisInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public void setPenDisInformation(DiscountAndPenaltyInformationType value) {
            this.penDisInformation = value;
        }

        /**
         * Gets the value of the monetaryInformation property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getMonetaryInformation() {
            return monetaryInformation;
        }

        /**
         * Sets the value of the monetaryInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setMonetaryInformation(MonetaryInformationType value) {
            this.monetaryInformation = value;
        }

        /**
         * Gets the value of the taxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DutyTaxFeeDetailsType }
         * 
         * 
         */
        public List<DutyTaxFeeDetailsType> getTaxInformation() {
            if (taxInformation == null) {
                taxInformation = new ArrayList<DutyTaxFeeDetailsType>();
            }
            return this.taxInformation;
        }

        /**
         * Gets the value of the dateInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getDateInformation() {
            if (dateInformation == null) {
                dateInformation = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.dateInformation;
        }

        /**
         * Gets the value of the frequentFlyerInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public FrequentTravellerIdentificationCodeType getFrequentFlyerInformation() {
            return frequentFlyerInformation;
        }

        /**
         * Sets the value of the frequentFlyerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public void setFrequentFlyerInformation(FrequentTravellerIdentificationCodeType value) {
            this.frequentFlyerInformation = value;
        }

        /**
         * Gets the value of the formOfPaymentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentType }
         *     
         */
        public FormOfPaymentType getFormOfPaymentInformation() {
            return formOfPaymentInformation;
        }

        /**
         * Sets the value of the formOfPaymentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentType }
         *     
         */
        public void setFormOfPaymentInformation(FormOfPaymentType value) {
            this.formOfPaymentInformation = value;
        }

        /**
         * Gets the value of the locationInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public PlaceLocationIdentificationType getLocationInformation() {
            return locationInformation;
        }

        /**
         * Sets the value of the locationInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public void setLocationInformation(PlaceLocationIdentificationType value) {
            this.locationInformation = value;
        }

        /**
         * Gets the value of the paxSegTstReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getPaxSegTstReference() {
            return paxSegTstReference;
        }

        /**
         * Sets the value of the paxSegTstReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setPaxSegTstReference(ReferenceInfoType value) {
            this.paxSegTstReference = value;
        }

        /**
         * Gets the value of the offerReferences property.
         * 
         * @return
         *     possible object is
         *     {@link OfferReferencesType }
         *     
         */
        public OfferReferencesType getOfferReferences() {
            return offerReferences;
        }

        /**
         * Sets the value of the offerReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferReferencesType }
         *     
         */
        public void setOfferReferences(OfferReferencesType value) {
            this.offerReferences = value;
        }

        /**
         * Gets the value of the elementManagementData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elementManagementData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElementManagementData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ElementManagementSegmentType }
         * 
         * 
         */
        public List<ElementManagementSegmentType> getElementManagementData() {
            if (elementManagementData == null) {
                elementManagementData = new ArrayList<ElementManagementSegmentType>();
            }
            return this.elementManagementData;
        }

    }

}
