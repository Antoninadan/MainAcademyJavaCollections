package com.mainacad.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestService {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        testList(arrayList);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list = new LinkedList<>();
        System.out.println(list);
    }

    public static void testList(List<?> list){
        list = new LinkedList<>();
        System.out.println(list);
    }

}
