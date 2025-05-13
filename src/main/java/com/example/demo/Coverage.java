package com.example.demo;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coverage {
    private String productGroup;
    private int coverageId;
    private int masterCoverageId;
    private String chargePeriod;
    private int chargeYear;
    private String coveragePeriod;
    private int coverageYear;
    private String productCode;
    private String productName;
    private String waiverIndi;
    private double waivedSa;
    private String internaId;
    private String expiryDate;
    private String insuredCategory;
    private CoverageInsured coverageInsured;
    private String renewDecision;
    private String benefitLevel;
    private String paymentFreq;
    private String paymentFreqDesc;
    private String paymentMethod;
    private String paymentMethodDesc;
    private double sumAssured;
    private int unit;
    private double totalPrem;
    private double extraPrem;
    private String protectionOption;
    private String expectedChargePeriod;
    private Map<String, Object> extendedProps;
    // getters/setters
}
