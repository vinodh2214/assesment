package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage () {
        return "index";
    }
    @GetMapping("/login")
    public String showLoginPage () {
        return "login";
    }

}
