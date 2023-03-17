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
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeFriendlyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeSchemaName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeInstanceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nodeName",
    "nodeFriendlyName",
    "nodeSchemaName",
    "nodeInstanceType",
    "task"
})
@XmlRootElement(name = "ActivateExistingSchemaRequest")
public class ActivateExistingSchemaRequest
    extends ClientIdentificationType
{

    @XmlElement(required = true)
    protected String nodeName;
    @XmlElement(required = true)
    protected String nodeFriendlyName;
    @XmlElement(required = true)
    protected String nodeSchemaName;
    @XmlElement(required = true)
    protected String nodeInstanceType;
    @XmlElement(required = true)
    protected String task;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the nodeFriendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeFriendlyName() {
        return nodeFriendlyName;
    }

    /**
     * Sets the value of the nodeFriendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeFriendlyName(String value) {
        this.nodeFriendlyName = value;
    }

    /**
     * Gets the value of the nodeSchemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeSchemaName() {
        return nodeSchemaName;
    }

    /**
     * Sets the value of the nodeSchemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeSchemaName(String value) {
        this.nodeSchemaName = value;
    }

    /**
     * Gets the value of the nodeInstanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeInstanceType() {
        return nodeInstanceType;
    }

    /**
     * Sets the value of the nodeInstanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeInstanceType(String value) {
        this.nodeInstanceType = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

}
