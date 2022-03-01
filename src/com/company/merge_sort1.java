package com.company;

import java.util.Arrays;

public class merge_sort1 {
    public static void main(String[] args) {
        int ar[]={9,8,7,5,4};
        int arr[]={2,4,6,8};
        int arr1[]={3,5,7,9};
       // System.out.println(Arrays.toString(merge(arr, arr1)));
        System.out.println(Arrays.toString(merge_sort(ar,0,ar.length-1)));
        String str="abcdefghijklmnopqrstuvwxy";
        System.out.println(pangram(str));

    }
    public static int [] merge(int [] a,int [] b){
        int [] c=new int[a.length + b.length];
        int ai=0;
        int bi=0;
        int k=0;
        while(ai<a.length && bi< b.length){
            if(a[ai] < b[bi]){
                c[k]=a[ai];
                ai++;
                k++;
            }
            else{
                c[k]=b[bi];
                bi++;
                k++;
            }
        }
        while(ai<a.length){
            c[k]=a[ai];
            ai++;
            k++;
        }
        while(bi < b.length){
            c[k]=b[bi];
            bi++;
            k++;
        }
        return c;
    }
    public static int [] merge_sort(int [] arr,int l,int r){
        if(l==r){
            int [] c=new int[1];
            c[0]=arr[l];
            return c;
        }
        int mid=(l+r)/2;
        int a[]=merge_sort(arr,l,mid);
        int b[]=merge_sort(arr,mid+1,r);
        return merge(a,b);
    }
    public static boolean pangram(String str){
            for(char ch='a'; ch <='z';ch++){
                if(str.indexOf(ch) < 0){
                    return false;
                }
            }
        return true;
    }
}
