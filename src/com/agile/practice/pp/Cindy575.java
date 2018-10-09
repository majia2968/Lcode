package com.agile.practice.pp;

import java.util.HashSet;
import java.util.Set;

public class Cindy575 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {1,1,2,3};
		System.out.println(distributeCandies(candies));
	}
	
    public static int distributeCandies(int[] candies) {
        Set set = new HashSet();
        for (int i : candies) {
        	if (!set.contains(i)) {
        		set.add(i);
        	}
        }
        return set.size() > candies.length / 2 ? candies.length / 2 : set.size() ;
    }

}
