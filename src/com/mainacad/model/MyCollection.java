package com.mainacad.model;

import java.util.Iterator;

//todo
public class MyCollection implements Iterable<Integer> {


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
    }
}
