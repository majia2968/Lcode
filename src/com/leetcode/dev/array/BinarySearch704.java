package com.leetcode.dev.array;

public class BinarySearch704 {

    public static void main(String[] arg) {
        int[] nums = {1,1,1,3,4,6,31,43,200};
        System.out.print(search(nums, 200));
    }

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else if(arr[mid] > target) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
