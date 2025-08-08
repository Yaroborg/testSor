package com.example.Tasklist.web.dto.user;
import com.example.Tasklist.domain.task.Task;
import com.example.Tasklist.domain.user.Role;
import com.example.Tasklist.web.dto.validation.OnCreate;
import com.example.Tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {

    @NotNull(message = "Id can't be null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must benot null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name must be between 255 characters", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Username must benot null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Username must be between 255 characters", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null", groups = OnCreate.class)
    private String passwordConfirmation;


}
