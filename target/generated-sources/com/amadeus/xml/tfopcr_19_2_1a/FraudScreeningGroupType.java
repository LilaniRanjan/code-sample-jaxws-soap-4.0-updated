
package com.amadeus.xml.tfopcr_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all data needed to prevent the fraud on the payment
 * 
 * <p>Java class for FraudScreeningGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudScreeningGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraudScreening" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StatusType_68675S"/>
 *         &lt;element name="pointOfService" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PointOfSaleInformationType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="posOperations" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PointOfServicesOperationsType" minOccurs="0"/>
 *         &lt;element name="paymentTerminal" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PaymentDeviceTerminal" minOccurs="0"/>
 *         &lt;element name="ipAdress" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}DeviceControlDetailsType" minOccurs="0"/>
 *         &lt;element name="merchantURL" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CommunicationContactType_202237S" minOccurs="0"/>
 *         &lt;element name="payerPhoneOrEmail" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}PhoneAndEmailAddressType_222736S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="browserInformation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}BrowserInformationType_222662S" minOccurs="0"/>
 *         &lt;element name="shopperSession" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SystemDetailsInfoType" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TravellerInformationType_202251S" minOccurs="0"/>
 *         &lt;element name="payerDateOfBirth" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeInformationType_202247S" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AddressType" minOccurs="0"/>
 *         &lt;element name="formOfIdDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType_202246S" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="travelShopper" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="shopperDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="shopperID" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}UserIdentificationType"/>
 *                   &lt;element name="shopperLogged" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StatusType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="securityCode" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="securityType" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SecurityScreeningType"/>
 *                   &lt;element name="securityKey" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}BinaryDataType"/>
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
@XmlType(name = "FraudScreeningGroupType", propOrder = {
    "fraudScreening",
    "pointOfService",
    "posOperations",
    "paymentTerminal",
    "ipAdress",
    "merchantURL",
    "payerPhoneOrEmail",
    "browserInformation",
    "shopperSession",
    "payerName",
    "payerDateOfBirth",
    "billingAddress",
    "formOfIdDetails",
    "travelShopper",
    "shopperDetails",
    "securityCode"
})
public class FraudScreeningGroupType {

    @XmlElement(required = true)
    protected StatusType68675S fraudScreening;
    protected List<PointOfSaleInformationType> pointOfService;
    protected PointOfServicesOperationsType posOperations;
    protected PaymentDeviceTerminal paymentTerminal;
    protected DeviceControlDetailsType ipAdress;
    protected CommunicationContactType202237S merchantURL;
    protected List<PhoneAndEmailAddressType222736S> payerPhoneOrEmail;
    protected BrowserInformationType222662S browserInformation;
    protected SystemDetailsInfoType shopperSession;
    protected TravellerInformationType202251S payerName;
    protected StructuredDateTimeInformationType202247S payerDateOfBirth;
    protected AddressType billingAddress;
    protected List<ReferenceInfoType202246S> formOfIdDetails;
    protected StatusType travelShopper;
    protected FraudScreeningGroupType.ShopperDetails shopperDetails;
    protected List<FraudScreeningGroupType.SecurityCode> securityCode;

    /**
     * Gets the value of the fraudScreening property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType68675S }
     *     
     */
    public StatusType68675S getFraudScreening() {
        return fraudScreening;
    }

    /**
     * Sets the value of the fraudScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType68675S }
     *     
     */
    public void setFraudScreening(StatusType68675S value) {
        this.fraudScreening = value;
    }

    /**
     * Gets the value of the pointOfService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSaleInformationType }
     * 
     * 
     */
    public List<PointOfSaleInformationType> getPointOfService() {
        if (pointOfService == null) {
            pointOfService = new ArrayList<PointOfSaleInformationType>();
        }
        return this.pointOfService;
    }

    /**
     * Gets the value of the posOperations property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServicesOperationsType }
     *     
     */
    public PointOfServicesOperationsType getPosOperations() {
        return posOperations;
    }

    /**
     * Sets the value of the posOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServicesOperationsType }
     *     
     */
    public void setPosOperations(PointOfServicesOperationsType value) {
        this.posOperations = value;
    }

    /**
     * Gets the value of the paymentTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDeviceTerminal }
     *     
     */
    public PaymentDeviceTerminal getPaymentTerminal() {
        return paymentTerminal;
    }

    /**
     * Sets the value of the paymentTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDeviceTerminal }
     *     
     */
    public void setPaymentTerminal(PaymentDeviceTerminal value) {
        this.paymentTerminal = value;
    }

    /**
     * Gets the value of the ipAdress property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlDetailsType }
     *     
     */
    public DeviceControlDetailsType getIpAdress() {
        return ipAdress;
    }

    /**
     * Sets the value of the ipAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlDetailsType }
     *     
     */
    public void setIpAdress(DeviceControlDetailsType value) {
        this.ipAdress = value;
    }

    /**
     * Gets the value of the merchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType202237S }
     *     
     */
    public CommunicationContactType202237S getMerchantURL() {
        return merchantURL;
    }

