
package com.amadeus.xml.tfopcr_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeType_247346C" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}StructuredDateTimeType_247346C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformationType", propOrder = {
    "beginDateTime",
    "endDateTime"
})
public class StructuredPeriodInformationType {

    protected StructuredDateTimeType247346C beginDateTime;
    protected StructuredDateTimeType247346C endDateTime;

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType247346C }
     *     
     */
    public StructuredDateTimeType247346C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType247346C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType247346C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType247346C }
     *     
     */
    public StructuredDateTimeType247346C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType247346C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType247346C value) {
        this.endDateTime = value;
    }

}
