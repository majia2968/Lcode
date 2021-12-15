package com.leetcode.dev.array;

public class NumberOfPr547 {

    public int findCircleNum(int[][] isConnected) {
        return 0;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}
