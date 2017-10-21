package com.agile.practice.c100;

public class MaxBinaryTree654 {

    public static void main(String[] args) {
        int[] nums = {3,6,11,3,2,32,4,1};
        constructMaximumBinaryTree(nums, 0, nums.length);
        System.out.println(constructMaximumBinaryTree(nums, 0, nums.length).val);

    }

    public static TNode constructMaximumBinaryTree(int[] nums, int l, int r) {
    	if (l == r) return null;
        TNode node = new TNode();
        int index = findMax(nums, l, r);
        node.val = nums[index];
        node.left = constructMaximumBinaryTree(nums, l, index);
        node.right = constructMaximumBinaryTree(nums, index+1, r);
        return node;
    }
      
    public static int findMax(int[] nums, int l, int r) {
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
}
