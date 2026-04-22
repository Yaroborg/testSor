package by.demo.docker_tutorial_java.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Это "коробочка данных", которую присылает клиент в JSON.
// Пример JSON: {"username": "anna", "email": "a@a.com"}
public class UserRequest {

    @NotBlank(message = "username обязателен") // "строка не должна быть пустой"
    private String username;

    @NotBlank(message = "email обязателен")
    @Email(message = "email некорректный")      // простая проверка формата
    private String email;

    // геттеры/сеттеры НУЖНЫ (если не используешь Lombok)
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
