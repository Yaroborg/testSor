package org.example.tasklist_lisow.web.mappers;

import org.example.tasklist_lisow.domain.task.Task;
import org.example.tasklist_lisow.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);
}
