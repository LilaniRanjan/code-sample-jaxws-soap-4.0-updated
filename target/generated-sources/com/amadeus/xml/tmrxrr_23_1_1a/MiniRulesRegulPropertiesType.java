
package com.amadeus.xml.tmrxrr_23_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiniRulesRegulPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiniRulesRegulPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mnrCatInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}CategDescrType"/>
 *         &lt;element name="mnrCatLoc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="catOrder" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ItemNumberType"/>
 *                   &lt;element name="catAssumption" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrFCInfoGrp" maxOccurs="16">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInfoType_217032S"/>
 *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}PlaceLocationIdentificationType" maxOccurs="16" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrDateInfoGrp" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dateInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}DateAndTimeInformationType"/>
 *                   &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *                   &lt;element name="mnrDateLoc" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleInformationType" maxOccurs="20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrMonInfoGrp" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}MonetaryInformationType"/>
 *                   &lt;element name="penaltyInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}PenaltyDetailsType_232211S" minOccurs="0"/>
 *                   &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *                   &lt;element name="mnrMonLoc" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleInformationType" maxOccurs="20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrRestriAppInfoGrp" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mnrRestriAppInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType_217033S"/>
 *                   &lt;element name="mnrRestriAppLoc" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleInformationType" maxOccurs="20" minOccurs="0"/>
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
@XmlType(name = "MiniRulesRegulPropertiesType", propOrder = {
    "mnrCatInfo",
    "mnrCatLoc",
    "mnrFCInfoGrp",
    "mnrDateInfoGrp",
    "mnrMonInfoGrp",
    "mnrRestriAppInfoGrp"
})
public class MiniRulesRegulPropertiesType {

    @XmlElement(required = true)
    protected CategDescrType mnrCatInfo;
    protected MiniRulesRegulPropertiesType.MnrCatLoc mnrCatLoc;
    @XmlElement(required = true)
    protected List<MiniRulesRegulPropertiesType.MnrFCInfoGrp> mnrFCInfoGrp;
    protected List<MiniRulesRegulPropertiesType.MnrDateInfoGrp> mnrDateInfoGrp;
    protected List<MiniRulesRegulPropertiesType.MnrMonInfoGrp> mnrMonInfoGrp;
    protected List<MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp> mnrRestriAppInfoGrp;

    /**
     * Gets the value of the mnrCatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CategDescrType }
     *     
     */
    public CategDescrType getMnrCatInfo() {
        return mnrCatInfo;
    }

    /**
     * Sets the value of the mnrCatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategDescrType }
     *     
     */
    public void setMnrCatInfo(CategDescrType value) {
        this.mnrCatInfo = value;
    }

    /**
     * Gets the value of the mnrCatLoc property.
     * 
     * @return
     *     possible object is
     *     {@link MiniRulesRegulPropertiesType.MnrCatLoc }
     *     
     */
    public MiniRulesRegulPropertiesType.MnrCatLoc getMnrCatLoc() {
        return mnrCatLoc;
    }

    /**
     * Sets the value of the mnrCatLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiniRulesRegulPropertiesType.MnrCatLoc }
     *     
     */
    public void setMnrCatLoc(MiniRulesRegulPropertiesType.MnrCatLoc value) {
        this.mnrCatLoc = value;
    }

