package CorpFood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "LoginPage";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("error12", true);
        return "LoginPage";
    }
}