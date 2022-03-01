package com.company;


import java.util.Arrays;


public class countM {
    public static void main(String[] args) {
        int [][] mat={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        ratmaze(mat,0,0,"");
    }
    public static void  ratmaze(int [][] mat,int r,int c,String ps){
        if(r== mat.length-1 && c== mat.length-1){
            System.out.println(ps);
            return;
        }
        mat[r][c]=0;
        if(r-1 >= 0 && mat[r-1][c]==1){
            ratmaze(mat,r-1,c, ps+"U");
        }
        if(r+1 < mat.length && mat[r+1][c]==1){
            ratmaze(mat,r+1,c,ps+"D");
        }
        if(c-1 >=0 && mat[r][c-1]==1){
            ratmaze(mat,r,c-1,ps+"L");
        }
        if(c+1 < mat.length && mat[r][c+1]==1){
            ratmaze(mat,r,c+1,ps+"R");
        }
        mat[r][c]=1;
    }
}
