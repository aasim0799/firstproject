package com.company;

import java.util.Arrays;

public class marge_sort {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int arr1[]={3,5,7,9};
        System.out.println(Arrays.toString(twosorted(arr,arr1)));
        int a[]={5,4,3,2,1};
        System.out.println(Arrays.toString(meerge(a,0,a.length-1)));
    }
    public static int [] twosorted(int [] arr,int[] arr1){
        int c[]=new int[arr.length+arr1.length];
        int ai=0;
        int bi=0;
        int k=0;
        while(ai<arr.length && bi<arr1.length){
            if(arr[ai]<arr1[bi]){
                c[k]=arr[ai];
                ai++;
                k++;
            }
            else{
                c[k]=arr1[bi];
                bi++;
                k++;
            }
        }
        while(ai<arr.length){
             c[k]=arr[ai];
             ai++;
             k++;
        }
        while (bi<arr1.length){
            c[k]=arr1[bi];
            bi++;
            k++;
        }
        return c;
    }
    public static int[] meerge(int [] arr,int l,int r){
        if(l==r){
            int [] c=new int[1];
            c[0]=arr[l];
            return c;
        }
        int mid=(l+r)/2;
        int a[]=meerge(arr,l,mid);
        int b[]=meerge(arr,mid+1,r);
        return twosorted(a,b);
    }
}
