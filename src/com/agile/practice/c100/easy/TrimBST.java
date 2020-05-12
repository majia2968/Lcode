package com.agile.practice.c100.easy;

public class TrimBST {

    public TreeNode trimBSTree(TreeNode root, int L, int R) {
        if (root == null) return null;
        TreeNode node = root;

        if (root.val < L) {
            return trimBSTree(root.right, L, R);
        }
        else if (root.val > R) {
            return trimBSTree(root.left, L, R);
        }
        node.left = trimBSTree(root.left, L, R);
        node .right = trimBSTree(root.right, L, R);
        return node;
    }
}
