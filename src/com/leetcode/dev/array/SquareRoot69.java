package com.leetcode.dev.array;

/**
 * Created by xuefengluo on 9/10/21.
 */
public class SquareRoot69 {

    public static void main(String[] arg) {
        SquareRoot69 squareRoot69 = new SquareRoot69();
        System.out.print(squareRoot69.mySqrt(1));
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        long left = 1;
        long right = x / 2;
        while (left < right) {
            long mid = left + (right-left)/2 + 1;
            long sm = mid * mid;
            if (sm > x) {
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        return (int) left;
    }
}
