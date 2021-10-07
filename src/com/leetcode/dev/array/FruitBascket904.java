package com.leetcode.dev.array;

import java.util.HashSet;
import java.util.Set;

public class FruitBascket904 {

    public static void main(String[] arg) {
        FruitBascket904 fruitBascket904 = new FruitBascket904();
        int[] nums = {0,1,0,0,8};
        System.out.print(fruitBascket904.totalFruit(nums));
    }

    public int totalFruit(int[] fruits) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int len = fruits.length;
        int max = 0;

        while (right < len) {
            set.add(fruits[right]);
            if (set.size() > 2) {
                max = Math.max(max, (right - left));
                left = right - 1;
                while (fruits[left] == fruits[left-1]) {
                    left--;
                }
                set.remove(fruits[left-1]);
            }
            right++;
        }
        return Math.max(max, (right - left));
    }
}
