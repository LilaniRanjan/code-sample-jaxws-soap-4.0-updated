
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specify parameters for virtual credit card creation
 * 
 * <p>Java class for VirtualCardParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualCardParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="virtualCardInformation" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}VirtualCardInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCardParametersType", propOrder = {
    "virtualCardInformation"
})
public class VirtualCardParametersType {

    protected VirtualCardInformationType virtualCardInformation;

    /**
     * Gets the value of the virtualCardInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCardInformationType }
     *     
     */
    public VirtualCardInformationType getVirtualCardInformation() {
        return virtualCardInformation;
    }

    /**
     * Sets the value of the virtualCardInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCardInformationType }
     *     
     */
    public void setVirtualCardInformation(VirtualCardInformationType value) {
        this.virtualCardInformation = value;
    }

}
