
package com.amadeus.xml.fmptbq_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupType_369602G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupType_369602G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ndcMarker" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OfferType"/>
 *         &lt;element name="ndcSpecialParameters" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}GroupType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupType_369602G", propOrder = {
    "ndcMarker",
    "ndcSpecialParameters"
})
public class GroupType369602G {

    @XmlElement(required = true)
    protected OfferType ndcMarker;
    protected List<GroupType> ndcSpecialParameters;

    /**
     * Gets the value of the ndcMarker property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getNdcMarker() {
        return ndcMarker;
    }

    /**
     * Sets the value of the ndcMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setNdcMarker(OfferType value) {
        this.ndcMarker = value;
    }

    /**
     * Gets the value of the ndcSpecialParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndcSpecialParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNdcSpecialParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupType }
     * 
     * 
     */
    public List<GroupType> getNdcSpecialParameters() {
        if (ndcSpecialParameters == null) {
            ndcSpecialParameters = new ArrayList<GroupType>();
        }
        return this.ndcSpecialParameters;
    }

}
