package com.example.demo.controller;

import com.example.demo.security.JwtUtil;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        try {
            System.out.println(">>> Attempting login for user: " + request.getUsername());

            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                    request.getUsername(), request.getPassword()
                )
            );

            if (authentication.isAuthenticated()) {
                String token = jwtUtil.generateToken(request.getUsername());

                LoginResponse response = new LoginResponse(
                    token,
                    "Login successful",
                    request.getUsername()
                );
                System.out.println(">>> Login successful, token generated.");
                return ResponseEntity.ok(response);
            } else {
                System.out.println(">>> Authentication failed: Not authenticated.");
                return ResponseEntity.status(401).body(
                    new LoginResponse(null, "Authentication failed", request.getUsername())
                );
            }

        } catch (AuthenticationException e) {
            System.out.println(">>> Login failed for " + request.getUsername() + ": " + e.getMessage());
            return ResponseEntity.status(401).body(
                new LoginResponse(null, "Invalid credentials", request.getUsername())
            );
        }
    }
}
