package org.example.tasklist_lisow.repository.impl;

import org.example.tasklist_lisow.domain.task.Task;
import org.example.tasklist_lisow.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositotyImpl implements TaskRepository {
    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void assinqnToUserId(Long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Task taskId) {

    }
}
