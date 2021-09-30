package com.leetcode.dev.array;

/**
 *
 */
public class SearchInsertPosition35 {

    public static void main(String[] arg) {
        SearchInsertPosition35 searchInsertPosition35 = new SearchInsertPosition35();
        int[] nums = {1,3,4,6,31,43,200};
        System.out.print(searchInsertPosition35.searchInsert(nums, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else
                return mid;
        }
        return left;
    }
}
