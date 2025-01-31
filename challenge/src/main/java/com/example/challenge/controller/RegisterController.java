package com.example.challenge.controller;

import com.example.challenge.dto.UserDto;
import com.example.challenge.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public ResponseEntity<String> register(@Valid @RequestBody UserDto userDto) {
        registerService.register(userDto);

        return ResponseEntity.ok().body("User created successfully");
    }
}
