package com.example.demo;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cal {
    private double totalPremiumBeforeLoading;
    private double totalPremiumAfterLoading;
    private double totalExtraPremium;
    private double totalResidualPremium;
    private List<CalInsured> calInsureds;
    private String uwSubStatusChangedDate;
    private String replyInvalidReason;
    // getters/setters
}
