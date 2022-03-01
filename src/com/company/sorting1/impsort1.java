package com.company.sorting1;

import java.util.Arrays;

public class impsort1 {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1};
        System.out.println(Arrays.toString(simplesort(arr)));
    }
    public static  int [] simplesort(int [] arr){
        int count=0;//3   made-8 //7- req
        int count1=1;//5
        for (int i=1;i<arr.length;i++){
            if(arr[i]==0){
                count++;//3
            }
            if(arr[i]==1){
                count1++;//4
            }
        }
        int [] array=new int[arr.length];
        for(int j=0;j<count;j++){
            array[j]=0;
        }
        for(int k=count;k<count+count1;k++){
            array[k]=1;
        }
        return array;
    }
}
