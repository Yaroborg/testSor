package com.example.Tasklist.service;
import com.example.Tasklist.domain.task.Task;
import java.util.List;


public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task create(Task task, Long id);
    Task update(Task task);

    void delete(Long id);

}
