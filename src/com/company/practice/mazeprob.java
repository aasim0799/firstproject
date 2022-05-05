package com.company.practice;

public class mazeprob {
    public static void main(String[] args) {
        int [][]mat = {
                {1,0,0,0},
                {1,1,0,0},
                {1,1,0,0},
                {0,1,1,1}
        };
        paths(mat,0,0,"");
    }
    public static void paths(int [][]mat,int r,int c,String s) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            System.out.println(s);
            return;
        }

        if (mat[r][c] == 0) {
            return;
        }

        mat[r][c] = 0;

        if (r < mat.length-1) {
            paths(mat,r+1,c,s+"D");
        }
        if (c < mat[0].length) {
            paths(mat,r,c+1,s+"R");
        }
        mat[r][c]=1;
    }
}
