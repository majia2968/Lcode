package com.leetcode.prod.array;

import java.util.HashSet;
import java.util.Set;

public class BinarySearch704 {
    //char[] rr = {'s', 'e'};
    public static void main(String[] args) {
        String[] emails = {"x.y@google.com", "x+y@google.com"};
        Set<String> set = new HashSet<String>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            set.add(local[0].replace(".", "") + "@" + parts[1]);
        }

        //if (s.contains("+"))

    }


}
