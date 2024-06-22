package spring.app.spring_mvc.service;

import spring.app.spring_mvc.model.User;
import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void delete(User user);

    void save(User user);

    User getById(int id);
}
