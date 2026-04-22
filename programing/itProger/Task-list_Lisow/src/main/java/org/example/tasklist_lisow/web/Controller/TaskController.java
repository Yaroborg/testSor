package org.example.tasklist_lisow.web.Controller;

import lombok.RequiredArgsConstructor;
import org.example.tasklist_lisow.domain.task.Task;
import org.example.tasklist_lisow.service.TaskService;
import org.example.tasklist_lisow.web.dto.task.TaskDto;
import org.example.tasklist_lisow.web.dto.validation.OnUpdate;
import org.example.tasklist_lisow.web.mappers.TaskMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/tasks")
@RestController
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;

    private final TaskMapper taskMapper;

    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class)@RequestBody TaskDto dto){
        Task task = taskMapper.toEntity(dto);
        Task updatedTask = taskService.update(task);
        return taskMapper.toDto(updatedTask);
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id){
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);

    }

    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable Long id){
        taskService.delete(id);
    }
}
