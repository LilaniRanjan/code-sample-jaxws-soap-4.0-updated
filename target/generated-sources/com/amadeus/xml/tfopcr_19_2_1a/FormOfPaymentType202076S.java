
package com.amadeus.xml.tfopcr_19_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment.
 * 
 * <p>Java class for FormOfPaymentType_202076S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentType_202076S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FormOfPaymentDetailsType" minOccurs="0"/>
 *         &lt;element name="otherFormOfPayment" type="{http://xml.amadeus.com/TFOPCR_19_2_1A}FormOfPaymentDetailsType" maxOccurs="98" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentType_202076S", propOrder = {
    "formOfPayment",
    "otherFormOfPayment"
})
public class FormOfPaymentType202076S {

    protected FormOfPaymentDetailsType formOfPayment;
    protected List<FormOfPaymentDetailsType> otherFormOfPayment;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentDetailsType }
     *     
     */
    public FormOfPaymentDetailsType getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentDetailsType }
     *     
     */
    public void setFormOfPayment(FormOfPaymentDetailsType value) {
        this.formOfPayment = value;
    }

    /**
     * Gets the value of the otherFormOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFormOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentDetailsType }
     * 
     * 
     */
    public List<FormOfPaymentDetailsType> getOtherFormOfPayment() {
        if (otherFormOfPayment == null) {
            otherFormOfPayment = new ArrayList<FormOfPaymentDetailsType>();
        }
        return this.otherFormOfPayment;
    }

}
