package com.example.Tasklist.service;
import com.example.Tasklist.web.dto.auth.JwtResponse;
import com.example.Tasklist.web.dto.auth.JwtRequest;
public interface AuthService {

    JwtResponse login (JwtRequest loginRequest);
    JwtResponse refresh (String refreshToken);
}
