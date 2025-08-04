
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputDisplayCapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputDisplayCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryChannelSupervision" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="otherChannelSupervision" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDisplayCapacityType", propOrder = {
    "primaryChannelSupervision",
    "otherChannelSupervision"
})
public class OutputDisplayCapacityType {

    @XmlElement(required = true)
    protected String primaryChannelSupervision;
    protected String otherChannelSupervision;

    /**
     * Gets the value of the primaryChannelSupervision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryChannelSupervision() {
        return primaryChannelSupervision;
    }

    /**
     * Sets the value of the primaryChannelSupervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryChannelSupervision(String value) {
        this.primaryChannelSupervision = value;
    }

    /**
     * Gets the value of the otherChannelSupervision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherChannelSupervision() {
        return otherChannelSupervision;
    }

    /**
     * Sets the value of the otherChannelSupervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherChannelSupervision(String value) {
        this.otherChannelSupervision = value;
    }

}
