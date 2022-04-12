package com.hjusic.config.security.service;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordManager {

    public PasswordManager(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private final PasswordEncoder passwordEncoder;

    public String encode(String rawPassword){
        return passwordEncoder.encode(rawPassword);
    }

    public Boolean validate(String rawPassword, String encoded){
        return passwordEncoder.matches(rawPassword, encoded);
    }

}
