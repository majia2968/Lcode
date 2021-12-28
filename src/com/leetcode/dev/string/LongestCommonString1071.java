package com.leetcode.dev.string;

public class LongestCommonString1071 {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        else if (!str1.startsWith(str2)) {
            return "";
        }
        else if (str2.isEmpty()) {
            return "";
        }
        else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}