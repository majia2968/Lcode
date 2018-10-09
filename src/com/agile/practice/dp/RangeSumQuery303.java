package com.agile.practice.dp;

public class RangeSumQuery303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9};
		RangeSumQuery303 rsq = new RangeSumQuery303(nums);
		System.out.println(rsq.sumRange(0, 5));
		System.out.println(rsq.sumRange(4, 5));
		System.out.println(rsq.sumRange(4, 8));
	}
	
    private int[] sum;
    public RangeSumQuery303(int[] nums) {
        sum = new int[nums.length+1];
        sum[0] = 0;
        sum[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }

}
