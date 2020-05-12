package com.agile.practice.c100.tree;

public class TwoSumTree {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        int target = k - root.val;
        if (root.left.val != target) findTarget(root.left, k);
        return false;
    }

}
