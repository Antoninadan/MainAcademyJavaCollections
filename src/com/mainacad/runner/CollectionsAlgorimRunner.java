package com.mainacad.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgorimRunner {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>();
        a.add(12);
        a.add(13);
        a.add(45);

        List<Integer> b=new ArrayList<Integer>();
        b.add(11);
        b.add(2);
        b.add(5);

        // disjoint
        System.out.println("Collections.disjoint(a, b) = " + Collections.disjoint(a, b));

        // frequancy
        System.out.println("Collections.frequency(a, 12) = " + Collections.frequency(a, 12));

        // shuffle
        Collections.shuffle(a);
        System.out.println("Collections.shuffle(a) = " + a);

    }
}
