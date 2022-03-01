package com.company;

import java.util.Arrays;

public class rotatekste {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int [] arr,int n){
        for(int i=0;i<n;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        }
    }

