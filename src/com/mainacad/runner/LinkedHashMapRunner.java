package com.mainacad.runner;

import com.mainacad.model.User;
import com.mainacad.service.GenerateUsers;

import java.util.*;

public class LinkedHashMapRunner {
    public static void main(String[] args) {
        List<User> users = GenerateUsers.getUsers();

        // accessOrder = false
        Map<Integer, User> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0, users.get(0));
        linkedHashMap.put(1, users.get(1));
        linkedHashMap.put(2, users.get(2));
        linkedHashMap.put(3, users.get(3));
        linkedHashMap.put(4, users.get(4));
        System.out.println("toString: " + linkedHashMap + "\n");

        linkedHashMap.put(-1, users.get(0));
        for (Map.Entry<Integer, User> entry : linkedHashMap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();

        User user1 = linkedHashMap.get(2);
        User user2 = linkedHashMap.get(4);
        for (Map.Entry<Integer, User> entry : linkedHashMap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();



        // accessOrder = true
        Map<Integer, User> linkedHashMapOrderTrue = new LinkedHashMap<Integer, User>(15, 0.75f, true);
            linkedHashMapOrderTrue.put(0, users.get(0));
            linkedHashMapOrderTrue.put(1, users.get(1));
            linkedHashMapOrderTrue.put(2, users.get(2));
            linkedHashMapOrderTrue.put(3, users.get(3));
            linkedHashMapOrderTrue.put(4, users.get(4));

        System.out.println("accessOrder = true");
        linkedHashMapOrderTrue.put(-1, users.get(0));
        for (Map.Entry<Integer, User> entry : linkedHashMapOrderTrue.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();

        User user3 = linkedHashMapOrderTrue.get(2);
        User user4 = linkedHashMapOrderTrue.get(4);
        for (Map.Entry<Integer, User> entry : linkedHashMapOrderTrue.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();


    }
}
