package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void delete(User user);

    void save(User user);

    User getById(int id);
}
