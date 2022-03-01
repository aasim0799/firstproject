package com.company;

public class binary_sarch {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        System.out.println(binary(arr,0,arr.length-1,7));
    }
    public static int binary(int arr[],int start,int end,int target){
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]>target){
               end=mid-1;
           }
           else if(arr[mid]<target){
               start=mid+1;
           }
           else{
               return mid;
           }
       }
       return -1;
    }
}
