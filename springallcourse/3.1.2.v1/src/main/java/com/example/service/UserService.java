package com.example312.v1.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void delete(User user);

    void save(User user);

    User getById(int id);
}
