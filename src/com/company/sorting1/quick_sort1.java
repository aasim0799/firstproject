package com.company.sorting1;

import java.util.*;

public class quick_sort1 {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(quicksort(arr,0,arr.length-1)));

    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partitionIndex(int[] arr, int l, int r) {
        int i = l;
        int j = l;
        int pivot =arr[r];
        while (i <= r) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int pivot = arr[end];
        int pi = partitionIndex(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }
    public static int[] quicksort(int arr[], int start, int end)
    {
        if(start<end){
            int pi=partitionIndex(arr,start,end);
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }
        return arr;
    }
//   String s="Geek1;


}
