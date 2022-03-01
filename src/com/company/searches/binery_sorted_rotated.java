package com.company.searches;

public class binery_sorted_rotated {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,-1,0,1,2};
        System.out.println(sorted(arr,0,arr.length-1,3));
    }
    public static int sorted(int arr[],int start,int end,int target){
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start] < arr[mid]){
                if(target <= arr[mid] && target <= arr[start]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target >= arr[end] && target <= arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
