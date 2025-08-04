
package com.amadeus.xml.fmptbr_24_6_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List the combinability group ids
 * 
 * <p>Java class for CombinabilityReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinabilityReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="combinabilityId" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumericInteger_Length0To3" maxOccurs="250"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinabilityReferencesType", propOrder = {
    "combinabilityId"
})
public class CombinabilityReferencesType {

    @XmlElement(required = true)
    protected List<BigInteger> combinabilityId;

    /**
     * Gets the value of the combinabilityId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinabilityId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinabilityId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getCombinabilityId() {
        if (combinabilityId == null) {
            combinabilityId = new ArrayList<BigInteger>();
        }
        return this.combinabilityId;
    }

}
