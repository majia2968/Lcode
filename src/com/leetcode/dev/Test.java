package com.leetcode.dev;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] arg) {

    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        while (right < len) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            }
            else{
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
}