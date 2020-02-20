package com.example.GrowthNote.repositories;

import com.example.GrowthNote.data.UserData;
import com.example.GrowthNote.entities.User;

import java.util.List;

public class UserRepository {
    private List<User> users = UserData.userLists;

    public Boolean getUserByNameAndPassword(String name, String password) {
        for (User user : users) {
            if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void userRegister(User user) {
        users.add(user);
    }
}
