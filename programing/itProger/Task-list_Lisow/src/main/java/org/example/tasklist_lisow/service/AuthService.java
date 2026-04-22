package org.example.tasklist_lisow.service;

import org.example.tasklist_lisow.web.dto.auth.JwtRequest;
import org.example.tasklist_lisow.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
