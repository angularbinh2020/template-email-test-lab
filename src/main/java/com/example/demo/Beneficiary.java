package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Beneficiary {
    private int no;
    private int partyType;
    private String partyId;
    private int designation;
    private int shareOrder;
    private double shareRate;
    private int relationToLA;
    private String relationToLADesc;
    private MBALPersonVO MBALPersonVO;
    // getters/setters
}
