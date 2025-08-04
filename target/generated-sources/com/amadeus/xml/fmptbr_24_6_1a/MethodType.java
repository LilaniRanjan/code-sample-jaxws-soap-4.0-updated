
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Method indicator for polling source
 * 
 * <p>Java class for MethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distributionMethodDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DistributionMethodDetailsType" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodType", propOrder = {
    "distributionMethodDetails"
})
public class MethodType {

    @XmlElement(required = true)
    protected List<DistributionMethodDetailsType> distributionMethodDetails;

    /**
     * Gets the value of the distributionMethodDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionMethodDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionMethodDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionMethodDetailsType }
     * 
     * 
     */
    public List<DistributionMethodDetailsType> getDistributionMethodDetails() {
        if (distributionMethodDetails == null) {
            distributionMethodDetails = new ArrayList<DistributionMethodDetailsType>();
        }
        return this.distributionMethodDetails;
    }

}
