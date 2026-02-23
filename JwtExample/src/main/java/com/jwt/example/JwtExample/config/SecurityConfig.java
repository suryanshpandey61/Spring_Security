package com.jwt.example.JwtExample.config;

import com.jwt.example.JwtExample.security.JwtAuthenticationEntryPoint;
import com.jwt.example.JwtExample.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationFilter filter;
    @Autowired
    private JwtAuthenticationEntryPoint entryPoint;
    
}
