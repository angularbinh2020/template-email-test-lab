package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String postCode;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    // getters/setters
}
