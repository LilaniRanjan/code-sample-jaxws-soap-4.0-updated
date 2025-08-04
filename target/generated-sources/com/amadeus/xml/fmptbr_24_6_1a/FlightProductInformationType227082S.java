
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify flight product information details
 * 
 * <p>Java class for FlightProductInformationType_227082S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightProductInformationType_227082S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinProduct" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CabinProductDetailsType_306830C" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="fareProductDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareProductDetailsType_311123C" minOccurs="0"/>
 *         &lt;element name="corporateId" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaNumericString_Length1To20" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="breakPoint" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="contextDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductTypeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductInformationType_227082S", propOrder = {
    "cabinProduct",
    "fareProductDetail",
    "corporateId",
    "breakPoint",
    "contextDetails"
})
public class FlightProductInformationType227082S {

    protected List<CabinProductDetailsType306830C> cabinProduct;
    protected FareProductDetailsType311123C fareProductDetail;
    protected List<String> corporateId;
    protected String breakPoint;
    protected ProductTypeDetailsType contextDetails;

    /**
     * Gets the value of the cabinProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinProductDetailsType306830C }
     * 
     * 
     */
    public List<CabinProductDetailsType306830C> getCabinProduct() {
        if (cabinProduct == null) {
            cabinProduct = new ArrayList<CabinProductDetailsType306830C>();
        }
        return this.cabinProduct;
    }

    /**
     * Gets the value of the fareProductDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareProductDetailsType311123C }
     *     
     */
    public FareProductDetailsType311123C getFareProductDetail() {
        return fareProductDetail;
    }

    /**
     * Sets the value of the fareProductDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductDetailsType311123C }
     *     
     */
    public void setFareProductDetail(FareProductDetailsType311123C value) {
        this.fareProductDetail = value;
    }

    /**
     * Gets the value of the corporateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorporateId() {
        if (corporateId == null) {
            corporateId = new ArrayList<String>();
        }
        return this.corporateId;
    }

    /**
     * Gets the value of the breakPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakPoint() {
        return breakPoint;
    }

    /**
     * Sets the value of the breakPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakPoint(String value) {
        this.breakPoint = value;
    }

    /**
     * Gets the value of the contextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public ProductTypeDetailsType getContextDetails() {
        return contextDetails;
    }

    /**
     * Sets the value of the contextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public void setContextDetails(ProductTypeDetailsType value) {
        this.contextDetails = value;
    }

}
