package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class UsersController {

    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getUsersPage(Model model) {
        logger.debug("Request received to get users page");
        model.addAttribute("users", userService.getUsersList());
        return "users";
    }

    @GetMapping(value = "/add")
    public String addNewUser(Model model) {
        logger.debug("Request received to show add new user form");
        model.addAttribute("user", new User());
        return "info";
    }

    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            logger.debug("Validation errors found while saving user: {}", bindingResult.getAllErrors());
            return "info";
        }
        logger.debug("Request received to save user: {}", user);
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping(value = "/edit")
    public String editUser(@RequestParam("id") int id, Model model) {
        logger.debug("Request received to edit user with id: {}", id);
        model.addAttribute("user", userService.getById(id));
        return "info";
    }

    @GetMapping(value = "/delete")
    public String deleteUser(@RequestParam("id") int id) {
        logger.debug("Request received to delete user with id: {}", id);
        userService.delete(userService.getById(id));
        return "redirect:/";
    }
}

