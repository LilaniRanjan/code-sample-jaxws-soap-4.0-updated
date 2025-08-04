
package com.amadeus.xml.tibnrq_23_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify currencies used in the transaction and relevant details for the rate of exchange.
 * 
 * <p>Java class for CurrenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrenciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstCurrencyDetails" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}CurrencyDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="secondCurrencyDetails" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}CurrencyDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}NumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="exchangeMarket" type="{http://xml.amadeus.com/TIBNRQ_23_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrenciesType", propOrder = {
    "firstCurrencyDetails",
    "secondCurrencyDetails",
    "exchangeRate",
    "exchangeMarket"
})
public class CurrenciesType {

    protected CurrencyDetailsTypeU firstCurrencyDetails;
    protected CurrencyDetailsTypeU secondCurrencyDetails;
    protected String exchangeRate;
    protected String exchangeMarket;

    /**
     * Gets the value of the firstCurrencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public CurrencyDetailsTypeU getFirstCurrencyDetails() {
        return firstCurrencyDetails;
    }

    /**
     * Sets the value of the firstCurrencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public void setFirstCurrencyDetails(CurrencyDetailsTypeU value) {
        this.firstCurrencyDetails = value;
    }

    /**
     * Gets the value of the secondCurrencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public CurrencyDetailsTypeU getSecondCurrencyDetails() {
        return secondCurrencyDetails;
    }

    /**
     * Sets the value of the secondCurrencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public void setSecondCurrencyDetails(CurrencyDetailsTypeU value) {
        this.secondCurrencyDetails = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeMarket() {
        return exchangeMarket;
    }

    /**
     * Sets the value of the exchangeMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeMarket(String value) {
        this.exchangeMarket = value;
    }

}
