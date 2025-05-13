package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Exclusion {
    private String exclusionContent;
    private String productCommercialName;
    private String productName;
    private String productCode;
    private String duration;
    private String durationMonth;
    private String durationDay;
}