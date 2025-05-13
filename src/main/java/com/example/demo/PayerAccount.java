package com.example.demo;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayerAccount {
    private String paymentMethod;
    private String paymentMethodDesc;
    private String paymentMethodNext;
    private String paymentMethodNextDesc;
    private BankAccount bankAccount;
    private BankAccount nextBankAccount;
    private Map<String, Object> extendedProps;
    // getters/setters
}
