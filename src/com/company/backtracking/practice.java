package com.company.backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
//        int n=6;
//        int []dp = new int [n+1];
//        Arrays.fill(dp,-1);
//        System.out.println(fibodp(n,dp));
//        int[] val = {60, 100, 120};
//        int[] wt = {10, 20, 30};
//        int w = 50;
//        int[][] dp = new int[w + 1][w + 1];
//        System.out.println(knapsack01DP(wt, val, w, 0, dp));
//        System.out.println(knapsack01DP(wt,val,w,0,dp));
       // int amount = 5;
     //   int[] coin = {1, 2, 5};
//        System.out.println(coin(amount,coin));
       // int[] arr = {1, 5, 7};
        //  System.out.println(mincoin(18, arr));
    }

    public static int coin(int amount, int[] coin) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j < dp.length; j++) {
                dp[j] += dp[j - coin[i]];
            }
        }
        return dp[amount];
    }

    public static int fibodp(int n, int[] dp) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fibodp(n - 1, dp) + fibodp(n - 2, dp);
    }

    public static int knapsack01(int[] wt, int[] val, int W, int i) {
        if (i == wt.length) return 0;
        int sel = W >= wt[i] ?
                knapsack01(wt, val, W - wt[i], i + 1) + val[i] : 0;
        int rej = knapsack01(wt, val, W, i + 1);
        return Math.max(sel, rej);
    }

    public static int knapsack01DP(int[] wt, int[] val, int W, int i, int[][] dp) {
        if (i == wt.length) return 0;
        if (dp[i][W] != 0) return dp[i][W];
        int sel = W >= wt[i] ?
                knapsack01DP(wt, val, W - wt[i], i + 1, dp) + val[i] : 0;
        int rej = knapsack01DP(wt, val, W, i + 1, dp);
        return dp[i][W] = Math.max(sel, rej);
    }

    public static int mincoin(int amount, int[] arr) {
        if (amount == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (amount >= 0) {
                int subans = mincoin(amount - arr[i], arr);

                if (subans != Integer.MAX_VALUE && subans + 1 < ans) {
                    ans = subans + 1;
                }
            }
        }
        return ans;
    }

    public int mincoinChange(int[] coins, int amount) {
        int[] minNumCoins = new int[amount + 1];
        Arrays.fill(minNumCoins, amount + 1);
        minNumCoins[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    minNumCoins[i] = Math.min(minNumCoins[i], minNumCoins[i - coin] + 1);
                }
            }
        }
        return minNumCoins[amount] == amount + 1 ? -1 : minNumCoins[amount];
    }

    // arr=[-2, -3, 4, -1, -2, 1, 5, -3]
    public static int kanade(int[] arr, int sum, int i,int curr) {
        if (i == arr.length-1) {
            return curr;
        }
        sum += arr[i];
        if (sum > curr) {
            curr = sum;
        }
        if (sum < 0) {
            sum=0;
        }
        return kanade(arr,sum,i+1,curr);
    }
}
