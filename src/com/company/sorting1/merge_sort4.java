package com.company.sorting1;

import java.util.Arrays;

public class merge_sort4 {
    public static void main(String[] args) {
        int [] a={1,3,5,7};
        int [] b={2,4,6,8};
        int [] arr={5,4,1,2,3};

        System.out.println(Arrays.toString(merge(arr, 0, arr.length - 1)));
      //  System.out.println(Arrays.toString(twosorted(a,b)));
        System.out.println(Arrays.toString(quick(arr, 0, arr.length - 1)));

    }
    public static int [] twosorted(int [] a,int [] b){
        int [] c =new int [a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
            while (j < b.length) {
                c[k] = b[j];
                 j++;
                 k++;
            }
        return c;
    }
    public static int [] merge(int [] arr,int start,int end) {
        if (start == end) {
                int [] c=new int[1];
                c[0] = arr[start];
                return c;
        }
        int mid=(start+end)/2;
        int [] a=merge(arr,start,mid);
        int [] b=merge(arr,mid+1,end);
        return twosorted(a,b);
    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    public static int part(int [] arr,int start,int end) {
        int pivot = arr[end];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }
    public static int[] quick(int [] arr,int start,int end) {
        if (start < end) {
            int pi=part(arr,start,end);
            quick(arr,start,pi-1);
            quick(arr,pi+1,end);
        }
        return arr;
    }
}
