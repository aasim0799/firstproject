package com.company;

import java.util.Arrays;

public class greatest_on_right {
    public static void main(String[] args) {
        int arr[]={7,5,6,2,3,1};
         greater(arr);
        print(arr);
    }
    public static void greater(int arr[]){
        int size=arr.length;
        int max=arr[size-1];
        arr[size-1]=-1;
        for(int i=size-2;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            if(max<temp){
                max=temp;
            }
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
