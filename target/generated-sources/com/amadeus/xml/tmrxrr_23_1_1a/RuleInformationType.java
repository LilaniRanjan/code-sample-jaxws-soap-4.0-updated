
package com.amadeus.xml.tmrxrr_23_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="ruleText" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleTextTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformationType", propOrder = {
    "ruleDetails",
    "ruleText"
})
public class RuleInformationType {

    protected RuleDetailsTypeU ruleDetails;
    @XmlElement(required = true)
    protected RuleTextTypeU ruleText;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleDetailsTypeU }
     *     
     */
    public RuleDetailsTypeU getRuleDetails() {
        return ruleDetails;
    }

    /**
     * Sets the value of the ruleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleDetailsTypeU }
     *     
     */
    public void setRuleDetails(RuleDetailsTypeU value) {
        this.ruleDetails = value;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * @return
     *     possible object is
     *     {@link RuleTextTypeU }
     *     
     */
    public RuleTextTypeU getRuleText() {
        return ruleText;
    }

    /**
     * Sets the value of the ruleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleTextTypeU }
     *     
     */
    public void setRuleText(RuleTextTypeU value) {
        this.ruleText = value;
    }

}
