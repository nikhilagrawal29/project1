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
 *         &lt;element name="Touchpoint" type="{http://messagepoint.com/api/schemas}TouchpointType" minOccurs="0"/&gt;
 *         &lt;element name="TouchpointCollection" type="{http://messagepoint.com/api/schemas}TouchpointCollectionType" minOccurs="0"/&gt;
 *         &lt;element name="CompositionPackage" type="{http://messagepoint.com/api/schemas}CompositionPackageType"/&gt;
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
    "touchpoint",
    "touchpointCollection",
    "compositionPackage"
})
@XmlRootElement(name = "CompositionPackageUploadRequest")
public class CompositionPackageUploadRequest
    extends ClientIdentificationType
{

    @XmlElement(name = "Touchpoint")
    protected TouchpointType touchpoint;
    @XmlElement(name = "TouchpointCollection")
    protected TouchpointCollectionType touchpointCollection;
    @XmlElement(name = "CompositionPackage", required = true)
    protected CompositionPackageType compositionPackage;

    /**
     * Gets the value of the touchpoint property.
     * 
     * @return
     *     possible object is
     *     {@link TouchpointType }
     *     
     */
    public TouchpointType getTouchpoint() {
        return touchpoint;
    }

    /**
     * Sets the value of the touchpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchpointType }
     *     
     */
    public void setTouchpoint(TouchpointType value) {
        this.touchpoint = value;
    }

    /**
     * Gets the value of the touchpointCollection property.
     * 
     * @return
     *     possible object is
     *     {@link TouchpointCollectionType }
     *     
     */
    public TouchpointCollectionType getTouchpointCollection() {
        return touchpointCollection;
    }

    /**
     * Sets the value of the touchpointCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchpointCollectionType }
     *     
     */
    public void setTouchpointCollection(TouchpointCollectionType value) {
        this.touchpointCollection = value;
    }

    /**
     * Gets the value of the compositionPackage property.
     * 
     * @return
     *     possible object is
     *     {@link CompositionPackageType }
     *     
     */
    public CompositionPackageType getCompositionPackage() {
        return compositionPackage;
    }

    /**
     * Sets the value of the compositionPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositionPackageType }
     *     
     */
    public void setCompositionPackage(CompositionPackageType value) {
        this.compositionPackage = value;
    }

}
