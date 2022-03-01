package com.company.Arrayss_;

public class count_ocuurences {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6,6,6,7,8};
        System.out.println(coun(arr,6));
    }
    public static int coun(int arr[],int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
