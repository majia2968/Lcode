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
        StringBuilder substr = new StringBuilder();
        boolean flag = false;
        for (int i = 1; i < len/2; i++) {
            substr.append(s.charAt(i));
            String clearedFromSubstrings = s.replaceAll(substr.toString(), "");
            if (clearedFromSubstrings.length() == 0) {
                return true;
            }
        }
        return false;
    }

}
