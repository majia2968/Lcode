package com.agile.practice.pp;

public class SquareSort {

    public int[] sortedSquares(int[] A) {
        int[] tmp = new int[A.length];
        int i = 0;
        int j = A.length - 1;
        int m = j;
        while (i <= j) {
            if (Math.pow(A[i], 2) > Math.pow(A[j], 2)) {
                tmp[m] = (int) Math.pow(A[i], 2);
                i++;
            }
            else {
                tmp[m] = (int) Math.pow(A[j], 2);
                j--;
            }
            m--;
        }
        return tmp;
    }
}
