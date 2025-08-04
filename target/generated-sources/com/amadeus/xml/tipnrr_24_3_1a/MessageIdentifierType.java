
package com.amadeus.xml.tipnrr_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the type, version etc. of the message being interchanged.
 * 
 * <p>Java class for MessageIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageTypeIdentifier" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}AlphaNumericString_Length1To64"/>
 *         &lt;element name="messageTypeVersionNumber" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="messageTypeReleaseNumber" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="controllingAgency" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="domain" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}AlphaNumericString_Length1To256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageIdentifierType", propOrder = {
    "messageTypeIdentifier",
    "messageTypeVersionNumber",
    "messageTypeReleaseNumber",
    "controllingAgency",
    "domain"
})
public class MessageIdentifierType {

    @XmlElement(required = true)
    protected String messageTypeIdentifier;
    @XmlElement(required = true)
    protected String messageTypeVersionNumber;
    @XmlElement(required = true)
    protected String messageTypeReleaseNumber;
    @XmlElement(required = true)
    protected String controllingAgency;
    protected String domain;

    /**
     * Gets the value of the messageTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeIdentifier() {
        return messageTypeIdentifier;
    }

    /**
     * Sets the value of the messageTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeIdentifier(String value) {
        this.messageTypeIdentifier = value;
    }

    /**
     * Gets the value of the messageTypeVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeVersionNumber() {
        return messageTypeVersionNumber;
    }

    /**
     * Sets the value of the messageTypeVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeVersionNumber(String value) {
        this.messageTypeVersionNumber = value;
    }

    /**
     * Gets the value of the messageTypeReleaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeReleaseNumber() {
        return messageTypeReleaseNumber;
    }

    /**
     * Sets the value of the messageTypeReleaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeReleaseNumber(String value) {
        this.messageTypeReleaseNumber = value;
    }

    /**
     * Gets the value of the controllingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllingAgency() {
        return controllingAgency;
    }

    /**
     * Sets the value of the controllingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllingAgency(String value) {
        this.controllingAgency = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

}
