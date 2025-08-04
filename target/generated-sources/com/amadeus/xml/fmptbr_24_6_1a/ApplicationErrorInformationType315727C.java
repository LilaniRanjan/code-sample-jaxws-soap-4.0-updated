
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationErrorInformationType_315727C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType_315727C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="codeListQualifier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="priceType" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length0To3" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="wrntitle" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To40" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType_315727C", propOrder = {
    "error",
    "codeListQualifier",
    "agency",
    "priceType",
    "wrntitle"
})
public class ApplicationErrorInformationType315727C {

    @XmlElement(required = true)
    protected String error;
    protected String codeListQualifier;
    protected String agency;
    protected List<String> priceType;
    protected String wrntitle;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the codeListQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListQualifier() {
        return codeListQualifier;
    }

    /**
     * Sets the value of the codeListQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListQualifier(String value) {
        this.codeListQualifier = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPriceType() {
        if (priceType == null) {
            priceType = new ArrayList<String>();
        }
        return this.priceType;
    }

    /**
     * Gets the value of the wrntitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrntitle() {
        return wrntitle;
    }

    /**
     * Sets the value of the wrntitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrntitle(String value) {
        this.wrntitle = value;
    }

}
