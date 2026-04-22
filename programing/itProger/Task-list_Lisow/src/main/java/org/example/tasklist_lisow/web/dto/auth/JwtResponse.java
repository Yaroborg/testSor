package org.example.tasklist_lisow.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {

    private String id;

    private String username;

    private String accessToken;

    private String refreshToken;

}
