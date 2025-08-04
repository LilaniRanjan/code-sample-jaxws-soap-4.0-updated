
package com.amadeus.xml.trcanq_14_1_1a;

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
 *         &lt;element name="documentNumberDetails" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}TicketNumberTypeI" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="sequenceNumberRanges" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}ItemNumberTypeI" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="voidOption" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="stockProviderDetails" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}OfficeSettingsDetailsType"/>
 *         &lt;element name="targetOfficeDetails" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
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
    "documentNumberDetails",
    "sequenceNumberRanges",
    "voidOption",
    "stockProviderDetails",
    "targetOfficeDetails"
})
@XmlRootElement(name = "Ticket_CancelDocument")
public class TicketCancelDocument {

    protected List<TicketNumberTypeI> documentNumberDetails;
    protected List<ItemNumberTypeI> sequenceNumberRanges;
    protected StatusType voidOption;
    @XmlElement(required = true)
    protected OfficeSettingsDetailsType stockProviderDetails;
    protected AdditionalBusinessSourceInformationType targetOfficeDetails;

    /**
     * Gets the value of the documentNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketNumberTypeI }
     * 
     * 
     */
    public List<TicketNumberTypeI> getDocumentNumberDetails() {
        if (documentNumberDetails == null) {
            documentNumberDetails = new ArrayList<TicketNumberTypeI>();
        }
        return this.documentNumberDetails;
    }

    /**
     * Gets the value of the sequenceNumberRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceNumberRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceNumberRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemNumberTypeI }
     * 
     * 
     */
    public List<ItemNumberTypeI> getSequenceNumberRanges() {
        if (sequenceNumberRanges == null) {
            sequenceNumberRanges = new ArrayList<ItemNumberTypeI>();
        }
        return this.sequenceNumberRanges;
    }

    /**
     * Gets the value of the voidOption property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getVoidOption() {
        return voidOption;
    }

    /**
     * Sets the value of the voidOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setVoidOption(StatusType value) {
        this.voidOption = value;
    }

    /**
     * Gets the value of the stockProviderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeSettingsDetailsType }
     *     
     */
    public OfficeSettingsDetailsType getStockProviderDetails() {
        return stockProviderDetails;
    }

    /**
     * Sets the value of the stockProviderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeSettingsDetailsType }
     *     
     */
    public void setStockProviderDetails(OfficeSettingsDetailsType value) {
        this.stockProviderDetails = value;
    }

    /**
     * Gets the value of the targetOfficeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessSourceInformationType }
     *     
     */
    public AdditionalBusinessSourceInformationType getTargetOfficeDetails() {
        return targetOfficeDetails;
    }

    /**
     * Sets the value of the targetOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessSourceInformationType }
     *     
     */
    public void setTargetOfficeDetails(AdditionalBusinessSourceInformationType value) {
        this.targetOfficeDetails = value;
    }

}
