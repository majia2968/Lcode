package com.leetcode.dev.array;

/**
 * Created by xuefengluo on 9/9/21.
 */
public class PositionInArray34 {

    public static void main(String[] arg) {
        PositionInArray34 positionInArray34 = new PositionInArray34();
        int[] nums = {1,3,4,6,31,43,200};
        //System.out.print(positionInArray34.searchRange(nums, 0));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] count = {-1,-1};
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid;
                right = mid;
                while (left >= 0 && nums[left] == target) {
                    count[0] = left;
                    left--;
                }
                while (right < nums.length && nums[right] == target) {
                    count[1] = right;
                    right--;
                }
            }

        }
        return count;
    }

}
