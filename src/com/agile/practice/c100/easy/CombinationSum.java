package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        print(0);
    }

    public static void print(int sum) {
        if (sum > 3) return;
        System.out.println("print out: " + sum);
        for (int i = 0; i < 5; i++) {
            print(++sum);
            System.out.println("China is a contry: " + sum);
        }
    }
//
//    public static void print1(int sum) {
//        if (sum > 5) return;
//        System.out.println("print out: " + 0);
//        for (int i = 0; i < 5; i++) {
//            if (sum > 3) return;
//            System.out.println("print out: " + 1);
//            for (int i = 0; i < 5; i++) {
//                if (sum > 3) return;
//                System.out.println("print out: " + 2);
//                for (int i = 0; i < 5; i++) {
//                    print(3);
//                    System.out.println("China is a contry: " + 3);
//                }
//                System.out.println("China is a contry: " + 1);
//            }
//            System.out.println("China is a contry: " + 0);
//        }
//    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, target, 0, temp, result);
        return result;
    }

    private void helper(int[] candidates, int start, int target, int sum,
                        List<Integer> list, List<List<Integer>> result){
        if(sum>target){
            return;
        }
        if(sum==target){
            result.add(list);
            return;
        }
        for(int i=start; i<candidates.length; i++){
            list.add(candidates[i]);
            helper(candidates, i, target, sum+candidates[i], list, result);
            list.remove(list.size()-1);
        }
    }
}
