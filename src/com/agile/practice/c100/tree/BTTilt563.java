package com.agile.practice.c100.tree;

import java.util.ArrayList;

public class BTTilt563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        ArrayList list = new ArrayList();
        findTilt(node, list);
        traverse(node);
        int su = 0;
        for(int i = 0; i < list.size(); i++) {
        	su += (Integer) list.get(i);
        }
        System.out.println(tilt);

        System.out.println(su);
	}

    public static int findTilt(Node root, ArrayList list) {
    	if (root == null) return 0;
    	int a = Math.abs(findTilt(root.left, list));
    	int b = Math.abs(findTilt(root.right, list));
    	list.add(Math.abs(a - b));
    	System.out.println(list);
    	return (Integer) root.data;
    }
    static int tilt = 0;
    public static int traverse(Node root)
    {
        if(root==null )
            return 0;
        int left=traverse(root.left);
        int right=traverse(root.right);
        tilt+=Math.abs(left-right);
        return left+right+(Integer) root.data;
    }
}
