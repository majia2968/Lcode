package com.agile.practice.pp;

import java.util.ArrayList;

class Fib {

    private int[] arr;

    public int fib(int N) {
        if (arr == null) {
            arr = new int[N+1];
        }
        if (N < 2) {
            return N;
        }
        if (arr[N] != 0) {
            return arr[N];
        }
        else {
            arr[N] = fib(N - 1) + fib(N - 2);
            return arr[N];
        }
    }

    public int fibTopDown(int N) {
        if (arr == null) {
            arr = new int[N+1];
        }
        if (N < 2) {
            return N;
        }
        for (int i=0; i<=N; i++) {
            if (i < 2) {
                arr[i] = i;
            }
            else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr[N];
    }
}
