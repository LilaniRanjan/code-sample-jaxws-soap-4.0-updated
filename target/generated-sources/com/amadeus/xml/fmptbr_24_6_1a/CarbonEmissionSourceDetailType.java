
package com.amadeus.xml.fmptbr_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This will contain carbon emission provider details per transportation mode
 * 
 * <p>Java class for CarbonEmissionSourceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarbonEmissionSourceDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerPerTransportation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProviderPerTransportationType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarbonEmissionSourceDetailType", propOrder = {
    "providerPerTransportation"
})
public class CarbonEmissionSourceDetailType {

    protected List<ProviderPerTransportationType> providerPerTransportation;

    /**
     * Gets the value of the providerPerTransportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerPerTransportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderPerTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderPerTransportationType }
     * 
     * 
     */
    public List<ProviderPerTransportationType> getProviderPerTransportation() {
        if (providerPerTransportation == null) {
            providerPerTransportation = new ArrayList<ProviderPerTransportationType>();
        }
        return this.providerPerTransportation;
    }

}
