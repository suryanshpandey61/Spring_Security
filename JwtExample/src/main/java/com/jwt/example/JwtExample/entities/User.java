package com.jwt.example.JwtExample.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="user_table")
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String password;
    private String about;
}
