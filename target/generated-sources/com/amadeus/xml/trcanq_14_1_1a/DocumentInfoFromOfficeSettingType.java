
package com.amadeus.xml.trcanq_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Document info coming from office settings
 * 
 * <p>Java class for DocumentInfoFromOfficeSettingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfoFromOfficeSettingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketIataCode" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="stockProviderCode" type="{http://xml.amadeus.com/TRCANQ_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfoFromOfficeSettingType", propOrder = {
    "marketIataCode",
    "stockProviderCode"
})
public class DocumentInfoFromOfficeSettingType {

    protected String marketIataCode;
    protected String stockProviderCode;

    /**
     * Gets the value of the marketIataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketIataCode() {
        return marketIataCode;
    }

    /**
     * Sets the value of the marketIataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketIataCode(String value) {
        this.marketIataCode = value;
    }

    /**
     * Gets the value of the stockProviderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockProviderCode() {
        return stockProviderCode;
    }

    /**
     * Sets the value of the stockProviderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockProviderCode(String value) {
        this.stockProviderCode = value;
    }

}
