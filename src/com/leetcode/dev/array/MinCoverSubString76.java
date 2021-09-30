package com.leetcode.dev.array;

import java.util.HashMap;

public class MinCoverSubString76 {

    public static void main(String[] arg) {
        MinCoverSubString76 ms = new MinCoverSubString76();
        String s = "ADOBECODEBANC", t = "BA";
        System.out.println(ms.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, 0);
        }
        for (char c : t.toCharArray()) {
            if (hm.containsKey(c)) hm.put(c, hm.get(c)+1);
            else return "";
        }
        int start=0, end=0;
        int counter=t.length();
        String res = "";
        int minLen = Integer.MAX_VALUE;

        while (end < s.length()) {
            if (hm.get(s.charAt(end)) > 0) counter--;
            hm.put(s.charAt(end), hm.get(s.charAt(end))-1);
            end++;
            while (counter == 0) {
                if (minLen > end-start+1) {
                    minLen = end-start+1;
                    res = s.substring(start, end);
                }
                if (hm.get(s.charAt(start)) == 0) counter++;
                hm.put(s.charAt(start), hm.get(s.charAt(start))+1);
                start++;
            }
        }
        return res;
    }

}
