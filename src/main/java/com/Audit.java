package com.natwest.ccps.connected.model.audit;

@Document(collection ="auditlogs")
@ToString
public class Audit {
    @Id
    private String auditId;
    private String auditDate = LocalDateTime.now().toString();
    private String auditType;
    private String envName;
    private String racfId;
    private String userGroup;

    private String templateId;
    private String templateName;
    private String templateGuid;
    private String thirdPartyTemplate;
    private String templateBrand;
    private String templateSubBrand;
    private String businessAreaDetails;
    private String businessArea;

    private String externalOrderId;
    private String createDateTime;
    private String updateDateTime;

    private String teamName;
    private String centreName;
    private String teamId;
    private String accountNo;
    private String sortcode;

    private String branchAddress1;
    private String branchAddress2;
    private String branchAddress3;
    private String branchAddress4;
    private String branchAddress5;
    private String branchPostCode;
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
    private String teamExpiryDate;


    private String isCentralPrint="Y";
    private String isLocalPrint="N";
    private String printMethod="central";
    //private String isArchived="N";
    //private String isCancelled = "N";
    private String fileName;
    private String s3Url;
    private String letterRefNo;
    private String addressFormatInd;
}
