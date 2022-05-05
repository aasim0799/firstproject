package com.company.hashmm;

public class two_steparr {
    public static void main(String[] args) {
//        System.out.println(steps(3));
//
//        System.out.println(one(2));
        int [] arr={8,9,10,11,12,13,14};
        System.out.println(binary(arr,8,0,arr.length-1));
    }
    public static int steps(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        int onestep=steps(n-1);
        int twosteps=steps(n-2);
        return onestep+twosteps;
    }
    public static int one(int n){
        if(n == 0)  return 1;
        if(n < 0)  return 0;
        int onestep=one(n-1);
        int tostep=one(n-2);
        return onestep+tostep;
    }
    public static int binary(int [] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(arr[mid]  == target) {
            return mid;
        }
        if(target < arr[mid]){
           return  binary(arr,target,start,mid-1);
        }
         return    binary(arr, target, mid + 1, end);
    }
}
