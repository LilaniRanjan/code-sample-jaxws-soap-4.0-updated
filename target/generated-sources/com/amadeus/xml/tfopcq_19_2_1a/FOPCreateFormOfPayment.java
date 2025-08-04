
package com.amadeus.xml.tfopcq_19_2_1a;

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
 *         &lt;element name="transactionContext" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TransactionInformationForTicketingType" minOccurs="0"/>
 *         &lt;element name="bestEffort" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StatusType_222955S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="reservationControlInformation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReservationControlInformationType_182595S" minOccurs="0"/>
 *         &lt;element name="fopGroup" maxOccurs="127">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fopReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ElementManagementSegmentType"/>
 *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="pnrElementAssociation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType_190195S" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SelectionDetailsType" minOccurs="0"/>
 *                   &lt;element name="feeDetailsInfoGroup" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="feeInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SpecificDataInformationType"/>
 *                             &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SelectionDetailsType_197860S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fpProcessingOptions" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StatusType_190200S" minOccurs="0"/>
 *                   &lt;element name="mopDescription" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SequenceDetailsTypeU"/>
 *                             &lt;element name="fopMasterElementReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType" minOccurs="0"/>
 *                             &lt;element name="stakeholderPayerReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInformationType" minOccurs="0"/>
 *                             &lt;element name="mopDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TicketingFormOfPaymentType_223002S"/>
 *                                       &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
 *                                       &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PaymentGroupType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "transactionContext",
    "bestEffort",
    "reservationControlInformation",
    "fopGroup"
})
@XmlRootElement(name = "FOP_CreateFormOfPayment")
public class FOPCreateFormOfPayment {

    protected TransactionInformationForTicketingType transactionContext;
    protected List<StatusType222955S> bestEffort;
    protected ReservationControlInformationType182595S reservationControlInformation;
    @XmlElement(required = true)
    protected List<FOPCreateFormOfPayment.FopGroup> fopGroup;

    /**
     * Gets the value of the transactionContext property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public TransactionInformationForTicketingType getTransactionContext() {
        return transactionContext;
    }

    /**
     * Sets the value of the transactionContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public void setTransactionContext(TransactionInformationForTicketingType value) {
        this.transactionContext = value;
    }

    /**
     * Gets the value of the bestEffort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestEffort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestEffort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType222955S }
     * 
     * 
     */
    public List<StatusType222955S> getBestEffort() {
        if (bestEffort == null) {
            bestEffort = new ArrayList<StatusType222955S>();
        }
        return this.bestEffort;
    }

    /**
     * Gets the value of the reservationControlInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationType182595S }
     *     
     */
    public ReservationControlInformationType182595S getReservationControlInformation() {
        return reservationControlInformation;
    }

    /**
     * Sets the value of the reservationControlInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationType182595S }
     *     
     */
    public void setReservationControlInformation(ReservationControlInformationType182595S value) {
        this.reservationControlInformation = value;
    }

