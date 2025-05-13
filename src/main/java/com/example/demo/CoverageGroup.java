package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverageGroup {
    private String productGroup;
    private String technicalName;
    private String productDocNum;
    private String productApprovalDate;
    private String commercialName;
    private double totalPrem;
    // getters/setters
}
