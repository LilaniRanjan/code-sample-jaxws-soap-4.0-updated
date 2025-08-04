
package com.amadeus.xml.fmpcaq_20_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType_80330S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType_80330S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberId" type="{http://xml.amadeus.com/FMPCAQ_20_2_1A}ItemNumberIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType_80330S", propOrder = {
    "itemNumberId"
})
public class ItemNumberType80330S {

    @XmlElement(required = true)
    protected ItemNumberIdentificationType itemNumberId;

    /**
     * Gets the value of the itemNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationType }
     *     
     */
    public ItemNumberIdentificationType getItemNumberId() {
        return itemNumberId;
    }

    /**
     * Sets the value of the itemNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationType }
     *     
     */
    public void setItemNumberId(ItemNumberIdentificationType value) {
        this.itemNumberId = value;
    }

}
