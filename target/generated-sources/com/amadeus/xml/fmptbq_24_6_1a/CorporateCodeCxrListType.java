
package com.amadeus.xml.fmptbq_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Corporate fare types indicated in PTK are detailed
 * 
 * <p>Java class for CorporateCodeCxrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateCodeCxrListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyQualifier" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="companyID" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length2To3" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateCodeCxrListType", propOrder = {
    "companyQualifier",
    "companyID"
})
public class CorporateCodeCxrListType {

    protected String companyQualifier;
    protected List<String> companyID;

    /**
     * Gets the value of the companyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyQualifier() {
        return companyQualifier;
    }

    /**
     * Sets the value of the companyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyQualifier(String value) {
        this.companyQualifier = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompanyID() {
        if (companyID == null) {
            companyID = new ArrayList<String>();
        }
        return this.companyID;
    }

}
