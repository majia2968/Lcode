package com.leetcode.dev.string;

import java.util.HashSet;
import java.util.Set;

public class RepeatSubString {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        return (s+s).substring(1, len*2-1).contains(s);
    }

    public boolean repeatedSubstringPattern1(String s) {
        int len = s.length();
        Set<String> set = new HashSet<>();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (!set.contains(s.substring(0, i))) {
                //set.add();
            }
        }
        return (s+s).substring(1, len*2-1).contains(s);
    }
}
