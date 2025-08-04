
package com.amadeus.xml.fmptbr_24_6_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To carry carbon emission details per cabin
 * 
 * <p>Java class for CarbonEmissionByCabinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarbonEmissionByCabinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaString_Length0To1"/>
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length1To15"/>
 *         &lt;element name="gasCode" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="gasUnit" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarbonEmissionByCabinType", propOrder = {
    "cabin",
    "quantity",
    "gasCode",
    "gasUnit"
})
public class CarbonEmissionByCabinType {

    @XmlElement(required = true)
    protected String cabin;
    @XmlElement(required = true)
    protected BigInteger quantity;
    protected String gasCode;
    protected String gasUnit;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the gasCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasCode() {
        return gasCode;
    }

    /**
     * Sets the value of the gasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasCode(String value) {
        this.gasCode = value;
    }

    /**
     * Gets the value of the gasUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasUnit() {
        return gasUnit;
    }

    /**
     * Sets the value of the gasUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasUnit(String value) {
        this.gasUnit = value;
    }

}
