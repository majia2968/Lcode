package com.leetcode.dev.array;

import java.util.PriorityQueue;

/**
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.

 Implement KthLargest class:

 KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
 int add(int val) Returns the element representing the kth largest element in the stream.

 */
public class KLargestInStream703 {
    PriorityQueue<Integer> que;
    int k;

    public KLargestInStream703 (int k, int[] nums) {
        this.k = k;
        que = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (que.size() < k) {
            que.offer(val);
        }
        else {
            if (que.peek() < val) {
                que.poll();
                que.offer(val);
            }
        }
        return que.peek();
    }
}
