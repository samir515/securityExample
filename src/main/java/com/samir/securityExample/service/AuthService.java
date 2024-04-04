package com.samir.securityExample.service;

import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<AuthResponse> authenticate(AuthRequest authRequest) throws Exception;
}
