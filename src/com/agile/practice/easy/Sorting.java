package com.agile.practice.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    static int[] arr = {23,6,4,6,12,8,34,2,9};
    static int[] tempArr = new int[arr.length];
    public static void main(String[] args) {
        //int[] arr = {23,6,4,6,12,8,34,2,9};
        //bubbleSort(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(tempArr));
        int[] arr2 = {1,3,4,7,33};
        int[] arr1 = {2,4,6,8};
        System.out.println(Arrays.toString(mergeArray(arr2, arr1)));
    }

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i,j,arr);
                }
            }
        }
    }

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void mergeSort(int arr[], int l, int r) {
        int m = (l + r) / 2;
        if (l < r) {
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(l, r, m);
        }
    }

    static void merge(int l, int r, int m) {
        int i = l;
        int j = m+1;
        int k = l;
        //int[] tempArr = new int[arr.length];

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];
            }
            else {
                tempArr[k++] = arr[j++];
            }
        }
        while (i <= m) {
            tempArr[k++] = arr[i++];
        }
        while (j <= r) {
            tempArr[k++] = arr[j++];
        }
    }















    static int[] mergeArray(int arr[], int prr[]) {
        int[] newArr = new int[arr.length + prr.length];
        int i = 0;
        int j = 0;
        int m = 0;
        int l = arr.length;
        int r = prr.length;
        while (i < l && j < r) {
            if (arr[i] < prr[j]) {
                newArr[m++] = arr[i++];
            }
            else {
                newArr[m++] = prr[j++];
            }
        }
        while (i < l) {
            newArr[m++] = arr[i++];
        }
        while (j < r) {
            newArr[m++] = prr[j++];
        }
        return newArr;
    }

}

