package com.agile.practice.pp;

public class Resursion {

    public static void main(String[] args) {
        //System.out.println(testBubbleUp(20));
        System.out.println(testResursion(10));
    }

    public static int testResursion(int i) {
        System.out.println(i);
        if (i > 10) return testResursion(--i);
        if (i < 0) return 0;
        System.out.println("count!" + i);
        testResursion(--i);
        System.out.println("count#" + i);
        return i;
    }

    public static int testBubbleUp(int i) {
        if (i < 0) return 0;
        System.out.println(i);
        return testBubbleUp(--i);
    }

}
