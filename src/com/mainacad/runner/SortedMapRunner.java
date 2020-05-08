package com.mainacad.runner;

import com.mainacad.model.User;
import com.mainacad.service.GenerateUsers;

import java.util.*;

public class SortedMapRunner {
    public static void main(String[] args) {

        List<User> users = GenerateUsers.getUsers();

        Map<Integer, User> treeMap = new TreeMap<>();
        treeMap.put(0, users.get(0));
        treeMap.put(1, users.get(1));
        treeMap.put(2, users.get(2));
        treeMap.put(3, users.get(3));
        treeMap.put(4, users.get(4));

        SortedMap sortedMap = Collections.synchronizedSortedMap(new TreeMap());
    }
}
