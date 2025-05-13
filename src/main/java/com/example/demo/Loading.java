package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Loading {
    private String productCommercialName;
    private String productName;
    private String productCode;
    private double sumAssured;
    private double premiumBeforeLoading;
    private double premiumAfterLoading;
    private double extraPremium;
}