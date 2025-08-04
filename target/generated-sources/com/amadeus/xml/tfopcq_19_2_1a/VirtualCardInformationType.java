
package com.amadeus.xml.tfopcq_19_2_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specify parameters for virtual credit card creation
 * 
 * <p>Java class for VirtualCardInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualCardInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorCode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *         &lt;element name="maximumAuthorizations" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericDecimal_Length1To4" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To3" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCardInformationType", propOrder = {
    "vendorCode",
    "maximumAuthorizations",
    "currency"
})
public class VirtualCardInformationType {

    protected String vendorCode;
    protected BigDecimal maximumAuthorizations;
    protected List<String> currency;

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the maximumAuthorizations property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumAuthorizations() {
        return maximumAuthorizations;
    }

    /**
     * Sets the value of the maximumAuthorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumAuthorizations(BigDecimal value) {
        this.maximumAuthorizations = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<String>();
        }
        return this.currency;
    }

}
