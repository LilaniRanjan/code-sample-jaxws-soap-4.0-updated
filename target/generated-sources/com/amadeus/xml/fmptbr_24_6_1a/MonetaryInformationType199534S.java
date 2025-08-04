
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify monetary information details
 * 
 * <p>Java class for MonetaryInformationType_199534S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_199534S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationDetailsType_277475C" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_199534S", propOrder = {
    "monetaryDetail"
})
public class MonetaryInformationType199534S {

    @XmlElement(required = true)
    protected List<MonetaryInformationDetailsType277475C> monetaryDetail;

    /**
     * Gets the value of the monetaryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType277475C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType277475C> getMonetaryDetail() {
        if (monetaryDetail == null) {
            monetaryDetail = new ArrayList<MonetaryInformationDetailsType277475C>();
        }
        return this.monetaryDetail;
    }

}
