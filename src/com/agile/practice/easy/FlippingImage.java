package com.agile.practice.easy;
import java.util.Arrays;
public class FlippingImage {

    public static void main(String[] args) {
        int[][]A = {{1,1,0},{1,0,1},{0,0,0}};
        //System.out.println("eee");
        System.out.println(Arrays.deepToString(flipAndInvertImage(A)));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            reverse(A[i]);
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = 1-A[i][j];
            }
        }
        return A;
    }

    public static int[] reverse(int[] arr) {
        int len = arr.length;
        for (int m = 0; m < arr.length/2; m++) {
            int tmp = arr[m];
            arr[m] = arr[len-m-1];
            arr[len-m-1] = tmp;
        }
        return arr;
    }

}
