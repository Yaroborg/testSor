package spring.app.spring_mvc.dao;

import spring.app.spring_mvc.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsersList();

    void delete(User user);

    void save(User user);

    User getById(int id);
}
