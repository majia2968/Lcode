package com.agile.practice.c100.tree;

public class MergeBTree617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static TNode mergeTrees(TNode t1, TNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

}
