package com.leetcode.dev.string;


import com.leetcode.dev.array.Test;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] arg) {
        char[] nums = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        ReverseString test = new ReverseString();
        test.reverseString(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(test.reverseString1("welcome"));
        System.out.println(test.reverseString2("welcome"));
        System.out.println(test.reverseString3("welcome"));
    }

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            char tmp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = tmp;
        }
    }

    public String reverseString1(String s) {
        int len = s.length();
        if (len <=1) return s;
        return s.charAt(len-1) + reverseString1(s.substring(0, len-1));
    }

    public String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseString3(String s) {
        String tmp = "";
        for (int i=s.length()-1; i >=0; i--) {
            tmp += s.charAt(i);
        }
        return tmp;
    }
}
