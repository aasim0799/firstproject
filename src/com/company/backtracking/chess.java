package com.company.backtracking;
import java.util.*;

public class chess {
    public static void main(String[] args) {
        char[][] chess = new char[4][4];
        for (int i = 0; i < chess.length; i++) {
                Arrays.fill(chess[i], '.');
        }
        nQueens(chess, 0, 0, 0);

      // time complexity for chess-queen is O(n!)
    }
    public static boolean canBePlaced(char[][] chess, int r, int c) {
        int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}};
        for (int i = 0; i < dir.length; i++) {
            int nr = r;
            int nc = c;
            int dirR = dir[i][0];
            int dirC = dir[i][1];
            while (nr >= 0 && nc >= 0 && nc < chess.length) {
                if (chess[nr][nc] == 'Q') return false;
                nr = nr + dirR;
                nc = nc + dirC;
            }
        }
        return true;
    }

    public static void nQueens(char[][] chess, int r, int c, int queens) {
        if (chess.length == queens) {
           // System.out.println(Arrays.deepToString(chess));
            for(int i=0;i<chess.length;i++) {
                System.out.println();
                for(int j=0;j<chess[0].length;j++){
                    System.out.print(chess[i][j]+" ");
                }
            }
            System.out.println();
            return ;
        }
        if (c == chess.length) return;
        if (canBePlaced(chess, r, c)) {
            chess[r][c] = 'Q';
            nQueens(chess, r + 1, 0, queens + 1);
            chess[r][c] = '.';
        }
        nQueens(chess, r, c + 1, queens);
    }
    public static int fibo(int n,int []dp) {
        if (n == 0 || n == 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
    }
}
