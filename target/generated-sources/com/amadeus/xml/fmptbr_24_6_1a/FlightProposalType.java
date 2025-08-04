
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightProposalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightProposalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqSgt" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="psdSgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProposalType", propOrder = {
    "reqSgt",
    "psdSgtRef"
})
public class FlightProposalType {

    protected String reqSgt;
    protected String psdSgtRef;

    /**
     * Gets the value of the reqSgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqSgt() {
        return reqSgt;
    }

    /**
     * Sets the value of the reqSgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqSgt(String value) {
        this.reqSgt = value;
    }

    /**
     * Gets the value of the psdSgtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsdSgtRef() {
        return psdSgtRef;
    }

    /**
     * Sets the value of the psdSgtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsdSgtRef(String value) {
        this.psdSgtRef = value;
    }

}
