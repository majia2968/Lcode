package com.agile.practice.c100.easy;

import java.util.HashMap;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    private static int fib(int N) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        if (cache.containsKey(N)) return cache.get(N);
        int result;
        if (N < 2) {
            result = N;
        }
        else {
            result = fib(N-1) + fib(N-2);
        }
        cache.put(N, result);
        return result;
    }
}
