
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment and not found in the FOP segment
 * 
 * <p>Java class for TicketingFormOfPaymentType_223002S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingFormOfPaymentType_223002S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FormOfPaymentInformationType_306313C" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingFormOfPaymentType_223002S", propOrder = {
    "fopDetails"
})
public class TicketingFormOfPaymentType223002S {

    protected List<FormOfPaymentInformationType306313C> fopDetails;

    /**
     * Gets the value of the fopDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fopDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFopDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentInformationType306313C }
     * 
     * 
     */
    public List<FormOfPaymentInformationType306313C> getFopDetails() {
        if (fopDetails == null) {
            fopDetails = new ArrayList<FormOfPaymentInformationType306313C>();
        }
        return this.fopDetails;
    }

}
