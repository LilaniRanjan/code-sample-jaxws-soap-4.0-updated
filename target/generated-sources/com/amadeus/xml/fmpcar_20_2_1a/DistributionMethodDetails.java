
package com.amadeus.xml.fmpcar_20_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="methodCode" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="distriProductCode" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
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
    "methodCode",
    "distriProductCode"
})
public class DistributionMethodDetails {

    protected String methodCode;
    protected String distriProductCode;

    /**
     * Gets the value of the methodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * Sets the value of the methodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodCode(String value) {
        this.methodCode = value;
    }

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
