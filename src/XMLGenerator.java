package com.example.demo;

import java.io.File;
import java.io.FileWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLGenerator {
    public static void main(String[] args) {
        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter("DriverFile.xml"));

            xmlStreamWriter.writeStartDocument("1.0");
            xmlStreamWriter.writeStartElement("DriverFile");
            xmlStreamWriter.writeNamespace("xsi", "https://natwest.com/XMLSchema-instance");

            writeElement(xmlStreamWriter, "RecordKey", "12344");
            writeElement(xmlStreamWriter, "OrderUuid", "");
            writeElement(xmlStreamWriter, "EnvironmentIdentifier", "");
            writeElement(xmlStreamWriter, "PRODUCT_NAME", "");
            writeElement(xmlStreamWriter, "Mailclass", "");
            writeElement(xmlStreamWriter, "CinOrBin", "");
            writeElement(xmlStreamWriter, "Cin2", "");
            writeElement(xmlStreamWriter, "PartyID", "");
            writeElement(xmlStreamWriter, "EDeliveryOnly", "");
            writeElement(xmlStreamWriter, "PaperlessIndicator", "");
            writeElement(xmlStreamWriter, "CustomerType", "");

            xmlStreamWriter.writeStartElement("CCPTemplateDB");
            writeElement(xmlStreamWriter, "TouchpointName", "");
            writeElement(xmlStreamWriter, "TouchpointGUID", "");
            writeElement(xmlStreamWriter, "TemplateID", "");
            writeElement(xmlStreamWriter, "BusinessArea", "");
            writeElement(xmlStreamWriter, "AddressFormatInd", "");
            xmlStreamWriter.writeEndElement();

            xmlStreamWriter.writeStartElement("CCPTeamDB");
            writeElement(xmlStreamWriter, "CentreName", "");
            writeElement(xmlStreamWriter, "TeamName", "");
            writeElement(xmlStreamWriter, "CentreAddLine1", "");
            writeElement(xmlStreamWriter, "CentreAddLine2", "");
            writeElement(xmlStreamWriter, "CentreAddLine3", "");
            writeElement(xmlStreamWriter, "CentreAddLine4", "");
            writeElement(xmlStreamWriter, "CentreAddLine5", "");
            writeElement(xmlStreamWriter, "CentrePostCode", "");
            writeElement(xmlStreamWriter, "PhonenumberRBS", "");
            writeElement(xmlStreamWriter, "PhonenumberNWB", "");
            writeElement(xmlStreamWriter, "PhonenumberUBN", "");
            writeElement(xmlStreamWriter, "LotCodeRbs", "");
            writeElement(xmlStreamWriter, "LotCodeNwb", "");
            writeElement(xmlStreamWriter, "LotCodeUbn", "");
            writeElement(xmlStreamWriter, "OverseasPhoneNumberRbs", "");
            writeElement(xmlStreamWriter, "OverseasPhoneNumberNwb", "");
            writeElement(xmlStreamWriter, "OverseasPhoneNumberUbn", "");
            writeElement(xmlStreamWriter, "BreCode", "");
            writeElement(xmlStreamWriter, "BreDescription", "");
            writeElement(xmlStreamWriter, "Signatory", "");
            writeElement(xmlStreamWriter, "SignatoryJobTitle", "");
            writeElement(xmlStreamWriter, "SignatoryRacfId", "");
            xmlStreamWriter.writeEndElement();

            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            xmlStreamWriter.flush();
            xmlStreamWriter.close();

            System.out.println("XML file generated successfully!");
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
