
package com.amadeus.xml.fmptbq_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * <p>Java class for TravellerDetailsType_313059C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDetailsType_313059C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="uniqueCustomerIdentifier" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="infantIndicator" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="title" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="otherTitle" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDetailsType_313059C", propOrder = {
    "givenName",
    "uniqueCustomerIdentifier",
    "infantIndicator",
    "title",
    "otherTitle",
    "surname"
})
public class TravellerDetailsType313059C {

    protected String givenName;
    protected String uniqueCustomerIdentifier;
    protected String infantIndicator;
    protected String title;
    protected String otherTitle;
    protected String surname;

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the uniqueCustomerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /**
     * Sets the value of the uniqueCustomerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCustomerIdentifier(String value) {
        this.uniqueCustomerIdentifier = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the otherTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTitle() {
        return otherTitle;
    }

    /**
     * Sets the value of the otherTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTitle(String value) {
        this.otherTitle = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
