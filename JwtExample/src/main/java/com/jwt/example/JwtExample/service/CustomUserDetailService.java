package com.jwt.example.JwtExample.service;

import com.jwt.example.JwtExample.entities.User;
import com.jwt.example.JwtExample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //load user from database
        User user= userRepository.findByEmail(username).orElseThrow(()->new RuntimeException("User not found !!"));
        return user;
    }
}
