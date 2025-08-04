
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To describe an item in either an industry or free format.
 * 
 * <p>Java class for ItemDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemDescription" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemDescriptionDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDescriptionType", propOrder = {
    "itemDescription"
})
public class ItemDescriptionType {

    @XmlElement(required = true)
    protected ItemDescriptionDetailsTypeI itemDescription;

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDescriptionDetailsTypeI }
     *     
     */
    public ItemDescriptionDetailsTypeI getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDescriptionDetailsTypeI }
     *     
     */
    public void setItemDescription(ItemDescriptionDetailsTypeI value) {
        this.itemDescription = value;
    }

}
