package com.agile.practice.c100.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBST {

    public int getWidTh(TreeNode root) {
        if (root == null) return 0;
        int max;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        que.offer(null);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            que.offer(node.left);
            que.offer(node.right);
        }
        return 0;
    }
}
