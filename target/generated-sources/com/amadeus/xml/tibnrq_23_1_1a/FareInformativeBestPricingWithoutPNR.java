
package com.amadeus.xml.tibnrq_23_1_1a;

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
 *         &lt;element name="originatorGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="additionalBusinessInformation" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="passengersGroup" maxOccurs="198">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}SegmentRepetitionControlTypeI"/>
 *                   &lt;element name="travellersID" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}SpecificTravellerTypeI" minOccurs="0"/>
 *                   &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}FareInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="segmentGroup" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}TravelProductInformationTypeI"/>
 *                   &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="inventory" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}ProductInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pricingOptionGroup" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}PricingOptionGroup" maxOccurs="999" minOccurs="0"/>
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
    "originatorGroup",
    "passengersGroup",
    "segmentGroup",
    "pricingOptionGroup"
})
@XmlRootElement(name = "Fare_InformativeBestPricingWithoutPNR")
public class FareInformativeBestPricingWithoutPNR {

    protected FareInformativeBestPricingWithoutPNR.OriginatorGroup originatorGroup;
    @XmlElement(required = true)
    protected List<FareInformativeBestPricingWithoutPNR.PassengersGroup> passengersGroup;
    @XmlElement(required = true)
    protected List<FareInformativeBestPricingWithoutPNR.SegmentGroup> segmentGroup;
    protected List<PricingOptionGroup> pricingOptionGroup;

    /**
     * Gets the value of the originatorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformativeBestPricingWithoutPNR.OriginatorGroup }
     *     
     */
    public FareInformativeBestPricingWithoutPNR.OriginatorGroup getOriginatorGroup() {
        return originatorGroup;
    }

    /**
     * Sets the value of the originatorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformativeBestPricingWithoutPNR.OriginatorGroup }
     *     
     */
    public void setOriginatorGroup(FareInformativeBestPricingWithoutPNR.OriginatorGroup value) {
        this.originatorGroup = value;
    }

    /**
     * Gets the value of the passengersGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengersGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengersGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInformativeBestPricingWithoutPNR.PassengersGroup }
     * 
     * 
     */
    public List<FareInformativeBestPricingWithoutPNR.PassengersGroup> getPassengersGroup() {
        if (passengersGroup == null) {
            passengersGroup = new ArrayList<FareInformativeBestPricingWithoutPNR.PassengersGroup>();
        }
        return this.passengersGroup;
    }

    /**
     * Gets the value of the segmentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInformativeBestPricingWithoutPNR.SegmentGroup }
     * 
     * 
     */
    public List<FareInformativeBestPricingWithoutPNR.SegmentGroup> getSegmentGroup() {
        if (segmentGroup == null) {
            segmentGroup = new ArrayList<FareInformativeBestPricingWithoutPNR.SegmentGroup>();
        }
        return this.segmentGroup;
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
     * {@link PricingOptionGroup }
     * 
     * 
     */
    public List<PricingOptionGroup> getPricingOptionGroup() {
        if (pricingOptionGroup == null) {
            pricingOptionGroup = new ArrayList<PricingOptionGroup>();
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
     *         &lt;element name="additionalBusinessInformation" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
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
        "additionalBusinessInformation"
    })
    public static class OriginatorGroup {

        protected AdditionalBusinessSourceInformationTypeI additionalBusinessInformation;

        /**
         * Gets the value of the additionalBusinessInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalBusinessSourceInformationTypeI }
         *     
         */
        public AdditionalBusinessSourceInformationTypeI getAdditionalBusinessInformation() {
            return additionalBusinessInformation;
        }

        /**
         * Sets the value of the additionalBusinessInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalBusinessSourceInformationTypeI }
         *     
         */
        public void setAdditionalBusinessInformation(AdditionalBusinessSourceInformationTypeI value) {
            this.additionalBusinessInformation = value;
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
     *         &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}SegmentRepetitionControlTypeI"/>
     *         &lt;element name="travellersID" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}SpecificTravellerTypeI" minOccurs="0"/>
     *         &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}FareInformationTypeI" minOccurs="0"/>
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
        "segmentRepetitionControl",
        "travellersID",
        "discountPtc"
    })
    public static class PassengersGroup {

        @XmlElement(required = true)
        protected SegmentRepetitionControlTypeI segmentRepetitionControl;
        protected SpecificTravellerTypeI travellersID;
        protected FareInformationTypeI discountPtc;

        /**
         * Gets the value of the segmentRepetitionControl property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentRepetitionControlTypeI }
         *     
         */
        public SegmentRepetitionControlTypeI getSegmentRepetitionControl() {
            return segmentRepetitionControl;
        }

        /**
         * Sets the value of the segmentRepetitionControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentRepetitionControlTypeI }
         *     
         */
        public void setSegmentRepetitionControl(SegmentRepetitionControlTypeI value) {
            this.segmentRepetitionControl = value;
        }

        /**
         * Gets the value of the travellersID property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificTravellerTypeI }
         *     
         */
        public SpecificTravellerTypeI getTravellersID() {
            return travellersID;
        }

        /**
         * Sets the value of the travellersID property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificTravellerTypeI }
         *     
         */
        public void setTravellersID(SpecificTravellerTypeI value) {
            this.travellersID = value;
        }

        /**
         * Gets the value of the discountPtc property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationTypeI }
         *     
         */
        public FareInformationTypeI getDiscountPtc() {
            return discountPtc;
        }

        /**
         * Sets the value of the discountPtc property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationTypeI }
         *     
         */
        public void setDiscountPtc(FareInformationTypeI value) {
            this.discountPtc = value;
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
     *         &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}TravelProductInformationTypeI"/>
     *         &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="inventory" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}ProductInformationTypeI" minOccurs="0"/>
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
        "segmentInformation",
        "additionnalSegmentDetails",
        "inventory"
    })
    public static class SegmentGroup {

        @XmlElement(required = true)
        protected TravelProductInformationTypeI segmentInformation;
        protected AdditionalProductDetailsTypeI additionnalSegmentDetails;
        protected ProductInformationTypeI inventory;

        /**
         * Gets the value of the segmentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public TravelProductInformationTypeI getSegmentInformation() {
            return segmentInformation;
        }

        /**
         * Sets the value of the segmentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public void setSegmentInformation(TravelProductInformationTypeI value) {
            this.segmentInformation = value;
        }

        /**
         * Gets the value of the additionnalSegmentDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public AdditionalProductDetailsTypeI getAdditionnalSegmentDetails() {
            return additionnalSegmentDetails;
        }

        /**
         * Sets the value of the additionnalSegmentDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public void setAdditionnalSegmentDetails(AdditionalProductDetailsTypeI value) {
            this.additionnalSegmentDetails = value;
        }

        /**
         * Gets the value of the inventory property.
         * 
         * @return
         *     possible object is
         *     {@link ProductInformationTypeI }
         *     
         */
        public ProductInformationTypeI getInventory() {
            return inventory;
        }

        /**
         * Sets the value of the inventory property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductInformationTypeI }
         *     
         */
        public void setInventory(ProductInformationTypeI value) {
            this.inventory = value;
        }

    }

}
