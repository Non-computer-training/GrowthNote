package com.example.GrowthNote.data;

import com.example.GrowthNote.entities.User;

import java.util.Arrays;
import java.util.List;

public class UserData {
    // jack：123456
    // xiaoming：2345678
    public static List<User> userLists = Arrays.asList(
            new User(1, "jack", "e10adc3949ba59abbe56e057f20f883e"),
            new User(2, "xiaoming", "b3275960d68fda9d831facc0426c3bbc"));
}
