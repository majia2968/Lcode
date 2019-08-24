package com.agile.practice.c100.string;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.agile.practice.c100.easy.TreeNode;

public class LongSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bab ";
		//System.out.println(lengthOfLongestSubstring("vmqjjfnxtyciixhceqyvibhdmivndvxyzzamcrtpywczjmvlodtqbpjayfchpisbiycczpgjdzezzprfyfwiujqbcubohvvyakxfmsyqkysbigwcslofikvurcbjxrccasvyflhwkzlrqowyijfxacvirmyuhtobbpadxvngydlyzudvnyrgnipnpztdyqledweguchivlwfctafeavejkqyxvfqsigjwodxoqeabnhfhuwzgqarehgmhgisqetrhuszoklbywqrtauvsinumhnrmfkbxffkijrbeefjmipocoeddjuemvqqjpzktxecolwzgpdseshzztnvljbntrbkealeemgkapikyleontpwmoltfwfnrtnxcwmvshepsahffekaemmeklzrpmjxjpwqhihkgvnqhysptomfeqsikvnyhnujcgokfddwsqjmqgsqwsggwhxyinfspgukkfowoxaxosmmogxephzhhy"));
		//System.out.println(lengthOfLongestPalindromic(s));
		Map<BigInteger,BigInteger> map = new HashMap<>();
		Map<Integer,Integer> memo = new HashMap<>();
		//System.out.println(longestPalindromic(s));
		//System.out.println(fab(BigInteger.valueOf(99), map));
		//System.out.println(fib(99, memo));
		//int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] arr = {-1,-2,-3,-4,-5};

		System.out.println(maxSubArray(arr));
		
//		String path = FilenameUtils.normalize("/foo/../bar/../baz");

	}
	
    public static int lengthOfLongestSubstring(String s) {
        	if (s == null) return 0;
        	if (s.equals(" ")) return 1;
        	List<Integer> list = new ArrayList<>();
            list.add(0);
            char[] ch = s.toCharArray();
             
            for (int i = 0; i < ch.length; i++) {
            	Set set = new HashSet();
            	for (int j = i; j < ch.length; j++) {
                	if (!set.contains(ch[j])) {
                		set.add(ch[j]);
                	}
                	else {
                		break;
                	}
            	}
            list.add(set.size());
            }
            return Collections.max(list);
    }
    
    public static String lengthOfLongestPalindromic(String s) {
        if (s == null) return null;
    	if (s.length() == 1) return s;
    	if (s.length() == 2) {
    		if (s.charAt(0) == s.charAt(1)) {
        		return s;
    		}
    		else {
        		return s.substring(0,1);    			
    		}
    	}
    	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        char[] ch = s.toCharArray();
        treeMap.put(0, "");
        for (int i = 1; i < ch.length; i++) {
        	for (int j = 0; j < i; j++) {
        		if (ch[i] == ch[j]) {
            		String tmp = s.substring(i, j+1);
            		if (tmp.equals(new StringBuilder(tmp).reverse().toString())) {
            			treeMap.put(tmp.length(), tmp);
            		}
        		}		
        	}
        }
         return treeMap.get(treeMap.lastKey());
    }
    
    public static String longestPalindromic(String s) {
        if (s == null || s.isEmpty()) return null;
    	if (s.length() == 1) {
    		return s;
    	}
     
    	String longest = s.substring(0, 1);
    	for (int i = 0; i < s.length(); i++) {
    		// get longest palindrome with center of i
    		String tmp = helper(s, i, i);
    		System.out.println(tmp);
    		if (tmp.length() > longest.length()) {
    			longest = tmp;
    		}
     
    		// get longest palindrome with center of i, i+1
    		tmp = helper(s, i, i + 1);
    		if (tmp.length() > longest.length()) {
    			longest = tmp;
    		}
    	}
     
    	return longest;
    }
     
    // Given a center, either one letter or two letter, 
    // Find longest palindrome
    public static String helper(String s, int left, int right) {
    	while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    		left--;
    		right++;
    	}
    	return s.substring(left+1, right);
    }
    
//    public static BigInteger fab(BigInteger i, Map<BigInteger,BigInteger> map) {
//    	if (i == 1 || i == 2) return BigInteger.valueOf(1);
//    	if (map.containsKey(i)) return map.get(i);
//    	BigInteger fib = fab(i-1, map).add(fab(i-2, map));
//    	map.put(i, fib);
//    	return fib;
//    }
    
    public static int fib(int n, Map<Integer,Integer> memo) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Index was negative. No such thing as a negative index in a series.");

        // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            System.out.println(memo.get(n));

            return memo.get(n);
        }
        System.out.printf(" computing fib(%d)\n", n);
        int result = fib(n - 1, memo) + fib(n - 2, memo);

        // memoize
        memo.put(n, result);

        return result;
    }
    
    public boolean divisorGame(int N) {
    	boolean[] dp = new boolean[N+1];
    	for (int i = 1; i <= N; i++) {
    		for (int x = 1; x < i; x++) {
    			if ((i % x == 0) && (!dp[i-x])) {
    				dp[i] = true;
    				break;
    			}
    		}
    	}
    	return dp[N];
    }
    
    public int maxProfit(int[] prices) {
    	int min = Integer.MAX_VALUE;
    	int profit = 0;
    	
    	for (int i = 0; i < prices.length; i++) {
    		if (prices[i] < min) {
    			min = prices[i];
    		}
    		else {
    			if (prices[i] - min > profit) {
    				profit = prices[i] - min;
    			}
    		}
    	}
    	return profit;
    }
    
    public static int maxSubArray(int[] nums) {
    	int length = nums.length;
    	int start = 0;
    	int end = 0;
    	for (int i = 0; i < length; i++) {
    		end = start + nums[i];
    		if (end < 0) end = 0;
    		if (start < end) start = end;
    	}
    	return start;
    }
    
    
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];
    	int length = nums.length;
    	int[] dp = new int[length];
    	dp[0] = nums[0];
    	dp[1] = Math.max(nums[0], nums[1]);
    	for (int i = 2; i < length; i++) {
    		dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
    	}
    	return dp[length-1];
    }
    
    public int minCostClimbingStairs(int n) {
        int[] temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 1;
        for (int i = 2; i <= n; i++) {
        	temp[i] = temp[i-1] + temp[i-2];
        }
        return temp[n];
    }
    
    public int minCostClimbingStairs1(int[] cost) {
    	int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
    	for (int i = 2; i < n; i++) {
    		dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
    	}
    	return dp[n];
    }
    
    
    

}
