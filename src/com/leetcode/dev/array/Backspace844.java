package com.leetcode.dev.array;

import java.util.Arrays;

/**
 * Created by xuefengluo on 8/17/21.
 */
public class Backspace844 {

    public static void main(String[] arg) {
        //removeElement(nums, 200);
        String s = "nzp#o#g", t = "b#nzp#o#g";
        //System.out.println(backspaceCompare(s, t));
        System.out.println(backspaceCompare1(s, t));
    }


    public static boolean backspaceCompare1(String s, String t) {
        int sIndex = s.length()-1;
        int fIndex = t.length()-1;
        int sback = 0;
        int fback = 0;
        while (sIndex >= 0 || fIndex >= 0) {
            while (sIndex >= 0 && (s.charAt(sIndex) == '#' || sback > 0)) {
                if (s.charAt(sIndex--) == '#') {
                    sback++;
                }
                else
                    sback--;
            }
            while (fIndex >= 0 && (t.charAt(fIndex) == '#'|| fback > 0)) {
                if (t.charAt(fIndex--) == '#') {
                    fback++;
                }
                else
                    fback--;
            }
            if (sIndex < 0 || fIndex < 0) return sIndex==fIndex;
            if (s.charAt(sIndex) == t.charAt(fIndex)) {
                sIndex--;
                fIndex--;
            }
            else
                return false;
        }
        return sIndex==fIndex;
    }

    public static boolean backspaceCompare(String s, String t) {
        return help(s).equals(help(t));
    }

    public static String help(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            }
            else {
                if (sb.length() != 0) sb.setLength(sb.length() - 1);
            }
        }
        return sb.toString();
    }

}
