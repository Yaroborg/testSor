package org.example.tasklist_lisow.domain.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private Long id;

    private String title;

    private String description;

    private Status status;

    private LocalDateTime expirationDate;

}
