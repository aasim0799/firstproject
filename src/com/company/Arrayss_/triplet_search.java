package com.company.Arrayss_;

import java.util.Arrays;

public class triplet_search {
    public static void main(String[] args) {
        int arr[]={1,4,45,6,10,8};
      //  fd(arr,8);
        trip(arr,12);
    }
    public static void fd(int arr[],int target){
        for (int i = 0; i < arr.length-2; i++) {
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("true");
                        return;
                    }
                }
            }
        }
        System.out.println("false");
    }
    public static void trip(int arr[],int target){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int start=i+1;
            int end=arr.length-1;
            while (start < end){
                if(arr[i]+arr[start]+arr[end]==target){
                    System.out.println("present");
                    return;
                }
            else if(arr[i] + arr[start] +arr[end] < target){
                start++;
            }
            else{
                end--;
            }
            }
        }
        System.out.println("absence");
    }
}
