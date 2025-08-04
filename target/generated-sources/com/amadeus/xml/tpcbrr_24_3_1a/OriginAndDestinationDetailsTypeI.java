
package com.amadeus.xml.tpcbrr_24_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey the origin and destination of a journey.
 * 
 * <p>Java class for OriginAndDestinationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginAndDestinationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityCode" type="{http://xml.amadeus.com/TPCBRR_24_3_1A}AlphaNumericString_Length1To4" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginAndDestinationDetailsTypeI", propOrder = {
    "cityCode"
})
public class OriginAndDestinationDetailsTypeI {

    @XmlElement(required = true)
    protected List<String> cityCode;

    /**
     * Gets the value of the cityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityCode() {
        if (cityCode == null) {
            cityCode = new ArrayList<String>();
        }
        return this.cityCode;
    }

}
