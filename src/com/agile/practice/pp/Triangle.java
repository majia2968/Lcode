package com.agile.practice.pp;

public class Triangle {

	public static void main(String[] args) {
		int rows = 10;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);

            }
            System.out.println();
        }
        triangle(10);
	}
	
	public static void triangle(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i || j == 0) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
