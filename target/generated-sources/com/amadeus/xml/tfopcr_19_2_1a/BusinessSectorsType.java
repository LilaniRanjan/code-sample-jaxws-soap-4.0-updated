
package com.amadeus.xml.tfopcr_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessSectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSectorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryTravelSector" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="otherTravelSector" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}AlphaNumericString_Length1To3" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSectorsType", propOrder = {
    "primaryTravelSector",
    "otherTravelSector"
})
public class BusinessSectorsType {

    @XmlElement(required = true)
    protected String primaryTravelSector;
    protected List<String> otherTravelSector;

    /**
     * Gets the value of the primaryTravelSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTravelSector() {
        return primaryTravelSector;
    }

    /**
     * Sets the value of the primaryTravelSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTravelSector(String value) {
        this.primaryTravelSector = value;
    }

    /**
     * Gets the value of the otherTravelSector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTravelSector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTravelSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherTravelSector() {
        if (otherTravelSector == null) {
            otherTravelSector = new ArrayList<String>();
        }
        return this.otherTravelSector;
    }

}
