package com.leetcode.dev.array;

/**
 * Created by xuefengluo on 8/23/21.
 */
public class MinSubArray209 {

    public static void main(String[] arg) {
        //removeElement(nums, 200);
        int[] nums = {5,1,3,5,10,7,4,9,2,8};
        //System.out.println(backspaceCompare(s, t));
        System.out.println(minSubArrayLenB(15, nums));
    }


    public static int minSubArrayLenB(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int len = 0;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                len = right-left+1;
                result = result < len ? result : len;
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    if (len > j-i+1) len = j-i+1;
                    break;
                }
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
