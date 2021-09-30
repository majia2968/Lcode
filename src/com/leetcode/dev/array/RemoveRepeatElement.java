package com.leetcode.dev.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatElement {

    public static void main(String[] arg) {
        int[] nums = {1, 1, 31, 3, 4, 4, 31, 43, 200};
        System.out.println(removeElement(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int fIndex = 0;
        int sIndex;
        for (sIndex = 0; fIndex < arr.length; fIndex++) {
            if (!set.contains(arr[fIndex])) {
                arr[sIndex] = arr[fIndex];
                set.add(arr[fIndex]);
                sIndex++;
            }
        }
        return sIndex;
    }

}
