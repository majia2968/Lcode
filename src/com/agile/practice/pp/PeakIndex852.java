package com.agile.practice.pp;

public class PeakIndex852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,5,7};
		System.out.println(peakIndexInMountainArray(A));
	}
	
    public static int peakIndexInMountainArray(int[] A) {
    	for(int i = 0; i < A.length - 1; i++) {
    		if (A[i] > A[i+1]) return i;
    	}
    	return A[A.length-1];
    }

}
