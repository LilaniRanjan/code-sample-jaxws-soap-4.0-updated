
package com.amadeus.xml.fmptbq_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify corporate number(s) or name(s)
 * 
 * <p>Java class for CorporateIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateId" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CorporateIdentityType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="corporateCodeCompanyLists" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CorporateCodeCxrListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateIdentificationType", propOrder = {
    "corporateId",
    "corporateCodeCompanyLists"
})
public class CorporateIdentificationType {

    protected List<CorporateIdentityType> corporateId;
    protected CorporateCodeCxrListType corporateCodeCompanyLists;

    /**
     * Gets the value of the corporateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateIdentityType }
     * 
     * 
     */
    public List<CorporateIdentityType> getCorporateId() {
        if (corporateId == null) {
            corporateId = new ArrayList<CorporateIdentityType>();
        }
        return this.corporateId;
    }

    /**
     * Gets the value of the corporateCodeCompanyLists property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateCodeCxrListType }
     *     
     */
    public CorporateCodeCxrListType getCorporateCodeCompanyLists() {
        return corporateCodeCompanyLists;
    }

    /**
     * Sets the value of the corporateCodeCompanyLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateCodeCxrListType }
     *     
     */
    public void setCorporateCodeCompanyLists(CorporateCodeCxrListType value) {
        this.corporateCodeCompanyLists = value;
    }

}
