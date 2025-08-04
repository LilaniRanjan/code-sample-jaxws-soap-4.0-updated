
package com.amadeus.xml.tpcbrq_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * convey offer references
 * 
 * <p>Java class for OfferReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerIdentifier" type="{http://xml.amadeus.com/TPCBRQ_24_3_1A}OfferType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferReferencesType", propOrder = {
    "offerIdentifier"
})
public class OfferReferencesType {

    @XmlElement(required = true)
    protected OfferType offerIdentifier;

    /**
     * Gets the value of the offerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOfferIdentifier() {
        return offerIdentifier;
    }

    /**
     * Sets the value of the offerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOfferIdentifier(OfferType value) {
        this.offerIdentifier = value;
    }

}
