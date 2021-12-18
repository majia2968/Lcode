package com.agile.practice.c100.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFT {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bst  bt = new Bst();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(height(node));
        System.out.println(getWidth(node, 4));
        System.out.println("max width is below:");
        System.out.println(maxWidth(node));
    }
	
    static int maxWidth(Node root) 
    {
    	if (root == null) return 0;
    	int maxWidth = 0;
    	Queue<Node> que = new LinkedList<Node>();
    	que.add(root);
    	while (!que.isEmpty()) {
    		int count = que.size();
    		maxWidth = Math.max(maxWidth, count);
    		List<Node> aa = new ArrayList<Node>();
    		while (count-- > 0) {
    			Node node = que.remove();
    			aa.add(node.left);
    			aa.add(node.right);
    			if (node.left != null) que.add(node.left);
    			if (node.right != null) que.add(node.right);
    		}
    		maxWidth = Math.max(maxWidth, countArray(aa));
    	}
        return maxWidth;
    }
    
    public static int countArray(List<Node> arr) {
    	int m=-1, n = -1;
    	for (int i = 0; i< arr.size() - 1; i++) {
    		if (arr.get(i) != null) 
    			{ 
    			  m = i;
    			  break;
    			}
    	}
    	for (int j = arr.size()-1; j>=0; j--) {
    		if (arr.get(j) != null) {
    			n = j;
    			break;
    		}
    	}
    	if (m == -1 || n == -1) return 1; 
    	return n-m+1;
    }
	
    public static void breadthFirstSearch(Node node){
        List<Node> al = new ArrayList<Node>();
        al.add(node);
        while(!al.isEmpty()){
            node = al.get(0);
            if(node.left != null){
                int index = al.size();
                al.add(index,node.left);
            }
            if(node.right != null){
                int index = al.size();
                al.add(index,node.right);
            }
            System.out.print(al.get(0).data+" ");
            al.remove(0);
        }
    }
    
    /* Get width of a given level */
    static int getWidth(Node node, int level) 
    {
        if (node == null) return 0;
        if (level == 1) return 1;
        if (level > 1) return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
        return 0;
    }

	
    /* function to print level order traversal of tree*/
    void printLevelOrder(Node root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    static int height(Node root)
    {
    	if (root == null) return 0;
    	int lHeight = height(root.left);
    	int rHeight = height(root.right);
    	return lHeight > rHeight ? lHeight + 1 : rHeight + 1;
    }
 
    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

}
