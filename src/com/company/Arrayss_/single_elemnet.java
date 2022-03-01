package com.company.Arrayss_;

public class single_elemnet {
    public static void main(String[] args) {
        int arr[]={3,3,7,7,10,11,11,12};
        single(arr);
    }
    public static void single(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i]==arr[arr.length-1] && arr[i] != arr[i-1] && i==arr.length-1){
                System.out.println(arr[i]);
                return;
            }
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else if(arr[i]==arr[i+1]){
                i=i+2;
            }
        }
    }
}
