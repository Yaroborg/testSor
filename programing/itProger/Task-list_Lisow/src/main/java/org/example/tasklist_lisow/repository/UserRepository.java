package org.example.tasklist_lisow.repository;

import org.example.tasklist_lisow.domain.user.Role;
import org.example.tasklist_lisow.domain.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> finById(Long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId,Long taskId);

    void delete(Long id);

}
