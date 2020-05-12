package com.mainacad.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalRunner {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Nullllllllllll"));

        optional = Optional.ofNullable("Hello world");
        System.out.println(optional.orElse("Nulllllllllll"));


        // stream
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList( 1, 2, 9, 3, 5, 10));
        Optional<Integer> result = list.stream()
                .filter(n -> n%2==0)
                .max((a,b) -> a-b);
        System.out.println(result.get());

    }
}
