package com.graey.spring_security.model;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
}
