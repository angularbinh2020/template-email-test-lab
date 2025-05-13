package com.example.demo;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverageInsured {
    private long partyId;
    private String fullName;
    private int coverageId;
    private int orderId;
    private Map<String, Object> extendedProps;
    // getters/setters
}
