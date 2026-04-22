package org.example.tasklist_lisow.service;

import org.example.tasklist_lisow.web.dto.auth.JwtRequest;
import org.example.tasklist_lisow.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiseImpl implements AuthService{
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
