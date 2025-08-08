package com.example.Tasklist.web.dto.auth;

import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Data
public class JwtRequest {
    @NotNull
    private String username;
    @NotNull
    private String password;

}
