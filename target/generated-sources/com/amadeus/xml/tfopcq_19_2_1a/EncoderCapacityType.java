
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncoderCapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncoderCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryOutputEncoder" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="otherOutputEncoder" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncoderCapacityType", propOrder = {
    "primaryOutputEncoder",
    "otherOutputEncoder"
})
public class EncoderCapacityType {

    @XmlElement(required = true)
    protected String primaryOutputEncoder;
    protected String otherOutputEncoder;

    /**
     * Gets the value of the primaryOutputEncoder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOutputEncoder() {
        return primaryOutputEncoder;
    }

    /**
     * Sets the value of the primaryOutputEncoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOutputEncoder(String value) {
        this.primaryOutputEncoder = value;
    }

    /**
     * Gets the value of the otherOutputEncoder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOutputEncoder() {
        return otherOutputEncoder;
    }

    /**
     * Sets the value of the otherOutputEncoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOutputEncoder(String value) {
        this.otherOutputEncoder = value;
    }

}
