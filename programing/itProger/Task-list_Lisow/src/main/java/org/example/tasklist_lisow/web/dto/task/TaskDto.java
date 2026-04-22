package org.example.tasklist_lisow.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.example.tasklist_lisow.domain.task.Status;
import org.example.tasklist_lisow.web.dto.validation.OnCreate;
import org.example.tasklist_lisow.web.dto.validation.OnUpdate;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class TaskDto {

    @NotNull(message = "id must be not null",groups = OnUpdate.class)
    private Long id;

    @Length(max = 255,message = "title length must be smaller than 255 symbols",groups = {OnCreate.class, OnUpdate.class})
    @NotNull(message = "title must be not null",groups = {OnUpdate.class, OnUpdate.class})
    private String title;

    @Length(max = 255,message = "description length must be smaller than 255 symbols",groups = {OnCreate.class, OnUpdate.class})
    private String description;


    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime expirationDate;
}
