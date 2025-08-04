
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey services for cabin or class
 * 
 * <p>Java class for FlightServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="cabinInfo" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}CabinInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="classInfo" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}ClassInformationType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightServicesType", propOrder = {
    "serviceType",
    "cabinInfo",
    "classInfo"
})
public class FlightServicesType {

    @XmlElement(required = true)
    protected String serviceType;
    protected List<CabinInformationType> cabinInfo;
    protected List<ClassInformationType> classInfo;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the cabinInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinInformationType }
     * 
     * 
     */
    public List<CabinInformationType> getCabinInfo() {
        if (cabinInfo == null) {
            cabinInfo = new ArrayList<CabinInformationType>();
        }
        return this.cabinInfo;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassInformationType }
     * 
     * 
     */
    public List<ClassInformationType> getClassInfo() {
        if (classInfo == null) {
            classInfo = new ArrayList<ClassInformationType>();
        }
        return this.classInfo;
    }

}
