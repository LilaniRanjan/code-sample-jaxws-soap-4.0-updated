
package com.amadeus.xml.fmpcar_20_2_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmenityDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmenityDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amenityReference" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}NumericString_Length1To3"/>
 *         &lt;element name="amenityType" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AMA_EDICodesetType_Length1to3"/>
 *         &lt;element name="amenityAttribute" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="isChargeable" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="seatSpace" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}NumericDecimal_Length1To4" minOccurs="0"/>
 *         &lt;element name="seatSpaceUnit" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="seatFlateness" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="rowLayout" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmenityDescription", propOrder = {
    "amenityReference",
    "amenityType",
    "amenityAttribute",
    "isChargeable",
    "seatSpace",
    "seatSpaceUnit",
    "seatFlateness",
    "rowLayout"
})
public class AmenityDescription {

    @XmlElement(required = true)
    protected String amenityReference;
    @XmlElement(required = true)
    protected String amenityType;
    protected String amenityAttribute;
    protected BigInteger isChargeable;
    protected BigDecimal seatSpace;
    protected String seatSpaceUnit;
    protected String seatFlateness;
    protected String rowLayout;

    /**
     * Gets the value of the amenityReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityReference() {
        return amenityReference;
    }

    /**
     * Sets the value of the amenityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityReference(String value) {
        this.amenityReference = value;
    }

    /**
     * Gets the value of the amenityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityType() {
        return amenityType;
    }

    /**
     * Sets the value of the amenityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityType(String value) {
        this.amenityType = value;
    }

    /**
     * Gets the value of the amenityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityAttribute() {
        return amenityAttribute;
    }

    /**
     * Sets the value of the amenityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityAttribute(String value) {
        this.amenityAttribute = value;
    }

    /**
     * Gets the value of the isChargeable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsChargeable() {
        return isChargeable;
    }

    /**
     * Sets the value of the isChargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsChargeable(BigInteger value) {
        this.isChargeable = value;
    }

    /**
     * Gets the value of the seatSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatSpace() {
        return seatSpace;
    }

    /**
     * Sets the value of the seatSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatSpace(BigDecimal value) {
        this.seatSpace = value;
    }

    /**
     * Gets the value of the seatSpaceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatSpaceUnit() {
        return seatSpaceUnit;
    }

    /**
     * Sets the value of the seatSpaceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatSpaceUnit(String value) {
        this.seatSpaceUnit = value;
    }

    /**
     * Gets the value of the seatFlateness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatFlateness() {
        return seatFlateness;
    }

    /**
     * Sets the value of the seatFlateness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatFlateness(String value) {
        this.seatFlateness = value;
    }

    /**
     * Gets the value of the rowLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowLayout() {
        return rowLayout;
    }

    /**
     * Sets the value of the rowLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowLayout(String value) {
        this.rowLayout = value;
    }

}
