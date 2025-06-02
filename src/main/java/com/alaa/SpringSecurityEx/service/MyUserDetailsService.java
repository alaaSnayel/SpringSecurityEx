package com.alaa.SpringSecurityEx.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alaa.SpringSecurityEx.model.Users;
import com.alaa.SpringSecurityEx.model.UserPrincipal;
import com.alaa.SpringSecurityEx.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

  @Autowired
  private UserRepo repo;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Users user1 = repo.findByUsername(username);
    if (user1 == null) {
      System.out.println("User Not Found");
      throw new UsernameNotFoundException("user not found");
    }

    return new UserPrincipal(user1);
  }

}
