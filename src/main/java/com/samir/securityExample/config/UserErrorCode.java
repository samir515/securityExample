package com.samir.securityExample.config;

import lombok.Getter;

@Getter
public enum UserErrorCode {
    EMAIL_NON_EXISTENT("Email does not exist");
    // Other error codes...

    private final String description;

    UserErrorCode(String description) {
        this.description = description;
    }

}
