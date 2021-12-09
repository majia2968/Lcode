package com.leetcode.dev.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] arg) {
        int[] nums = {1,1,31,3,4,6,31,43,200};
        Test test = new Test();
        System.out.println(Arrays.toString(test.findTwoSum(nums, 8)));
        Arrays.sort(nums);
        System.out.print(Arrays.toString(test.findTwoSum1(nums, 10)));
    }

    public int[] findTwoSum(int[] nums, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(n-nums[i])) {
                set.add(nums[i]);
            }
            else return new int[]{nums[i], n - nums[i]};
        }
        return new int[]{-1, -1};
    }

    public int[] findTwoSum1(int[] nums, int n) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < n) {
                left++;
            }
            else if (nums[left] + nums[right] > n) {
                right--;
            }
            else {
                return new int[] {nums[left], nums[right]};
            }
        }
        return new int[]{-1, -1};
    }

}
