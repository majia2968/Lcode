package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MiddleofLinkedList876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode middleNode(ListNode head) {
    	List<ListNode> myAL = new ArrayList<ListNode>();
    	LinkedList<ListNode> myQueue = new LinkedList<ListNode>();
    	while (head != null) {
    		myQueue.add(head);
    		head = head.next;
    	}
    	myAL.addAll(myQueue);
    	int size = myAL.size();
    	if (size == 1) return myAL.get(0);
    	if (size / 2 == 0) {
    		return myAL.get(size/2+1);
    	}
    	else {
    		return myAL.get(size/2);
    	}
    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
