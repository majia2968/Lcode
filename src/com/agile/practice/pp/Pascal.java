package com.agile.practice.pp;

public class Pascal {

    public static void main(String[] args) {
       printPascal(8);
    }

    public static void printPascal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i==j) {
                    arr[i][j] = 1;
                    System.out.print(1);
                }
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(arr[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
