package com.example.demo;

import java.io.File;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.type.TypeReference;
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
      TypeReference<Map<String, Object>> typeRef = new TypeReference<>() {
      };
      Map<String, Object> root = mapper.readValue(jsonFile, typeRef);
      Map<String, Object> MBALPrintPolicyVO = (Map<String, Object>) root.get("MBALPrintPolicyVO");
      model.addAttribute("MBALPrintPolicyVO", MBALPrintPolicyVO);
    } catch (Exception e) {
      e.printStackTrace();
      model.addAttribute("error", "Không thể đọc file JSON");
    }
    return "editor"; // tương ứng với file editor.html trong templates
  }
}
