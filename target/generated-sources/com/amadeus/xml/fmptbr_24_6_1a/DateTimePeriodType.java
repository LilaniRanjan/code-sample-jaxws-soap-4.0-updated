
package com.amadeus.xml.fmptbr_24_6_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify date, and/or time, or period.
 * 
 * <p>Java class for DateTimePeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimePeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTimeDescription" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateTimePeriodDetailsBatchType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriodType", propOrder = {
    "dateTimeDescription"
})
public class DateTimePeriodType {

    @XmlElement(required = true)
    protected DateTimePeriodDetailsBatchType dateTimeDescription;

    /**
     * Gets the value of the dateTimeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetailsBatchType }
     *     
     */
    public DateTimePeriodDetailsBatchType getDateTimeDescription() {
        return dateTimeDescription;
    }

    /**
     * Sets the value of the dateTimeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetailsBatchType }
     *     
     */
    public void setDateTimeDescription(DateTimePeriodDetailsBatchType value) {
        this.dateTimeDescription = value;
    }

}
