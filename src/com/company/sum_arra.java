package com.company;
import java.util.*;

public class sum_arra {
    public static void main(String[] args) {
          int arr []={9,8,-7,6,-5,4,-3};
       // int arr1[]={4,6,-7,8,-5,9,-3};
        System.out.println(Arrays.toString(sortipos(arr)));
    }
    public static int [] sortipos(int [] arr){
        for(int i=0;i<arr.length-1;i++) {
            int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min] && arr[j] > 0) {
                        min = j;
                    }
                }
                swap(arr, i, min);

        }
        return arr;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
