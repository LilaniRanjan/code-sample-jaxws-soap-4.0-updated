
package com.amadeus.xml.tfopcr_19_2_1a;

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
 *         &lt;element name="transmissionError" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType_96608G" minOccurs="0"/>
 *         &lt;element name="fopDescription" maxOccurs="127" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fopReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ElementManagementSegmentType"/>
 *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="pnrElementAssociation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType_190198S" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="additionalMonetaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CodedAttributeType" minOccurs="0"/>
 *                   &lt;element name="freeFlowFop" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
 *                   &lt;element name="fpElementError" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType_96609G" minOccurs="0"/>
 *                   &lt;element name="mopDescription" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SequenceDetailsType"/>
 *                             &lt;element name="fopMasterElementReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType" minOccurs="0"/>
 *                             &lt;element name="stakeholderPayerReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInformationType" minOccurs="0"/>
 *                             &lt;element name="mopDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TicketingFormOfPaymentType_223002S"/>
 *                                       &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
 *                                       &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mopElementError" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType" minOccurs="0"/>
 *                             &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PaymentGroupType" minOccurs="0"/>
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
    "transmissionError",
    "fopDescription"
})
@XmlRootElement(name = "FOP_CreateFormOfPaymentReply")
public class FOPCreateFormOfPaymentReply {

    protected ErrorGroupType96608G transmissionError;
    protected List<FOPCreateFormOfPaymentReply.FopDescription> fopDescription;

    /**
     * Gets the value of the transmissionError property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType96608G }
     *     
     */
    public ErrorGroupType96608G getTransmissionError() {
        return transmissionError;
    }

    /**
     * Sets the value of the transmissionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType96608G }
     *     
     */
    public void setTransmissionError(ErrorGroupType96608G value) {
        this.transmissionError = value;
    }

