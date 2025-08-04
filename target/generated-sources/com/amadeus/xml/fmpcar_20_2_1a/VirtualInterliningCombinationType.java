
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualInterliningCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualInterliningCombinationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="recoRef" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="flightProposal" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}FlightProposalType" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualInterliningCombinationType", propOrder = {
    "number",
    "recoRef",
    "flightProposal"
})
public class VirtualInterliningCombinationType {

    protected String number;
    protected String recoRef;
    protected List<FlightProposalType> flightProposal;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the recoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoRef() {
        return recoRef;
    }

    /**
     * Sets the value of the recoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoRef(String value) {
        this.recoRef = value;
    }

    /**
     * Gets the value of the flightProposal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightProposal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightProposal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightProposalType }
     * 
     * 
     */
    public List<FlightProposalType> getFlightProposal() {
        if (flightProposal == null) {
            flightProposal = new ArrayList<FlightProposalType>();
        }
        return this.flightProposal;
    }

}
