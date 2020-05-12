package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.List;

public class BasketBall682 {

	
    public static int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < ops.length; i++) {
        	if (ops[i].equals("+")) {
        		if (arr.size() > 1 ) {
        			arr.add(arr.get(arr.size()-1) + arr.get(arr.size()-2));
        		}
        		else {
        			arr.add(arr.get(arr.size()-1));
        		}
        	}
        	else if (ops[i].equals("D")) {
        		arr.add(2 * ( arr.get(arr.size()-1)));
        	}
        	else if (ops[i].equals("C")) {
        		arr.remove(arr.size()-1);
        	}
        	else {
        		arr.add(Integer.parseInt(ops[i]));
        	}

        }
    	for (int i : arr) {
    		sum += i;
    	}
    	return sum;
    }

}
