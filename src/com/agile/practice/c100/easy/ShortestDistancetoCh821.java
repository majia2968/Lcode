package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistancetoCh821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
	}
	
    public static int[] shortestToChar(String S, char C) {
    	int size = S.length() - 1;
    	int[] result = new int[S.length()];
        Arrays.fill(result,Integer.MAX_VALUE);
        for (int i = 0; i <= size; i++) {	
        	if (S.charAt(i) == C) {
        		for (int j=i; j>=0; j--) {
        			if (result[j] > i-j) {
        				result[j] = i-j;
        			}
        			else break;
        		}
        		for (int j=i; j <= size; j++) {
        			if (result[j] > j-i) {
        				result[j] = j-i;
        			}
        			else break;
        		}
        	}
        }	
        return result;
    }

}
