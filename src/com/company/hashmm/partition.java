package com.company.hashmm;
import java.util.Arrays;

public class partition {
    public static void main(String[] args) {
          int[] arr={1,5,4,6,2,3};
            quicks(arr,0,arr.length-1);
          System.out.println(Arrays.toString(arr));
    }
    public static void quicks(int arr[],int l,int r){
        if(l>=r) return;
        int pivot=arr[r];
        int pi=pertition(arr,pivot,l,r);
        quicks(arr,l,pi-1);
        quicks(arr,pi+1,r);
    }

        public static int   pertition(int arr[],int pivot,int l,int r){
        int i=l;
        int j=l;
        while(i<=r){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j-1;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
