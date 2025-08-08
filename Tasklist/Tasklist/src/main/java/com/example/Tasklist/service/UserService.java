package com.example.Tasklist.service;
import com.example.Tasklist.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getdById(Long id);
    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean  isTaskOwner(Long userId, Long taskId);

    void delete (Long Id);
}
