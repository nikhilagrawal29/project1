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
 * <p>Java class for TouchpointInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouchpointInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Connected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SelectionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OmniChannel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Channels" type="{http://messagepoint.com/api/schemas}ChannelsListType" minOccurs="0"/&gt;
 *         &lt;element name="Connector" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductionChangeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Metadata" type="{http://messagepoint.com/api/schemas}MetadataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchpointInfoType", propOrder = {
    "name",
    "guid",
    "connected",
    "selectionType",
    "channel",
    "omniChannel",
    "channels",
    "connector",
    "description",
    "productionChangeStatus",
    "metadata"
})
public class TouchpointInfoType {

    @XmlElement(name = "Name", required = true,namespace = "http://messagepoint.com/api/schemas")
    protected String name;
    @XmlElement(name = "Guid", required = true,namespace = "http://messagepoint.com/api/schemas")
    protected String guid;
    @XmlElement(name = "Connected")
    protected boolean connected;
    @XmlElement(name = "SelectionType", required = true)
    protected String selectionType;
    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "OmniChannel")
    protected boolean omniChannel;
    @XmlElement(name = "Channels")
    protected ChannelsListType channels;
    @XmlElement(name = "Connector", required = true)
    protected String connector;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ProductionChangeStatus", required = true)
    protected String productionChangeStatus;
    @XmlElement(name = "Metadata", required = true)
    protected MetadataType metadata;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     */
    public void setConnected(boolean value) {
        this.connected = value;
    }

    /**
     * Gets the value of the selectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * Sets the value of the selectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionType(String value) {
        this.selectionType = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the omniChannel property.
     * 
     */
    public boolean isOmniChannel() {
        return omniChannel;
    }

    /**
     * Sets the value of the omniChannel property.
     * 
     */
    public void setOmniChannel(boolean value) {
        this.omniChannel = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelsListType }
     *     
     */
    public ChannelsListType getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelsListType }
     *     
     */
    public void setChannels(ChannelsListType value) {
        this.channels = value;
    }

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnector(String value) {
        this.connector = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the productionChangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionChangeStatus() {
        return productionChangeStatus;
    }

    /**
     * Sets the value of the productionChangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionChangeStatus(String value) {
        this.productionChangeStatus = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

}