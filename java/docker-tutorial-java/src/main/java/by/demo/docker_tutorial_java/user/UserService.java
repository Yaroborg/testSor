package by.demo.docker_tutorial_java.user;

import by.demo.docker_tutorial_java.user.dto.UserRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Transactional // "одна атомарная операция" — сохранить пользователя
    public User create(UserRequest req) {
        User u = new User();
        u.setUsername(req.getUsername());
        u.setEmail(req.getEmail());
        return repo.save(u); // INSERT в БД
    }
}
