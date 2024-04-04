package com.samir.securityExample.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
    // Getters and setters for email and password
    private String email;
    private String password;

    public AuthRequest() {
    }

    public AuthRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
