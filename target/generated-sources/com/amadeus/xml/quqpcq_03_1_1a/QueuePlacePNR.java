
package com.amadeus.xml.quqpcq_03_1_1a;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="placementOption" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}SelectionDetailsTypeI"/>
 *         &lt;element name="targetDetails" maxOccurs="10">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="targetOffice" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}AdditionalBusinessSourceInformationType"/>
 *                   &lt;element name="queueNumber" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}QueueInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="categoryDetails" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}SubQueueInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="placementDate" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recordLocator" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}ReservationControlInformationTypeI"/>
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
    "placementOption",
    "targetDetails",
    "recordLocator"
})
@XmlRootElement(name = "Queue_PlacePNR")
public class QueuePlacePNR {

    @XmlElement(required = true)
    protected SelectionDetailsTypeI placementOption;
    @XmlElement(required = true)
    protected List<QueuePlacePNR.TargetDetails> targetDetails;
    @XmlElement(required = true)
    protected ReservationControlInformationTypeI recordLocator;

    /**
     * Gets the value of the placementOption property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsTypeI }
     *     
     */
    public SelectionDetailsTypeI getPlacementOption() {
        return placementOption;
    }

    /**
     * Sets the value of the placementOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsTypeI }
     *     
     */
    public void setPlacementOption(SelectionDetailsTypeI value) {
        this.placementOption = value;
    }

    /**
     * Gets the value of the targetDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueuePlacePNR.TargetDetails }
     * 
     * 
     */
    public List<QueuePlacePNR.TargetDetails> getTargetDetails() {
        if (targetDetails == null) {
            targetDetails = new ArrayList<QueuePlacePNR.TargetDetails>();
        }
        return this.targetDetails;
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
     *         &lt;element name="targetOffice" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}AdditionalBusinessSourceInformationType"/>
     *         &lt;element name="queueNumber" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}QueueInformationTypeI" minOccurs="0"/>
     *         &lt;element name="categoryDetails" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}SubQueueInformationTypeI" minOccurs="0"/>
     *         &lt;element name="placementDate" type="{http://xml.amadeus.com/QUQPCQ_03_1_1A}StructuredDateTimeInformationType" minOccurs="0"/>
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
        "targetOffice",
        "queueNumber",
        "categoryDetails",
        "placementDate"
    })
    public static class TargetDetails {

        @XmlElement(required = true)
        protected AdditionalBusinessSourceInformationType targetOffice;
        protected QueueInformationTypeI queueNumber;
        protected SubQueueInformationTypeI categoryDetails;
        protected StructuredDateTimeInformationType placementDate;

        /**
         * Gets the value of the targetOffice property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalBusinessSourceInformationType }
         *     
         */
        public AdditionalBusinessSourceInformationType getTargetOffice() {
            return targetOffice;
        }

        /**
         * Sets the value of the targetOffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalBusinessSourceInformationType }
         *     
         */
        public void setTargetOffice(AdditionalBusinessSourceInformationType value) {
            this.targetOffice = value;
        }

        /**
         * Gets the value of the queueNumber property.
         * 
         * @return
         *     possible object is
         *     {@link QueueInformationTypeI }
         *     
         */
        public QueueInformationTypeI getQueueNumber() {
            return queueNumber;
        }

        /**
         * Sets the value of the queueNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueInformationTypeI }
         *     
         */
        public void setQueueNumber(QueueInformationTypeI value) {
            this.queueNumber = value;
        }

        /**
         * Gets the value of the categoryDetails property.
         * 
         * @return
         *     possible object is
         *     {@link SubQueueInformationTypeI }
         *     
         */
        public SubQueueInformationTypeI getCategoryDetails() {
            return categoryDetails;
        }

        /**
         * Sets the value of the categoryDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubQueueInformationTypeI }
         *     
         */
        public void setCategoryDetails(SubQueueInformationTypeI value) {
            this.categoryDetails = value;
        }

        /**
         * Gets the value of the placementDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType }
         *     
         */
        public StructuredDateTimeInformationType getPlacementDate() {
            return placementDate;
        }

        /**
         * Sets the value of the placementDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType }
         *     
         */
        public void setPlacementDate(StructuredDateTimeInformationType value) {
            this.placementDate = value;
        }

    }

}
