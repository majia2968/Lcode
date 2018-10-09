package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.List;

public class SelfDivideNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
        int left=1;int right=10000;
        for (int i = left; i <= right; i++) {
        	if (divided(i)) list.add(i);
        }
        System.out.println(divided(120));
	}
	
	public static boolean divided(int x) {
		int y = x;
		while (x > 0) {
			if (x%10 != 0) {
				if (y % (x % 10) != 0) {
					return false;
				}
			}
			else {
				return false;
			}
			x /= 10;
		}
		return true;
	}

}
