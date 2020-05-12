package com.agile.practice.c100.easy;


public class MergeSort {

    public static void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);
    }

    private static void mergesort(int[] input, int start, int end) {

        int mid = (start + end) / 2;
        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }

    }
}
