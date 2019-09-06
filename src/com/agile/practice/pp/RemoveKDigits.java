package com.agile.practice.pp;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        sb.deleteCharAt(0);
        String s = "SFFF-FF";
        String[] dd = s.split("-");
        System.out.println(sb.length());
    }

    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack();
        int size = num.length();
        if (size == k) return "0";
        int n = k;
        for (char ch : num.toCharArray()) {
            while (!stack.empty() && n > 0 && Character.getNumericValue(ch) < stack.peek()) {
                n--;
                stack.pop();
            }
            stack.push(Character.getNumericValue(ch));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
            if (sb.length()==0) return "0";
        }
        //edge case, alway check the length of return string
        if (sb.length() > size-k) return sb.substring(0, size-k);
        return sb.toString();
    }

}
