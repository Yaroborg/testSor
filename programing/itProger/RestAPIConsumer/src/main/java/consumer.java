import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;

import java.util.HashMap;
import java.util.Map;

public class consumer {


    public static void main(String[] args) {


        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "http://94.198.50.185:7081/api/users";

        // Получение списка всех пользователей
        ResponseEntity<String> response = restTemplate.getForEntity(baseUrl, String.class);
        String sessionId = response.getHeaders().getFirst(HttpHeaders.SET_COOKIE);
        System.out.println("Session ID: " + sessionId);

        // Установка заголовка сессии для последующих запросов
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.COOKIE, sessionId);
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Создание пользователя с id = 3, name = James, lastName = Brown, age = на ваш выбор
        String createUserJson = "{\"id\":3,\"name\":\"James\",\"lastName\":\"Brown\",\"age\":30}";
        HttpEntity<String> createUserRequest = new HttpEntity<>(createUserJson, headers);
        ResponseEntity<String> createUserResponse = restTemplate.postForEntity(baseUrl, createUserRequest, String.class);
        System.out.println("Create User Response: " + createUserResponse.getBody());

        // Изменение пользователя с id = 3
        String updateUserJson = "{\"id\":3,\"name\":\"Thomas\",\"lastName\":\"Shelby\",\"age\":30}";
        HttpEntity<String> updateUserRequest = new HttpEntity<>(updateUserJson, headers);
        ResponseEntity<String> updateUserResponse = restTemplate.exchange(baseUrl, HttpMethod.PUT, updateUserRequest, String.class);
        System.out.println("Update User Response: " + updateUserResponse.getBody());

        // Удаление пользователя с id = 3
        HttpEntity<String> deleteUserRequest = new HttpEntity<>(headers);
        ResponseEntity<String> deleteUserResponse = restTemplate.exchange(baseUrl + "/3", HttpMethod.DELETE, deleteUserRequest, String.class);
        System.out.println("Delete User Response: " + deleteUserResponse.getBody());
    }


}

