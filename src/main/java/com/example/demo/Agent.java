package com.example.demo;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agent {
    private String agentCode;
    private String agentName;
    private Map<String, Object> extendedProps;
    private String agentEmail;
    private String phoneNumber;
    // getters/setters
}
