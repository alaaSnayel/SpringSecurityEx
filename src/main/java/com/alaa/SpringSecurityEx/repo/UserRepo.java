package com.alaa.SpringSecurityEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alaa.SpringSecurityEx.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

  Users findByUsername(String username);

}
