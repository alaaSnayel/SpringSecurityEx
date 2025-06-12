package com.alaa.SpringSecurityEx.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService {

  public String generateToken() {
    return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6Ik1hZ2R5IiwiaWF0IjoxNTE2MjM5MDIyfQ.w4KcYF4nYf_A66Gz-c5qYc5fqayLQhPhB12QwiXKD44";
  }
  
}
