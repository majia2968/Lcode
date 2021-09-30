package com.leetcode.dev.array;

import java.util.Arrays;

/**
 * 977
 */
public class SquareArray {

    public static void main(String[] arg) {
        int[] nums = {-4,-1,0,3,10};
        //sortArray(nums);
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] arr) {
        int lIndex = 0;
        int rIndex = arr.length-1;
        int index = arr.length-1;
        int[] tmp = new int[arr.length];

        while (lIndex < rIndex) {
            if (Math.pow(arr[lIndex],2) > Math.pow(arr[rIndex], 2)) {
                tmp[index] = (int)Math.pow(arr[lIndex],2);
                lIndex++;
            }
            else {
                tmp[index] = (int)Math.pow(arr[rIndex],2);
                rIndex--;
            }
            index--;
        }
        return tmp;
    }
}
