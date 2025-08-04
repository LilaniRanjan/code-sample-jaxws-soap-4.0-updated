
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a phone or email address
 * 
 * <p>Java class for PhoneAndEmailAddressType_222736S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneAndEmailAddressType_222736S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneOrEmailType" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="telephoneNumberDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredTelephoneNumberType_306061C" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To254" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneAndEmailAddressType_222736S", propOrder = {
    "phoneOrEmailType",
    "telephoneNumberDetails",
    "emailAddress"
})
public class PhoneAndEmailAddressType222736S {

    @XmlElement(required = true)
    protected String phoneOrEmailType;
    protected StructuredTelephoneNumberType306061C telephoneNumberDetails;
    protected String emailAddress;

    /**
     * Gets the value of the phoneOrEmailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneOrEmailType() {
        return phoneOrEmailType;
    }

    /**
     * Sets the value of the phoneOrEmailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneOrEmailType(String value) {
        this.phoneOrEmailType = value;
    }

    /**
     * Gets the value of the telephoneNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTelephoneNumberType306061C }
     *     
     */
    public StructuredTelephoneNumberType306061C getTelephoneNumberDetails() {
        return telephoneNumberDetails;
    }

    /**
     * Sets the value of the telephoneNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTelephoneNumberType306061C }
     *     
     */
    public void setTelephoneNumberDetails(StructuredTelephoneNumberType306061C value) {
        this.telephoneNumberDetails = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
