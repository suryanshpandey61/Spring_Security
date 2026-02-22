package com.jwt.example.JwtExample.service;

import com.jwt.example.JwtExample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService() {
      userList.add(new User(UUID.randomUUID().toString(),"Anmol Pandey","anmol@gmail.com"));
      userList.add(new User(UUID.randomUUID().toString(),"Suryansh Pandey","suryansh@gmail.com"));
      userList.add(new User(UUID.randomUUID().toString(),"Anubhav Tiwari","anubhav@dev.com"));
      userList.add(new User(UUID.randomUUID().toString(),"Gaurav Mishra","gaurav@yahoo.com"));
    }
}
