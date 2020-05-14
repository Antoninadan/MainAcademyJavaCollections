package com.mainacad.runner;

import java.util.ArrayDeque;

public class ArrayDequeRunner {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.push(34);
        arrayDeque.push(3);
        arrayDeque.push(102);
        arrayDeque.push(-3);
        System.out.println(arrayDeque + "\n");

        while(arrayDeque.peek()!=null){
            System.out.println(arrayDeque.pop());
        }
    }

}
