package com.agile.practice.c100;

import java.util.*;

public class LongestSubString3 {

    public static void main(String[] args) {
        String s = "uabucaccbabuy";
        Map<Set, Integer> map = findLongestSubString(s);
        for (Map.Entry<Set, Integer> mapData : map.entrySet()) {
            System.out.println(mapData.getKey() + "  :  " + mapData.getValue().toString());
        }
    }

    public static Map<Set, Integer> findLongestSubString(String s) {
        char[] ss = s.toCharArray();
        Map<Set, Integer> map = new HashMap<Set, Integer>();
        for (int i = 0; i < ss.length; i++) {
            Set set = new LinkedHashSet();
            int j = i;
            while (!set.contains(ss[j]) && j < ss.length-1) {
                set.add(ss[j++]);
            }
            map.put(set, set.size());
            System.out.println(set.toString());
        }
        return map;
    }
}
