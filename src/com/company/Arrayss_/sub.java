package com.company.Arrayss_;

import java.util.Arrays;

public class sub {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1};
      //  System.out.println(Arrays.toString(sub(arr, 3)));
        int n=-662;
        System.out.println(n);
        System.out.println(Math.abs(n));
    }
    public static int [] sub(int arr[],int target){
        int sum;
        for(int i=0;i<arr.length;i++) {
            sum = arr[i];

            for (int j = i + 1;j<=arr.length;j++) {
             if(sum==target){
                 return new int[]{i,j-1};
             }
             if(sum>target){
                 break;
             }
             if(j < arr.length){
                 sum=sum+arr[j];
             }
            }
        }
        return new int []{-1};
    }
}
