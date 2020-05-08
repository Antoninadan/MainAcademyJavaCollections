package com.mainacad.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapRunner {
    public static void main(String[] args) {
        Map hashMap= new HashMap();
        String keyHashMap = new String("keyHashMap");
        hashMap.put(keyHashMap, "keyHashMap");

        Map weakHashMap = new WeakHashMap();
        String keyWeakHashMap = new String("keyWeakHashMap");
        weakHashMap.put(keyWeakHashMap, "keyWeakHashMap");

        System.gc();
        System.out.println("All keys are not null AFTER GC:" + "\n"
                + "hash map     : "+hashMap.get("keyHashMap")+ "\n"
                + "weak hash map: "+weakHashMap.get("keyWeakHashMap"));
        System.out.println();

        keyHashMap = null;
        keyWeakHashMap = null;

        System.gc();
        System.out.println("All keys are not null AFTER GC:" + "\n"
                + "hash map     : "+hashMap.get("keyHashMap")+ "\n"
                + "weak hash map: "+weakHashMap.get("keyWeakHashMap"));

    }
}
