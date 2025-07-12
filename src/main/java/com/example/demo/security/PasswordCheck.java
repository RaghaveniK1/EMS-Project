package com.example.demo.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordCheck {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "test123";
        String hashedPassword = "$2a$10$YqQybUtQBM7bTzWxoeDRdeJ9k6F/Ec9.z1zgtbFwNeA3vQXxqLgy6";

        boolean result = encoder.matches(rawPassword, hashedPassword);
        System.out.println(">>> Password match? " + result);
    }
}
