package ru.alishev.springcourse.FirstSecurityApp.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.alishev.springcourse.FirstSecurityApp.models.Person;
import ru.alishev.springcourse.FirstSecurityApp.repositories.PeopleRepository;

@Service
public class RegistrationServise {

    private final PeopleRepository peopleRepository;
    private final PasswordEncoder passwordEncoder;

    public RegistrationServise(PeopleRepository peopleRepository, PasswordEncoder passwordEncoder) {
        this.peopleRepository = peopleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(Person person) {
        person.setPassword(passwordEncoder.encode(person.getPassword()));
        peopleRepository.save(person);
    }
}
