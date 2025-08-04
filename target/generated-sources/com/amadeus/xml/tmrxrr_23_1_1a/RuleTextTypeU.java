
package com.amadeus.xml.tmrxrr_23_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the text rule
 * 
 * <p>Java class for RuleTextTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleTextTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textType" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}AlphaNumericString_Length1To70"/>
 *         &lt;element name="infoType" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}AlphaNumericString_Length1To512" minOccurs="0"/>
 *         &lt;element name="language" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="encoding" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleTextTypeU", propOrder = {
    "textType",
    "infoType",
    "freeText",
    "language",
    "encoding"
})
public class RuleTextTypeU {

    @XmlElement(required = true)
    protected String textType;
    protected String infoType;
    protected String freeText;
    protected String language;
    protected String encoding;

    /**
     * Gets the value of the textType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextType() {
        return textType;
    }

    /**
     * Sets the value of the textType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextType(String value) {
        this.textType = value;
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}
