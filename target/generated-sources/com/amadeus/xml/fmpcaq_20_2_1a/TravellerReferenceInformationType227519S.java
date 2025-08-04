
package com.amadeus.xml.fmpcaq_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify traveller/personal details
 * 
 * <p>Java class for TravellerReferenceInformationType_227519S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerReferenceInformationType_227519S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ptc" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="traveller" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}TravellerDetailsType_311635C" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerReferenceInformationType_227519S", propOrder = {
    "ptc",
    "traveller"
})
public class TravellerReferenceInformationType227519S {

    protected String ptc;
    protected List<TravellerDetailsType311635C> traveller;

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtc() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtc(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDetailsType311635C }
     * 
     * 
     */
    public List<TravellerDetailsType311635C> getTraveller() {
        if (traveller == null) {
            traveller = new ArrayList<TravellerDetailsType311635C>();
        }
        return this.traveller;
    }

}
