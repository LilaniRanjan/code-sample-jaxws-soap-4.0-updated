
package com.amadeus.xml.tipnrq_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingOptionKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingOptionKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingOptionKeyType", propOrder = {
    "pricingOptionKey"
})
public class PricingOptionKeyType {

    @XmlElement(required = true)
    protected String pricingOptionKey;

    /**
     * Gets the value of the pricingOptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingOptionKey() {
        return pricingOptionKey;
    }

    /**
     * Sets the value of the pricingOptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingOptionKey(String value) {
        this.pricingOptionKey = value;
    }

}
