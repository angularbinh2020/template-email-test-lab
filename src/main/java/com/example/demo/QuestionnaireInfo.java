package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionnaireInfo {
    private String Q1;
    private String Q2;
    private String Q3;
    // getters/setters
}
