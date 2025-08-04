
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distributionChannelField" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="subGroup" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="accessType" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionChannelType", propOrder = {
    "distributionChannelField",
    "subGroup",
    "accessType"
})
public class DistributionChannelType {

    @XmlElement(required = true)
    protected String distributionChannelField;
    protected String subGroup;
    protected String accessType;

    /**
     * Gets the value of the distributionChannelField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionChannelField() {
        return distributionChannelField;
    }

    /**
     * Sets the value of the distributionChannelField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionChannelField(String value) {
        this.distributionChannelField = value;
    }

    /**
     * Gets the value of the subGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroup() {
        return subGroup;
    }

    /**
     * Sets the value of the subGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroup(String value) {
        this.subGroup = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

}
