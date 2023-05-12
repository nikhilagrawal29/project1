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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChunkNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Base64Content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActivateTarget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RenameIfExisting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "filename",
    "chunkNumber",
    "base64Content",
    "activateTarget",
    "renameIfExisting"
})
@XmlRootElement(name = "TouchpointImportRequest")
public class TouchpointImportRequest
    extends ClientIdentificationType
{

    @XmlElement(name = "Filename", required = true)
    protected String filename;
    @XmlElement(name = "ChunkNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected long chunkNumber;
    @XmlElement(name = "Base64Content", required = true)
    protected String base64Content;
    @XmlElement(name = "ActivateTarget")
    protected Boolean activateTarget;
    @XmlElement(name = "RenameIfExisting")
    protected Boolean renameIfExisting;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the chunkNumber property.
     * 
     */
    public long getChunkNumber() {
        return chunkNumber;
    }

    /**
     * Sets the value of the chunkNumber property.
     * 
     */
    public void setChunkNumber(long value) {
        this.chunkNumber = value;
    }

    /**
     * Gets the value of the base64Content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Content() {
        return base64Content;
    }

    /**
     * Sets the value of the base64Content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Content(String value) {
        this.base64Content = value;
    }

    /**
     * Gets the value of the activateTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivateTarget() {
        return activateTarget;
    }

    /**
     * Sets the value of the activateTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivateTarget(Boolean value) {
        this.activateTarget = value;
    }

    /**
     * Gets the value of the renameIfExisting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenameIfExisting() {
        return renameIfExisting;
    }

    /**
     * Sets the value of the renameIfExisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenameIfExisting(Boolean value) {
        this.renameIfExisting = value;
    }

}