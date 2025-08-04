
package com.amadeus.xml.fmpcaq_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Gives the Special Offers in NDC
 * 
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ndcParameterIdentification" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}ItemNumberType"/>
 *         &lt;element name="ndcLoyaltyProgram" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}FrequentTravellerIdentificationCodeType_227517S" minOccurs="0"/>
 *         &lt;element name="ndcSpecialFares" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}FareFamilyCriteriaType_227518S" minOccurs="0"/>
 *         &lt;element name="travellerDetails" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}TravellerReferenceInformationType_227519S" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "ndcParameterIdentification",
    "ndcLoyaltyProgram",
    "ndcSpecialFares",
    "travellerDetails"
})
public class Group {

    @XmlElement(required = true)
    protected ItemNumberType ndcParameterIdentification;
    protected FrequentTravellerIdentificationCodeType227517S ndcLoyaltyProgram;
    protected FareFamilyCriteriaType227518S ndcSpecialFares;
    protected List<TravellerReferenceInformationType227519S> travellerDetails;

    /**
     * Gets the value of the ndcParameterIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType }
     *     
     */
    public ItemNumberType getNdcParameterIdentification() {
        return ndcParameterIdentification;
    }

    /**
     * Sets the value of the ndcParameterIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType }
     *     
     */
    public void setNdcParameterIdentification(ItemNumberType value) {
        this.ndcParameterIdentification = value;
    }

    /**
     * Gets the value of the ndcLoyaltyProgram property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationCodeType227517S }
     *     
     */
    public FrequentTravellerIdentificationCodeType227517S getNdcLoyaltyProgram() {
        return ndcLoyaltyProgram;
    }

    /**
     * Sets the value of the ndcLoyaltyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationCodeType227517S }
     *     
     */
    public void setNdcLoyaltyProgram(FrequentTravellerIdentificationCodeType227517S value) {
        this.ndcLoyaltyProgram = value;
    }

    /**
     * Gets the value of the ndcSpecialFares property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyCriteriaType227518S }
     *     
     */
    public FareFamilyCriteriaType227518S getNdcSpecialFares() {
        return ndcSpecialFares;
    }

    /**
     * Sets the value of the ndcSpecialFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyCriteriaType227518S }
     *     
     */
    public void setNdcSpecialFares(FareFamilyCriteriaType227518S value) {
        this.ndcSpecialFares = value;
    }

    /**
     * Gets the value of the travellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerReferenceInformationType227519S }
     * 
     * 
     */
    public List<TravellerReferenceInformationType227519S> getTravellerDetails() {
        if (travellerDetails == null) {
            travellerDetails = new ArrayList<TravellerReferenceInformationType227519S>();
        }
        return this.travellerDetails;
    }

}
