package com.example.dao;

import com.example.model.User;
import java.util.List;

public interface UserDao {
    List<User> getUsersList();

    void delete(User user);

    void save(User user);

    User getById(int id);
}
