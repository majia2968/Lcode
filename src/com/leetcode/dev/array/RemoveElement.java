package com.leetcode.dev.array;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] arg) {
        int[] nums = {1,1,31,3,4,6,31,43,200};
        //removeElement(nums, 200);
        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement1(nums, 31));
        System.out.println(Arrays.toString(nums));
    }

    public static void removeElement(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val && i != arr.length-1) {
                for (int j = i+1; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
                i--;
            }

        }
    }

    //two index
    public static int removeElement1(int[] arr, int val) {
        int fIndex = 0;
        int sIndex;
        for (sIndex=0; fIndex < arr.length; fIndex++) {
            if (arr[fIndex] != val) {
                arr[sIndex] = arr[fIndex];
                sIndex++;
            }
        }
        return sIndex;
    }
}
