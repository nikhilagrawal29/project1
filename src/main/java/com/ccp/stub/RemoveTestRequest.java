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
 *         &lt;element name="GuidList" type="{http://messagepoint.com/api/schemas}GuidListType"/&gt;
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
    "guidList"
})
@XmlRootElement(name = "RemoveTestRequest")
public class RemoveTestRequest
    extends ClientIdentificationType
{

    @XmlElement(name = "GuidList", required = true)
    protected GuidListType guidList;

    /**
     * Gets the value of the guidList property.
     * 
     * @return
     *     possible object is
     *     {@link GuidListType }
     *     
     */
    public GuidListType getGuidList() {
        return guidList;
    }

    /**
     * Sets the value of the guidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidListType }
     *     
     */
    public void setGuidList(GuidListType value) {
        this.guidList = value;
    }

}
