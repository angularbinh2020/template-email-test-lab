package com.example.demo;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Party {
    private int partyType;
    private String partyId;
    private MBALPersonVO MBALPersonVO;
    private String relationToPHDesc; // optional
    private int relationToPH;        // optional
    private String medicalExamIndi; // optional
    private Map<String, Object> extendedProps;
    // getters/setters
}
