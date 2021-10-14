package com.leetcode.dev.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * \
 */
public class FlowerAdj1042 {

    public int[] gardenNoAdj(int n, int[][] paths) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) map.put(i, new HashSet<>());
        for (int[] path : paths) {
            map.get(path[0]-1).add(path[1]-1);
            map.get(path[1]-1).add(path[0]-1);
        }
        int[] res = new int[n];
        for (int j = 0; j < n; j++) {
            boolean[] used = new boolean[5];
        }
        return res;
    }
}
