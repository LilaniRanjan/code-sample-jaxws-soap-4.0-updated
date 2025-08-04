
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information relative to slider conversion
 * 
 * <p>Java class for SliderConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SliderConversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sliderMode" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}StatusDetailsType_275596C"/>
 *         &lt;element name="sliderPosition" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}NumberOfUnitDetailsType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SliderConversionType", propOrder = {
    "sliderMode",
    "sliderPosition"
})
public class SliderConversionType {

    @XmlElement(required = true)
    protected StatusDetailsType275596C sliderMode;
    protected List<NumberOfUnitDetailsType> sliderPosition;

    /**
     * Gets the value of the sliderMode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsType275596C }
     *     
     */
    public StatusDetailsType275596C getSliderMode() {
        return sliderMode;
    }

    /**
     * Sets the value of the sliderMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsType275596C }
     *     
     */
    public void setSliderMode(StatusDetailsType275596C value) {
        this.sliderMode = value;
    }

    /**
     * Gets the value of the sliderPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sliderPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSliderPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsType }
     * 
     * 
     */
    public List<NumberOfUnitDetailsType> getSliderPosition() {
        if (sliderPosition == null) {
            sliderPosition = new ArrayList<NumberOfUnitDetailsType>();
        }
        return this.sliderPosition;
    }

}
