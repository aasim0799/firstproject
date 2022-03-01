package com.company.array2d;

import java.util.Arrays;

public class linearin_2d {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
//        System.out.println(Arrays.toString(linear(arr,8)));
//        linear(arr,8);
        System.out.println(Arrays.toString(max(arr)));
    }
    public static int [] linear(int [][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] max(int [][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max=arr[row][col];
                }
            }
        }
       return new int []{max};
    }
}
