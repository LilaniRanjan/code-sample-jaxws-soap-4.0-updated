
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Goods identification for a specified source
 * 
 * <p>Java class for ItemNumberIdentificationType_192491C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberIdentificationType_192491C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="responsibleAgency" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberIdentificationType_192491C", propOrder = {
    "number",
    "type",
    "qualifier",
    "responsibleAgency"
})
public class ItemNumberIdentificationType192491C {

    protected String number;
    protected String type;
    protected String qualifier;
    protected String responsibleAgency;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the responsibleAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleAgency() {
        return responsibleAgency;
    }

    /**
     * Sets the value of the responsibleAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleAgency(String value) {
        this.responsibleAgency = value;
    }

}
