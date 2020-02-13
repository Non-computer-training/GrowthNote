package com.example.GrowthNote.controllers;

import com.example.GrowthNote.entities.User;
import com.example.GrowthNote.services.UserService;

public class UserController {
    private UserService userService = new UserService();

    public Boolean getUserByNameAndPassword(String name, String password) {
        return userService.getUserByNameAndPassword(name, password);
    }

    public void userRegister(String name, String password) {
        userService.userRegister(name, password);
    }
}
