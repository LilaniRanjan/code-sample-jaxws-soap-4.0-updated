
package com.amadeus.xml.fmptbr_24_6_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket
 * 
 * <p>Java class for PricingTicketingSubsequentType_228122S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentType_228122S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxFareNum" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="totalFareAmount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="totalTaxAmount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="codeShareDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CompanyRoleIdentificationType_120783C" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationDetailsType_277475C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="pricingTicketing" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentType_228122S", propOrder = {
    "paxFareNum",
    "totalFareAmount",
    "totalTaxAmount",
    "codeShareDetails",
    "monetaryDetails",
    "pricingTicketing"
})
public class PricingTicketingSubsequentType228122S {

    @XmlElement(required = true)
    protected String paxFareNum;
    protected BigDecimal totalFareAmount;
    protected BigDecimal totalTaxAmount;
    protected List<CompanyRoleIdentificationType120783C> codeShareDetails;
    protected List<MonetaryInformationDetailsType277475C> monetaryDetails;
    protected PricingTicketingInformationType pricingTicketing;

    /**
     * Gets the value of the paxFareNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxFareNum() {
        return paxFareNum;
    }

    /**
     * Sets the value of the paxFareNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxFareNum(String value) {
        this.paxFareNum = value;
    }

    /**
     * Gets the value of the totalFareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFareAmount() {
        return totalFareAmount;
    }

    /**
     * Sets the value of the totalFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFareAmount(BigDecimal value) {
        this.totalFareAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxAmount(BigDecimal value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the codeShareDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeShareDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeShareDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyRoleIdentificationType120783C }
     * 
     * 
     */
    public List<CompanyRoleIdentificationType120783C> getCodeShareDetails() {
        if (codeShareDetails == null) {
            codeShareDetails = new ArrayList<CompanyRoleIdentificationType120783C>();
        }
        return this.codeShareDetails;
    }

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType277475C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType277475C> getMonetaryDetails() {
        if (monetaryDetails == null) {
            monetaryDetails = new ArrayList<MonetaryInformationDetailsType277475C>();
        }
        return this.monetaryDetails;
    }

    /**
     * Gets the value of the pricingTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public PricingTicketingInformationType getPricingTicketing() {
        return pricingTicketing;
    }

    /**
     * Sets the value of the pricingTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public void setPricingTicketing(PricingTicketingInformationType value) {
        this.pricingTicketing = value;
    }

}
