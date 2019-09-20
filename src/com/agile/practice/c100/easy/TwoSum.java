package com.agile.practice.c100.easy;

import com.agile.practice.c100.tree.TNode;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    public static String twoString(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int cover = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0 )cover += num1.charAt(i--) - '0';
            if (j >= 0 )cover += num2.charAt(j--) - '0';
            sb.append((char) (cover%10 + '0'));
            cover /= 10;
        }
        if (cover > 0) sb.append('1');
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "4532323";
        System.out.println(s.charAt(0) - '0');
        System.out.println(twoString("9990", "111"));
        int[] tt = {1,4,5,6,7};
        System.out.println(reverseString("welcome"));
        System.out.println(reverse(1234567));
        System.out.println(reverseInt(-1234567));
        System.out.println(Arrays.toString(productExceptSelf(tt)));
    }

    public static int reverseInt(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev*10 + x%10;
            x /= 10;
        }
        return rev;
    }

    public boolean findTarget(TNode root, int k) {
        HashSet set = new HashSet();
        return help(root,k,set);
    }

    public boolean help(TNode root, int k, HashSet set) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return help(root.left, k, set) || help(root.right, k, set);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] tmp = new int[2];
        HashSet hashSet = new HashSet();
        for (int i = 0; i < numbers.length; i++) {
            if (hashSet.contains(target-numbers[i])) {
                tmp[0] = i;
            }
            else {
                hashSet.add(numbers[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target - numbers[tmp[0]]) tmp[1] = i;
        }
        tmp[0]++;
        tmp[1]++;
        return tmp;
    }

    public int[] twoSum2(int[] numbers, int target) {
        return null;
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += num1.charAt(i) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j) - '0';
            }
            builder.append((char)(carry % 10 + '0'));
            carry /= 10;

        }
        if (carry == 1) {
            builder.append('1');
        }
        return builder.reverse().toString();
    }

    public static int[] productExceptSelf(int[] num) {
        int[] left = new int[num.length];
        int[] right = new int[num.length];
        int[] product = new int[num.length];
        left[0] = 1;
        right[num.length-1] = 1;
        for (int i = 1 ; i < num.length; i++) {
            left[i] = left[i-1] * num[i-1];
        }
        for (int j = num.length-2; j>=0; j--) {
            right[j] = num[j+1] * right[j+1];
        }
        for (int m = 0; m < num.length; m++) {
            product[m] = left[m] * right[m];
        }
        return product;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num%10;
            num /= 10;
        }
        return rev;
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        while (s.length() > 0) {
            sb.append(s.charAt(s.length()-1));
            s = s.substring(0, s.length()-1);
        }
        return sb.toString();
    }
}
