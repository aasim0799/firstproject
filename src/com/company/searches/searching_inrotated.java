package com.company.searches;

public class searching_inrotated {
    public static void main(String[] args) {
            int arr[]={5,4,1,2,3};
        System.out.println(rotate(arr,0,arr.length-1));
    }
    public static int  rotate(int arr[],int start,int end){
        int mid=start+(end-start)/2;
        if(mid > start && arr[mid]<arr[mid-1]){
            return arr[mid];
        }
        else if(mid < end && arr[mid]>arr[mid+1]){
            return arr[mid+1];
        }
        if (arr[end] > arr[mid])
            return rotate(arr, start, mid-1);
        return rotate(arr, mid+1, end);
    }
}
