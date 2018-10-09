package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		System.out.println(subdomainVisits(cpdomains));
	}
	
    public static List<String> subdomainVisits(String[] cpdomains) {
    	List<String> tmp = new ArrayList<String>();
    	Map<String, Integer> map = new HashMap<>();
    	for (String sth : cpdomains) {
    		System.out.println(sth);
    		int number = Integer.parseInt(sth.split(" ")[0]);
    		String stmp = sth.split(" ")[1];

    		while (!stmp.isEmpty()) {
    			if (map.containsKey(stmp)) {
    				map.replace(stmp, map.get(stmp) + number);
    			}
    			else {
        			map.put(stmp, number);
    			}
    			int iend = stmp.indexOf(".");  
    			if (iend != -1) 
    			{
    			    stmp = stmp.substring(iend+1 , stmp.length()); //this will give abc
    			}
    			if (iend == -1) {
    				stmp = "";
    			}
    		}    		
    	}
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			tmp.add(entry.getValue() + " "+ entry.getKey());
		}
    	Collections.reverse(tmp);
    	return tmp;
    }

}
