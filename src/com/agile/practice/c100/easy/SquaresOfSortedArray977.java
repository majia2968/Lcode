package com.agile.practice.c100.easy;

public class SquaresOfSortedArray977 {

    public int[] sortedSquares(int[] A) {
        int[] tmp = new int[A.length];
        int i = 0;
        int j = A.length - 1;
        int x = A.length - 1;
        while (i <= j) {
            if (Math.pow(A[i], 2) > Math.pow(A[j], 2)) {
                tmp[x] = (int) Math.pow(A[i], 2);
                i++;
            }
            else {
                tmp[x] = (int) Math.pow(A[j], 2);
                j--;
            }
            x--;

        }
        return tmp;
    }
}
