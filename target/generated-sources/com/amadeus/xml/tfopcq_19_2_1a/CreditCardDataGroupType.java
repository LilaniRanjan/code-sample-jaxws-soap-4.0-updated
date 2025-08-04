
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all credit card data needed for payment
 * 
 * <p>Java class for CreditCardDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditCardDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}CreditCardDataType"/>
 *         &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferenceInfoType_190166S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="cardHolderAddress" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AddressType_68622S" minOccurs="0"/>
 *         &lt;element name="virtualCreditCardData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="virtualCreditCardParameters" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}VirtualCardParametersType"/>
 *                   &lt;element name="validityDate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDataGroupType", propOrder = {
    "creditCardDetails",
    "fortknoxIds",
    "cardHolderAddress",
    "virtualCreditCardData"
})
public class CreditCardDataGroupType {

    @XmlElement(required = true)
    protected CreditCardDataType creditCardDetails;
    protected List<ReferenceInfoType190166S> fortknoxIds;
    protected AddressType68622S cardHolderAddress;
    protected CreditCardDataGroupType.VirtualCreditCardData virtualCreditCardData;

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataType }
     *     
     */
    public CreditCardDataType getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataType }
     *     
     */
    public void setCreditCardDetails(CreditCardDataType value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the fortknoxIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fortknoxIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFortknoxIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType190166S }
     * 
     * 
     */
    public List<ReferenceInfoType190166S> getFortknoxIds() {
        if (fortknoxIds == null) {
            fortknoxIds = new ArrayList<ReferenceInfoType190166S>();
        }
        return this.fortknoxIds;
    }

    /**
     * Gets the value of the cardHolderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType68622S }
     *     
     */
    public AddressType68622S getCardHolderAddress() {
        return cardHolderAddress;
    }

    /**
     * Sets the value of the cardHolderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType68622S }
     *     
     */
    public void setCardHolderAddress(AddressType68622S value) {
        this.cardHolderAddress = value;
    }

    /**
     * Gets the value of the virtualCreditCardData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataGroupType.VirtualCreditCardData }
     *     
     */
    public CreditCardDataGroupType.VirtualCreditCardData getVirtualCreditCardData() {
        return virtualCreditCardData;
    }

    /**
     * Sets the value of the virtualCreditCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataGroupType.VirtualCreditCardData }
     *     
     */
    public void setVirtualCreditCardData(CreditCardDataGroupType.VirtualCreditCardData value) {
        this.virtualCreditCardData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="virtualCreditCardParameters" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}VirtualCardParametersType"/>
     *         &lt;element name="validityDate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredPeriodInformationType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "virtualCreditCardParameters",
        "validityDate"
    })
    public static class VirtualCreditCardData {

        @XmlElement(required = true)
        protected VirtualCardParametersType virtualCreditCardParameters;
        protected StructuredPeriodInformationType validityDate;

        /**
         * Gets the value of the virtualCreditCardParameters property.
         * 
         * @return
         *     possible object is
         *     {@link VirtualCardParametersType }
         *     
         */
        public VirtualCardParametersType getVirtualCreditCardParameters() {
            return virtualCreditCardParameters;
        }

        /**
         * Sets the value of the virtualCreditCardParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link VirtualCardParametersType }
         *     
         */
        public void setVirtualCreditCardParameters(VirtualCardParametersType value) {
            this.virtualCreditCardParameters = value;
        }

        /**
         * Gets the value of the validityDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredPeriodInformationType }
         *     
         */
        public StructuredPeriodInformationType getValidityDate() {
            return validityDate;
        }

        /**
         * Sets the value of the validityDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredPeriodInformationType }
         *     
         */
        public void setValidityDate(StructuredPeriodInformationType value) {
            this.validityDate = value;
        }

    }

}