    /**
     * Gets the value of the mnrFCInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrFCInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrFCInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrFCInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrFCInfoGrp> getMnrFCInfoGrp() {
        if (mnrFCInfoGrp == null) {
            mnrFCInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrFCInfoGrp>();
        }
        return this.mnrFCInfoGrp;
    }

    /**
     * Gets the value of the mnrDateInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrDateInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrDateInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrDateInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrDateInfoGrp> getMnrDateInfoGrp() {
        if (mnrDateInfoGrp == null) {
            mnrDateInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrDateInfoGrp>();
        }
        return this.mnrDateInfoGrp;
    }

    /**
     * Gets the value of the mnrMonInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrMonInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrMonInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrMonInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrMonInfoGrp> getMnrMonInfoGrp() {
        if (mnrMonInfoGrp == null) {
            mnrMonInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrMonInfoGrp>();
        }
        return this.mnrMonInfoGrp;
    }

    /**
     * Gets the value of the mnrRestriAppInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrRestriAppInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrRestriAppInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp> getMnrRestriAppInfoGrp() {
        if (mnrRestriAppInfoGrp == null) {
            mnrRestriAppInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp>();
        }
        return this.mnrRestriAppInfoGrp;
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
     *         &lt;element name="catOrder" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ItemNumberType"/>
     *         &lt;element name="catAssumption" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}FreeTextInformationType_219131S" minOccurs="0"/>
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
        "catOrder",
        "catAssumption"
    })
    public static class MnrCatLoc {

        @XmlElement(required = true)
        protected ItemNumberType catOrder;
        protected FreeTextInformationType219131S catAssumption;

        /**
         * Gets the value of the catOrder property.
         * 
         * @return
         *     possible object is
         *     {@link ItemNumberType }
         *     
         */
        public ItemNumberType getCatOrder() {
            return catOrder;
        }

        /**
         * Sets the value of the catOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemNumberType }
         *     
         */
        public void setCatOrder(ItemNumberType value) {
            this.catOrder = value;
        }

        /**
         * Gets the value of the catAssumption property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformationType219131S }
         *     
         */
        public FreeTextInformationType219131S getCatAssumption() {
            return catAssumption;
        }

