package com.agile.practice.pp;

public class BitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(2,4));
	}
	
    public static int hammingDistance(int x, int y) {
        int res = 0, exc = x ^ y;
        for (int i = 0; i < 32; ++i) {
            res += (exc >> i) & 1;
        }
        return res;
    }

}
