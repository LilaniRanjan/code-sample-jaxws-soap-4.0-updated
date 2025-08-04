
package com.amadeus.xml.tipnrq_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Party that plays a role in a business/transaction
 * 
 * <p>Java class for StakeholderGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StakeholderGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stakeholderDetails" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}StakeholderType"/>
 *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}CompanyInformationType" minOccurs="0"/>
 *         &lt;element name="office" type="{http://xml.amadeus.com/TIPNRQ_24_3_1A}PosOfficeIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StakeholderGroup", propOrder = {
    "stakeholderDetails",
    "companyIdentification",
    "office"
})
public class StakeholderGroup {

    @XmlElement(required = true)
    protected StakeholderType stakeholderDetails;
    protected CompanyInformationType companyIdentification;
    protected PosOfficeIdType office;

    /**
     * Gets the value of the stakeholderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StakeholderType }
     *     
     */
    public StakeholderType getStakeholderDetails() {
        return stakeholderDetails;
    }

    /**
     * Sets the value of the stakeholderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StakeholderType }
     *     
     */
    public void setStakeholderDetails(StakeholderType value) {
        this.stakeholderDetails = value;
    }

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType }
     *     
     */
    public CompanyInformationType getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType }
     *     
     */
    public void setCompanyIdentification(CompanyInformationType value) {
        this.companyIdentification = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link PosOfficeIdType }
     *     
     */
    public PosOfficeIdType getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosOfficeIdType }
     *     
     */
    public void setOffice(PosOfficeIdType value) {
        this.office = value;
    }

}
