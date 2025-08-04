
package com.amadeus.xml.tfopcr_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationMethodsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationMethodsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryVerificationMethod" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="otherVerificationMethod" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To25" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationMethodsType", propOrder = {
    "primaryVerificationMethod",
    "otherVerificationMethod"
})
public class VerificationMethodsType {

    @XmlElement(required = true)
    protected String primaryVerificationMethod;
    protected List<String> otherVerificationMethod;

    /**
     * Gets the value of the primaryVerificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryVerificationMethod() {
        return primaryVerificationMethod;
    }

    /**
     * Sets the value of the primaryVerificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryVerificationMethod(String value) {
        this.primaryVerificationMethod = value;
    }

    /**
     * Gets the value of the otherVerificationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherVerificationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherVerificationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherVerificationMethod() {
        if (otherVerificationMethod == null) {
            otherVerificationMethod = new ArrayList<String>();
        }
        return this.otherVerificationMethod;
    }

}
