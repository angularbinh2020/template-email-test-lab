package com.example.demo;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MBALPrintPolicyVO {
    private String issueDate;
    private int policyType;
    private String policyTypeDesc;
    private String applyDate;
    private String discountType;
    private String discountTypeDesc;
    private int installPrem;
    private int currency;
    private String inceptionDate;
    private String expiryDate;
    private String deliverType;
    private String deliverTypeDesc;
    private String policyNumber;
    private String channelType;
    private String insurerCode;
    private String introducerNo;
    private String proposalNo;
    private String paymode;
    private QuestionnaireInfo questionnaireInfo;
    private String quotationCode;
    private List<CoverageGroup> coverageGroups;
    private List<Coverage> coverages;
    private Party policyHolder;
    private List<Party> insureds;
    private List<Beneficiary> beneficiaries;
    private List<Party> payers;
    private List<PayerAccount> payerAccounts;
    private String mainCoverageName;
    private String comboId;
    private Staff referrer;
    private Staff supporter;
    private Staff sale;
    private List<Agent> agents;
    private String generationDate;
    private String generationYear;
    private String generationMonth;
    private String generationDay;
    private String effectiveYear;
    private String effectiveMonth;
    private String effectiveDay;
    private String transactionType;
    private Cal cal;

    // getters/setters
}
