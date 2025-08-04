
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeypadCapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeypadCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryInputKeypad" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="otherInputKeypad" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeypadCapacityType", propOrder = {
    "primaryInputKeypad",
    "otherInputKeypad"
})
public class KeypadCapacityType {

    @XmlElement(required = true)
    protected String primaryInputKeypad;
    protected List<String> otherInputKeypad;

    /**
     * Gets the value of the primaryInputKeypad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInputKeypad() {
        return primaryInputKeypad;
    }

    /**
     * Sets the value of the primaryInputKeypad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInputKeypad(String value) {
        this.primaryInputKeypad = value;
    }

    /**
     * Gets the value of the otherInputKeypad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInputKeypad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInputKeypad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherInputKeypad() {
        if (otherInputKeypad == null) {
            otherInputKeypad = new ArrayList<String>();
        }
        return this.otherInputKeypad;
    }

}
