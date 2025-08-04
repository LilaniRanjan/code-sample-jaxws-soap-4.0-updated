
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide routing information.
 * 
 * <p>Java class for RoutingInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routingDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ProductLocationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInformationTypeI", propOrder = {
    "routingDetails"
})
public class RoutingInformationTypeI {

    @XmlElement(required = true)
    protected ProductLocationDetailsTypeI routingDetails;

    /**
     * Gets the value of the routingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLocationDetailsTypeI }
     *     
     */
    public ProductLocationDetailsTypeI getRoutingDetails() {
        return routingDetails;
    }

    /**
     * Sets the value of the routingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLocationDetailsTypeI }
     *     
     */
    public void setRoutingDetails(ProductLocationDetailsTypeI value) {
        this.routingDetails = value;
    }

}
