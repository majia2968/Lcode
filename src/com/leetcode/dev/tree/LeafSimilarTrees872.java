package com.leetcode.dev.tree;

import com.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        dfs(root1, arr1);
        dfs(root2, arr2);
        return arr1.equals(arr2);
    }

    public void dfs(TreeNode node, List<Integer> arr) {
        if (node != null) {
            if (node.left == null && node.right == null)
                arr.add(node.val);
            dfs(node.left, arr);
            dfs(node.right, arr);
        }
    }

}
