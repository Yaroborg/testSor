package org.example.tasklist_lisow.service;

import org.example.tasklist_lisow.domain.task.Task;
import org.example.tasklist_lisow.domain.user.User;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task update (Task task);

    Task create (Task task,Long id);

    void delete (Long id);



}
