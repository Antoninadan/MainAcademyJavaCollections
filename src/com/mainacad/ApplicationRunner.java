package com.mainacad;

import com.mainacad.model.User;

import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {

        User user1= new User("Alex", 25);
        User user2= new User("Yuriy", 20);
        User user3= new User("Peter", 21);
        User user4= new User("Nikita", 37);
        User user5= new User("Mia", 25);
        User user6 = user1;
        User user7 = user2;

        Queue<User> queue = new PriorityQueue<>();
        queue.add(user4);
        queue.add(user5);
        queue.add(user1);
        queue.add(user2);
        queue.add(user3);
        queue.add(user6);
        queue.add(user7);
        queue.add(user3);

        System.out.println("Queue has size " + queue.size());

        User fisrtElement = queue.peek();
        System.out.println("fisrtElement.getName() = " + fisrtElement.getName());
        fisrtElement = queue.poll();
        System.out.println("fisrtElement.getName() = " + fisrtElement.getName());

        List<User> list = new ArrayList<>(queue);
        System.out.println("List has size = " + list.size());

        list.add(7,user3);
        System.out.println("List has size = " + list.size());


        Set<User> set = new HashSet<>(list);
        System.out.println("Set has size = " + set.size());

        for (int i = 0; i < queue.size(); i++) { /// !!!!!!!!!!!!!!!!!!!!!!!!!!!!1
            System.out.println(queue.peek());
        }

    }
}