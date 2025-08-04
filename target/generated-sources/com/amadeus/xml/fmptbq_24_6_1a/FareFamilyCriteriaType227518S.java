
package com.amadeus.xml.fmptbq_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare family criteria
 * 
 * <p>Java class for FareFamilyCriteriaType_227518S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyCriteriaType_227518S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierId" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareProductDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareProductDetailsType_311630C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="corporateInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MultipleIdentificationNumbersType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyCriteriaType_227518S", propOrder = {
    "carrierId",
    "fareProductDetail",
    "corporateInfo"
})
public class FareFamilyCriteriaType227518S {

    protected String carrierId;
    protected List<FareProductDetailsType311630C> fareProductDetail;
    protected List<MultipleIdentificationNumbersType> corporateInfo;

    /**
     * Gets the value of the carrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * Sets the value of the carrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierId(String value) {
        this.carrierId = value;
    }

    /**
     * Gets the value of the fareProductDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProductDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductDetailsType311630C }
     * 
     * 
     */
    public List<FareProductDetailsType311630C> getFareProductDetail() {
        if (fareProductDetail == null) {
            fareProductDetail = new ArrayList<FareProductDetailsType311630C>();
        }
        return this.fareProductDetail;
    }

    /**
     * Gets the value of the corporateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultipleIdentificationNumbersType }
     * 
     * 
     */
    public List<MultipleIdentificationNumbersType> getCorporateInfo() {
        if (corporateInfo == null) {
            corporateInfo = new ArrayList<MultipleIdentificationNumbersType>();
        }
        return this.corporateInfo;
    }

}
