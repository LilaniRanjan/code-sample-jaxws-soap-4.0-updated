
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey the approval data of the transaction
 * 
 * <p>Java class for GenericAuthorisationResultType_202258S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericAuthorisationResultType_202258S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalCodeData" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AuthorizationApprovalDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAuthorisationResultType_202258S", propOrder = {
    "approvalCodeData"
})
public class GenericAuthorisationResultType202258S {

    protected AuthorizationApprovalDataType approvalCodeData;

    /**
     * Gets the value of the approvalCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationApprovalDataType }
     *     
     */
    public AuthorizationApprovalDataType getApprovalCodeData() {
        return approvalCodeData;
    }

    /**
     * Sets the value of the approvalCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationApprovalDataType }
     *     
     */
    public void setApprovalCodeData(AuthorizationApprovalDataType value) {
        this.approvalCodeData = value;
    }

}
