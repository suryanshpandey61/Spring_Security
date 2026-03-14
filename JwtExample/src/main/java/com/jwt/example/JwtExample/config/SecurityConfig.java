package com.jwt.example.JwtExample.config;

import com.jwt.example.JwtExample.security.JwtAuthenticationEntryPoint;
import com.jwt.example.JwtExample.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationFilter filter;
    @Autowired
    private JwtAuthenticationEntryPoint entryPoint;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {

        //configurations
        httpSecurity.csrf(csrf -> csrf.disable())
                .cors(cors -> cors.disable())
                .authorizeHttpRequests(
                        auth -> auth.requestMatchers("/home/**")
                                .authenticated()
                                .requestMatchers("/auth/login").permitAll()
                )
                .exceptionHandling(ex -> ex.authenticationEntryPoint(entryPoint))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        ;
        httpSecurity.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();
    }

    public DaoAuthenticationProvider daoAuthenticationProvider

}
