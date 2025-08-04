
package com.amadeus.xml.tfopcq_19_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionCondition" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="identityVerifiedBy" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="remoteCommerceIndicators" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="authorCharacteristicInd" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="authorLifecycleLimit" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="cardSequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumericInteger_Length1To7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContextType", propOrder = {
    "transactionCondition",
    "identityVerifiedBy",
    "remoteCommerceIndicators",
    "authorCharacteristicInd",
    "authorLifecycleLimit",
    "cardSequenceNumber"
})
public class TransactionContextType {

    @XmlElement(required = true)
    protected String transactionCondition;
    protected String identityVerifiedBy;
    protected String remoteCommerceIndicators;
    protected String authorCharacteristicInd;
    protected BigInteger authorLifecycleLimit;
    protected BigInteger cardSequenceNumber;

    /**
     * Gets the value of the transactionCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCondition() {
        return transactionCondition;
    }

    /**
     * Sets the value of the transactionCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCondition(String value) {
        this.transactionCondition = value;
    }

    /**
     * Gets the value of the identityVerifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityVerifiedBy() {
        return identityVerifiedBy;
    }

    /**
     * Sets the value of the identityVerifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityVerifiedBy(String value) {
        this.identityVerifiedBy = value;
    }

    /**
     * Gets the value of the remoteCommerceIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteCommerceIndicators() {
        return remoteCommerceIndicators;
    }

    /**
     * Sets the value of the remoteCommerceIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteCommerceIndicators(String value) {
        this.remoteCommerceIndicators = value;
    }

    /**
     * Gets the value of the authorCharacteristicInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorCharacteristicInd() {
        return authorCharacteristicInd;
    }

    /**
     * Sets the value of the authorCharacteristicInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorCharacteristicInd(String value) {
        this.authorCharacteristicInd = value;
    }

    /**
     * Gets the value of the authorLifecycleLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorLifecycleLimit() {
        return authorLifecycleLimit;
    }

    /**
     * Sets the value of the authorLifecycleLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorLifecycleLimit(BigInteger value) {
        this.authorLifecycleLimit = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardSequenceNumber(BigInteger value) {
        this.cardSequenceNumber = value;
    }

}
