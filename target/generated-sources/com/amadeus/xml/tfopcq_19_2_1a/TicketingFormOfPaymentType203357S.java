
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment and not found in the FOP segment
 * 
 * <p>Java class for TicketingFormOfPaymentType_203357S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingFormOfPaymentType_203357S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FormOfPaymentInformationType_282478C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingFormOfPaymentType_203357S", propOrder = {
    "fopDetails"
})
public class TicketingFormOfPaymentType203357S {

    protected FormOfPaymentInformationType282478C fopDetails;

    /**
     * Gets the value of the fopDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentInformationType282478C }
     *     
     */
    public FormOfPaymentInformationType282478C getFopDetails() {
        return fopDetails;
    }

    /**
     * Sets the value of the fopDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentInformationType282478C }
     *     
     */
    public void setFopDetails(FormOfPaymentInformationType282478C value) {
        this.fopDetails = value;
    }

}