    /**
     * Gets the value of the fopDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fopDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFopDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOPCreateFormOfPaymentReply.FopDescription }
     * 
     * 
     */
    public List<FOPCreateFormOfPaymentReply.FopDescription> getFopDescription() {
        if (fopDescription == null) {
            fopDescription = new ArrayList<FOPCreateFormOfPaymentReply.FopDescription>();
        }
        return this.fopDescription;
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
     *         &lt;element name="fopReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ElementManagementSegmentType"/>
     *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="pnrElementAssociation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType_190198S" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="additionalMonetaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CodedAttributeType" minOccurs="0"/>
     *         &lt;element name="freeFlowFop" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
     *         &lt;element name="fpElementError" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType_96609G" minOccurs="0"/>
     *         &lt;element name="mopDescription" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SequenceDetailsType"/>
     *                   &lt;element name="fopMasterElementReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType" minOccurs="0"/>
     *                   &lt;element name="stakeholderPayerReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInformationType" minOccurs="0"/>
     *                   &lt;element name="mopDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TicketingFormOfPaymentType_223002S"/>
     *                             &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
     *                             &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mopElementError" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType" minOccurs="0"/>
     *                   &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PaymentGroupType" minOccurs="0"/>
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
        "additionalMonetaryData",
        "freeFlowFop",
        "fpElementError",
        "mopDescription"
    })
    public static class FopDescription {

        @XmlElement(required = true)
        protected ElementManagementSegmentType fopReference;
        protected List<ReferenceInformationType> passengerAssociation;
        protected List<ReferenceInfoType190198S> pnrElementAssociation;
        protected CodedAttributeType additionalMonetaryData;
        protected FreeTextInformationType202263S freeFlowFop;
        protected ErrorGroupType96609G fpElementError;
        protected List<FOPCreateFormOfPaymentReply.FopDescription.MopDescription> mopDescription;

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
         * {@link ReferenceInfoType190198S }
         * 
         * 
         */
        public List<ReferenceInfoType190198S> getPnrElementAssociation() {
            if (pnrElementAssociation == null) {
                pnrElementAssociation = new ArrayList<ReferenceInfoType190198S>();
            }
            return this.pnrElementAssociation;
        }

        /**
         * Gets the value of the additionalMonetaryData property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getAdditionalMonetaryData() {
            return additionalMonetaryData;
        }

        /**
         * Sets the value of the additionalMonetaryData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setAdditionalMonetaryData(CodedAttributeType value) {
            this.additionalMonetaryData = value;
        }

        /**
         * Gets the value of the freeFlowFop property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformationType202263S }
         *     
         */
        public FreeTextInformationType202263S getFreeFlowFop() {
            return freeFlowFop;
        }

        /**
         * Sets the value of the freeFlowFop property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformationType202263S }
         *     
         */
        public void setFreeFlowFop(FreeTextInformationType202263S value) {
            this.freeFlowFop = value;
        }

        /**
         * Gets the value of the fpElementError property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorGroupType96609G }
         *     
         */
        public ErrorGroupType96609G getFpElementError() {
            return fpElementError;
        }

        /**
         * Sets the value of the fpElementError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorGroupType96609G }
         *     
         */
        public void setFpElementError(ErrorGroupType96609G value) {
            this.fpElementError = value;
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
         * {@link FOPCreateFormOfPaymentReply.FopDescription.MopDescription }
         * 
         * 
         */
        public List<FOPCreateFormOfPaymentReply.FopDescription.MopDescription> getMopDescription() {
            if (mopDescription == null) {
                mopDescription = new ArrayList<FOPCreateFormOfPaymentReply.FopDescription.MopDescription>();
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
         *         &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SequenceDetailsType"/>
         *         &lt;element name="fopMasterElementReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType" minOccurs="0"/>
         *         &lt;element name="stakeholderPayerReference" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInformationType" minOccurs="0"/>
         *         &lt;element name="mopDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TicketingFormOfPaymentType_223002S"/>
         *                   &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
         *                   &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mopElementError" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ErrorGroupType" minOccurs="0"/>
         *         &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PaymentGroupType" minOccurs="0"/>
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
            "mopElementError",
            "paymentModule"
        })
        public static class MopDescription {

            @XmlElement(required = true)
            protected SequenceDetailsType fopSequenceNumber;
            protected ReferenceInfoType fopMasterElementReference;
            protected ReferenceInformationType stakeholderPayerReference;
            protected FOPCreateFormOfPaymentReply.FopDescription.MopDescription.MopDetails mopDetails;
            protected ErrorGroupType mopElementError;
            protected PaymentGroupType paymentModule;

            /**
             * Gets the value of the fopSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link SequenceDetailsType }
             *     
             */
            public SequenceDetailsType getFopSequenceNumber() {
                return fopSequenceNumber;
            }

            /**
             * Sets the value of the fopSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link SequenceDetailsType }
             *     
             */
            public void setFopSequenceNumber(SequenceDetailsType value) {
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
             *     {@link FOPCreateFormOfPaymentReply.FopDescription.MopDescription.MopDetails }
             *     
             */
            public FOPCreateFormOfPaymentReply.FopDescription.MopDescription.MopDetails getMopDetails() {
                return mopDetails;
            }

            /**
             * Sets the value of the mopDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FOPCreateFormOfPaymentReply.FopDescription.MopDescription.MopDetails }
             *     
             */
            public void setMopDetails(FOPCreateFormOfPaymentReply.FopDescription.MopDescription.MopDetails value) {
                this.mopDetails = value;
            }

            /**
             * Gets the value of the mopElementError property.
             * 
             * @return
             *     possible object is
             *     {@link ErrorGroupType }
             *     
             */
            public ErrorGroupType getMopElementError() {
                return mopElementError;
            }

            /**
             * Sets the value of the mopElementError property.
             * 
             * @param value
             *     allowed object is
             *     {@link ErrorGroupType }
             *     
             */
            public void setMopElementError(ErrorGroupType value) {
                this.mopElementError = value;
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
             *         &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TicketingFormOfPaymentType_223002S"/>
             *         &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
             *         &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
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
