//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.14 at 07:56:45 PM IST 
//


package com.ccp.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SuccessResponse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FailureResponse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleResponseType", propOrder = {
    "successResponse",
    "failureResponse"
})
public class SimpleResponseType {

    @XmlElement(name = "SuccessResponse")
    protected String successResponse;
    @XmlElement(name = "FailureResponse")
    protected String failureResponse;

    /**
     * Gets the value of the successResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessResponse() {
        return successResponse;
    }

    /**
     * Sets the value of the successResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessResponse(String value) {
        this.successResponse = value;
    }

    /**
     * Gets the value of the failureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureResponse() {
        return failureResponse;
    }

    /**
     * Sets the value of the failureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureResponse(String value) {
        this.failureResponse = value;
    }

}
