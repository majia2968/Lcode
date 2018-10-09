package com.agile.practice.pp;

public class ToeplitzMatrix766 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{22,0,94,45,46,96},{10,22,80,94,45,46}};
		System.out.println(matrix[0].length);
		System.out.println(isToeplitzMatrix(matrix));
	}
	
    public static boolean isToeplitzMatrix(int[][] matrix) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	for (int i=0; i<m; i++) {
    		for (int j=0; j<n; j++) {
    			if (j == n-1 ||i == m-1) continue;
    			if (matrix[i][j] != matrix[i+1][j+1]) return false;
    		}
    	}
        return true;
    }

}
