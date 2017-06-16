package com.agile.practice.c100;

import java.util.Arrays;

public class ArrayPartition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {11,2,43,24};
		System.out.println(arrayPartition(nums));
	}
	
	public static int arrayPartition(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i+=2) {
			sum += nums[i];
		}
		return sum;
	}

}
