package com.example.Tasklist.web.dto.auth;
import lombok.Data;

@Data
public class JwtResponse {

    private Long id;

    private String username;

    private String accesToken;

    private String refreshToken;

}
