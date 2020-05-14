package com.mainacad.runner;

import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(34);
        treeSet.add(3);
        treeSet.add(102);
        treeSet.add(102);
        treeSet.add(-3);
        System.out.println(treeSet);

    }
}