    /**
     * Gets the value of the fopGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fopGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFopGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOPCreateFormOfPayment.FopGroup }
     * 
     * 
     */
    public List<FOPCreateFormOfPayment.FopGroup> getFopGroup() {
        if (fopGroup == null) {
            fopGroup = new ArrayList<FOPCreateFormOfPayment.FopGroup>();
        }
        return this.fopGroup;
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
     *         &lt;element name="fopReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ElementManagementSegmentType"/>
     *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="pnrElementAssociation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType_190195S" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SelectionDetailsType" minOccurs="0"/>
     *         &lt;element name="feeDetailsInfoGroup" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="feeInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SpecificDataInformationType"/>
     *                   &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SelectionDetailsType_197860S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fpProcessingOptions" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StatusType_190200S" minOccurs="0"/>
     *         &lt;element name="mopDescription" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SequenceDetailsTypeU"/>
     *                   &lt;element name="fopMasterElementReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType" minOccurs="0"/>
     *                   &lt;element name="stakeholderPayerReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInformationType" minOccurs="0"/>
     *                   &lt;element name="mopDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TicketingFormOfPaymentType_223002S"/>
     *                             &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
     *                             &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PaymentGroupType" minOccurs="0"/>
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
        "fopReference",
        "passengerAssociation",
        "pnrElementAssociation",
        "pricingTicketingDetails",
        "feeTypeInfo",
        "feeDetailsInfoGroup",
        "fpProcessingOptions",
        "mopDescription"
    })
    public static class FopGroup {

        @XmlElement(required = true)
        protected ElementManagementSegmentType fopReference;
        protected List<ReferenceInformationType> passengerAssociation;
        protected List<ReferenceInfoType190195S> pnrElementAssociation;
        protected PricingTicketingDetailsTypeI pricingTicketingDetails;
        protected SelectionDetailsType feeTypeInfo;
        protected List<FOPCreateFormOfPayment.FopGroup.FeeDetailsInfoGroup> feeDetailsInfoGroup;
        protected StatusType190200S fpProcessingOptions;
        protected List<FOPCreateFormOfPayment.FopGroup.MopDescription> mopDescription;

        /**
         * Gets the value of the fopReference property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public ElementManagementSegmentType getFopReference() {
            return fopReference;
        }

        /**
         * Sets the value of the fopReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public void setFopReference(ElementManagementSegmentType value) {
            this.fopReference = value;
        }

        /**
         * Gets the value of the passengerAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInformationType }
         * 
         * 
         */
        public List<ReferenceInformationType> getPassengerAssociation() {
            if (passengerAssociation == null) {
                passengerAssociation = new ArrayList<ReferenceInformationType>();
            }
            return this.passengerAssociation;
        }

        /**
         * Gets the value of the pnrElementAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pnrElementAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPnrElementAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType190195S }
         * 
         * 
         */
        public List<ReferenceInfoType190195S> getPnrElementAssociation() {
            if (pnrElementAssociation == null) {
                pnrElementAssociation = new ArrayList<ReferenceInfoType190195S>();
            }
            return this.pnrElementAssociation;
        }

        /**
         * Gets the value of the pricingTicketingDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsTypeI }
         *     
         */
        public PricingTicketingDetailsTypeI getPricingTicketingDetails() {
            return pricingTicketingDetails;
        }

        /**
         * Sets the value of the pricingTicketingDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsTypeI }
         *     
         */
        public void setPricingTicketingDetails(PricingTicketingDetailsTypeI value) {
            this.pricingTicketingDetails = value;
        }

        /**
         * Gets the value of the feeTypeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsType }
         *     
         */
        public SelectionDetailsType getFeeTypeInfo() {
            return feeTypeInfo;
        }

        /**
         * Sets the value of the feeTypeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsType }
         *     
         */
        public void setFeeTypeInfo(SelectionDetailsType value) {
            this.feeTypeInfo = value;
        }

        /**
         * Gets the value of the feeDetailsInfoGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeDetailsInfoGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeDetailsInfoGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FOPCreateFormOfPayment.FopGroup.FeeDetailsInfoGroup }
         * 
         * 
         */
        public List<FOPCreateFormOfPayment.FopGroup.FeeDetailsInfoGroup> getFeeDetailsInfoGroup() {
            if (feeDetailsInfoGroup == null) {
                feeDetailsInfoGroup = new ArrayList<FOPCreateFormOfPayment.FopGroup.FeeDetailsInfoGroup>();
            }
            return this.feeDetailsInfoGroup;
        }

        /**
         * Gets the value of the fpProcessingOptions property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType190200S }
         *     
         */
        public StatusType190200S getFpProcessingOptions() {
            return fpProcessingOptions;
        }

        /**
         * Sets the value of the fpProcessingOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType190200S }
         *     
         */
        public void setFpProcessingOptions(StatusType190200S value) {
            this.fpProcessingOptions = value;
        }

        /**
         * Gets the value of the mopDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mopDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMopDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FOPCreateFormOfPayment.FopGroup.MopDescription }
         * 
         * 
         */
        public List<FOPCreateFormOfPayment.FopGroup.MopDescription> getMopDescription() {
            if (mopDescription == null) {
                mopDescription = new ArrayList<FOPCreateFormOfPayment.FopGroup.MopDescription>();
            }
            return this.mopDescription;
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
         *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SpecificDataInformationType"/>
         *         &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SelectionDetailsType_197860S" minOccurs="0"/>
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
            "feeInfo",
            "feeProcessingInfo"
        })
        public static class FeeDetailsInfoGroup {

            @XmlElement(required = true)
            protected SpecificDataInformationType feeInfo;
            protected SelectionDetailsType197860S feeProcessingInfo;

            /**
             * Gets the value of the feeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public SpecificDataInformationType getFeeInfo() {
                return feeInfo;
            }

            /**
             * Sets the value of the feeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public void setFeeInfo(SpecificDataInformationType value) {
                this.feeInfo = value;
            }

            /**
             * Gets the value of the feeProcessingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetailsType197860S }
             *     
             */
            public SelectionDetailsType197860S getFeeProcessingInfo() {
                return feeProcessingInfo;
            }

            /**
             * Sets the value of the feeProcessingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetailsType197860S }
             *     
             */
            public void setFeeProcessingInfo(SelectionDetailsType197860S value) {
                this.feeProcessingInfo = value;
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
         *         &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}SequenceDetailsTypeU"/>
         *         &lt;element name="fopMasterElementReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType" minOccurs="0"/>
         *         &lt;element name="stakeholderPayerReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInformationType" minOccurs="0"/>
         *         &lt;element name="mopDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TicketingFormOfPaymentType_223002S"/>
         *                   &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
         *                   &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PaymentGroupType" minOccurs="0"/>
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
            "fopSequenceNumber",
            "fopMasterElementReference",
            "stakeholderPayerReference",
            "mopDetails",
            "paymentModule"
        })
        public static class MopDescription {

            @XmlElement(required = true)
            protected SequenceDetailsTypeU fopSequenceNumber;
            protected ReferenceInfoType fopMasterElementReference;
            protected ReferenceInformationType stakeholderPayerReference;
            protected FOPCreateFormOfPayment.FopGroup.MopDescription.MopDetails mopDetails;
            protected PaymentGroupType paymentModule;

            /**
             * Gets the value of the fopSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link SequenceDetailsTypeU }
             *     
             */
            public SequenceDetailsTypeU getFopSequenceNumber() {
                return fopSequenceNumber;
            }

            /**
             * Sets the value of the fopSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link SequenceDetailsTypeU }
             *     
             */
            public void setFopSequenceNumber(SequenceDetailsTypeU value) {
                this.fopSequenceNumber = value;
            }

            /**
             * Gets the value of the fopMasterElementReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getFopMasterElementReference() {
                return fopMasterElementReference;
            }

            /**
             * Sets the value of the fopMasterElementReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setFopMasterElementReference(ReferenceInfoType value) {
                this.fopMasterElementReference = value;
            }

            /**
             * Gets the value of the stakeholderPayerReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformationType }
             *     
             */
            public ReferenceInformationType getStakeholderPayerReference() {
                return stakeholderPayerReference;
            }

            /**
             * Sets the value of the stakeholderPayerReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformationType }
             *     
             */
            public void setStakeholderPayerReference(ReferenceInformationType value) {
                this.stakeholderPayerReference = value;
            }

            /**
             * Gets the value of the mopDetails property.
             * 
             * @return
             *     possible object is
             *     {@link FOPCreateFormOfPayment.FopGroup.MopDescription.MopDetails }
             *     
             */
            public FOPCreateFormOfPayment.FopGroup.MopDescription.MopDetails getMopDetails() {
                return mopDetails;
            }

            /**
             * Sets the value of the mopDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FOPCreateFormOfPayment.FopGroup.MopDescription.MopDetails }
             *     
             */
            public void setMopDetails(FOPCreateFormOfPayment.FopGroup.MopDescription.MopDetails value) {
                this.mopDetails = value;
            }

            /**
             * Gets the value of the paymentModule property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentGroupType }
             *     
             */
            public PaymentGroupType getPaymentModule() {
                return paymentModule;
            }

            /**
             * Sets the value of the paymentModule property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentGroupType }
             *     
             */
            public void setPaymentModule(PaymentGroupType value) {
                this.paymentModule = value;
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
             *         &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TicketingFormOfPaymentType_223002S"/>
             *         &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
             *         &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
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
                "fopPNRDetails",
                "oldFopFreeflow",
                "pnrSupplementaryData"
            })
            public static class MopDetails {

                @XmlElement(required = true)
                protected TicketingFormOfPaymentType223002S fopPNRDetails;
                protected FreeTextInformationType202263S oldFopFreeflow;
                protected List<PNRSupplementaryDataType> pnrSupplementaryData;

                /**
                 * Gets the value of the fopPNRDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketingFormOfPaymentType223002S }
                 *     
                 */
                public TicketingFormOfPaymentType223002S getFopPNRDetails() {
                    return fopPNRDetails;
                }

                /**
                 * Sets the value of the fopPNRDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketingFormOfPaymentType223002S }
                 *     
                 */
                public void setFopPNRDetails(TicketingFormOfPaymentType223002S value) {
                    this.fopPNRDetails = value;
                }

                /**
                 * Gets the value of the oldFopFreeflow property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType202263S }
                 *     
                 */
                public FreeTextInformationType202263S getOldFopFreeflow() {
                    return oldFopFreeflow;
                }

                /**
                 * Sets the value of the oldFopFreeflow property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType202263S }
                 *     
                 */
                public void setOldFopFreeflow(FreeTextInformationType202263S value) {
                    this.oldFopFreeflow = value;
                }

                /**
                 * Gets the value of the pnrSupplementaryData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pnrSupplementaryData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPnrSupplementaryData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRSupplementaryDataType }
                 * 
                 * 
                 */
                public List<PNRSupplementaryDataType> getPnrSupplementaryData() {
                    if (pnrSupplementaryData == null) {
                        pnrSupplementaryData = new ArrayList<PNRSupplementaryDataType>();
                    }
                    return this.pnrSupplementaryData;
                }

            }

        }

    }

}
