
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification for a traveller.
 * 
 * <p>Java class for ReferenceInfoType_134840S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType_134840S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencingDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferencingDetailsType_195563C" maxOccurs="200" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType_134840S", propOrder = {
    "referencingDetail"
})
public class ReferenceInfoType134840S {

    protected List<ReferencingDetailsType195563C> referencingDetail;

    /**
     * Gets the value of the referencingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsType195563C }
     * 
     * 
     */
    public List<ReferencingDetailsType195563C> getReferencingDetail() {
        if (referencingDetail == null) {
            referencingDetail = new ArrayList<ReferencingDetailsType195563C>();
        }
        return this.referencingDetail;
    }

}
