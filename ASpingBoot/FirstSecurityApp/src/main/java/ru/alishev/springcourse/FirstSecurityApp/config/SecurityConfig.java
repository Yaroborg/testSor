package ru.alishev.springcourse.FirstSecurityApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.alishev.springcourse.FirstSecurityApp.services.PersonDetailsService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final PersonDetailsService personDetailsService;
    @Autowired
    public SecurityConfig(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }
    // Настройка собственной безопасности
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // Отключение защиты от CSRF
        http.authorizeRequests() // Конфигурация запросов
            .antMatchers("/auth/login", "/error").permitAll() // Доступ разрешен всем(благодаря указателю .permitAll())
            .anyRequest().authenticated() // Доступ разрешен только для зарегистрированных пользователей(благодаря указателю .authenticated())
            .and();
        http.formLogin().loginPage("/auth/login") // Страница логина
            .loginProcessingUrl("/process_login")    // URL, на котором обрабатывается логин
            .defaultSuccessUrl("/hello", true) // Перенаправление после успешной аутентификации
            .failureUrl("/auth/login?error"); // Перенаправление после ошибки аутентификации

    }

    // Настройка аутентификации
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(personDetailsService)
                .passwordEncoder(getPasswordEncoder());
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}




