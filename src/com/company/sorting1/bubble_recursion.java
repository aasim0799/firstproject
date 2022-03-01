package com.company.sorting1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class bubble_recursion {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
       // System.out.println(Arrays.toString(bubble(arr)));
        recur(arr,arr.length-1);
        print(arr);
    }
    public static void recur(int arr[],int n){
        if(n==0)
            return;
        for(int j=0;j<n;j++){
            if(arr[j]>arr[j+1])
                swap(arr,j,j+1);
        }
        recur(arr,n-1);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] bubble(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        return arr;
    }
    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
