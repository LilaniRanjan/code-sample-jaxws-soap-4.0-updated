
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all MOP specific data for Web Fund Transfer
 * 
 * <p>Java class for WebFundTransferGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebFundTransferGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuerId" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}ReferenceInfoType_202086S"/>
 *         &lt;element name="paymentProvider" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}CompanyInformationType_202069S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFundTransferGroupType", propOrder = {
    "issuerId",
    "paymentProvider"
})
public class WebFundTransferGroupType {

    @XmlElement(required = true)
    protected ReferenceInfoType202086S issuerId;
    @XmlElement(required = true)
    protected CompanyInformationType202069S paymentProvider;

    /**
     * Gets the value of the issuerId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType202086S }
     *     
     */
    public ReferenceInfoType202086S getIssuerId() {
        return issuerId;
    }

    /**
     * Sets the value of the issuerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType202086S }
     *     
     */
    public void setIssuerId(ReferenceInfoType202086S value) {
        this.issuerId = value;
    }

    /**
     * Gets the value of the paymentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType202069S }
     *     
     */
    public CompanyInformationType202069S getPaymentProvider() {
        return paymentProvider;
    }

    /**
     * Sets the value of the paymentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType202069S }
     *     
     */
    public void setPaymentProvider(CompanyInformationType202069S value) {
        this.paymentProvider = value;
    }

}
