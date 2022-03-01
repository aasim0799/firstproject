package com.company.Arrayss_;

public class elemnent_appears0nce {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,4,5,5};
        once(arr);
    }
    public static void once(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i]==arr[i+1]){
                i=i+2;
            }
            else if(arr[i] != arr[i+1] && arr[i] == arr[i-1]){
                i++;
            }
            else{
                System.out.println(arr[i]);
                i++;
            }
        }
    }
}
