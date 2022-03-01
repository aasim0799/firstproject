package com.company.Arrayss_;

public class buy_stock {
    public static void main(String[] args) {
        int arr[]={3,6,7,1,5,4};
        System.out.println(by(arr));
    }
    public static int by(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]-min>max){
                max=arr[i]-min;
            }
        }
        return max;
    }
}
