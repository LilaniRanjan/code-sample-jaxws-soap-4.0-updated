
package com.amadeus.xml.tfopcq_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify point of services detailed information of operations.
 * 
 * <p>Java class for PointOfServicesOperationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfServicesOperationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operatingEnvironment" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}OperatingEnvinronmentType" minOccurs="0"/>
 *         &lt;element name="businessSectors" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}BusinessSectorsType" minOccurs="0"/>
 *         &lt;element name="deliveryTypeGoods" type="{http://xml.amadeus.com/TFOPCQ_19_2_1A}AlphaNumericString_Length1To25" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfServicesOperationsType", propOrder = {
    "operatingEnvironment",
    "businessSectors",
    "deliveryTypeGoods"
})
public class PointOfServicesOperationsType {

    protected OperatingEnvinronmentType operatingEnvironment;
    protected BusinessSectorsType businessSectors;
    protected List<String> deliveryTypeGoods;

    /**
     * Gets the value of the operatingEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingEnvinronmentType }
     *     
     */
    public OperatingEnvinronmentType getOperatingEnvironment() {
        return operatingEnvironment;
    }

    /**
     * Sets the value of the operatingEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingEnvinronmentType }
     *     
     */
    public void setOperatingEnvironment(OperatingEnvinronmentType value) {
        this.operatingEnvironment = value;
    }

    /**
     * Gets the value of the businessSectors property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSectorsType }
     *     
     */
    public BusinessSectorsType getBusinessSectors() {
        return businessSectors;
    }

    /**
     * Sets the value of the businessSectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSectorsType }
     *     
     */
    public void setBusinessSectors(BusinessSectorsType value) {
        this.businessSectors = value;
    }

    /**
     * Gets the value of the deliveryTypeGoods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTypeGoods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTypeGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryTypeGoods() {
        if (deliveryTypeGoods == null) {
            deliveryTypeGoods = new ArrayList<String>();
        }
        return this.deliveryTypeGoods;
    }

}
