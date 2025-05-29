package com.alaa.SpringSecurityEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

  @GetMapping("/")
  public String greeting(HttpServletRequest request) {
    return "Welcome to Spring Security Example!" + request.getSession().getId();
  }

}
