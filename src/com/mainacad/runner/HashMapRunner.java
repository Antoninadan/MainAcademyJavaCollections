package com.mainacad.runner;

import com.mainacad.model.User;
import com.mainacad.service.GenerateUsers;

import java.util.HashMap;
import java.util.Iterator;
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
        System.out.println("toString: " + hashmap + "\n");


        // 1. Iteration
        for (Map.Entry<Integer, User> entry : hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();

        // 2. Iteration
        for (Integer key : hashmap.keySet())
            System.out.println(hashmap.get(key));
        System.out.println();

        // 3. Iteration
        Iterator<Map.Entry<Integer, User>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println();


        Iterator<Map.Entry<Integer, User>> itr1 = hashmap.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<Integer, User> entry = itr1.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();

        // add and order change
        hashmap.put(-1, users.get(0));
        for (Map.Entry<Integer, User> entry : hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();


    }
}
