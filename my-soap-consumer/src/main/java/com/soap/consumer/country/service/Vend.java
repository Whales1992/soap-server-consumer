//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.30 at 08:59:49 PM WAT 
//


package com.soap.consumer.country.service;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origMsisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destMsisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tarifftypeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceproviderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "origMsisdn",
    "destMsisdn",
    "amount",
    "sequence",
    "tarifftypeId",
    "serviceproviderId"
})
@XmlRootElement(name = "vend")
public class Vend {

    @XmlElement(required = true)
    protected String origMsisdn;
    @XmlElement(required = true)
    protected String destMsisdn;
    @XmlElement(required = true)
    protected String amount;
    @XmlElement(required = true)
    protected String sequence;
    @XmlElement(required = true)
    protected String tarifftypeId;
    @XmlElement(required = true)
    protected String serviceproviderId;

    /**
     * Gets the value of the origMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigMsisdn() {
        return origMsisdn;
    }

    /**
     * Sets the value of the origMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigMsisdn(String value) {
        this.origMsisdn = value;
    }

    /**
     * Gets the value of the destMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestMsisdn() {
        return destMsisdn;
    }

    /**
     * Sets the value of the destMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestMsisdn(String value) {
        this.destMsisdn = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the tarifftypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifftypeId() {
        return tarifftypeId;
    }

    /**
     * Sets the value of the tarifftypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifftypeId(String value) {
        this.tarifftypeId = value;
    }

    /**
     * Gets the value of the serviceproviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceproviderId() {
        return serviceproviderId;
    }

    /**
     * Sets the value of the serviceproviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceproviderId(String value) {
        this.serviceproviderId = value;
    }

}
