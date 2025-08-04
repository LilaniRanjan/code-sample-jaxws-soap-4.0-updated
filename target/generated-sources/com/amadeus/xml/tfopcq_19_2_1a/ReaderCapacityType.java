
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReaderCapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReaderCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryInputReader" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="otherInputReader" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReaderCapacityType", propOrder = {
    "primaryInputReader",
    "otherInputReader"
})
public class ReaderCapacityType {

    @XmlElement(required = true)
    protected String primaryInputReader;
    protected List<String> otherInputReader;

    /**
     * Gets the value of the primaryInputReader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInputReader() {
        return primaryInputReader;
    }

    /**
     * Sets the value of the primaryInputReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInputReader(String value) {
        this.primaryInputReader = value;
    }

    /**
     * Gets the value of the otherInputReader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInputReader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInputReader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherInputReader() {
        if (otherInputReader == null) {
            otherInputReader = new ArrayList<String>();
        }
        return this.otherInputReader;
    }

}
