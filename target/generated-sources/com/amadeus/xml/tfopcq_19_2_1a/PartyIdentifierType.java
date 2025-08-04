
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a party identification. To specify a party identification. To specify a party identification. To specify a party identification
 * 
 * <p>Java class for PartyIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyIdentifier" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="partyCodeQualifier" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentifierType", propOrder = {
    "partyIdentifier",
    "partyCodeQualifier"
})
public class PartyIdentifierType {

    protected String partyIdentifier;
    protected String partyCodeQualifier;

    /**
     * Gets the value of the partyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentifier() {
        return partyIdentifier;
    }

    /**
     * Sets the value of the partyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentifier(String value) {
        this.partyIdentifier = value;
    }

    /**
     * Gets the value of the partyCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCodeQualifier() {
        return partyCodeQualifier;
    }

    /**
     * Sets the value of the partyCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCodeQualifier(String value) {
        this.partyCodeQualifier = value;
    }

}
