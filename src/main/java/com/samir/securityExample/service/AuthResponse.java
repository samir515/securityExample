package com.samir.securityExample.service;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthResponse {

    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }

}
