package com.agile.practice.c100.string;

import java.util.Arrays;

public class FlippigImage832 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {
				{1,1,0},
				{1,0,1},
				{0,0,0}
		};
		int[] a = {5,2,3,4,5,6};
		System.out.println(Arrays.toString(swap(a)));
	}
	
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
        	swap(A[i]);
        	for (int j = 0; j < A[i].length; j++) {
        		A[i][j] = 1 - A[i][j];
        	}
        }
        return A;
    }
    
    public static int[] swap(int[] arr) {
    	int size = arr.length;
    	for (int i = 0; i < arr.length / 2; i++) {
    		int tmp = arr[i];
    		arr[i] = arr[size-i-1];
    		arr[size-i-1] = tmp;
    	}
    	return arr;
    }

}
