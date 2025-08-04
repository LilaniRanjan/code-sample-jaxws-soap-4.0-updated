
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Carries the carbon emission provider per transportation mode
 * 
 * <p>Java class for ProviderPerTransportationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderPerTransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carbonEmissionProviderCd" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="computationMethod" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaString_Length1To6" minOccurs="0"/>
 *         &lt;element name="transportationModeType" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To4" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderPerTransportationType", propOrder = {
    "carbonEmissionProviderCd",
    "computationMethod",
    "transportationModeType"
})
public class ProviderPerTransportationType {

    protected String carbonEmissionProviderCd;
    protected String computationMethod;
    protected List<String> transportationModeType;

    /**
     * Gets the value of the carbonEmissionProviderCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarbonEmissionProviderCd() {
        return carbonEmissionProviderCd;
    }

    /**
     * Sets the value of the carbonEmissionProviderCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarbonEmissionProviderCd(String value) {
        this.carbonEmissionProviderCd = value;
    }

    /**
     * Gets the value of the computationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputationMethod() {
        return computationMethod;
    }

    /**
     * Sets the value of the computationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputationMethod(String value) {
        this.computationMethod = value;
    }

    /**
     * Gets the value of the transportationModeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationModeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationModeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportationModeType() {
        if (transportationModeType == null) {
            transportationModeType = new ArrayList<String>();
        }
        return this.transportationModeType;
    }

}
