package com.leetcode.dev.pattern;

import com.leetcode.commons.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class TwoSum {

    // map solution
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return null;
        int[] aws = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                aws[0] = map.get(target- nums[i]);
                aws[1] = map.get(i);
            }
            map.put(nums[i], i);
        }
        return aws;
    }

    //Two sum two: two index solution, sorted array
    public int[] twoSumII(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] aws = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            }
            else if (nums[left] + nums[right] > target) {
                right--;
            }
            else {
                aws[0] = ++left;
                aws[1] = ++right;
                return aws;
            }
        }
        return new int[]{-1, -1};
    }

    //Two sum two: two index solution, design
    public int[] twoSumIII(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] aws = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            }
            else if (nums[left] + nums[right] > target) {
                right--;
            }
            else {
                aws[0] = ++left;
                aws[1] = ++right;
                return aws;
            }
        }
        return new int[]{-1, -1};
    }

    /***
     *Given the root of a Binary Search Tree and a target number k,
     * return true if there exist two elements in the BST such that
     * their sum is equal to the given target.
     */
    Set<Integer> set = new HashSet<>();
    public boolean findTargetIV(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) {
            return true;
        }
        else set.add(root.val);
        return findTargetIV(root.left, k) || findTargetIV(root.right, k);
    }

    public int remove(int[] nums, int n) {
        int slowInd = 0;
        int len = nums.length;
        for (int fastInd = 0; fastInd < len-1; fastInd++) {
            if (nums[fastInd] != n) {
                nums[slowInd] = nums[fastInd];
                slowInd++;
            }
        }
        return slowInd;
    }
}
