package by.demo.docker_tutorial_java.user;

import org.springframework.data.jpa.repository.JpaRepository;

// "JpaRepository" даёт готовые методы: save, findById, findAll и т.д.
public interface UserRepository extends JpaRepository<User, Long> {
}

