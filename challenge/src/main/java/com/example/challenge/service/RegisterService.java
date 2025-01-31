package com.example.challenge.service;

import com.example.challenge.dto.UserDto;
import com.example.challenge.model.User;
import com.example.challenge.repository.UserRepository;
import com.example.challenge.security.Role;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private UserRepository userRepository;

    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserDto userDto) {
        User user = new User();

        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRole(Role.USER);

        userRepository.save(user);

    }
}
