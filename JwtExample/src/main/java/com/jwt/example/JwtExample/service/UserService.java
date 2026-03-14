package com.jwt.example.JwtExample.service;

import com.jwt.example.JwtExample.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {




    public List<User> getUserList(){
        return userList;
    }
}
