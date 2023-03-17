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
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedOrderExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedOrderStateToInclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "jobId",
    "connectedOrderExternalId",
    "connectedOrderStateToInclude"
})
@XmlRootElement(name = "JobStatusRequest")
public class JobStatusRequest
    extends ClientIdentificationType
{

    @XmlElement(name = "JobId")
    protected Long jobId;
    @XmlElement(name = "ConnectedOrderExternalId")
    protected String connectedOrderExternalId;
    @XmlElement(name = "ConnectedOrderStateToInclude")
    protected String connectedOrderStateToInclude;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJobId(Long value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the connectedOrderExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedOrderExternalId() {
        return connectedOrderExternalId;
    }

    /**
     * Sets the value of the connectedOrderExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedOrderExternalId(String value) {
        this.connectedOrderExternalId = value;
    }

    /**
     * Gets the value of the connectedOrderStateToInclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedOrderStateToInclude() {
        return connectedOrderStateToInclude;
    }

    /**
     * Sets the value of the connectedOrderStateToInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedOrderStateToInclude(String value) {
        this.connectedOrderStateToInclude = value;
    }

}