        /**
         * Sets the value of the catAssumption property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformationType219131S }
         *     
         */
        public void setCatAssumption(FreeTextInformationType219131S value) {
            this.catAssumption = value;
        }

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
     *         &lt;element name="dateInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}DateAndTimeInformationType"/>
     *         &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}NumberOfUnitsType" minOccurs="0"/>
     *         &lt;element name="mnrDateLoc" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleInformationType" maxOccurs="20" minOccurs="0"/>
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
        "dateInfo",
        "valueInfo",
        "mnrDateLoc"
    })
    public static class MnrDateInfoGrp {

        @XmlElement(required = true)
        protected DateAndTimeInformationType dateInfo;
        protected NumberOfUnitsType valueInfo;
        protected List<RuleInformationType> mnrDateLoc;

        /**
         * Gets the value of the dateInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DateAndTimeInformationType }
         *     
         */
        public DateAndTimeInformationType getDateInfo() {
            return dateInfo;
        }

        /**
         * Sets the value of the dateInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAndTimeInformationType }
         *     
         */
        public void setDateInfo(DateAndTimeInformationType value) {
            this.dateInfo = value;
        }

        /**
         * Gets the value of the valueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getValueInfo() {
            return valueInfo;
        }

        /**
         * Sets the value of the valueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setValueInfo(NumberOfUnitsType value) {
            this.valueInfo = value;
        }

        /**
         * Gets the value of the mnrDateLoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnrDateLoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMnrDateLoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RuleInformationType }
         * 
         * 
         */
        public List<RuleInformationType> getMnrDateLoc() {
            if (mnrDateLoc == null) {
                mnrDateLoc = new ArrayList<RuleInformationType>();
            }
            return this.mnrDateLoc;
        }

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
     *         &lt;element name="refInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}ReferenceInfoType_217032S"/>
     *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}PlaceLocationIdentificationType" maxOccurs="16" minOccurs="0"/>
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
        "refInfo",
        "locationInfo"
    })
    public static class MnrFCInfoGrp {

        @XmlElement(required = true)
        protected ReferenceInfoType217032S refInfo;
        protected List<PlaceLocationIdentificationType> locationInfo;

        /**
         * Gets the value of the refInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType217032S }
         *     
         */
        public ReferenceInfoType217032S getRefInfo() {
            return refInfo;
        }

        /**
         * Sets the value of the refInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType217032S }
         *     
         */
        public void setRefInfo(ReferenceInfoType217032S value) {
            this.refInfo = value;
        }

        /**
         * Gets the value of the locationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlaceLocationIdentificationType }
         * 
         * 
         */
        public List<PlaceLocationIdentificationType> getLocationInfo() {
            if (locationInfo == null) {
                locationInfo = new ArrayList<PlaceLocationIdentificationType>();
            }
            return this.locationInfo;
        }

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
     *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}MonetaryInformationType"/>
     *         &lt;element name="penaltyInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}PenaltyDetailsType_232211S" minOccurs="0"/>
     *         &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}NumberOfUnitsType" minOccurs="0"/>
     *         &lt;element name="mnrMonLoc" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleInformationType" maxOccurs="20" minOccurs="0"/>
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
        "monetaryInfo",
        "penaltyInfo",
        "valueInfo",
        "mnrMonLoc"
    })
    public static class MnrMonInfoGrp {

        @XmlElement(required = true)
        protected MonetaryInformationType monetaryInfo;
        protected PenaltyDetailsType232211S penaltyInfo;
        protected NumberOfUnitsType valueInfo;
        protected List<RuleInformationType> mnrMonLoc;

        /**
         * Gets the value of the monetaryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getMonetaryInfo() {
            return monetaryInfo;
        }

        /**
         * Sets the value of the monetaryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setMonetaryInfo(MonetaryInformationType value) {
            this.monetaryInfo = value;
        }

        /**
         * Gets the value of the penaltyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PenaltyDetailsType232211S }
         *     
         */
        public PenaltyDetailsType232211S getPenaltyInfo() {
            return penaltyInfo;
        }

        /**
         * Sets the value of the penaltyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PenaltyDetailsType232211S }
         *     
         */
        public void setPenaltyInfo(PenaltyDetailsType232211S value) {
            this.penaltyInfo = value;
        }

        /**
         * Gets the value of the valueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getValueInfo() {
            return valueInfo;
        }

        /**
         * Sets the value of the valueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setValueInfo(NumberOfUnitsType value) {
            this.valueInfo = value;
        }

        /**
         * Gets the value of the mnrMonLoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnrMonLoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMnrMonLoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RuleInformationType }
         * 
         * 
         */
        public List<RuleInformationType> getMnrMonLoc() {
            if (mnrMonLoc == null) {
                mnrMonLoc = new ArrayList<RuleInformationType>();
            }
            return this.mnrMonLoc;
        }

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
     *         &lt;element name="mnrRestriAppInfo" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}StatusType_217033S"/>
     *         &lt;element name="mnrRestriAppLoc" type="{http://xml.amadeus.com/TMRXRR_23_1_1A}RuleInformationType" maxOccurs="20" minOccurs="0"/>
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
        "mnrRestriAppInfo",
        "mnrRestriAppLoc"
    })
    public static class MnrRestriAppInfoGrp {

        @XmlElement(required = true)
        protected StatusType217033S mnrRestriAppInfo;
        protected List<RuleInformationType> mnrRestriAppLoc;

        /**
         * Gets the value of the mnrRestriAppInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType217033S }
         *     
         */
        public StatusType217033S getMnrRestriAppInfo() {
            return mnrRestriAppInfo;
        }

        /**
         * Sets the value of the mnrRestriAppInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType217033S }
         *     
         */
        public void setMnrRestriAppInfo(StatusType217033S value) {
            this.mnrRestriAppInfo = value;
        }

        /**
         * Gets the value of the mnrRestriAppLoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnrRestriAppLoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMnrRestriAppLoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RuleInformationType }
         * 
         * 
         */
        public List<RuleInformationType> getMnrRestriAppLoc() {
            if (mnrRestriAppLoc == null) {
                mnrRestriAppLoc = new ArrayList<RuleInformationType>();
            }
            return this.mnrRestriAppLoc;
        }

    }

}
