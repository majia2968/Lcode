package com.leetcode.dev.array;

import java.util.Arrays;

/**
 * Created by  on 8/17/21.
 */
public class MoveZero283 {

    public static void main(String[] arg) {
        int[] nums = {0,1,0,3,12};
        moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZero(int[] nums) {
        int sIndex;
        int fIndex = 0;
        for (sIndex = 0; fIndex < nums.length; fIndex++) {
            if (nums[fIndex] != 0) {
                nums[sIndex] = nums[fIndex];
                sIndex++;
            }
        }
        while (fIndex-sIndex > 0) {
            nums[fIndex-1] = 0;
            fIndex--;
        }
    }

}
