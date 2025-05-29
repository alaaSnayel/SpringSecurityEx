package com.alaa.SpringSecurityEx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain SecuretyFilterChain(HttpSecurity http) throws Exception {
    
    // http.csrf(customizer -> customizer.disable());
    // http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
    // // http.formLogin(Customizer.withDefaults());
    // http.httpBasic(Customizer.withDefaults()); // Enable HTTP Basic authentication
    // // stateless APIs
    // http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    // return http.build();

    // We can do like this
    return http
    .csrf(customizer -> customizer.disable())
    .authorizeHttpRequests(request -> request.anyRequest().authenticated())
    .httpBasic(Customizer.withDefaults())
    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();
    // http.formLogin(Customizer.withDefaults());

  }

}
