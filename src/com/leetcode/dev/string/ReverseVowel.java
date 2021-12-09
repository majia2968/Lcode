package com.leetcode.dev.string;

public class ReverseVowel {

    // two pointer approach
    public String reverseVowels (String s){
        char[] res = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
                char tmp = s.charAt(left);
                res[left] = s.charAt(right);
                res[right] = tmp;
                left++;
                right--;
            } else if (isVowel(s.charAt(left)) && !isVowel(s.charAt(right))) {
                right--;
            } else if (!isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
                left++;
            } else {
                left++;
                right--;
            }

        }
        return new String(res);
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}
