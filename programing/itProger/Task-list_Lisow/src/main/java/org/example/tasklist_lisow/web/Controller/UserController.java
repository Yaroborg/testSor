package org.example.tasklist_lisow.web.Controller;


import lombok.RequiredArgsConstructor;
import org.example.tasklist_lisow.domain.task.Task;
import org.example.tasklist_lisow.domain.user.User;
import org.example.tasklist_lisow.service.TaskService;
import org.example.tasklist_lisow.service.UserService;
import org.example.tasklist_lisow.web.dto.task.TaskDto;
import org.example.tasklist_lisow.web.dto.user.UserDto;
import org.example.tasklist_lisow.web.dto.validation.OnUpdate;
import org.example.tasklist_lisow.web.mappers.TaskMapper;
import org.example.tasklist_lisow.web.mappers.UserMapper;
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

    private final UserMapper userMapper;

    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto){
        User user = userMapper.toEntity(dto);
        User updateUser = userService.update(user);
        return userMapper.toDto(updateUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id){
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/{id}/task")
    public List<TaskDto> getTasksByUserId(@PathVariable Long id){
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto createTask(@PathVariable Long id,
                              @Validated(OnUpdate.class)
                              @RequestBody TaskDto dto){
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task,id);
        return taskMapper.toDto(createdTask);

    }

}
