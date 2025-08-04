
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsynchPaymentStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsynchPaymentStatusGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalReferenceNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}GenericAuthorisationResultType"/>
 *         &lt;element name="asyncPaymentUrl" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CommunicationContactType_202097S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsynchPaymentStatusGroupType", propOrder = {
    "approvalReferenceNumber",
    "asyncPaymentUrl"
})
public class AsynchPaymentStatusGroupType {

    @XmlElement(required = true)
    protected GenericAuthorisationResultType approvalReferenceNumber;
    protected CommunicationContactType202097S asyncPaymentUrl;

    /**
     * Gets the value of the approvalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public GenericAuthorisationResultType getApprovalReferenceNumber() {
        return approvalReferenceNumber;
    }

    /**
     * Sets the value of the approvalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public void setApprovalReferenceNumber(GenericAuthorisationResultType value) {
        this.approvalReferenceNumber = value;
    }

    /**
     * Gets the value of the asyncPaymentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType202097S }
     *     
     */
    public CommunicationContactType202097S getAsyncPaymentUrl() {
        return asyncPaymentUrl;
    }

    /**
     * Sets the value of the asyncPaymentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType202097S }
     *     
     */
    public void setAsyncPaymentUrl(CommunicationContactType202097S value) {
        this.asyncPaymentUrl = value;
    }

}
