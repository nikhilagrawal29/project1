package com.example.demo;

import com.ccp.stub.ObjectListResponseType;
import com.ccp.stub.TouchpointInfoType;
import com.ccp.stub.TouchpointListType;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;

public class SimpleSoapClient {
public static String  responseF;
    public static void main(String args[]) throws IOException, JAXBException {


        String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://messagepoint.com/api/schemas\">" +
                "   <soapenv:Header>" +
                "      <wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">" +
                "         <wsse:UsernameToken wsu:Id=\"\">" +
                "            <wsse:Username>rohit.goel@espire.com</wsse:Username>" +
                "            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">Prinova@123</wsse:Password>" +
                "         </wsse:UsernameToken>" +
                "      </wsse:Security>" +
                "   </soapenv:Header>" +
                "   <soapenv:Body>" +
                "      <sch:TouchpointListRequest>" +
                "         <sch:BranchId>Espire</sch:BranchId>" +
                "         <sch:NodeId>sandbox</sch:NodeId>" +
                "         <sch:Prerelease>false</sch:Prerelease>" +
                "         <sch:RequesterUsername>rohit.goel@espire.com</sch:RequesterUsername>" +
                "         <sch:ListAll>false</sch:ListAll>" +
                "         <!--Optional:-->" +
                "         <sch:ExplicitResponse>true</sch:ExplicitResponse>" +
                "      </sch:TouchpointListRequest>" +
                "   </soapenv:Body>" +
                "</soapenv:Envelope>";
         responseF = callSoapService(xml);
        System.out.println(responseF);

        Object objectListResponseType = JAXB.unmarshal(new StringReader(responseF), Object.class);
        System.out.println(objectListResponseType);
        try {
            getData();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    static String callSoapService(String soapRequest) {
        try {
            String url = "https://ws.messagepoint.com:443/mp/api/"; // replace your URL here
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(soapRequest);
            wr.flush();
            wr.close();
            String responseStatus = con.getResponseMessage();
            System.out.println(responseStatus);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            String finalvalue = response.toString();
            System.out.println(finalvalue);

            return finalvalue;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    private static final String TARGET_ELEMENT = "TouchpointListResponse";

    public static void getData() throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader(responseF));

        while (sr.hasNext()) {
            int type = sr.next();
            System.out.println(sr.getLocalName());
            if (type == XMLStreamReader.START_ELEMENT && TARGET_ELEMENT.equals(sr.getLocalName())) {
               LinkedHashMap<String, LinkedHashMap<Integer, List<TouchpointInfoType>>> r = (LinkedHashMap<String, LinkedHashMap<Integer, List<TouchpointInfoType>>>) xmlMapper.readValue(sr, Object.class);
                System.out.println(r);
                ////System.out.println(r.get("TouchpointList").getTouchpoint().size() );
                break;
            }
        }
    }
}
