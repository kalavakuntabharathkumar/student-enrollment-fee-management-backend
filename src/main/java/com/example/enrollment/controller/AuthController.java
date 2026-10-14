package com.example.enrollment.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController @RequestMapping("/api/auth")
public class AuthController {
 @PostMapping("/login")
 public Map<String,String> login(@RequestBody Map<String,String> body){
   // Demo endpoint: production JWT issuance should validate credentials against a user store.
   return Map.of("token","demo-jwt-token","role",body.getOrDefault("role","STAFF"));
 }
}
