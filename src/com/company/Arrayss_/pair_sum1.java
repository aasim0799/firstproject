package com.company.Arrayss_;

public class pair_sum1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        //  kanade(arr,9);
        pair(arr,9);
    }
    public static void kanade(int arr[],int target){
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = arr.length - 1; j > i; j--) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("pair (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
    public static void pair(int arr[],int target){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]==target){
                System.out.println("pair (" + arr[i] + "," + arr[j] + ")");
                i++;
                j--;
            }
        }
    }
}
