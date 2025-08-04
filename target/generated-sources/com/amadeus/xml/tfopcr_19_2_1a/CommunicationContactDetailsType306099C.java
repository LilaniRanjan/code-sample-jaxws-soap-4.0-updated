
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Communication identifier such as URL address.
 * 
 * <p>Java class for CommunicationContactDetailsType_306099C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactDetailsType_306099C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internetAddress" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To2500"/>
 *         &lt;element name="adressQualifier" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactDetailsType_306099C", propOrder = {
    "internetAddress",
    "adressQualifier"
})
public class CommunicationContactDetailsType306099C {

    @XmlElement(required = true)
    protected String internetAddress;
    @XmlElement(required = true)
    protected String adressQualifier;

    /**
     * Gets the value of the internetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAddress() {
        return internetAddress;
    }

    /**
     * Sets the value of the internetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAddress(String value) {
        this.internetAddress = value;
    }

    /**
     * Gets the value of the adressQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressQualifier() {
        return adressQualifier;
    }

    /**
     * Sets the value of the adressQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressQualifier(String value) {
        this.adressQualifier = value;
    }

}
