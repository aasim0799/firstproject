package com.company.Arrayss_;

import java.util.Arrays;

public class plus_one {
    public static void main(String[] args) {
        int arr[]={1,0,0,0};
      //  System.out.println(Arrays.toString(plus(arr)));
        System.out.println(Arrays.toString(minus(arr)));
    }
    public static int [] plus(int arr[]){
        int i=arr.length-1;
        while(i>=0){
            if(arr[i]!=9){
                arr[i]=arr[i]+1;
                return arr;
            }
            arr[i]=0;
            i--;
        }
        int res[]=new int[arr.length+1];
        res[0]=1;
        return res;
    }
    public static int [] minus(int arr[]){
        int i=arr.length-1;
        while(i>=0){
            if(arr[i]!=0){
                arr[i]=arr[i]-1;
                return arr;
            }
            arr[i]=9;
            i--;
        }
        return arr;
    }
}