    /**
     * Sets the value of the merchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType202237S }
     *     
     */
    public void setMerchantURL(CommunicationContactType202237S value) {
        this.merchantURL = value;
    }

    /**
     * Gets the value of the payerPhoneOrEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerPhoneOrEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerPhoneOrEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneAndEmailAddressType222736S }
     * 
     * 
     */
    public List<PhoneAndEmailAddressType222736S> getPayerPhoneOrEmail() {
        if (payerPhoneOrEmail == null) {
            payerPhoneOrEmail = new ArrayList<PhoneAndEmailAddressType222736S>();
        }
        return this.payerPhoneOrEmail;
    }

    /**
     * Gets the value of the browserInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserInformationType222662S }
     *     
     */
    public BrowserInformationType222662S getBrowserInformation() {
        return browserInformation;
    }

    /**
     * Sets the value of the browserInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserInformationType222662S }
     *     
     */
    public void setBrowserInformation(BrowserInformationType222662S value) {
        this.browserInformation = value;
    }

    /**
     * Gets the value of the shopperSession property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public SystemDetailsInfoType getShopperSession() {
        return shopperSession;
    }

    /**
     * Sets the value of the shopperSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public void setShopperSession(SystemDetailsInfoType value) {
        this.shopperSession = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformationType202251S }
     *     
     */
    public TravellerInformationType202251S getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformationType202251S }
     *     
     */
    public void setPayerName(TravellerInformationType202251S value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType202247S }
     *     
     */
    public StructuredDateTimeInformationType202247S getPayerDateOfBirth() {
        return payerDateOfBirth;
    }

    /**
     * Sets the value of the payerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType202247S }
     *     
     */
    public void setPayerDateOfBirth(StructuredDateTimeInformationType202247S value) {
        this.payerDateOfBirth = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the formOfIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType202246S }
     * 
     * 
     */
    public List<ReferenceInfoType202246S> getFormOfIdDetails() {
        if (formOfIdDetails == null) {
            formOfIdDetails = new ArrayList<ReferenceInfoType202246S>();
        }
        return this.formOfIdDetails;
    }

    /**
     * Gets the value of the travelShopper property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getTravelShopper() {
        return travelShopper;
    }

    /**
     * Sets the value of the travelShopper property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setTravelShopper(StatusType value) {
        this.travelShopper = value;
    }

    /**
     * Gets the value of the shopperDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScreeningGroupType.ShopperDetails }
     *     
     */
    public FraudScreeningGroupType.ShopperDetails getShopperDetails() {
        return shopperDetails;
    }

    /**
     * Sets the value of the shopperDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScreeningGroupType.ShopperDetails }
     *     
     */
    public void setShopperDetails(FraudScreeningGroupType.ShopperDetails value) {
        this.shopperDetails = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FraudScreeningGroupType.SecurityCode }
     * 
     * 
     */
    public List<FraudScreeningGroupType.SecurityCode> getSecurityCode() {
        if (securityCode == null) {
            securityCode = new ArrayList<FraudScreeningGroupType.SecurityCode>();
        }
        return this.securityCode;
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
     *         &lt;element name="securityType" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}SecurityScreeningType"/>
     *         &lt;element name="securityKey" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}BinaryDataType"/>
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
        "securityType",
        "securityKey"
    })
    public static class SecurityCode {

        @XmlElement(required = true)
        protected SecurityScreeningType securityType;
        @XmlElement(required = true)
        protected BinaryDataType securityKey;

        /**
         * Gets the value of the securityType property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityScreeningType }
         *     
         */
        public SecurityScreeningType getSecurityType() {
            return securityType;
        }

        /**
         * Sets the value of the securityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityScreeningType }
         *     
         */
        public void setSecurityType(SecurityScreeningType value) {
            this.securityType = value;
        }

        /**
         * Gets the value of the securityKey property.
         * 
         * @return
         *     possible object is
         *     {@link BinaryDataType }
         *     
         */
        public BinaryDataType getSecurityKey() {
            return securityKey;
        }

        /**
         * Sets the value of the securityKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link BinaryDataType }
         *     
         */
        public void setSecurityKey(BinaryDataType value) {
            this.securityKey = value;
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
     *         &lt;element name="shopperID" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}UserIdentificationType"/>
     *         &lt;element name="shopperLogged" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StatusType" minOccurs="0"/>
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
        "shopperID",
        "shopperLogged"
    })
    public static class ShopperDetails {

        @XmlElement(required = true)
        protected UserIdentificationType shopperID;
        protected StatusType shopperLogged;

        /**
         * Gets the value of the shopperID property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType }
         *     
         */
        public UserIdentificationType getShopperID() {
            return shopperID;
        }

        /**
         * Sets the value of the shopperID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType }
         *     
         */
        public void setShopperID(UserIdentificationType value) {
            this.shopperID = value;
        }

        /**
         * Gets the value of the shopperLogged property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getShopperLogged() {
            return shopperLogged;
        }

        /**
         * Sets the value of the shopperLogged property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setShopperLogged(StatusType value) {
            this.shopperLogged = value;
        }

    }

}
