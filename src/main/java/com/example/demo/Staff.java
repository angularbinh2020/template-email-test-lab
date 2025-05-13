package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Staff {
    private String branchName;
    private String branchCode;
    private String branchAdress;
    private String licenseCode;
    private String staffName;
    private String staffCode;
    private String email;
    private String phone;
    // getters/setters
}
