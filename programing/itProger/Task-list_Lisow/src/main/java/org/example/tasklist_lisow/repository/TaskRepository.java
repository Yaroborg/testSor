package org.example.tasklist_lisow.repository;

import org.example.tasklist_lisow.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findByUserId(Long userId);

    void assinqnToUserId(Long userId);

    void update(Task task);

    void create(Task task);

    void delete(Task taskId);

}
