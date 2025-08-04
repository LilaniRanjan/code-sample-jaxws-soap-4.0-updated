
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information related to agent terminal
 * 
 * <p>Java class for TerminalIdentificationDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalIdentificationDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalID" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length8To8" minOccurs="0"/>
 *         &lt;element name="distributionChannel" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}DistributionChannelType"/>
 *         &lt;element name="originatorType" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="transactionContext" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}TransactionContextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalIdentificationDescriptionType", propOrder = {
    "terminalID",
    "distributionChannel",
    "originatorType",
    "transactionContext"
})
public class TerminalIdentificationDescriptionType {

    protected String terminalID;
    @XmlElement(required = true)
    protected DistributionChannelType distributionChannel;
    protected String originatorType;
    protected TransactionContextType transactionContext;

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelType }
     *     
     */
    public DistributionChannelType getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Sets the value of the distributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelType }
     *     
     */
    public void setDistributionChannel(DistributionChannelType value) {
        this.distributionChannel = value;
    }

    /**
     * Gets the value of the originatorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorType() {
        return originatorType;
    }

    /**
     * Sets the value of the originatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorType(String value) {
        this.originatorType = value;
    }

    /**
     * Gets the value of the transactionContext property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContextType }
     *     
     */
    public TransactionContextType getTransactionContext() {
        return transactionContext;
    }

    /**
     * Sets the value of the transactionContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContextType }
     *     
     */
    public void setTransactionContext(TransactionContextType value) {
        this.transactionContext = value;
    }

}
