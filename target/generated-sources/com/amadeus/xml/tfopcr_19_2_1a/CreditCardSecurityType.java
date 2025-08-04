
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys data of the credit card authentication
 * 
 * <p>Java class for CreditCardSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardSecurityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationDataDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AuthenticationDataType" minOccurs="0"/>
 *         &lt;element name="tdsVersion" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardSecurityType", propOrder = {
    "authenticationDataDetails",
    "tdsVersion"
})
public class CreditCardSecurityType {

    protected AuthenticationDataType authenticationDataDetails;
    protected String tdsVersion;

    /**
     * Gets the value of the authenticationDataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationDataType }
     *     
     */
    public AuthenticationDataType getAuthenticationDataDetails() {
        return authenticationDataDetails;
    }

    /**
     * Sets the value of the authenticationDataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationDataType }
     *     
     */
    public void setAuthenticationDataDetails(AuthenticationDataType value) {
        this.authenticationDataDetails = value;
    }

    /**
     * Gets the value of the tdsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdsVersion() {
        return tdsVersion;
    }

    /**
     * Sets the value of the tdsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdsVersion(String value) {
        this.tdsVersion = value;
    }

}
