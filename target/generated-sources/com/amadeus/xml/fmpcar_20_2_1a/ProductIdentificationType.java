
package com.amadeus.xml.fmpcar_20_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a product.
 * 
 * <p>Java class for ProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productData" type="{http://xml.amadeus.com/FMPCAR_20_2_1A}ProductIdentDetailsType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationType", propOrder = {
    "productData"
})
public class ProductIdentificationType {

    protected List<ProductIdentDetailsType> productData;

    /**
     * Gets the value of the productData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentDetailsType }
     * 
     * 
     */
    public List<ProductIdentDetailsType> getProductData() {
        if (productData == null) {
            productData = new ArrayList<ProductIdentDetailsType>();
        }
        return this.productData;
    }

}
