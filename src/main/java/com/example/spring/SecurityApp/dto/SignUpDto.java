package com.example.spring.SecurityApp.dto;

import lombok.Data;

import java.util.Set;

import com.example.spring.SecurityApp.entities.enums.Permission;
import com.example.spring.SecurityApp.entities.enums.Role;

@Data
public class SignUpDto {
    private String email;
    private String password;
    private String name;
    private Set<Role> roles;
    private Set<Permission> permissions;
}
