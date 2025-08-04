
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Displays penalties levied for different applying time bound situations
 * 
 * <p>Java class for PenaltyDetailsType_232330S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyDetailsType_232330S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penaltyDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PenaltyDetailsType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="Dummy.NET" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyDetailsType_232330S", propOrder = {
    "penaltyDetails"
})
public class PenaltyDetailsType232330S {

    protected List<PenaltyDetailsType> penaltyDetails;

    /**
     * Gets the value of the penaltyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyDetailsType }
     * 
     * 
     */
    public List<PenaltyDetailsType> getPenaltyDetails() {
        if (penaltyDetails == null) {
            penaltyDetails = new ArrayList<PenaltyDetailsType>();
        }
        return this.penaltyDetails;
    }

}
