package com.agile.practice.c100.java8;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    interface NumericTest {
        boolean computeTest(int n);
    }

    public static void main(String args[]) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

    }
}