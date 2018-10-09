package com.agile.practice.pp;

public class TransposeMatrix867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int[][] transpose(int[][] A) {
        int[][] tmp = new int[A[0].length][A.length];
        for (int i = 0; i < tmp.length; i++) {
        	for (int j = 0; j < tmp[0].length; j++) {
        		tmp[i][j] = A[j][i];
        	}
        }
        return tmp;
    }

}
