
package com.amadeus.xml.pnracc_21_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Method indicator for polling source
 * 
 * <p>Java class for MethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distributionMethodDetails" type="{http://xml.amadeus.com/PNRACC_21_1_1A}DistributionMethodDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodType", propOrder = {
    "distributionMethodDetails"
})
public class MethodType {

    @XmlElement(required = true)
    protected DistributionMethodDetails distributionMethodDetails;

    /**
     * Gets the value of the distributionMethodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionMethodDetails }
     *     
     */
    public DistributionMethodDetails getDistributionMethodDetails() {
        return distributionMethodDetails;
    }

    /**
     * Sets the value of the distributionMethodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionMethodDetails }
     *     
     */
    public void setDistributionMethodDetails(DistributionMethodDetails value) {
        this.distributionMethodDetails = value;
    }

}
