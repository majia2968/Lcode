package com.agile.practice.c100.string;

public class CountBinarySubstring696 {

	public static void main(String[] args) {
		System.out.println(countBinarySubstrings("110001111000000"));
	}
	
    public static int countBinarySubstrings(String s) {
        int ans = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return ans + Math.min(prev, cur);
    }

}
