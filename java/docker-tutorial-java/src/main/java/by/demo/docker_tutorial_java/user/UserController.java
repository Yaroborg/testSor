package by.demo.docker_tutorial_java.user;

import by.demo.docker_tutorial_java.user.dto.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// REST-контроллер. Базовый путь = /users
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // POST /users
    // Тело запроса = JSON -> UserRequest
    // @Valid включает проверку @NotBlank/@Email
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 Created
    public User create(@RequestBody @Valid UserRequest request) {
        // Возвращаем сохранённого пользователя (в ответе будет id, createdAt)
        return service.create(request);
    }
}
