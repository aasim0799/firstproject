package com.company.sorting1;

import java.util.Arrays;

public class merge_sort5 {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
       //  mergeSort(arr,0,arr.length-1);
       //  print(arr);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static  void merge(int arr[], int start,int mid,
                      int end)
    {
        int start2 = mid + 1;

        // If the direct merge is already sorted

        // Two pointers to maintain start
        // of both arrays to merge
        while (start <= mid && start2 <= end) {

            if (arr[start] <= arr[start2]) {
                start++;
            }
            else {
                int value = arr[start2];
                int index = start2;

                // Shift all the elements between element 1
                // element 2, right by 1.
                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = value;

                start++;
                mid++;
                start2++;
            }
        }
    }

    static void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l,m, r);
        }
    }
}
