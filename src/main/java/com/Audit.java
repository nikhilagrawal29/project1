package com.natwest.ccps.connected.model.audit;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Audit {
    private String auditId;
    private String auditDate;
    private String auditType;
    private String racfId;
    private String userGroup;
    private String externalOrderId;
    private Date date;
    private String businessArea;
    private String businessAreaUserId;
    private String isCentralPrintSuccess;
    private String isLocalPrintSuccess;
    private String isArchivalSuccess;
    private String templateId;
    private String teamName;
    private String centreName;
    private String accountNo;
    private String touchPointName;
    private String touchPointGuid;
    private String environemntName;
    private String sortcode;
    private String brand;
    private String subBrand;
    private String thirdPartyTemplate;
    private String addresseeLine1;
    private String addresseeLine2;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String addressLine5;
    private String postCode;
    private String phoneNumberRBS;
    private String phoneNumberNWB;
    private String phoneNumberUBN;
    private String lotCodeRbs;
    private String lotCodeNwb;
    private String lotCodeUbn;
    private String overseasNumberRBS;
    private String overseasNumberNWB;
    private String overseasNumberUBN;
    private String breCode;
    private String breDescription;
    private String signatory;
    private String signatoryJobTitle;
    private String signatorySignature;
    private Date teamExpiryDate;


}
