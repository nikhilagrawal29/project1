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
    "chunkNumber"
})
@XmlRootElement(name = "FileChunkDownloadRequest")
public class FileChunkDownloadRequest
    extends ClientIdentificationType
{

    @XmlElement(name = "Filename", required = true)
    protected String filename;
    @XmlElement(name = "ChunkNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected long chunkNumber;

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

}
