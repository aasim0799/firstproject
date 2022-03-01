package com.company;

public class recursive_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(search(arr,0,arr.length-1,4));
    }
    public static int search(int arr[],int start,int end,int target){
        if(start>=end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target) {
           return search(arr, mid + 1, end, target);
        }
        return search(arr,start,mid-1,target);
    }
}
