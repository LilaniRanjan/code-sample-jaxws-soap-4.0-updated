
package com.amadeus.xml.tpcbrr_24_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType_198917S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_198917S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDataMainInformation" type="{http://xml.amadeus.com/TPCBRR_24_3_1A}MonetaryInformationDetailsType_262564C"/>
 *         &lt;element name="fareDataSupInformation" type="{http://xml.amadeus.com/TPCBRR_24_3_1A}MonetaryInformationDetailsType_262564C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_198917S", propOrder = {
    "fareDataMainInformation",
    "fareDataSupInformation"
})
public class MonetaryInformationType198917S {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsType262564C fareDataMainInformation;
    protected List<MonetaryInformationDetailsType262564C> fareDataSupInformation;

    /**
     * Gets the value of the fareDataMainInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsType262564C }
     *     
     */
    public MonetaryInformationDetailsType262564C getFareDataMainInformation() {
        return fareDataMainInformation;
    }

    /**
     * Sets the value of the fareDataMainInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsType262564C }
     *     
     */
    public void setFareDataMainInformation(MonetaryInformationDetailsType262564C value) {
        this.fareDataMainInformation = value;
    }

    /**
     * Gets the value of the fareDataSupInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDataSupInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDataSupInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType262564C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType262564C> getFareDataSupInformation() {
        if (fareDataSupInformation == null) {
            fareDataSupInformation = new ArrayList<MonetaryInformationDetailsType262564C>();
        }
        return this.fareDataSupInformation;
    }

}
