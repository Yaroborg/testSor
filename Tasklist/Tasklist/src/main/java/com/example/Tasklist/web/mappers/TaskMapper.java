package com.example.Tasklist.web.mappers;
import com.example.Tasklist.domain.task.Task;
import com.example.Tasklist.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);
    Task toEntity(TaskDto taskDto);
    List<TaskDto> toDto(List<Task> tasks);


}
