
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the error occuring during the transaction
 * 
 * <p>Java class for PaymentErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentErrorGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ApplicationErrorInformationType_215551S"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}FreeTextInformationType_202263S" minOccurs="0"/>
 *         &lt;element name="errorSupplementaryData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorSupplementaryMessages" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215552S"/>
 *                   &lt;element name="expirationDate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType_215553S" minOccurs="0"/>
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
@XmlType(name = "PaymentErrorGroupType", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription",
    "errorSupplementaryData"
})
public class PaymentErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType215551S errorOrWarningCodeDetails;
    protected FreeTextInformationType202263S errorWarningDescription;
    protected PaymentErrorGroupType.ErrorSupplementaryData errorSupplementaryData;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType215551S }
     *     
     */
    public ApplicationErrorInformationType215551S getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType215551S }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType215551S value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType202263S }
     *     
     */
    public FreeTextInformationType202263S getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType202263S }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType202263S value) {
        this.errorWarningDescription = value;
    }

    /**
     * Gets the value of the errorSupplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentErrorGroupType.ErrorSupplementaryData }
     *     
     */
    public PaymentErrorGroupType.ErrorSupplementaryData getErrorSupplementaryData() {
        return errorSupplementaryData;
    }

    /**
     * Sets the value of the errorSupplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentErrorGroupType.ErrorSupplementaryData }
     *     
     */
    public void setErrorSupplementaryData(PaymentErrorGroupType.ErrorSupplementaryData value) {
        this.errorSupplementaryData = value;
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
     *         &lt;element name="errorSupplementaryMessages" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AttributeType_215552S"/>
     *         &lt;element name="expirationDate" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StructuredDateTimeInformationType_215553S" minOccurs="0"/>
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
        "errorSupplementaryMessages",
        "expirationDate"
    })
    public static class ErrorSupplementaryData {

        @XmlElement(required = true)
        protected AttributeType215552S errorSupplementaryMessages;
        protected StructuredDateTimeInformationType215553S expirationDate;

        /**
         * Gets the value of the errorSupplementaryMessages property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType215552S }
         *     
         */
        public AttributeType215552S getErrorSupplementaryMessages() {
            return errorSupplementaryMessages;
        }

        /**
         * Sets the value of the errorSupplementaryMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType215552S }
         *     
         */
        public void setErrorSupplementaryMessages(AttributeType215552S value) {
            this.errorSupplementaryMessages = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType215553S }
         *     
         */
        public StructuredDateTimeInformationType215553S getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType215553S }
         *     
         */
        public void setExpirationDate(StructuredDateTimeInformationType215553S value) {
            this.expirationDate = value;
        }

    }

}
