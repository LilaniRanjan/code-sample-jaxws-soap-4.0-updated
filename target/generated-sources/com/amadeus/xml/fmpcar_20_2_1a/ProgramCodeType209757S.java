
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey program information
 * 
 * <p>Java class for ProgramCodeType_209757S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramCodeType_209757S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxFareNum" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AlphaNumericString_Length1To2" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="program" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}LabelType_290125C" minOccurs="0"/>
 *         &lt;element name="tierLevel" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}LabelType_290125C" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="accrualType" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}AccrualType_290124C" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramCodeType_209757S", propOrder = {
    "paxFareNum",
    "program",
    "tierLevel",
    "accrualType"
})
public class ProgramCodeType209757S {

    protected List<String> paxFareNum;
    protected LabelType290125C program;
    protected List<LabelType290125C> tierLevel;
    protected List<AccrualType290124C> accrualType;

    /**
     * Gets the value of the paxFareNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxFareNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxFareNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxFareNum() {
        if (paxFareNum == null) {
            paxFareNum = new ArrayList<String>();
        }
        return this.paxFareNum;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link LabelType290125C }
     *     
     */
    public LabelType290125C getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType290125C }
     *     
     */
    public void setProgram(LabelType290125C value) {
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
     * {@link LabelType290125C }
     * 
     * 
     */
    public List<LabelType290125C> getTierLevel() {
        if (tierLevel == null) {
            tierLevel = new ArrayList<LabelType290125C>();
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
     * {@link AccrualType290124C }
     * 
     * 
     */
    public List<AccrualType290124C> getAccrualType() {
        if (accrualType == null) {
            accrualType = new ArrayList<AccrualType290124C>();
        }
        return this.accrualType;
    }

}
