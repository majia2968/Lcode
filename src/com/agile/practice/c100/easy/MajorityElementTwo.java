package com.agile.practice.c100.easy;

import java.util.List;

public class MajorityElementTwo {

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,2,2,2,7,8,4,5,2};
        majorityElement(nums);
    }
    public static List<Integer> majorityElement(int[] nums) {
        int a = 0;
        int b = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;

        for (int num : nums) {
            if (num == a) count1++;
            else if (num == b) count2++;
            else if (count1 == 0) {
                a = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                b = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        System.out.println(a);
        System.out.println(b);
        return null;
    }


}
