
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes communication channel
 * 
 * <p>Java class for CommunicationContactType_202254S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactType_202254S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CommunicationContactDetailsTypeU_129344C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactType_202254S", propOrder = {
    "communication"
})
public class CommunicationContactType202254S {

    @XmlElement(required = true)
    protected CommunicationContactDetailsTypeU129344C communication;

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactDetailsTypeU129344C }
     *     
     */
    public CommunicationContactDetailsTypeU129344C getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactDetailsTypeU129344C }
     *     
     */
    public void setCommunication(CommunicationContactDetailsTypeU129344C value) {
        this.communication = value;
    }

}
