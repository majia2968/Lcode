package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.List;

public class Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(15));
	}
	
    public static List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
        	if (i % 3 != 0 && i % 5 != 0) {
        		arr.add(Integer.toString(i));
        	}
        	else {
        		if (i % 3 == 0 && i % 5 == 0) {
        			arr.add("\"BuzzFuzz\"");
        		}
        		else {
        			if (i % 3 == 0) arr.add("\"Buzz\"");
        			if (i % 5 == 0) arr.add("\"Fuzz\"");
        		}
        	}
        }
        return arr;
    }

}
