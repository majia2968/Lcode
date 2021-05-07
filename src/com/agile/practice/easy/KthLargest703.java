package com.agile.practice.easy;

import java.util.PriorityQueue;

public class KthLargest703 {

    PriorityQueue<Integer>  pq = new PriorityQueue();
    int k;

    public KthLargest703(int k, int[] nums) {
        this.k = k;
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.add(val);
        }
        else if (pq.peek() < val) {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }

}
