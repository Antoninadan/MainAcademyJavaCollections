package com.mainacad.runner;

import java.util.*;

public class SynchronRunner {
    public static void main(String[] args) {
        Map map = Collections.synchronizedMap(new HashMap());
        List list = Collections.synchronizedList(new ArrayList());

//        // put-if-absent idiom - contains a race condition
//        // may require external synchronization
//        if (!map.containsKey(key))
//            map.put(key, value);
//
//        // ad-hoc iteration - contains race conditions
//        // may require external synchronization
//        for (int i = 0; i < list.size(); i++) {
//            doSomething(list.get(i));
//        }
//
//        // normal iteration - can throw ConcurrentModificationException
//        // may require external synchronization
//        for (Iterator i = list.iterator(); i.hasNext(); ) {
//            doSomething(i.next());

    }
}
