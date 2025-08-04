
package com.amadeus.xml.quqpcr_03_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="errorReturn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorDefinition" type="{http://xml.amadeus.com/QUQPCR_03_1_1A}ApplicationErrorInformationTypeI"/>
 *                   &lt;element name="errorText" type="{http://xml.amadeus.com/QUQPCR_03_1_1A}FreeTextInformationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recordLocator" type="{http://xml.amadeus.com/QUQPCR_03_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
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
    "errorReturn",
    "recordLocator"
})
@XmlRootElement(name = "Queue_PlacePNRReply")
public class QueuePlacePNRReply {

    protected QueuePlacePNRReply.ErrorReturn errorReturn;
    protected ReservationControlInformationTypeI recordLocator;

    /**
     * Gets the value of the errorReturn property.
     * 
     * @return
     *     possible object is
     *     {@link QueuePlacePNRReply.ErrorReturn }
     *     
     */
    public QueuePlacePNRReply.ErrorReturn getErrorReturn() {
        return errorReturn;
    }

    /**
     * Sets the value of the errorReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueuePlacePNRReply.ErrorReturn }
     *     
     */
    public void setErrorReturn(QueuePlacePNRReply.ErrorReturn value) {
        this.errorReturn = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setRecordLocator(ReservationControlInformationTypeI value) {
        this.recordLocator = value;
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
     *         &lt;element name="errorDefinition" type="{http://xml.amadeus.com/QUQPCR_03_1_1A}ApplicationErrorInformationTypeI"/>
     *         &lt;element name="errorText" type="{http://xml.amadeus.com/QUQPCR_03_1_1A}FreeTextInformationType" minOccurs="0"/>
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
        "errorDefinition",
        "errorText"
    })
    public static class ErrorReturn {

        @XmlElement(required = true)
        protected ApplicationErrorInformationTypeI errorDefinition;
        protected FreeTextInformationType errorText;

        /**
         * Gets the value of the errorDefinition property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public ApplicationErrorInformationTypeI getErrorDefinition() {
            return errorDefinition;
        }

        /**
         * Sets the value of the errorDefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public void setErrorDefinition(ApplicationErrorInformationTypeI value) {
            this.errorDefinition = value;
        }

        /**
         * Gets the value of the errorText property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformationType }
         *     
         */
        public FreeTextInformationType getErrorText() {
            return errorText;
        }

        /**
         * Sets the value of the errorText property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformationType }
         *     
         */
        public void setErrorText(FreeTextInformationType value) {
            this.errorText = value;
        }

    }

}
