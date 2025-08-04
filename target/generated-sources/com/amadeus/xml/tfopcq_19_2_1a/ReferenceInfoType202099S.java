
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an association between references given to travellers, to products, to services
 * 
 * <p>Java class for ReferenceInfoType_202099S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType_202099S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payerAccountId" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}ReferencingDetailsTypeI_107111C" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType_202099S", propOrder = {
    "payerAccountId"
})
public class ReferenceInfoType202099S {

    protected List<ReferencingDetailsTypeI107111C> payerAccountId;

    /**
     * Gets the value of the payerAccountId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerAccountId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerAccountId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsTypeI107111C }
     * 
     * 
     */
    public List<ReferencingDetailsTypeI107111C> getPayerAccountId() {
        if (payerAccountId == null) {
            payerAccountId = new ArrayList<ReferencingDetailsTypeI107111C>();
        }
        return this.payerAccountId;
    }

}
