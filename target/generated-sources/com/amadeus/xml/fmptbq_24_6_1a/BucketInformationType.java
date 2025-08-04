
package com.amadeus.xml.fmptbq_24_6_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BucketInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BucketInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="completion" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="valueRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="count" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumericInteger_Length1To6" minOccurs="0"/>
 *         &lt;element name="attributeCount" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumericInteger_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BucketInformationType", propOrder = {
    "number",
    "name",
    "completion",
    "mode",
    "valueRef",
    "weight",
    "count",
    "attributeCount"
})
public class BucketInformationType {

    protected String number;
    protected String name;
    protected String completion;
    protected String mode;
    protected String valueRef;
    protected BigInteger weight;
    protected BigInteger count;
    protected BigInteger attributeCount;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the completion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletion() {
        return completion;
    }

    /**
     * Sets the value of the completion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletion(String value) {
        this.completion = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeight(BigInteger value) {
        this.weight = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the attributeCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttributeCount() {
        return attributeCount;
    }

    /**
     * Sets the value of the attributeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttributeCount(BigInteger value) {
        this.attributeCount = value;
    }

}
