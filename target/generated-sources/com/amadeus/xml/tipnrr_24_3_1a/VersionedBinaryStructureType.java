
package com.amadeus.xml.tipnrr_24_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionedBinaryStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionedBinaryStructureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaryDescription" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}MessageStructureVersionType"/>
 *         &lt;element name="binaryData" type="{http://xml.amadeus.com/TIPNRR_24_3_1A}BinaryDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedBinaryStructureType", propOrder = {
    "binaryDescription",
    "binaryData"
})
public class VersionedBinaryStructureType {

    @XmlElement(required = true)
    protected MessageStructureVersionType binaryDescription;
    @XmlElement(required = true)
    protected BinaryDataType binaryData;

    /**
     * Gets the value of the binaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStructureVersionType }
     *     
     */
    public MessageStructureVersionType getBinaryDescription() {
        return binaryDescription;
    }

    /**
     * Sets the value of the binaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStructureVersionType }
     *     
     */
    public void setBinaryDescription(MessageStructureVersionType value) {
        this.binaryDescription = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataType }
     *     
     */
    public BinaryDataType getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataType }
     *     
     */
    public void setBinaryData(BinaryDataType value) {
        this.binaryData = value;
    }

}
