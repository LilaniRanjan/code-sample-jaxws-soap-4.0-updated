
package com.amadeus.xml.tmrxrq_23_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="miniRulesQueryOption" type="{http://xml.amadeus.com/TMRXRQ_23_1_1A}AttributeType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://xml.amadeus.com/TMRXRQ_23_1_1A}LanguageBatchTypeU" minOccurs="0"/>
 *         &lt;element name="groupRecords" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recordID" type="{http://xml.amadeus.com/TMRXRQ_23_1_1A}ItemReferencesAndVersionsType"/>
 *                   &lt;element name="filteringSelection" type="{http://xml.amadeus.com/TMRXRQ_23_1_1A}ReferenceInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "miniRulesQueryOption",
    "language",
    "groupRecords"
})
@XmlRootElement(name = "MiniRule_GetFromRec")
public class MiniRuleGetFromRec {

    protected AttributeType miniRulesQueryOption;
    protected LanguageBatchTypeU language;
    @XmlElement(required = true)
    protected List<MiniRuleGetFromRec.GroupRecords> groupRecords;

    /**
     * Gets the value of the miniRulesQueryOption property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getMiniRulesQueryOption() {
        return miniRulesQueryOption;
    }

    /**
     * Sets the value of the miniRulesQueryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setMiniRulesQueryOption(AttributeType value) {
        this.miniRulesQueryOption = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageBatchTypeU }
     *     
     */
    public LanguageBatchTypeU getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageBatchTypeU }
     *     
     */
    public void setLanguage(LanguageBatchTypeU value) {
        this.language = value;
    }

    /**
     * Gets the value of the groupRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRuleGetFromRec.GroupRecords }
     * 
     * 
     */
    public List<MiniRuleGetFromRec.GroupRecords> getGroupRecords() {
        if (groupRecords == null) {
            groupRecords = new ArrayList<MiniRuleGetFromRec.GroupRecords>();
        }
        return this.groupRecords;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="recordID" type="{http://xml.amadeus.com/TMRXRQ_23_1_1A}ItemReferencesAndVersionsType"/>
     *         &lt;element name="filteringSelection" type="{http://xml.amadeus.com/TMRXRQ_23_1_1A}ReferenceInfoType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recordID",
        "filteringSelection"
    })
    public static class GroupRecords {

        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType recordID;
        protected ReferenceInfoType filteringSelection;

        /**
         * Gets the value of the recordID property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public ItemReferencesAndVersionsType getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public void setRecordID(ItemReferencesAndVersionsType value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the filteringSelection property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getFilteringSelection() {
            return filteringSelection;
        }

        /**
         * Sets the value of the filteringSelection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setFilteringSelection(ReferenceInfoType value) {
            this.filteringSelection = value;
        }

    }

}
