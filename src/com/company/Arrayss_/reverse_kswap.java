package com.company.Arrayss_;

import java.util.Arrays;

public class reverse_kswap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
       // System.out.println(Arrays.toString(sw(arr, 5)));
        System.out.println(Arrays.toString(pw(arr,5)));
    }
    public static int [] sw(int arr[],int k){
        int i=0;
        int j=i+k-1;
        while(i<arr.length && j<arr.length) {
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
            i=i+k-1;
            j=i+k-1;
        }
        return arr;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int [] pw(int arr[],int k){
        for(int i=0;i<arr.length;i=i+k){
            int start=i;
            int end=Math.min(i+k-1,arr.length-1);
            while(start <= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return arr;
    }
}
