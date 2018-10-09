package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReshapeMatrix566 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int[][] matrix = {{22,0,94,45,46,96},{10,22,80,94,45,46}};
		System.out.println(matrixReshape(matrix, 1, 12));
		ReshapeMatrix566 ss = new ReshapeMatrix566();
		System.out.println(ss == null);
	}
	
    public static int[][] matrixReshape(int[][] nums, int r, int c) throws InterruptedException {
    	int m = nums.length;
    	int n = nums[0].length;
    	if (m * n != r * c) return nums;
    	int[][] newNums = new int[r][c];
    	Queue list = new LinkedList();
    	for(int i=0;i<m;i++) {
    	    for(int j=0;j<n;j++) {
    	        list.add(nums[i][j]);
    	    }
    	}
    	System.out.println(list.toString());
    	for (int i=0; i<r; i++) {
    		for (int j=0; j<c; j++) {
    			newNums[i][j] = (int) list.remove();
    		}
    	}
        return newNums;
    }

}
