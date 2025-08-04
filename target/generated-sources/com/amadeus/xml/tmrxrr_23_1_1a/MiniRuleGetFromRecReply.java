
package com.amadeus.xml.tmrxrr_23_1_1a;

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
 *         &lt;element name="responseDetails" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ResponseAnalysisDetailsType"/>
 *         &lt;element name="errorWarningGroup" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ErrorGroupType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="language" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}LanguageBatchTypeU" minOccurs="0"/>
 *         &lt;element name="mnrByPricingRecord" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingRecordId" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ItemReferencesAndVersionsType"/>
 *                   &lt;element name="errorWarningGroup" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ErrorGroupType" minOccurs="0"/>
 *                   &lt;element name="offerRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ElementManagementSegmentType_104354S" minOccurs="0"/>
 *                   &lt;element name="paxRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInformationType" minOccurs="0"/>
 *                   &lt;element name="paxTypeLoc" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paxCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
 *                             &lt;element name="paxTypeDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fareComponentInfo" maxOccurs="16" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FareQualifierDetailsType"/>
 *                             &lt;element name="fareComponentRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInfoType"/>
 *                             &lt;element name="originAndDestination" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}OriginAndDestinationDetailsTypeI"/>
 *                             &lt;element name="originDestinLoc" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="originDestinCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
 *                                       &lt;element name="originDestinDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="segmentRefernce" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ElementManagementSegmentType" maxOccurs="99"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="listSituation" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="listSituationDum" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="situationCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
 *                             &lt;element name="situationDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mnrRulesInfoGrp" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}MiniRulesRegulPropertiesType" maxOccurs="600" minOccurs="0"/>
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
    "responseDetails",
    "errorWarningGroup",
    "language",
    "mnrByPricingRecord"
})
@XmlRootElement(name = "MiniRule_GetFromRecReply")
public class MiniRuleGetFromRecReply {

    @XmlElement(required = true)
    protected ResponseAnalysisDetailsType responseDetails;
    protected List<ErrorGroupType> errorWarningGroup;
    protected LanguageBatchTypeU language;
    protected List<MiniRuleGetFromRecReply.MnrByPricingRecord> mnrByPricingRecord;

