package com.company.Arrayss_;

public class firstand_last {
    public static void main(String[] args) {
        int arr[]={5,2,3,1,1,1,1,8};
           // ss(arr,1);
        System.out.println(firstoccur(arr,1));
        System.out.println(lastoccur(arr,1));
    }
    public static void ss(int arr[],int target){
        int first=-1;
        int last=-1;

        for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target && first == -1){
            first=i;
            System.out.print(first);
        }
        if(arr[i]==target && first != -1){
            last=i;
            System.out.print(last);
        }
        }
    }
    public static int  firstoccur(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
            end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
    public static int  lastoccur(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                index=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}
