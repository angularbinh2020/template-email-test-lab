package com.example.demo;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class EditorController {

  @GetMapping("/")
  public String showEditor(Model model) {
    ObjectMapper mapper = new ObjectMapper();

    // Đường dẫn tuyệt đối hoặc tương đối tới file JSON
    File jsonFile = new File("src\\main\\resources\\static\\PolicyPack_20250509.json");
    // Thêm vào model (truy cập được ở Thymeleaf như ${policy.policyNumber}, v.v.)
    try {
      JsonNode root = mapper.readTree(jsonFile);
      JsonNode policyNode = root.get("MBALPrintPolicyVO");
      MBALPrintPolicyVO policyData = mapper.treeToValue(policyNode, MBALPrintPolicyVO.class);
      model.addAttribute("MBALPrintPolicyVO", policyData);
    } catch (Exception e) {
      e.printStackTrace();
      model.addAttribute("error", "Không thể đọc file JSON");
    }
    return "editor"; // tương ứng với file editor.html trong templates
  }
}
