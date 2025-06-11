package com.alaa.SpringSecurityEx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alaa.SpringSecurityEx.model.Users;
import com.alaa.SpringSecurityEx.service.UserService;

@RestController
public class UserController {

  @Autowired
  private UserService service;

  @PostMapping("/register")
  public Users register(@RequestBody Users user) {
    return service.register(user);
  }
}
