
package com.amadeus.xml.fmpcaq_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareProductDetailsType_311630C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareProductDetailsType_311630C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareType" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AMA_EDICodesetType_Length1to3" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="travellerId" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProductDetailsType_311630C", propOrder = {
    "fareType",
    "travellerId"
})
public class FareProductDetailsType311630C {

    protected List<String> fareType;
    protected String travellerId;

    /**
     * Gets the value of the fareType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareType() {
        if (fareType == null) {
            fareType = new ArrayList<String>();
        }
        return this.fareType;
    }

    /**
     * Gets the value of the travellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerId() {
        return travellerId;
    }

    /**
     * Sets the value of the travellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerId(String value) {
        this.travellerId = value;
    }

}
