package com.example.GrowthNote.services;

import com.example.GrowthNote.entities.User;
import com.example.GrowthNote.repositories.UserRepository;
import org.springframework.util.DigestUtils;

import java.util.UUID;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public Boolean getUserByNameAndPassword(String name, String password) {
        String passwordMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        return userRepository.getUserByNameAndPassword(name, passwordMd5);
    }

    public void userRegister(String name, String password) {
        String passwordMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        userRepository.userRegister(new User(UUID.randomUUID().toString(), name, passwordMd5));
    }
}
