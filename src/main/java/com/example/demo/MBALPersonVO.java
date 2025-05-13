package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MBALPersonVO {
    private String firstName;
    private String midName;
    private String lastName;
    private String fullName;
    private String nationality;
    private String gender;
    private String birthday;
    private int certiType;
    private String certiTypeDesc;
    private String certiCode;
    private String certiStart;
    private String certiEnd;
    private String preferredLifeIndi;
    private String smoking;
    private String occupationCode;
    private String occupationName;
    private int income;
    private String marriageStatus;
    private String marriageStatusDesc;
    private int height;
    private int weight;
    private String fullAddress;
    private Address address;
    private String email;
    private String mobileTel;
    private String officeTel;
    private String officeTelExt;
    private String homeTel;
    private String fax;
    private String issuePlace;
    private String contact;
    private String contactTel;
    private String salutation;
    // getters/setters
}
