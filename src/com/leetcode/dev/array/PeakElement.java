package com.leetcode.dev.array;

public class PeakElement {

    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int sIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int fIndex = 0; fIndex < len; fIndex++) {
            if (nums[fIndex] > max) {
                max = nums[fIndex];
                sIndex = fIndex;
            }
        }
        return sIndex;
    }
}
