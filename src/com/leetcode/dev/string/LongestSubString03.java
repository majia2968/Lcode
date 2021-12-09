package com.leetcode.dev.string;

import java.util.HashSet;

/**
 * Created by xuefengluo on 10/25/21.
 */
public class LongestSubString03 {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = s.length();
        int max = 0;
        int sIndex = 0;
        for (int fIndex = 0; fIndex < len; fIndex++) {
            while (set.contains(s.charAt(fIndex))) {
                set.remove(s.charAt(sIndex));
                sIndex++;
            }
            set.add(s.charAt(fIndex));
            max = Math.max(max, set.size());
        }
        return max;
    }
}
