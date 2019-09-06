package com.agile.practice.pp;

import com.agile.practice.c100.easy.TreeNode;

import java.util.HashSet;

public class TwoSumBST {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        while(true) {
            if (!(str1 + str2).equals(str2 + str1)) return "";
            if (str1.equals(str2)) return str1;
            if (str1.length() > str2.length()) {
                str1 = str1.substring(str2.length());
            }
            if (str1.length() < str2.length()) {
                str2 = str2.substring(str1.length());
            }
        }
    }

}
