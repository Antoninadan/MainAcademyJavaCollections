package com.mainacad.runner;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorRunner {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("First");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
