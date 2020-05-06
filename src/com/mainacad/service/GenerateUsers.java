package com.mainacad.service;

import com.mainacad.model.User;

import java.util.ArrayList;
import java.util.List;

public class GenerateUsers {
    public static List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user0 = new User("0_Alex", 25);
        User user1 = new User("1_Yuriy", 20);
        User user2 = new User("2_Peter", 21);
        User user3 = new User("3_Nikita", 37);
        User user4 = new User("4_Mia", 25);

        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}
