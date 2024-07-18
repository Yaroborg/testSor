package SpringSecurity.Spring_Security_Fisunov.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/authenticated")
    public String pageForAuthenticatedUser(Principal principal) {
        return "secured part of web service " + principal.getName();
    }

    @GetMapping("/read_profile")
    public String pageForReadProfile() {
        return "read profile ";
    }

    @GetMapping("/only_for_admins")
    public String pageForAdmins() {
        return "Admin page";
    }
}
