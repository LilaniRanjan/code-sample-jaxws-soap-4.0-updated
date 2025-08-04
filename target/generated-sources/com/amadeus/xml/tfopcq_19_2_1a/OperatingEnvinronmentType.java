
package com.amadeus.xml.tfopcq_19_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingEnvinronmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingEnvinronmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="environment" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="offlineCapacity" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="onlineCapacity" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="supervisedBy" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="vicinity" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="interaction" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="cardPresence" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingEnvinronmentType", propOrder = {
    "environment",
    "offlineCapacity",
    "onlineCapacity",
    "supervisedBy",
    "vicinity",
    "interaction",
    "cardPresence"
})
public class OperatingEnvinronmentType {

    @XmlElement(required = true)
    protected String environment;
    protected String offlineCapacity;
    protected String onlineCapacity;
    protected String supervisedBy;
    protected String vicinity;
    protected String interaction;
    protected String cardPresence;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the offlineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineCapacity() {
        return offlineCapacity;
    }

    /**
     * Sets the value of the offlineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineCapacity(String value) {
        this.offlineCapacity = value;
    }

    /**
     * Gets the value of the onlineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineCapacity() {
        return onlineCapacity;
    }

    /**
     * Sets the value of the onlineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineCapacity(String value) {
        this.onlineCapacity = value;
    }

    /**
     * Gets the value of the supervisedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisedBy() {
        return supervisedBy;
    }

    /**
     * Sets the value of the supervisedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisedBy(String value) {
        this.supervisedBy = value;
    }

    /**
     * Gets the value of the vicinity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVicinity() {
        return vicinity;
    }

    /**
     * Sets the value of the vicinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVicinity(String value) {
        this.vicinity = value;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteraction(String value) {
        this.interaction = value;
    }

    /**
     * Gets the value of the cardPresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPresence() {
        return cardPresence;
    }

    /**
     * Sets the value of the cardPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPresence(String value) {
        this.cardPresence = value;
    }

}
