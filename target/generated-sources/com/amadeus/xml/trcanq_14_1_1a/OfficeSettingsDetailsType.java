
package com.amadeus.xml.trcanq_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information relating to office settings
 * 
 * <p>Java class for OfficeSettingsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficeSettingsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="officeSettingsDetails" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}DocumentInfoFromOfficeSettingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficeSettingsDetailsType", propOrder = {
    "officeSettingsDetails"
})
public class OfficeSettingsDetailsType {

    @XmlElement(required = true)
    protected DocumentInfoFromOfficeSettingType officeSettingsDetails;

    /**
     * Gets the value of the officeSettingsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfoFromOfficeSettingType }
     *     
     */
    public DocumentInfoFromOfficeSettingType getOfficeSettingsDetails() {
        return officeSettingsDetails;
    }

    /**
     * Sets the value of the officeSettingsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfoFromOfficeSettingType }
     *     
     */
    public void setOfficeSettingsDetails(DocumentInfoFromOfficeSettingType value) {
        this.officeSettingsDetails = value;
    }

}
