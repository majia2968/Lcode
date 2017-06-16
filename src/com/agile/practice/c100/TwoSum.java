package com.agile.practice.c100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,6,3,4,76,32,4};
		int target = 8;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
           if (map.get(nums[i]) != null) {
        	   int[] result = {map.get(nums[i]) + 1, i + 1};
        	   return result;
           }
           map.put(target-nums[i], i);
        }  
        int[] result = {};
        return result;
    }

}
