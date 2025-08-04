
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Method indicator for polling source
 * 
 * <p>Java class for Method complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Method">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distributionMethodDetails" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}DistributionMethodDetails" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Method", propOrder = {
    "distributionMethodDetails"
})
public class Method {

    @XmlElement(required = true)
    protected List<DistributionMethodDetails> distributionMethodDetails;

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
     * {@link DistributionMethodDetails }
     * 
     * 
     */
    public List<DistributionMethodDetails> getDistributionMethodDetails() {
        if (distributionMethodDetails == null) {
            distributionMethodDetails = new ArrayList<DistributionMethodDetails>();
        }
        return this.distributionMethodDetails;
    }

}
