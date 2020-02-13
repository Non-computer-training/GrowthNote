package com.example.GrowthNote.data;

import com.example.GrowthNote.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData {
    // jack：123456
    // xiaoming：2345678
    public static List<User> userLists = new ArrayList(Arrays.asList(
            new User("f8d809a3-6206-4d93-ae2c-3995868535b6", "jack", "e10adc3949ba59abbe56e057f20f883e"),
            new User("38d76638-91a6-49dc-b31a-418d2a0c3e0a", "xiaoming", "b3275960d68fda9d831facc0426c3bbc")));
}
