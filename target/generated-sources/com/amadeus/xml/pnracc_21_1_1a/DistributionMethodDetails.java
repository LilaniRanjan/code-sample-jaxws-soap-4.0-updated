
package com.amadeus.xml.pnracc_21_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionMethodDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionMethodDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distriProductCode" type="{http://xml.amadeus.com/PNRACC_21_1_1A}AlphaNumericString_Length1To1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionMethodDetails", propOrder = {
    "distriProductCode"
})
public class DistributionMethodDetails {

    @XmlElement(required = true)
    protected String distriProductCode;

    /**
     * Gets the value of the distriProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistriProductCode() {
        return distriProductCode;
    }

    /**
     * Sets the value of the distriProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistriProductCode(String value) {
        this.distriProductCode = value;
    }

}
