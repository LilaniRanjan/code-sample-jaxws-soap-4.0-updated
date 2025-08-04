
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualInterlineRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualInterlineRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To18" minOccurs="0"/>
 *         &lt;element name="totalTaxes" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To18" minOccurs="0"/>
 *         &lt;element name="otherAmount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationDetailsType_288107C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="qualityCriteria" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}QualityCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualInterlineRecommendationType", propOrder = {
    "identifier",
    "totalAmount",
    "totalTaxes",
    "otherAmount",
    "qualityCriteria"
})
public class VirtualInterlineRecommendationType {

    protected String identifier;
    protected String totalAmount;
    protected String totalTaxes;
    protected List<MonetaryInformationDetailsType288107C> otherAmount;
    protected QualityCriteriaType qualityCriteria;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxes() {
        return totalTaxes;
    }

    /**
     * Sets the value of the totalTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxes(String value) {
        this.totalTaxes = value;
    }

    /**
     * Gets the value of the otherAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType288107C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType288107C> getOtherAmount() {
        if (otherAmount == null) {
            otherAmount = new ArrayList<MonetaryInformationDetailsType288107C>();
        }
        return this.otherAmount;
    }

    /**
     * Gets the value of the qualityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link QualityCriteriaType }
     *     
     */
    public QualityCriteriaType getQualityCriteria() {
        return qualityCriteria;
    }

    /**
     * Sets the value of the qualityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityCriteriaType }
     *     
     */
    public void setQualityCriteria(QualityCriteriaType value) {
        this.qualityCriteria = value;
    }

}
