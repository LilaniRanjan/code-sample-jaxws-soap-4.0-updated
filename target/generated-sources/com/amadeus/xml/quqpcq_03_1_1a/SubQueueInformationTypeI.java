
package com.amadeus.xml.quqpcq_03_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of a reservation sub queue
 * 
 * <p>Java class for SubQueueInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubQueueInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subQueueInfoDetails" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}SubQueueInformationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubQueueInformationTypeI", propOrder = {
    "subQueueInfoDetails"
})
public class SubQueueInformationTypeI {

    @XmlElement(required = true)
    protected SubQueueInformationDetailsTypeI subQueueInfoDetails;

    /**
     * Gets the value of the subQueueInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubQueueInformationDetailsTypeI }
     *     
     */
    public SubQueueInformationDetailsTypeI getSubQueueInfoDetails() {
        return subQueueInfoDetails;
    }

    /**
     * Sets the value of the subQueueInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubQueueInformationDetailsTypeI }
     *     
     */
    public void setSubQueueInfoDetails(SubQueueInformationDetailsTypeI value) {
        this.subQueueInfoDetails = value;
    }

}
