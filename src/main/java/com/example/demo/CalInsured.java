package com.example.demo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalInsured {
    private long partyId;
    private List<Exclusion> exclusions;
    private List<Loading> loadings;
    private List<Decline> declines;
    private List<Postpone> postpones;
    private String loadingMainProductName;
    private String loadingQuotationNumber;
    private double totalExtraPremium;
    private String reason;
    private String subReason;
    // getters/setters
}
