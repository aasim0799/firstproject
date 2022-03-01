package com.company.sorting1;

import java.util.Arrays;

public class odd_even_sort {
    public static void main(String[] args) {
        int arr[]={1 ,2, 3, 5, 4, 7, 10};

        twoWaySort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int a[]={3,1,2,4};
        System.out.println(Arrays.toString(odd(arr)));
        int b[]={10,13,44,9};
        System.out.println(Arrays.toString(array(arr)));
        System.out.println(Arrays.toString(barray(arr)));
    }
    static void twoWaySort(int arr[], int n)
    {
        // Make all odd numbers negative
        for (int i = 0; i < n; i++)
            if ((arr[i] & 1) != 0) // Check for odd
                arr[i] *= -1;

        // Sort all numbers
        Arrays.sort(arr);

        // Retaining original array
        for (int i = 0; i < n; i++)
            if ((arr[i] & 1) != 0)
                arr[i] *= -1;
    }
    public static int [] odd(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            if(arr[start]%2 == 0){
                start++;
            }
            else if(arr[end]%2 != 0){
                end--;
            }
            else{
                swap(arr,start,end);
            }
        }
        return arr;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int [] array(int arr[]){
        int count=0;
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                nums[count]=arr[i];
                count++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2 != 0){
                nums[count]=arr[j];
                count++;
            }
        }
        return nums;
    }
    public static int [] barray(int arr[]){
        int count=0;
        int nums[]=new int[arr.length];
        int bount=nums.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                nums[count]=arr[i];
                count++;
            }
            else{
                nums[bount]=arr[i];
                bount--;
            }
        }
        return nums;
    }
}

