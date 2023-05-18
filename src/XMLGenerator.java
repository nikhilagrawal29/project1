package com.example.demo;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;

public class XMLGenerator {
    public static void main(String[] args) {
        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter("DriverFile.xml"));

            xmlStreamWriter.writeStartDocument("1.0");
            xmlStreamWriter.writeStartElement("DriverFile");
            xmlStreamWriter.writeNamespace("xsi", "https://natwest.com/XMLSchema-instance");

            writeElement(xmlStreamWriter, XmlElement.RECORD_KEY.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.ORDER_UUID.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.ENVIRONMENT_IDENTIFIER.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.PRODUCT_NAME.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.MAILCLASS.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CIN_OR_BIN.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CIN2.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.PARTY_ID.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.EDELIVERY_ONLY.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.PAPERLESS_INDICATOR.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CUSTOMER_TYPE.getElementName(), "");

            xmlStreamWriter.writeStartElement("CCPTemplateDB");
            writeElement(xmlStreamWriter, XmlElement.TOUCHPOINT_NAME.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.TOUCHPOINT_GUID.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.TEMPLATE_ID.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.BUSINESS_AREA.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.ADDRESS_FORMAT_IND.getElementName(), "");
            xmlStreamWriter.writeEndElement();

            xmlStreamWriter.writeStartElement("CCPTeamDB");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_NAME.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.TEAM_NAME.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_ADD_LINE_1.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_ADD_LINE_2.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_ADD_LINE_3.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_ADD_LINE_4.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_ADD_LINE_5.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.CENTRE_POST_CODE.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.PHONENUMBER_RBS.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.PHONENUMBER_NWB.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.PHONENUMBER_UBN.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.LOT_CODE_RBS.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.LOT_CODE_NWB.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.LOT_CODE_UBN.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.OVERSEAS_PHONENUMBER_RBS.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.OVERSEAS_PHONENUMBER_NWB.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.OVERSEAS_PHONENUMBER_UBN.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.BRE_CODE.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.BRE_DESCRIPTION.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.SIGNATORY.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.SIGNATORY_JOB_TITLE.getElementName(), "");
            writeElement(xmlStreamWriter, XmlElement.SIGNATORY_RACF_ID.getElementName(), "");
            xmlStreamWriter.writeEndElement();

            // End elements and close writer
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.flush();
            xmlStreamWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeElement(XMLStreamWriter writer, String elementName, String value) throws XMLStreamException {
        writer.writeStartElement(elementName);
        writer.writeCharacters(value);
        writer.writeEndElement();
    }
}

