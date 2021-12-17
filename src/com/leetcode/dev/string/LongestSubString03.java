package com.leetcode.dev.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by CL
 */
public class LongestSubString03 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int sIndex = 0;
        int len = s.length();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            while (set.contains(s.charAt(i))) {
               set.remove(s.charAt(sIndex++));
            }
            set.add(s.charAt(i));
            max = Math.max(max, set.size());
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int sIndex = 0;
        int len = s.length();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            while (map.containsKey(s.charAt(i))) {
                map.remove(s.charAt(sIndex++));
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, map.size());
        }
        return max;
    }
}
