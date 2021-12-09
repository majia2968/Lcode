package com.leetcode.dev.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum015 {

    public static void main(String[] arg) {
        int[] nums = {0,0,0,0,-1,-4};
//        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum015 test = new ThreeSum015();
        System.out.println(test.threeSum(nums).toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            findTwoSum(nums, i, results);
        }
        return results;
    }

    private void findTwoSum(int[] nums, int index, List<List<Integer>> results) {
        int left = index+1;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < -nums[index]) {
                left++;
            }
            else if (nums[left] + nums[right] > -nums[index]) {
                right--;
            }
            else {
                List<Integer> triple = new ArrayList();
                triple.add(nums[index]);
                triple.add(nums[left]);
                triple.add(nums[right]);
                results.add(triple);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
    }

}
