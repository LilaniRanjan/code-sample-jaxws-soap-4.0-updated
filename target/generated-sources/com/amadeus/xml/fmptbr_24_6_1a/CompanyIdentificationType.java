
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketingCarrier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length2To3"/>
 *         &lt;element name="operatingCarrier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length2To3" minOccurs="0"/>
 *         &lt;element name="alliance" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationType", propOrder = {
    "marketingCarrier",
    "operatingCarrier",
    "alliance"
})
public class CompanyIdentificationType {

    @XmlElement(required = true)
    protected String marketingCarrier;
    protected String operatingCarrier;
    protected String alliance;

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrier(String value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the alliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlliance(String value) {
        this.alliance = value;
    }

}
