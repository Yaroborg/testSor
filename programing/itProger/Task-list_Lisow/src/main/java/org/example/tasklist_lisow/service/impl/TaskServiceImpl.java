package org.example.tasklist_lisow.service.impl;

import org.example.tasklist_lisow.domain.task.Task;
import org.example.tasklist_lisow.domain.user.User;
import org.example.tasklist_lisow.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(Long id) {
        return List.of();
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task,Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
