
package com.amadeus.xml.fmpcaq_20_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfUnitDetailsType_307599C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitDetailsType_307599C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}NumericInteger_Length1To6"/>
 *         &lt;element name="typeOfUnit" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitDetailsType_307599C", propOrder = {
    "numberOfUnits",
    "typeOfUnit"
})
public class NumberOfUnitDetailsType307599C {

    @XmlElement(required = true)
    protected BigInteger numberOfUnits;
    @XmlElement(required = true)
    protected String typeOfUnit;

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the typeOfUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfUnit() {
        return typeOfUnit;
    }

    /**
     * Sets the value of the typeOfUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfUnit(String value) {
        this.typeOfUnit = value;
    }

}
