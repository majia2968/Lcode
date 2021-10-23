package com.leetcode.dev.tree;

import com.leetcode.commons.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIV653 {

    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (findTarget(root.left, k)) return true;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        if (findTarget(root.right, k)) return true;

        return false;
    }

}
