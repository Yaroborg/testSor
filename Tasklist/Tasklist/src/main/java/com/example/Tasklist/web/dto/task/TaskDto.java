package com.example.Tasklist.web.dto.task;
import com.example.Tasklist.domain.task.Status;
import com.example.Tasklist.web.dto.validation.OnCreate;
import com.example.Tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;

@Data
public class TaskDto {

    @NotNull(message = "Id can't be null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Title must benot null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Title must be between 255 characters", groups = {OnCreate.class, OnUpdate.class})
    private String title;

    @Length(max = 255, message = "Description must be between 255 characters", groups = {OnCreate.class, OnUpdate.class})
    private String description;

    private Status status;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime expirationDate;

}
