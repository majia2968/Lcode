package com.leetcode.dev.pattern;

import java.util.Arrays;

/**
 * Greedy
 */
public class Greedy {

    // idea：small cookie for small kid first.
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                start++;
                count++;
            }
        }
        return count;
    }
}
