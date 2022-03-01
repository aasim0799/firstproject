package com.company.Arrayss_;

public class remove_element {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,3};
        System.out.println(remove(arr,3));
    }
    public static int remove(int arr[],int target){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != target){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}
