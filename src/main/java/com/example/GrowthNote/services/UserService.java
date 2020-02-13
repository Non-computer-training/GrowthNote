package com.example.GrowthNote.services;

import com.example.GrowthNote.repositories.UserRepository;
import org.springframework.util.DigestUtils;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public Boolean getUserByNameAndPassword(String name, String password) {
        String passwordMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        return userRepository.getUserByNameAndPassword(name, passwordMd5);
    }
}
