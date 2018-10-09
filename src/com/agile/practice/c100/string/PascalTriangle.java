package com.agile.practice.c100.string;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle(9);
	}
	
	public static void triangle(int n) {
		int[][] arr = new int[9][9];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i-1; j++) {
				if (j==0 || j==i-1) {
					arr[i][j] = 1;
					System.out.print(1);
					System.out.print(" ");
				}
				else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					System.out.print(arr[i][j]);
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
