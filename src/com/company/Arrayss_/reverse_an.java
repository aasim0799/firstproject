package com.company.Arrayss_;

import java.util.Arrays;

public class reverse_an {
    public static void main(String[] args) {
        int arr[]={2,74,92,52,56,81};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
