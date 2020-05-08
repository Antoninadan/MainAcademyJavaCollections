package com.mainacad.runner;

import com.mainacad.model.User;
import com.mainacad.service.GenerateUsers;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        List<User> users = GenerateUsers.getUsers();

        Map<Integer, User> treeMap = new TreeMap<>();
        treeMap.put(0, users.get(0));
        treeMap.put(1, users.get(1));
        treeMap.put(2, users.get(2));
        treeMap.put(3, users.get(3));
        treeMap.put(4, users.get(4));
        System.out.println("toString: " + treeMap + "\n");

        treeMap.put(-1, users.get(0));
        for (Map.Entry<Integer, User> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();

        User user1 = treeMap.get(2);
        User user2 = treeMap.get(4);
        for (Map.Entry<Integer, User> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();


        Comparator<Integer> comparatorReverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o2 > o1) return 1;
                return 0;
            }
        };

        Map<Integer, User> treeMapReverse = new TreeMap<>(comparatorReverse);
        treeMapReverse.putAll(treeMap);
        for (Map.Entry<Integer, User> entry : treeMapReverse.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();

    }
}
