
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DimensionDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bucketRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="valueRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionDetailType", propOrder = {
    "bucketRef",
    "valueRef"
})
public class DimensionDetailType {

    protected String bucketRef;
    protected String valueRef;

    /**
     * Gets the value of the bucketRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketRef() {
        return bucketRef;
    }

    /**
     * Sets the value of the bucketRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketRef(String value) {
        this.bucketRef = value;
    }

    /**
     * Gets the value of the valueRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRef() {
        return valueRef;
    }

    /**
     * Sets the value of the valueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueRef(String value) {
        this.valueRef = value;
    }

}
