package com.example.lungcancer.controller;

import com.example.lungcancer.model.User;
import com.example.lungcancer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AuthController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        if (repo.existsById(user.getUsername())) {
            return ResponseEntity.badRequest().body("Username already exists");
        }
        repo.save(user);
        return ResponseEntity.ok("User registered");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User found = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (found != null) return ResponseEntity.ok("success");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}

