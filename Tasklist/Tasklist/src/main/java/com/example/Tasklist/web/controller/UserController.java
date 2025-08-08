package com.example.Tasklist.web.controller;

import com.example.Tasklist.domain.task.Task;
import com.example.Tasklist.domain.user.User;
import com.example.Tasklist.service.TaskService;
import com.example.Tasklist.service.UserService;
import com.example.Tasklist.web.dto.task.TaskDto;
import com.example.Tasklist.web.dto.user.UserDto;
import com.example.Tasklist.web.dto.validation.OnCreate;
import com.example.Tasklist.web.dto.validation.OnUpdate;
import com.example.Tasklist.web.mappers.TaskMapper;
import com.example.Tasklist.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;

    private final TaskService taskService;

    private final TaskMapper taskMapper;

    private final UserMapper userMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {

        User user = userMapper.toEntity(dto);
        User updatedUser = userService.update(user);
        return userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {

        User user = userService.getdById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTaskByUserId(@PathVariable Long id) {

        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto createTask(@PathVariable Long id,
                              @Validated(OnCreate.class) @RequestBody TaskDto taskDto) {

        Task task = taskMapper.toEntity(taskDto);
        Task createdTask = taskService.create(task, id);
        return taskMapper.toDto(createdTask);
    }

}
