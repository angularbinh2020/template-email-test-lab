package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccount {
    private String bankCode;
    private String bankAccountCity;
    private String bankAccount;
    private String accoName;
    private String accountType;
    private String debitCreditType;
    private String creditCardType;
    // getters/setters
}
