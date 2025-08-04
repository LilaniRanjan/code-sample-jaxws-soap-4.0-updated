
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the Detailed Payment Data associated to a MOP
 * 
 * <p>Java class for DetailedPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FormOfPaymentTypeI_191756S"/>
 *         &lt;element name="fundTransferDetailledData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}DetailedWebFundTransferType" minOccurs="0"/>
 *         &lt;element name="asyncDetailledDataGroup" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AsynchPaymentStatusGroupType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}DummySegmentTypeI"/>
 *         &lt;element name="invoiceDetailedDataGroup" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}InvoiceValidationGroupType" minOccurs="0"/>
 *         &lt;element name="creditCardDetailedData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CreditCardStatusGroupType" minOccurs="0"/>
 *         &lt;element name="webAccountDetailledData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}WebAccountSuppDataGroupType" minOccurs="0"/>
 *         &lt;element name="virtualCreditCardStatusGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="virtualCreditCardParameters" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}VirtualCardParametersType_175504S"/>
 *                   &lt;element name="virtualCreditCardData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CreditCardDataType" minOccurs="0"/>
 *                   &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType_190166S" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="vCCAssociatedAdress" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AddressType_68622S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="amopDetailedData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stepDefinition" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
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
 *                   &lt;element name="transactionResult" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ResponseAnalysisDetailsType_202257S"/>
 *                   &lt;element name="errorGroup" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ErrorGroupType" maxOccurs="9" minOccurs="0"/>
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
@XmlType(name = "DetailedPaymentDataType", propOrder = {
    "fopInformation",
    "fundTransferDetailledData",
    "asyncDetailledDataGroup",
    "dummy",
    "invoiceDetailedDataGroup",
    "creditCardDetailedData",
    "webAccountDetailledData",
    "virtualCreditCardStatusGroup",
    "amopDetailedData"
})
public class DetailedPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI191756S fopInformation;
    protected DetailedWebFundTransferType fundTransferDetailledData;
    protected AsynchPaymentStatusGroupType asyncDetailledDataGroup;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected InvoiceValidationGroupType invoiceDetailedDataGroup;
    protected CreditCardStatusGroupType creditCardDetailedData;
    protected WebAccountSuppDataGroupType webAccountDetailledData;
    protected DetailedPaymentDataType.VirtualCreditCardStatusGroup virtualCreditCardStatusGroup;
    protected DetailedPaymentDataType.AmopDetailedData amopDetailedData;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI191756S }
     *     
     */
    public FormOfPaymentTypeI191756S getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI191756S }
     *     
     */
    public void setFopInformation(FormOfPaymentTypeI191756S value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the fundTransferDetailledData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedWebFundTransferType }
     *     
     */
    public DetailedWebFundTransferType getFundTransferDetailledData() {
        return fundTransferDetailledData;
    }

    /**
     * Sets the value of the fundTransferDetailledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedWebFundTransferType }
     *     
     */
    public void setFundTransferDetailledData(DetailedWebFundTransferType value) {
        this.fundTransferDetailledData = value;
    }

    /**
     * Gets the value of the asyncDetailledDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchPaymentStatusGroupType }
     *     
     */
    public AsynchPaymentStatusGroupType getAsyncDetailledDataGroup() {
        return asyncDetailledDataGroup;
    }

    /**
     * Sets the value of the asyncDetailledDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchPaymentStatusGroupType }
     *     
     */
    public void setAsyncDetailledDataGroup(AsynchPaymentStatusGroupType value) {
        this.asyncDetailledDataGroup = value;
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
     * Gets the value of the invoiceDetailedDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceValidationGroupType }
     *     
     */
    public InvoiceValidationGroupType getInvoiceDetailedDataGroup() {
        return invoiceDetailedDataGroup;
    }

    /**
     * Sets the value of the invoiceDetailedDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceValidationGroupType }
     *     
     */
    public void setInvoiceDetailedDataGroup(InvoiceValidationGroupType value) {
        this.invoiceDetailedDataGroup = value;
    }

    /**
     * Gets the value of the creditCardDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public CreditCardStatusGroupType getCreditCardDetailedData() {
        return creditCardDetailedData;
    }

    /**
     * Sets the value of the creditCardDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public void setCreditCardDetailedData(CreditCardStatusGroupType value) {
        this.creditCardDetailedData = value;
    }

    /**
     * Gets the value of the webAccountDetailledData property.
     * 
     * @return
     *     possible object is
     *     {@link WebAccountSuppDataGroupType }
     *     
     */
    public WebAccountSuppDataGroupType getWebAccountDetailledData() {
        return webAccountDetailledData;
    }

    /**
     * Sets the value of the webAccountDetailledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAccountSuppDataGroupType }
     *     
     */
    public void setWebAccountDetailledData(WebAccountSuppDataGroupType value) {
        this.webAccountDetailledData = value;
    }

    /**
     * Gets the value of the virtualCreditCardStatusGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPaymentDataType.VirtualCreditCardStatusGroup }
     *     
     */
    public DetailedPaymentDataType.VirtualCreditCardStatusGroup getVirtualCreditCardStatusGroup() {
        return virtualCreditCardStatusGroup;
    }

    /**
     * Sets the value of the virtualCreditCardStatusGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPaymentDataType.VirtualCreditCardStatusGroup }
     *     
     */
    public void setVirtualCreditCardStatusGroup(DetailedPaymentDataType.VirtualCreditCardStatusGroup value) {
        this.virtualCreditCardStatusGroup = value;
    }

    /**
     * Gets the value of the amopDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPaymentDataType.AmopDetailedData }
     *     
     */
    public DetailedPaymentDataType.AmopDetailedData getAmopDetailedData() {
        return amopDetailedData;
    }

    /**
     * Sets the value of the amopDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPaymentDataType.AmopDetailedData }
     *     
     */
    public void setAmopDetailedData(DetailedPaymentDataType.AmopDetailedData value) {
        this.amopDetailedData = value;
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
     *         &lt;element name="stepDefinition" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CodedAttributeType"/>
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
     *         &lt;element name="transactionResult" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ResponseAnalysisDetailsType_202257S"/>
     *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ErrorGroupType" maxOccurs="9" minOccurs="0"/>
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
        "stepDefinition",
        "messageVersion",
        "paymentDataMap",
        "groupAmopProcess",
        "dummy",
        "groupAmopParameters",
        "transactionResult",
        "errorGroup"
    })
    public static class AmopDetailedData {

        @XmlElement(required = true)
        protected CodedAttributeType stepDefinition;
        @XmlElement(required = true)
        protected MessageStructureVersionType messageVersion;
        protected List<AttributeType215546S> paymentDataMap;
        protected DetailedPaymentDataType.AmopDetailedData.GroupAmopProcess groupAmopProcess;
        @XmlElement(required = true)
        protected DummySegmentTypeI dummy;
        protected DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters groupAmopParameters;
        @XmlElement(required = true)
        protected ResponseAnalysisDetailsType202257S transactionResult;
        protected List<ErrorGroupType> errorGroup;

        /**
         * Gets the value of the stepDefinition property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getStepDefinition() {
            return stepDefinition;
        }

        /**
         * Sets the value of the stepDefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setStepDefinition(CodedAttributeType value) {
            this.stepDefinition = value;
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
         *     {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopProcess }
         *     
         */
        public DetailedPaymentDataType.AmopDetailedData.GroupAmopProcess getGroupAmopProcess() {
            return groupAmopProcess;
        }

        /**
         * Sets the value of the groupAmopProcess property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopProcess }
         *     
         */
        public void setGroupAmopProcess(DetailedPaymentDataType.AmopDetailedData.GroupAmopProcess value) {
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
         *     {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters }
         *     
         */
        public DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters getGroupAmopParameters() {
            return groupAmopParameters;
        }

        /**
         * Sets the value of the groupAmopParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters }
         *     
         */
        public void setGroupAmopParameters(DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters value) {
            this.groupAmopParameters = value;
        }

        /**
         * Gets the value of the transactionResult property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseAnalysisDetailsType202257S }
         *     
         */
        public ResponseAnalysisDetailsType202257S getTransactionResult() {
            return transactionResult;
        }

        /**
         * Sets the value of the transactionResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseAnalysisDetailsType202257S }
         *     
         */
        public void setTransactionResult(ResponseAnalysisDetailsType202257S value) {
            this.transactionResult = value;
        }

        /**
         * Gets the value of the errorGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorGroupType }
         * 
         * 
         */
        public List<ErrorGroupType> getErrorGroup() {
            if (errorGroup == null) {
                errorGroup = new ArrayList<ErrorGroupType>();
            }
            return this.errorGroup;
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
            protected List<DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl> amopGroupUrl;
            protected DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.GroupAmopContext groupAmopContext;

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
             * {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl }
             * 
             * 
             */
            public List<DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl> getAmopGroupUrl() {
                if (amopGroupUrl == null) {
                    amopGroupUrl = new ArrayList<DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl>();
                }
                return this.amopGroupUrl;
            }

            /**
             * Gets the value of the groupAmopContext property.
             * 
             * @return
             *     possible object is
             *     {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.GroupAmopContext }
             *     
             */
            public DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.GroupAmopContext getGroupAmopContext() {
                return groupAmopContext;
            }

            /**
             * Sets the value of the groupAmopContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.GroupAmopContext }
             *     
             */
            public void setGroupAmopContext(DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.GroupAmopContext value) {
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
                protected List<DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl.AmopPayload> amopPayload;

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
                 * {@link DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl.AmopPayload }
                 * 
                 * 
                 */
                public List<DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl.AmopPayload> getAmopPayload() {
                    if (amopPayload == null) {
                        amopPayload = new ArrayList<DetailedPaymentDataType.AmopDetailedData.GroupAmopParameters.AmopGroupUrl.AmopPayload>();
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
     *         &lt;element name="virtualCreditCardParameters" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}VirtualCardParametersType_175504S"/>
     *         &lt;element name="virtualCreditCardData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CreditCardDataType" minOccurs="0"/>
     *         &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType_190166S" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="vCCAssociatedAdress" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AddressType_68622S" minOccurs="0"/>
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
        "virtualCreditCardParameters",
        "virtualCreditCardData",
        "fortknoxIds",
        "vccAssociatedAdress"
    })
    public static class VirtualCreditCardStatusGroup {

        @XmlElement(required = true)
        protected VirtualCardParametersType175504S virtualCreditCardParameters;
        protected CreditCardDataType virtualCreditCardData;
        protected List<ReferenceInfoType190166S> fortknoxIds;
        @XmlElement(name = "vCCAssociatedAdress")
        protected AddressType68622S vccAssociatedAdress;

        /**
         * Gets the value of the virtualCreditCardParameters property.
         * 
         * @return
         *     possible object is
         *     {@link VirtualCardParametersType175504S }
         *     
         */
        public VirtualCardParametersType175504S getVirtualCreditCardParameters() {
            return virtualCreditCardParameters;
        }

        /**
         * Sets the value of the virtualCreditCardParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link VirtualCardParametersType175504S }
         *     
         */
        public void setVirtualCreditCardParameters(VirtualCardParametersType175504S value) {
            this.virtualCreditCardParameters = value;
        }

        /**
         * Gets the value of the virtualCreditCardData property.
         * 
         * @return
         *     possible object is
         *     {@link CreditCardDataType }
         *     
         */
        public CreditCardDataType getVirtualCreditCardData() {
            return virtualCreditCardData;
        }

        /**
         * Sets the value of the virtualCreditCardData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreditCardDataType }
         *     
         */
        public void setVirtualCreditCardData(CreditCardDataType value) {
            this.virtualCreditCardData = value;
        }

        /**
         * Gets the value of the fortknoxIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fortknoxIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFortknoxIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType190166S }
         * 
         * 
         */
        public List<ReferenceInfoType190166S> getFortknoxIds() {
            if (fortknoxIds == null) {
                fortknoxIds = new ArrayList<ReferenceInfoType190166S>();
            }
            return this.fortknoxIds;
        }

        /**
         * Gets the value of the vccAssociatedAdress property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType68622S }
         *     
         */
        public AddressType68622S getVCCAssociatedAdress() {
            return vccAssociatedAdress;
        }

        /**
         * Sets the value of the vccAssociatedAdress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType68622S }
         *     
         */
        public void setVCCAssociatedAdress(AddressType68622S value) {
            this.vccAssociatedAdress = value;
        }

    }

}
