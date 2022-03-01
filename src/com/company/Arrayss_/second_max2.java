package com.company.Arrayss_;

public class second_max2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,-6};
       // System.out.println(secondmin(arr));
        int arr1[]={1,-2,3,-6,-7,3,5,3,7};
        System.out.println(secondmac(arr1));
    }
    public static int  secondmin(int arr[]){
        int small=Integer.MAX_VALUE;
        int secondsm=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondsm=small;
                small=arr[i];
            }
            if(arr[i]>small && arr[i]<secondsm){
                secondsm=arr[i];
            }
        }
        return secondsm;
    }
    public static int secondmac(int arr[]){
        int max=Integer.MIN_VALUE;
        int scmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                scmax=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>max){
                scmax=arr[i];
            }
        }
        return scmax;
    }
}
