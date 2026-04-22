package by.demo.docker_tutorial_java.user;

import jakarta.persistence.*;
import java.time.Instant;

// "Entity" = запись в таблице БД
@Entity
@Table(name = "users") // создаст таблицу users (из-за ddl-auto=update)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL/AUTO-INCREMENT
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    // геттеры/сеттеры
    public Long getId() { return id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
