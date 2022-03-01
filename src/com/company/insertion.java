package com.company;
import java.util.*;


public class insertion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        binary(arr,4,0,arr.length-1);
    }
    public static void binary(int arr[],int target,int start,int end) {
        int mid = start + end;
        while(start<=end){
            if (arr[mid] == target) {
                System.out.println("Present");
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + end;
        }
        if(start>end){
            System.out.println("absent");
        }
    }
}
