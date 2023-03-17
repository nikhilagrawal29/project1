package com.example.demo;

import com.ccp.stub.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mp/")
public class SoapController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/touchpoint")
    public TouchpointListType getTouchPointList() {
        ObjectFactory objectFactory = new ObjectFactory();
        TouchpointListRequest touchpointListRequest = objectFactory.createTouchpointListRequest();
        touchpointListRequest.setRequesterUsername("rohit.goel@espire.com");
        touchpointListRequest.setBranchId("Espire");
        touchpointListRequest.setNodeId("sandbox");
        touchpointListRequest.setListAll(false);
        touchpointListRequest.setPrerelease("false");
        touchpointListRequest.setExplicitResponse(true);
        ObjectListResponseType objectListResponseType = new ObjectListResponseType();
        ObjectListResponseType response = (ObjectListResponseType)
                soapClient.getTouchPointRequest("https://pr222avi.messagepoint.com:443/mp/api/",
                touchpointListRequest);
       /* System.out.println(soapClient.getTouchPointRequest("https://ws.messagepoint.com/mp/api/api.wsdl?company=espire&prerelease=false",
                touchpointListRequest));*/
        return response.getTouchpointList();
    }


    @GetMapping("/createConnectedOrder")
    public CreateConnectedOrderResponseType createConnectedOrder() {
        ObjectFactory objectFactory = new ObjectFactory();
        CreateConnectedOrderRequest connectedOrderRequest = objectFactory.createCreateConnectedOrderRequest();

        TouchpointType type = new TouchpointType();
        type.setGuid("E5CB6AAE856277DE2283206671FBA4A6");
        connectedOrderRequest.setTouchpoint(type);

        connectedOrderRequest.setBranchId("Espire");
        connectedOrderRequest.setAuthorUsername("rohit.goel@espire.com");
        connectedOrderRequest.setCreateProof(false);

        ConnectedOrderDataPointListType connectedOrderDataPointType = new ConnectedOrderDataPointListType();
        List<ConnectedOrderDataPointType> dataPoint = new ArrayList<>();
        ConnectedOrderDataPointType connectedOrderDataPointType1 = new ConnectedOrderDataPointType();
        connectedOrderDataPointType1.setConnector("AccountNumber");
        connectedOrderDataPointType1.setValue("2432432");
        ConnectedOrderDataPointType connectedOrderDataPointType2 = new ConnectedOrderDataPointType();
        connectedOrderDataPointType2.setConnector("PrintMethod");
        connectedOrderDataPointType2.setValue("Local");
        ConnectedOrderDataPointType connectedOrderDataPointType3 = new ConnectedOrderDataPointType();
        connectedOrderDataPointType3.setConnector("AddSortCode1");
        connectedOrderDataPointType3.setValue("111111");

        ConnectedOrderDataPointType connectedOrderDataPointType4 = new ConnectedOrderDataPointType();
        connectedOrderDataPointType4.setConnector("AddAccount1");
        connectedOrderDataPointType4.setValue("11111111");
        dataPoint.add(connectedOrderDataPointType1);dataPoint.add(connectedOrderDataPointType2);dataPoint.add(connectedOrderDataPointType3);dataPoint.add(connectedOrderDataPointType4);
        connectedOrderDataPointType.getDataPoint().addAll(dataPoint);
        connectedOrderRequest.setDataPointList(connectedOrderDataPointType);

        connectedOrderRequest.setNodeId("sandbox");
        connectedOrderRequest.setPrerelease("false");
        ObjectListResponseType objectListResponseType = new ObjectListResponseType();
        CreateConnectedOrderResponseType response = (CreateConnectedOrderResponseType)
                soapClient.getTouchPointRequest("https://pr222avi.messagepoint.com:443/mp/api/",
                        connectedOrderRequest);
       /* System.out.println(soapClient.getTouchPointRequest("https://ws.messagepoint.com/mp/api/api.wsdl?company=espire&prerelease=false",
                touchpointListRequest));*/
        return response;
    }
}