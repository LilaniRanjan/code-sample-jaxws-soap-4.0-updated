
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to specify details relating to the transaction
 * 
 * <p>Java class for TransactionInformationForTicketingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationForTicketingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}TransactionInformationsType_245700C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformationForTicketingType", propOrder = {
    "transactionDetails"
})
public class TransactionInformationForTicketingType {

    @XmlElement(required = true)
    protected TransactionInformationsType245700C transactionDetails;

    /**
     * Gets the value of the transactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationsType245700C }
     *     
     */
    public TransactionInformationsType245700C getTransactionDetails() {
        return transactionDetails;
    }

    /**
     * Sets the value of the transactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationsType245700C }
     *     
     */
    public void setTransactionDetails(TransactionInformationsType245700C value) {
        this.transactionDetails = value;
    }

}
