
package com.amadeus.xml.fmpcaq_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifierInclusion" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="areaQualifier" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaString_Length1To1"/>
 *         &lt;element name="areaId" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}AlphaString_Length1To5" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDetailType", propOrder = {
    "identifierInclusion",
    "areaQualifier",
    "areaId"
})
public class AreaDetailType {

    protected String identifierInclusion;
    @XmlElement(required = true)
    protected String areaQualifier;
    @XmlElement(required = true)
    protected List<String> areaId;

    /**
     * Gets the value of the identifierInclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierInclusion() {
        return identifierInclusion;
    }

    /**
     * Sets the value of the identifierInclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierInclusion(String value) {
        this.identifierInclusion = value;
    }

    /**
     * Gets the value of the areaQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaQualifier() {
        return areaQualifier;
    }

    /**
     * Sets the value of the areaQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaQualifier(String value) {
        this.areaQualifier = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAreaId() {
        if (areaId == null) {
            areaId = new ArrayList<String>();
        }
        return this.areaId;
    }

}
