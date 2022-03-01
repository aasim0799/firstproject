package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class selection_Sort {
    public static void main(String[] args) {
     int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
          selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minIndex] > arr[j] && arr[j]<0) minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
        public static void swap(int [] arr,int i,int j){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
        }

}
