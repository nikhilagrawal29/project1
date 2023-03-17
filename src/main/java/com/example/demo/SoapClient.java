package com.example.demo;

import com.ccp.stub.ObjectListResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.xml.transform.StringSource;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class SoapClient extends WebServiceGatewaySupport {
    @Autowired
    Environment environment;
    public Object getTouchPointRequest(String url, Object requestPayload) {
        WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
        JAXBElement res = null;
        try {
            res = (JAXBElement) webServiceTemplate.marshalSendAndReceive(url, requestPayload, new WebServiceMessageCallback() {
                @Override
                public void doWithMessage(WebServiceMessage message) {
                    try {
                        SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();
                        StringSource headerSource = new StringSource(environment.getProperty("soap.auth.header"));
                        Transformer transformer = TransformerFactory.newInstance().newTransformer();
                        transformer.transform(headerSource, soapHeader.getResult());
                        logger.info("Marshalling of SOAP header success.");
                    } catch (Exception e) {
                        logger.error("error during marshalling of the SOAP headers", e);
                    }
                }
            });
        } catch (SoapFaultClientException e) {
            logger.error("Error while invoking session service : " + e.getMessage());
            return null;
        }

        System.out.println(res.getValue());
        return res.getValue();
    }
}