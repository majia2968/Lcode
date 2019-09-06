package com.agile.practice.c100.easy;

import com.agile.practice.c100.tree.TNode;

import java.util.HashSet;

public class TwoSum {

    public boolean findTarget(TNode root, int k) {
        HashSet set = new HashSet();
        return help(root,k,set);
    }

    public boolean help(TNode root, int k, HashSet set) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return help(root.left, k, set) || help(root.right, k, set);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] tmp = new int[2];
        HashSet hashSet = new HashSet();
        for (int i = 0; i < numbers.length; i++) {
            if (hashSet.contains(target-numbers[i])) {
                tmp[0] = i;
            }
            else {
                hashSet.add(numbers[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target - numbers[tmp[0]]) tmp[1] = i;
        }
        tmp[0]++;
        tmp[1]++;
        return tmp;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int[] tmp = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (true) {
            if (target == numbers[i] + numbers[j]) {
                tmp[0] = i + 1;
                tmp[1] = j + 1;
                return tmp;
            }
            else if (target < numbers[i] + numbers[j]) {
                if (target < numbers[j]) j--;
                else
            }
            else {
                return null;
            }

        }
    }
}
