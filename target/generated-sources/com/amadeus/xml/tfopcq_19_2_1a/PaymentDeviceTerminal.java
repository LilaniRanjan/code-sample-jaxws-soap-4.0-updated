
package com.amadeus.xml.tfopcq_19_2_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDeviceTerminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDeviceTerminal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceReference" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}IdentificationNumberTypeI_306019C" minOccurs="0"/>
 *         &lt;element name="category" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="mobility" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="keypadCapacity" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}KeypadCapacityType" minOccurs="0"/>
 *         &lt;element name="readers" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReaderCapacityType" minOccurs="0"/>
 *         &lt;element name="encoders" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}EncoderCapacityType" minOccurs="0"/>
 *         &lt;element name="screen" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}OutputDisplayCapacityType" minOccurs="0"/>
 *         &lt;element name="printer" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}OutputDisplayCapacityType" minOccurs="0"/>
 *         &lt;element name="onlineCapability" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="offlineCapability" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="pinCaptureMaxLength" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="verificationMethods" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}VerificationMethodsType" minOccurs="0"/>
 *         &lt;element name="cardCapture" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="dataAuthenticationMode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="identityVerificationMeans" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="availableService" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDeviceTerminal", propOrder = {
    "deviceReference",
    "category",
    "mobility",
    "keypadCapacity",
    "readers",
    "encoders",
    "screen",
    "printer",
    "onlineCapability",
    "offlineCapability",
    "pinCaptureMaxLength",
    "verificationMethods",
    "cardCapture",
    "dataAuthenticationMode",
    "identityVerificationMeans",
    "availableService"
})
public class PaymentDeviceTerminal {

    protected IdentificationNumberTypeI306019C deviceReference;
    protected String category;
    protected String mobility;
    protected KeypadCapacityType keypadCapacity;
    protected ReaderCapacityType readers;
    protected EncoderCapacityType encoders;
    protected OutputDisplayCapacityType screen;
    protected OutputDisplayCapacityType printer;
    protected String onlineCapability;
    protected String offlineCapability;
    protected BigInteger pinCaptureMaxLength;
    protected VerificationMethodsType verificationMethods;
    protected String cardCapture;
    protected String dataAuthenticationMode;
    protected List<String> identityVerificationMeans;
    protected List<String> availableService;

    /**
     * Gets the value of the deviceReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberTypeI306019C }
     *     
     */
    public IdentificationNumberTypeI306019C getDeviceReference() {
        return deviceReference;
    }

    /**
     * Sets the value of the deviceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberTypeI306019C }
     *     
     */
    public void setDeviceReference(IdentificationNumberTypeI306019C value) {
        this.deviceReference = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobility(String value) {
        this.mobility = value;
    }

    /**
     * Gets the value of the keypadCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link KeypadCapacityType }
     *     
     */
    public KeypadCapacityType getKeypadCapacity() {
        return keypadCapacity;
    }

    /**
     * Sets the value of the keypadCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeypadCapacityType }
     *     
     */
    public void setKeypadCapacity(KeypadCapacityType value) {
        this.keypadCapacity = value;
    }

    /**
     * Gets the value of the readers property.
     * 
     * @return
     *     possible object is
     *     {@link ReaderCapacityType }
     *     
     */
    public ReaderCapacityType getReaders() {
        return readers;
    }

    /**
     * Sets the value of the readers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReaderCapacityType }
     *     
     */
    public void setReaders(ReaderCapacityType value) {
        this.readers = value;
    }

    /**
     * Gets the value of the encoders property.
     * 
     * @return
     *     possible object is
     *     {@link EncoderCapacityType }
     *     
     */
    public EncoderCapacityType getEncoders() {
        return encoders;
    }

    /**
     * Sets the value of the encoders property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncoderCapacityType }
     *     
     */
    public void setEncoders(EncoderCapacityType value) {
        this.encoders = value;
    }

    /**
     * Gets the value of the screen property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDisplayCapacityType }
     *     
     */
    public OutputDisplayCapacityType getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDisplayCapacityType }
     *     
     */
    public void setScreen(OutputDisplayCapacityType value) {
        this.screen = value;
    }

    /**
     * Gets the value of the printer property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDisplayCapacityType }
     *     
     */
    public OutputDisplayCapacityType getPrinter() {
        return printer;
    }

    /**
     * Sets the value of the printer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDisplayCapacityType }
     *     
     */
    public void setPrinter(OutputDisplayCapacityType value) {
        this.printer = value;
    }

    /**
     * Gets the value of the onlineCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineCapability() {
        return onlineCapability;
    }

    /**
     * Sets the value of the onlineCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineCapability(String value) {
        this.onlineCapability = value;
    }

    /**
     * Gets the value of the offlineCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineCapability() {
        return offlineCapability;
    }

    /**
     * Sets the value of the offlineCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineCapability(String value) {
        this.offlineCapability = value;
    }

    /**
     * Gets the value of the pinCaptureMaxLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPinCaptureMaxLength() {
        return pinCaptureMaxLength;
    }

    /**
     * Sets the value of the pinCaptureMaxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPinCaptureMaxLength(BigInteger value) {
        this.pinCaptureMaxLength = value;
    }

    /**
     * Gets the value of the verificationMethods property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationMethodsType }
     *     
     */
    public VerificationMethodsType getVerificationMethods() {
        return verificationMethods;
    }

    /**
     * Sets the value of the verificationMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationMethodsType }
     *     
     */
    public void setVerificationMethods(VerificationMethodsType value) {
        this.verificationMethods = value;
    }

    /**
     * Gets the value of the cardCapture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCapture() {
        return cardCapture;
    }

    /**
     * Sets the value of the cardCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCapture(String value) {
        this.cardCapture = value;
    }

    /**
     * Gets the value of the dataAuthenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAuthenticationMode() {
        return dataAuthenticationMode;
    }

    /**
     * Sets the value of the dataAuthenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAuthenticationMode(String value) {
        this.dataAuthenticationMode = value;
    }

    /**
     * Gets the value of the identityVerificationMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityVerificationMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityVerificationMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentityVerificationMeans() {
        if (identityVerificationMeans == null) {
            identityVerificationMeans = new ArrayList<String>();
        }
        return this.identityVerificationMeans;
    }

    /**
     * Gets the value of the availableService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAvailableService() {
        if (availableService == null) {
            availableService = new ArrayList<String>();
        }
        return this.availableService;
    }

}
