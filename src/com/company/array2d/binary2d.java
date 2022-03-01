package com.company.array2d;

import java.util.Arrays;

public class binary2d {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(Arrays.toString(d2(arr, 6)));
        System.out.println(Arrays.toString(d3(arr,4)));
    }
    public static int [] d2(int [][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }

    public static int [] d3(int [][]arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            else if (arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
