
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicesReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicesReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fromPrice" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicesReferencesType", propOrder = {
    "reference",
    "status",
    "fromPrice"
})
public class ServicesReferencesType {

    protected String reference;
    protected String status;
    protected String fromPrice;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the fromPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPrice() {
        return fromPrice;
    }

    /**
     * Sets the value of the fromPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPrice(String value) {
        this.fromPrice = value;
    }

}