    /**
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAnalysisDetailsType }
     *     
     */
    public ResponseAnalysisDetailsType getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAnalysisDetailsType }
     *     
     */
    public void setResponseDetails(ResponseAnalysisDetailsType value) {
        this.responseDetails = value;
    }

    /**
     * Gets the value of the errorWarningGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorWarningGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorWarningGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType }
     * 
     * 
     */
    public List<ErrorGroupType> getErrorWarningGroup() {
        if (errorWarningGroup == null) {
            errorWarningGroup = new ArrayList<ErrorGroupType>();
        }
        return this.errorWarningGroup;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageBatchTypeU }
     *     
     */
    public LanguageBatchTypeU getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageBatchTypeU }
     *     
     */
    public void setLanguage(LanguageBatchTypeU value) {
        this.language = value;
    }

    /**
     * Gets the value of the mnrByPricingRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrByPricingRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrByPricingRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRuleGetFromRecReply.MnrByPricingRecord }
     * 
     * 
     */
    public List<MiniRuleGetFromRecReply.MnrByPricingRecord> getMnrByPricingRecord() {
        if (mnrByPricingRecord == null) {
            mnrByPricingRecord = new ArrayList<MiniRuleGetFromRecReply.MnrByPricingRecord>();
        }
        return this.mnrByPricingRecord;
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
     *         &lt;element name="pricingRecordId" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ItemReferencesAndVersionsType"/>
     *         &lt;element name="errorWarningGroup" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ErrorGroupType" minOccurs="0"/>
     *         &lt;element name="offerRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ElementManagementSegmentType_104354S" minOccurs="0"/>
     *         &lt;element name="paxRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInformationType" minOccurs="0"/>
     *         &lt;element name="paxTypeLoc" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paxCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
     *                   &lt;element name="paxTypeDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fareComponentInfo" maxOccurs="16" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FareQualifierDetailsType"/>
     *                   &lt;element name="fareComponentRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInfoType"/>
     *                   &lt;element name="originAndDestination" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}OriginAndDestinationDetailsTypeI"/>
     *                   &lt;element name="originDestinLoc" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="originDestinCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
     *                             &lt;element name="originDestinDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="segmentRefernce" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ElementManagementSegmentType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="listSituation" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="listSituationDum" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="situationCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
     *                   &lt;element name="situationDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mnrRulesInfoGrp" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}MiniRulesRegulPropertiesType" maxOccurs="600" minOccurs="0"/>
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
        "pricingRecordId",
        "errorWarningGroup",
        "offerRef",
        "paxRef",
        "paxTypeLoc",
        "fareComponentInfo",
        "listSituation",
        "mnrRulesInfoGrp"
    })
    public static class MnrByPricingRecord {

        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType pricingRecordId;
        protected ErrorGroupType errorWarningGroup;
        protected ElementManagementSegmentType104354S offerRef;
        protected ReferenceInformationType paxRef;
        protected List<MiniRuleGetFromRecReply.MnrByPricingRecord.PaxTypeLoc> paxTypeLoc;
        protected List<MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo> fareComponentInfo;
        protected List<MiniRuleGetFromRecReply.MnrByPricingRecord.ListSituation> listSituation;
        protected List<MiniRulesRegulPropertiesType> mnrRulesInfoGrp;

        /**
         * Gets the value of the pricingRecordId property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public ItemReferencesAndVersionsType getPricingRecordId() {
            return pricingRecordId;
        }

        /**
         * Sets the value of the pricingRecordId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public void setPricingRecordId(ItemReferencesAndVersionsType value) {
            this.pricingRecordId = value;
        }

        /**
         * Gets the value of the errorWarningGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorGroupType }
         *     
         */
        public ErrorGroupType getErrorWarningGroup() {
            return errorWarningGroup;
        }

        /**
         * Sets the value of the errorWarningGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorGroupType }
         *     
         */
        public void setErrorWarningGroup(ErrorGroupType value) {
            this.errorWarningGroup = value;
        }

        /**
         * Gets the value of the offerRef property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType104354S }
         *     
         */
        public ElementManagementSegmentType104354S getOfferRef() {
            return offerRef;
        }

        /**
         * Sets the value of the offerRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType104354S }
         *     
         */
        public void setOfferRef(ElementManagementSegmentType104354S value) {
            this.offerRef = value;
        }

        /**
         * Gets the value of the paxRef property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationType }
         *     
         */
        public ReferenceInformationType getPaxRef() {
            return paxRef;
        }

        /**
         * Sets the value of the paxRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationType }
         *     
         */
        public void setPaxRef(ReferenceInformationType value) {
            this.paxRef = value;
        }

        /**
         * Gets the value of the paxTypeLoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxTypeLoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxTypeLoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRuleGetFromRecReply.MnrByPricingRecord.PaxTypeLoc }
         * 
         * 
         */
        public List<MiniRuleGetFromRecReply.MnrByPricingRecord.PaxTypeLoc> getPaxTypeLoc() {
            if (paxTypeLoc == null) {
                paxTypeLoc = new ArrayList<MiniRuleGetFromRecReply.MnrByPricingRecord.PaxTypeLoc>();
            }
            return this.paxTypeLoc;
        }

        /**
         * Gets the value of the fareComponentInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareComponentInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareComponentInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo }
         * 
         * 
         */
        public List<MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo> getFareComponentInfo() {
            if (fareComponentInfo == null) {
                fareComponentInfo = new ArrayList<MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo>();
            }
            return this.fareComponentInfo;
        }

        /**
         * Gets the value of the listSituation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listSituation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListSituation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRuleGetFromRecReply.MnrByPricingRecord.ListSituation }
         * 
         * 
         */
        public List<MiniRuleGetFromRecReply.MnrByPricingRecord.ListSituation> getListSituation() {
            if (listSituation == null) {
                listSituation = new ArrayList<MiniRuleGetFromRecReply.MnrByPricingRecord.ListSituation>();
            }
            return this.listSituation;
        }

        /**
         * Gets the value of the mnrRulesInfoGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnrRulesInfoGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMnrRulesInfoGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRulesRegulPropertiesType }
         * 
         * 
         */
        public List<MiniRulesRegulPropertiesType> getMnrRulesInfoGrp() {
            if (mnrRulesInfoGrp == null) {
                mnrRulesInfoGrp = new ArrayList<MiniRulesRegulPropertiesType>();
            }
            return this.mnrRulesInfoGrp;
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
         *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FareQualifierDetailsType"/>
         *         &lt;element name="fareComponentRef" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInfoType"/>
         *         &lt;element name="originAndDestination" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}OriginAndDestinationDetailsTypeI"/>
         *         &lt;element name="originDestinLoc" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="originDestinCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
         *                   &lt;element name="originDestinDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="segmentRefernce" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ElementManagementSegmentType" maxOccurs="99"/>
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
            "fareQualifierDetails",
            "fareComponentRef",
            "originAndDestination",
            "originDestinLoc",
            "segmentRefernce"
        })
        public static class FareComponentInfo {

            @XmlElement(required = true)
            protected FareQualifierDetailsType fareQualifierDetails;
            @XmlElement(required = true)
            protected ReferenceInfoType fareComponentRef;
            @XmlElement(required = true)
            protected OriginAndDestinationDetailsTypeI originAndDestination;
            protected List<MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo.OriginDestinLoc> originDestinLoc;
            @XmlElement(required = true)
            protected List<ElementManagementSegmentType> segmentRefernce;

            /**
             * Gets the value of the fareQualifierDetails property.
             * 
             * @return
             *     possible object is
             *     {@link FareQualifierDetailsType }
             *     
             */
            public FareQualifierDetailsType getFareQualifierDetails() {
                return fareQualifierDetails;
            }

            /**
             * Sets the value of the fareQualifierDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareQualifierDetailsType }
             *     
             */
            public void setFareQualifierDetails(FareQualifierDetailsType value) {
                this.fareQualifierDetails = value;
            }

            /**
             * Gets the value of the fareComponentRef property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getFareComponentRef() {
                return fareComponentRef;
            }

            /**
             * Sets the value of the fareComponentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setFareComponentRef(ReferenceInfoType value) {
                this.fareComponentRef = value;
            }

            /**
             * Gets the value of the originAndDestination property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationDetailsTypeI }
             *     
             */
            public OriginAndDestinationDetailsTypeI getOriginAndDestination() {
                return originAndDestination;
            }

            /**
             * Sets the value of the originAndDestination property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationDetailsTypeI }
             *     
             */
            public void setOriginAndDestination(OriginAndDestinationDetailsTypeI value) {
                this.originAndDestination = value;
            }

            /**
             * Gets the value of the originDestinLoc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originDestinLoc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOriginDestinLoc().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo.OriginDestinLoc }
             * 
             * 
             */
            public List<MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo.OriginDestinLoc> getOriginDestinLoc() {
                if (originDestinLoc == null) {
                    originDestinLoc = new ArrayList<MiniRuleGetFromRecReply.MnrByPricingRecord.FareComponentInfo.OriginDestinLoc>();
                }
                return this.originDestinLoc;
            }

            /**
             * Gets the value of the segmentRefernce property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentRefernce property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSegmentRefernce().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElementManagementSegmentType }
             * 
             * 
             */
            public List<ElementManagementSegmentType> getSegmentRefernce() {
                if (segmentRefernce == null) {
                    segmentRefernce = new ArrayList<ElementManagementSegmentType>();
                }
                return this.segmentRefernce;
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
             *         &lt;element name="originDestinCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
             *         &lt;element name="originDestinDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
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
                "originDestinCode",
                "originDestinDescription"
            })
            public static class OriginDestinLoc {

                @XmlElement(required = true)
                protected StatusType originDestinCode;
                @XmlElement(required = true)
                protected FreeTextInformationType219131S originDestinDescription;

                /**
                 * Gets the value of the originDestinCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType }
                 *     
                 */
                public StatusType getOriginDestinCode() {
                    return originDestinCode;
                }

                /**
                 * Sets the value of the originDestinCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType }
                 *     
                 */
                public void setOriginDestinCode(StatusType value) {
                    this.originDestinCode = value;
                }

                /**
                 * Gets the value of the originDestinDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType219131S }
                 *     
                 */
                public FreeTextInformationType219131S getOriginDestinDescription() {
                    return originDestinDescription;
                }

                /**
                 * Sets the value of the originDestinDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType219131S }
                 *     
                 */
                public void setOriginDestinDescription(FreeTextInformationType219131S value) {
                    this.originDestinDescription = value;
                }

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
         *         &lt;element name="listSituationDum" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="situationCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
         *         &lt;element name="situationDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
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
            "listSituationDum",
            "situationCode",
            "situationDescription"
        })
        public static class ListSituation {

            @XmlElement(required = true)
            protected DummySegmentTypeI listSituationDum;
            @XmlElement(required = true)
            protected StatusType situationCode;
            @XmlElement(required = true)
            protected FreeTextInformationType219131S situationDescription;

            /**
             * Gets the value of the listSituationDum property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getListSituationDum() {
                return listSituationDum;
            }

            /**
             * Sets the value of the listSituationDum property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setListSituationDum(DummySegmentTypeI value) {
                this.listSituationDum = value;
            }

            /**
             * Gets the value of the situationCode property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType }
             *     
             */
            public StatusType getSituationCode() {
                return situationCode;
            }

            /**
             * Sets the value of the situationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType }
             *     
             */
            public void setSituationCode(StatusType value) {
                this.situationCode = value;
            }

            /**
             * Gets the value of the situationDescription property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType219131S }
             *     
             */
            public FreeTextInformationType219131S getSituationDescription() {
                return situationDescription;
            }

            /**
             * Sets the value of the situationDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType219131S }
             *     
             */
            public void setSituationDescription(FreeTextInformationType219131S value) {
                this.situationDescription = value;
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
         *         &lt;element name="paxCode" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType"/>
         *         &lt;element name="paxTypeDescription" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S"/>
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
            "paxCode",
            "paxTypeDescription"
        })
        public static class PaxTypeLoc {

            @XmlElement(required = true)
            protected StatusType paxCode;
            @XmlElement(required = true)
            protected FreeTextInformationType219131S paxTypeDescription;

            /**
             * Gets the value of the paxCode property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType }
             *     
             */
            public StatusType getPaxCode() {
                return paxCode;
            }

            /**
             * Sets the value of the paxCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType }
             *     
             */
            public void setPaxCode(StatusType value) {
                this.paxCode = value;
            }

            /**
             * Gets the value of the paxTypeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType219131S }
             *     
             */
            public FreeTextInformationType219131S getPaxTypeDescription() {
                return paxTypeDescription;
            }

            /**
             * Sets the value of the paxTypeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType219131S }
             *     
             */
            public void setPaxTypeDescription(FreeTextInformationType219131S value) {
                this.paxTypeDescription = value;
            }

        }

    }

}
