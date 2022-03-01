package com.company;

public class two_elemnet_dif {
    public static void main(String[] args) {
        int arr[]={7,9,5,6,13,2};
        max(arr);
    }
    public static void max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }
}
