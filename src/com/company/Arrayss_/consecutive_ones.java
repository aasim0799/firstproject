package com.company.Arrayss_;

public class consecutive_ones {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1,1,0,1};
        System.out.println(ones(arr,1));
    }
    public static int ones(int arr[],int target){
        int count=0;
        int maxcount=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                count++;
            }
            else{
                count=0;
            }
            if(maxcount<count){
                maxcount=count;
            }
        }
        return maxcount;
    }
}
