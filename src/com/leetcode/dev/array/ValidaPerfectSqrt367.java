package com.leetcode.dev.array;

/**
 * Created by xuefengluo on 9/13/21.
 */
public class ValidaPerfectSqrt367 {

    public static void main(String[] arg) {
        ValidaPerfectSqrt367 validaPerfectSqrt367 = new ValidaPerfectSqrt367();
        System.out.println(7/2);
        System.out.print(validaPerfectSqrt367.isPerfectSquare(1));
    }

    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) return true;
        int left = 0;
        int right = num/2;
        while (left < right) {
            int mid = left + (right - left) / 2 + 1;
            if (mid * mid > num) {
                right = mid - 1;
            }
            else if(mid * mid < num) {
                left = mid;
            }
            else
                return true;
        }
        return false;
    }


}
