package com.leetcode.dev.tree;

import com.leetcode.commons.TreeNode;

public class Test {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || root.left == null) return 0;
        int sum, leftV, rightV ;
        sum = leftV = rightV = 0;
        if (root.left != null) leftV = sumOfLeftLeaves(root.left);
        if (root.right != null) rightV = sumOfLeftLeaves(root.right);
        return root.left.val + leftV ;
    }

}
