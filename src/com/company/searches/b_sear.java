package com.company.searches;

public class b_sear {
    public static void main(String[] args) {
        char [] arr={'a','b','c','d'};
        System.out.println(binar(arr,'d'));
    }
    public static char binar(char arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}