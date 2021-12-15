package com.leetcode.dev.string;

public class RepeatSubString {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        return (s+s).substring(1, len*2-1).contains(s);
    }
}
