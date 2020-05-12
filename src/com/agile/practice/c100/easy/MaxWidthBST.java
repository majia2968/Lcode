package com.agile.practice.c100.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBST {

    public int getWidTh(TreeNode root) {
        if (root == null) return 0;
        int max = 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            while (size-- > 0) {
                TreeNode node = que.poll();
                if (node.left != null) que.offer(node.left);
                if (node.right != null) que.offer(node.right);
            }
        }
        return max;
    }
}
