package com.company;
import java.util.*;

public class segregate_01 {
    public static void main(String[] args) {
            int arr[]={0,1,0,1,0,1,0,0};
        System.out.println(Arrays.toString(smd(arr)));

    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int [] smd(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i] == arr[j]){
                i++;
            }
            if(arr[i] != arr[j] && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0 && arr[j]==1){
                i++;
                j--;
            }
        }
        return arr;
    }
}
