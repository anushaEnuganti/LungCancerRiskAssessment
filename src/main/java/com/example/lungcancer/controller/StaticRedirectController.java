package com.example.lungcancer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticRedirectController {

    @GetMapping("/")
    public String home() {
        return "redirect:/login.html"; // Optional: set home route
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:/login.html";
    }

    @GetMapping("/register")
    public String register() {
        return "redirect:/register.html";
    }

    @GetMapping("/risk")
    public String risk() {
        return "redirect:/risk.html";
    }
}


