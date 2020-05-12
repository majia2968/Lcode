package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearNumber {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) list.add(i);
        }
        return list;
    }


}
