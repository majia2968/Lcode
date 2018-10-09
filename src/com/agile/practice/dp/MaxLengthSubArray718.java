package com.agile.practice.dp;

public class MaxLengthSubArray718 {

	public static void main(String[] args) {
		int[] A = {14, 12, 11, 20};
		int[] B = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45, 12, 11, 20};
		System.out.println(findLength(A,B));
	}
	
    public static int findLength(int[] A, int[] B) {
        int ans = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        for (int i = A.length - 1; i >= 0; --i) {
            for (int j = B.length - 1; j >= 0; --j) {
                if (A[i] == B[j]) {
                    memo[i][j] = memo[i+1][j+1] + 1;
                    if (ans < memo[i][j]) ans = memo[i][j];
                }
            }
        }
        return ans;
    }

}