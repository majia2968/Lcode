package com.agile.practice.pp;

public class RepeatSubPattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] ops = {"5","2","C","D","+"};
        System.out.println(repeatedSubstringPattern("abcabcabc"));
        System.out.println(repeatedSubstringPattern("ababab"));
        //System.out.println(StringUtils.isEmpty(null));

    }

    public static boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                int c = n / i;
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j <= c; j++) {
                    sb.append(str.substring(0, i));
                }
                if (sb.toString().equals(str)) return true;
                System.out.println(sb.toString());
            }
        }
        return false;
    }
}
