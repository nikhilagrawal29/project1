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
 *     &lt;extension base="{http://messagepoint.com/api/schemas}ClientIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToNode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fromNode",
    "toNode"
})
@XmlRootElement(name = "NodeToNodeCopyRequest")
public class NodeToNodeCopyRequest
    extends ClientIdentificationType
{

    @XmlElement(name = "FromNode")
    protected String fromNode;
    @XmlElement(name = "ToNode", required = true)
    protected String toNode;

    /**
     * Gets the value of the fromNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromNode() {
        return fromNode;
    }

    /**
     * Sets the value of the fromNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromNode(String value) {
        this.fromNode = value;
    }

    /**
     * Gets the value of the toNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToNode() {
        return toNode;
    }

    /**
     * Sets the value of the toNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToNode(String value) {
        this.toNode = value;
    }

}
