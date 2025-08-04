
package com.amadeus.xml.pnracc_22_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType_227073S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType_227073S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/PNRACC_22_1_1A}ItemNumberIdentificationType_311115C" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType_227073S", propOrder = {
    "itemNumberDetails"
})
public class ItemNumberType227073S {

    @XmlElement(required = true)
    protected List<ItemNumberIdentificationType311115C> itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemNumberIdentificationType311115C }
     * 
     * 
     */
    public List<ItemNumberIdentificationType311115C> getItemNumberDetails() {
        if (itemNumberDetails == null) {
            itemNumberDetails = new ArrayList<ItemNumberIdentificationType311115C>();
        }
        return this.itemNumberDetails;
    }

}
