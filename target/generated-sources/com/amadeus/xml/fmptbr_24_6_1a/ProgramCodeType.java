
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey program information
 * 
 * <p>Java class for ProgramCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="program" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}LabelType_290117C" minOccurs="0"/>
 *         &lt;element name="tierLevel" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}LabelType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="accrualType" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AccrualType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramCodeType", propOrder = {
    "program",
    "tierLevel",
    "accrualType"
})
public class ProgramCodeType {

    protected LabelType290117C program;
    protected List<LabelType> tierLevel;
    protected List<AccrualType> accrualType;

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link LabelType290117C }
     *     
     */
    public LabelType290117C getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType290117C }
     *     
     */
    public void setProgram(LabelType290117C value) {
        this.program = value;
    }

    /**
     * Gets the value of the tierLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tierLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelType }
     * 
     * 
     */
    public List<LabelType> getTierLevel() {
        if (tierLevel == null) {
            tierLevel = new ArrayList<LabelType>();
        }
        return this.tierLevel;
    }

    /**
     * Gets the value of the accrualType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accrualType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccrualType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccrualType }
     * 
     * 
     */
    public List<AccrualType> getAccrualType() {
        if (accrualType == null) {
            accrualType = new ArrayList<AccrualType>();
        }
        return this.accrualType;
    }

}
