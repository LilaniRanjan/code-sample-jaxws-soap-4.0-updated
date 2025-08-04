
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey Mean Of Payment specific data
 * 
 * <p>Java class for MeanOfPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeanOfPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FormOfPaymentType"/>
 *         &lt;element name="fundTransferData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}WebFundTransferGroupType" minOccurs="0"/>
 *         &lt;element name="asyncDataGroup" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AsynchPaymentGroupType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}DummySegmentTypeI"/>
 *         &lt;element name="invoiceDataGroup" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}InvoiceFopGroupType" minOccurs="0"/>
 *         &lt;element name="creditCardData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CreditCardDataGroupType" minOccurs="0"/>
 *         &lt;element name="webAccountData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}WebAccountGroupType" minOccurs="0"/>
 *         &lt;element name="amopData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paymentStep" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
 *                   &lt;element name="messageVersion" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
 *                   &lt;element name="paymentDataMap" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="groupAmopProcess" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
 *                             &lt;element name="amopProcessData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}DummySegmentTypeI"/>
 *                   &lt;element name="groupAmopParameters" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
 *                             &lt;element name="amopParameterData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="amopGroupUrl" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
 *                                       &lt;element name="url" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" minOccurs="0"/>
 *                                       &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *                                       &lt;element name="amopUrlData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="amopPayload" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="binaryDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
 *                                                 &lt;element name="binaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}BinaryDataType_222902S"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="groupAmopContext" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="clientTokenId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ItemReferencesAndVersionsType"/>
 *                                       &lt;element name="amopContextData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" maxOccurs="99" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlType(name = "MeanOfPaymentDataType", propOrder = {
    "fopInformation",
    "fundTransferData",
    "asyncDataGroup",
    "dummy",
    "invoiceDataGroup",
    "creditCardData",
    "webAccountData",
    "amopData"
})
public class MeanOfPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPaymentType fopInformation;
    protected WebFundTransferGroupType fundTransferData;
    protected AsynchPaymentGroupType asyncDataGroup;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected InvoiceFopGroupType invoiceDataGroup;
    protected CreditCardDataGroupType creditCardData;
    protected WebAccountGroupType webAccountData;
    protected MeanOfPaymentDataType.AmopData amopData;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setFopInformation(FormOfPaymentType value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the fundTransferData property.
     * 
     * @return
     *     possible object is
     *     {@link WebFundTransferGroupType }
     *     
     */
    public WebFundTransferGroupType getFundTransferData() {
        return fundTransferData;
    }

    /**
     * Sets the value of the fundTransferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFundTransferGroupType }
     *     
     */
    public void setFundTransferData(WebFundTransferGroupType value) {
        this.fundTransferData = value;
    }

    /**
     * Gets the value of the asyncDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchPaymentGroupType }
     *     
     */
    public AsynchPaymentGroupType getAsyncDataGroup() {
        return asyncDataGroup;
    }

    /**
     * Sets the value of the asyncDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchPaymentGroupType }
     *     
     */
    public void setAsyncDataGroup(AsynchPaymentGroupType value) {
        this.asyncDataGroup = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setDummy(DummySegmentTypeI value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the invoiceDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFopGroupType }
     *     
     */
    public InvoiceFopGroupType getInvoiceDataGroup() {
        return invoiceDataGroup;
    }

    /**
     * Sets the value of the invoiceDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFopGroupType }
     *     
     */
    public void setInvoiceDataGroup(InvoiceFopGroupType value) {
        this.invoiceDataGroup = value;
    }

    /**
     * Gets the value of the creditCardData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataGroupType }
     *     
     */
    public CreditCardDataGroupType getCreditCardData() {
        return creditCardData;
    }

    /**
     * Sets the value of the creditCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataGroupType }
     *     
     */
    public void setCreditCardData(CreditCardDataGroupType value) {
        this.creditCardData = value;
    }

    /**
     * Gets the value of the webAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link WebAccountGroupType }
     *     
     */
    public WebAccountGroupType getWebAccountData() {
        return webAccountData;
    }

    /**
     * Sets the value of the webAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAccountGroupType }
     *     
     */
    public void setWebAccountData(WebAccountGroupType value) {
        this.webAccountData = value;
    }

    /**
     * Gets the value of the amopData property.
     * 
     * @return
     *     possible object is
     *     {@link MeanOfPaymentDataType.AmopData }
     *     
     */
    public MeanOfPaymentDataType.AmopData getAmopData() {
        return amopData;
    }

    /**
     * Sets the value of the amopData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanOfPaymentDataType.AmopData }
     *     
     */
    public void setAmopData(MeanOfPaymentDataType.AmopData value) {
        this.amopData = value;
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
     *         &lt;element name="paymentStep" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
     *         &lt;element name="messageVersion" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
     *         &lt;element name="paymentDataMap" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="groupAmopProcess" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
     *                   &lt;element name="amopProcessData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}DummySegmentTypeI"/>
     *         &lt;element name="groupAmopParameters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
     *                   &lt;element name="amopParameterData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="amopGroupUrl" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
     *                             &lt;element name="url" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" minOccurs="0"/>
     *                             &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType" minOccurs="0"/>
     *                             &lt;element name="amopUrlData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="amopPayload" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="binaryDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
     *                                       &lt;element name="binaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}BinaryDataType_222902S"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="groupAmopContext" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="clientTokenId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ItemReferencesAndVersionsType"/>
     *                             &lt;element name="amopContextData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" maxOccurs="99" minOccurs="0"/>
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
        "paymentStep",
        "messageVersion",
        "paymentDataMap",
        "groupAmopProcess",
        "dummy",
        "groupAmopParameters"
    })
    public static class AmopData {

        @XmlElement(required = true)
        protected CodedAttributeType paymentStep;
        @XmlElement(required = true)
        protected MessageStructureVersionType messageVersion;
        protected List<AttributeType215546S> paymentDataMap;
        protected MeanOfPaymentDataType.AmopData.GroupAmopProcess groupAmopProcess;
        @XmlElement(required = true)
        protected DummySegmentTypeI dummy;
        protected MeanOfPaymentDataType.AmopData.GroupAmopParameters groupAmopParameters;

        /**
         * Gets the value of the paymentStep property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getPaymentStep() {
            return paymentStep;
        }

        /**
         * Sets the value of the paymentStep property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setPaymentStep(CodedAttributeType value) {
            this.paymentStep = value;
        }

        /**
         * Gets the value of the messageVersion property.
         * 
         * @return
         *     possible object is
         *     {@link MessageStructureVersionType }
         *     
         */
        public MessageStructureVersionType getMessageVersion() {
            return messageVersion;
        }

        /**
         * Sets the value of the messageVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageStructureVersionType }
         *     
         */
        public void setMessageVersion(MessageStructureVersionType value) {
            this.messageVersion = value;
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
         * Gets the value of the groupAmopProcess property.
         * 
         * @return
         *     possible object is
         *     {@link MeanOfPaymentDataType.AmopData.GroupAmopProcess }
         *     
         */
        public MeanOfPaymentDataType.AmopData.GroupAmopProcess getGroupAmopProcess() {
            return groupAmopProcess;
        }

        /**
         * Sets the value of the groupAmopProcess property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeanOfPaymentDataType.AmopData.GroupAmopProcess }
         *     
         */
        public void setGroupAmopProcess(MeanOfPaymentDataType.AmopData.GroupAmopProcess value) {
            this.groupAmopProcess = value;
        }

        /**
         * Gets the value of the dummy property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getDummy() {
            return dummy;
        }

        /**
         * Sets the value of the dummy property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setDummy(DummySegmentTypeI value) {
            this.dummy = value;
        }

        /**
         * Gets the value of the groupAmopParameters property.
         * 
         * @return
         *     possible object is
         *     {@link MeanOfPaymentDataType.AmopData.GroupAmopParameters }
         *     
         */
        public MeanOfPaymentDataType.AmopData.GroupAmopParameters getGroupAmopParameters() {
            return groupAmopParameters;
        }

        /**
         * Sets the value of the groupAmopParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeanOfPaymentDataType.AmopData.GroupAmopParameters }
         *     
         */
        public void setGroupAmopParameters(MeanOfPaymentDataType.AmopData.GroupAmopParameters value) {
            this.groupAmopParameters = value;
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
         *         &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
         *         &lt;element name="amopParameterData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="amopGroupUrl" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
         *                   &lt;element name="url" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" minOccurs="0"/>
         *                   &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType" minOccurs="0"/>
         *                   &lt;element name="amopUrlData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="amopPayload" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="binaryDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
         *                             &lt;element name="binaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}BinaryDataType_222902S"/>
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
         *         &lt;element name="groupAmopContext" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="clientTokenId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ItemReferencesAndVersionsType"/>
         *                   &lt;element name="amopContextData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" maxOccurs="99" minOccurs="0"/>
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
            "groupUsage",
            "amopParameterData",
            "amopGroupUrl",
            "groupAmopContext"
        })
        public static class GroupAmopParameters {

            @XmlElement(required = true)
            protected CodedAttributeType groupUsage;
            protected List<AttributeType215546S> amopParameterData;
            protected List<MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl> amopGroupUrl;
            protected MeanOfPaymentDataType.AmopData.GroupAmopParameters.GroupAmopContext groupAmopContext;

            /**
             * Gets the value of the groupUsage property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType }
             *     
             */
            public CodedAttributeType getGroupUsage() {
                return groupUsage;
            }

            /**
             * Sets the value of the groupUsage property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType }
             *     
             */
            public void setGroupUsage(CodedAttributeType value) {
                this.groupUsage = value;
            }

            /**
             * Gets the value of the amopParameterData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amopParameterData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmopParameterData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttributeType215546S }
             * 
             * 
             */
            public List<AttributeType215546S> getAmopParameterData() {
                if (amopParameterData == null) {
                    amopParameterData = new ArrayList<AttributeType215546S>();
                }
                return this.amopParameterData;
            }

            /**
             * Gets the value of the amopGroupUrl property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amopGroupUrl property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmopGroupUrl().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl }
             * 
             * 
             */
            public List<MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl> getAmopGroupUrl() {
                if (amopGroupUrl == null) {
                    amopGroupUrl = new ArrayList<MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl>();
                }
                return this.amopGroupUrl;
            }

            /**
             * Gets the value of the groupAmopContext property.
             * 
             * @return
             *     possible object is
             *     {@link MeanOfPaymentDataType.AmopData.GroupAmopParameters.GroupAmopContext }
             *     
             */
            public MeanOfPaymentDataType.AmopData.GroupAmopParameters.GroupAmopContext getGroupAmopContext() {
                return groupAmopContext;
            }

            /**
             * Sets the value of the groupAmopContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link MeanOfPaymentDataType.AmopData.GroupAmopParameters.GroupAmopContext }
             *     
             */
            public void setGroupAmopContext(MeanOfPaymentDataType.AmopData.GroupAmopParameters.GroupAmopContext value) {
                this.groupAmopContext = value;
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
             *         &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
             *         &lt;element name="url" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" minOccurs="0"/>
             *         &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType" minOccurs="0"/>
             *         &lt;element name="amopUrlData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="amopPayload" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="binaryDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
             *                   &lt;element name="binaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}BinaryDataType_222902S"/>
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
                "groupUsage",
                "url",
                "transactionDateTime",
                "amopUrlData",
                "amopPayload"
            })
            public static class AmopGroupUrl {

                @XmlElement(required = true)
                protected CodedAttributeType groupUsage;
                protected CommunicationContactType url;
                protected StructuredDateTimeInformationType transactionDateTime;
                protected List<AttributeType215546S> amopUrlData;
                protected List<MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl.AmopPayload> amopPayload;

                /**
                 * Gets the value of the groupUsage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodedAttributeType }
                 *     
                 */
                public CodedAttributeType getGroupUsage() {
                    return groupUsage;
                }

                /**
                 * Sets the value of the groupUsage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodedAttributeType }
                 *     
                 */
                public void setGroupUsage(CodedAttributeType value) {
                    this.groupUsage = value;
                }

                /**
                 * Gets the value of the url property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommunicationContactType }
                 *     
                 */
                public CommunicationContactType getUrl() {
                    return url;
                }

                /**
                 * Sets the value of the url property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommunicationContactType }
                 *     
                 */
                public void setUrl(CommunicationContactType value) {
                    this.url = value;
                }

                /**
                 * Gets the value of the transactionDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredDateTimeInformationType }
                 *     
                 */
                public StructuredDateTimeInformationType getTransactionDateTime() {
                    return transactionDateTime;
                }

                /**
                 * Sets the value of the transactionDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredDateTimeInformationType }
                 *     
                 */
                public void setTransactionDateTime(StructuredDateTimeInformationType value) {
                    this.transactionDateTime = value;
                }

                /**
                 * Gets the value of the amopUrlData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the amopUrlData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAmopUrlData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AttributeType215546S }
                 * 
                 * 
                 */
                public List<AttributeType215546S> getAmopUrlData() {
                    if (amopUrlData == null) {
                        amopUrlData = new ArrayList<AttributeType215546S>();
                    }
                    return this.amopUrlData;
                }

                /**
                 * Gets the value of the amopPayload property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the amopPayload property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAmopPayload().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl.AmopPayload }
                 * 
                 * 
                 */
                public List<MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl.AmopPayload> getAmopPayload() {
                    if (amopPayload == null) {
                        amopPayload = new ArrayList<MeanOfPaymentDataType.AmopData.GroupAmopParameters.AmopGroupUrl.AmopPayload>();
                    }
                    return this.amopPayload;
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
                 *         &lt;element name="binaryDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}MessageStructureVersionType"/>
                 *         &lt;element name="binaryData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}BinaryDataType_222902S"/>
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
                    "binaryDescription",
                    "binaryData"
                })
                public static class AmopPayload {

                    @XmlElement(required = true)
                    protected MessageStructureVersionType binaryDescription;
                    @XmlElement(required = true)
                    protected BinaryDataType222902S binaryData;

                    /**
                     * Gets the value of the binaryDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MessageStructureVersionType }
                     *     
                     */
                    public MessageStructureVersionType getBinaryDescription() {
                        return binaryDescription;
                    }

                    /**
                     * Sets the value of the binaryDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MessageStructureVersionType }
                     *     
                     */
                    public void setBinaryDescription(MessageStructureVersionType value) {
                        this.binaryDescription = value;
                    }

                    /**
                     * Gets the value of the binaryData property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BinaryDataType222902S }
                     *     
                     */
                    public BinaryDataType222902S getBinaryData() {
                        return binaryData;
                    }

                    /**
                     * Sets the value of the binaryData property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BinaryDataType222902S }
                     *     
                     */
                    public void setBinaryData(BinaryDataType222902S value) {
                        this.binaryData = value;
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
             *         &lt;element name="clientTokenId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ItemReferencesAndVersionsType"/>
             *         &lt;element name="amopContextData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType" maxOccurs="99" minOccurs="0"/>
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
                "clientTokenId",
                "amopContextData",
                "communication"
            })
            public static class GroupAmopContext {

                @XmlElement(required = true)
                protected ItemReferencesAndVersionsType clientTokenId;
                protected List<AttributeType215546S> amopContextData;
                protected List<CommunicationContactType> communication;

                /**
                 * Gets the value of the clientTokenId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemReferencesAndVersionsType }
                 *     
                 */
                public ItemReferencesAndVersionsType getClientTokenId() {
                    return clientTokenId;
                }

                /**
                 * Sets the value of the clientTokenId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemReferencesAndVersionsType }
                 *     
                 */
                public void setClientTokenId(ItemReferencesAndVersionsType value) {
                    this.clientTokenId = value;
                }

                /**
                 * Gets the value of the amopContextData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the amopContextData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAmopContextData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AttributeType215546S }
                 * 
                 * 
                 */
                public List<AttributeType215546S> getAmopContextData() {
                    if (amopContextData == null) {
                        amopContextData = new ArrayList<AttributeType215546S>();
                    }
                    return this.amopContextData;
                }

                /**
                 * Gets the value of the communication property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the communication property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCommunication().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CommunicationContactType }
                 * 
                 * 
                 */
                public List<CommunicationContactType> getCommunication() {
                    if (communication == null) {
                        communication = new ArrayList<CommunicationContactType>();
                    }
                    return this.communication;
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
         *         &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
         *         &lt;element name="amopProcessData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215546S" maxOccurs="99" minOccurs="0"/>
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
            "groupUsage",
            "amopProcessData"
        })
        public static class GroupAmopProcess {

            @XmlElement(required = true)
            protected CodedAttributeType groupUsage;
            protected List<AttributeType215546S> amopProcessData;

            /**
             * Gets the value of the groupUsage property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType }
             *     
             */
            public CodedAttributeType getGroupUsage() {
                return groupUsage;
            }

            /**
             * Sets the value of the groupUsage property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType }
             *     
             */
            public void setGroupUsage(CodedAttributeType value) {
                this.groupUsage = value;
            }

            /**
             * Gets the value of the amopProcessData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amopProcessData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmopProcessData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttributeType215546S }
             * 
             * 
             */
            public List<AttributeType215546S> getAmopProcessData() {
                if (amopProcessData == null) {
                    amopProcessData = new ArrayList<AttributeType215546S>();
                }
                return this.amopProcessData;
            }

        }

    }

}
