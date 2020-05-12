package com.mainacad.model;

// todo
public class MyIterator {
    private int pointer = 0;

    public boolean hasNext() {
        return  false;//pointer < IntList.this.n;
    }

    public int next() {
        return 0; //IntList.this.arr[pointer++];
    }
}
