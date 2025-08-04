
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes communication channel
 * 
 * <p>Java class for CommunicationContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlDetails" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CommunicationContactDetailsTypeU_274202C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactType", propOrder = {
    "urlDetails"
})
public class CommunicationContactType {

    protected CommunicationContactDetailsTypeU274202C urlDetails;

    /**
     * Gets the value of the urlDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactDetailsTypeU274202C }
     *     
     */
    public CommunicationContactDetailsTypeU274202C getUrlDetails() {
        return urlDetails;
    }

    /**
     * Sets the value of the urlDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactDetailsTypeU274202C }
     *     
     */
    public void setUrlDetails(CommunicationContactDetailsTypeU274202C value) {
        this.urlDetails = value;
    }

}
