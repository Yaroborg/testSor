package ru.alishev.springcourse.FirstSecurityApp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2,max = 100,message = "Имя должно быть в диапозоне от 2х до 100 букв")
    @Column(name = "username")
    private String username;

    @Min(value = 1990,message = "Если ты не вампир твой год должен быть старше 1900")
    @Column(name = "year_of_birth")
    private int yearOfBirth;

    @Column(name = "password")
    private String password;

    public Person() {

    }
     public Person(String username, int yearOfBirth) {
        this.username = username;
        this.yearOfBirth = yearOfBirth;
     }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(@NotEmpty(message = "Имя не должно быть пустым") @Size(min = 2, max = 100, message = "Имя должно быть в диапозоне от 2х до 100 букв") String username) {
        this.username = username;
    }

    public void setYearOfBirth(@Min(value = 1990, message = "Если ты не вампир твой год должен быть старше 1900") int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public @NotEmpty(message = "Имя не должно быть пустым") @Size(min = 2, max = 100, message = "Имя должно быть в диапозоне от 2х до 100 букв") String getUsername() {
        return username;
    }

    @Min(value = 1990, message = "Если ты не вампир твой год должен быть старше 1900")
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", password='" + password + '\'' +
                '}';
    }
}
