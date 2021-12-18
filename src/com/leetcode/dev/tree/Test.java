package com.leetcode.dev.tree;

import com.agile.practice.c100.tree.Bst;
import com.leetcode.commons.TreeNode;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bst bt = new Bst();
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

}
