package com.mainacad.runner;

import com.mainacad.model.User;
import com.mainacad.service.GenerateUsers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {
        List<User> users = GenerateUsers.getUsers();

        Map<Integer, User> hashmap = new HashMap<>();
        hashmap.put(0, users.get(0));
        hashmap.put(1, users.get(1));
        hashmap.put(2, users.get(2));
        hashmap.put(3, users.get(3));
        hashmap.put(4, users.get(4));
        hashmap.put(5, users.get(5));
        hashmap.put(6, users.get(6));

        System.out.println(hashmap);

    }
}
