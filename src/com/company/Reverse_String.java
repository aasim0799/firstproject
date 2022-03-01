package com.company;
import java.util.Arrays;


public class Reverse_String {
    public static void main(String[] args)
    {   int [] arr ={7,6,4,2,1};
        int [] brr ={44,45,56,78};
        int [] crr=mergee(arr,brr);
       // System.out.println(Arrays.toString(crr));
        System.out.println(Arrays.toString(mergly(arr,0,arr.length-1)));
    }
    public static int [] mergee(int [] arr, int[] brr){
        int [] c=new int [arr.length+brr.length];
        int  i,j,k;
         i=j=k=0;
         while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                c[k]=arr[i];
                i++;
                k++;
            }
            else {
                c[k] = brr[j];
                j++;
                k++;
            }
         }
         while(i<arr.length){
             c[k]=arr[i];
             i++;
             k++;
         }
         while(j<brr.length){
             c[k]=brr[j];
             j++;
             k++;
         }
         return c;

    }
    public static int [] mergly(int [] pop,int start,int end){
        if(start==end) {
            int [] c=new int [1];
            c[0]=pop[start];
            return c;
        }
        int mid=(start+end)/2;
        int[] arr=mergly(pop,start,mid);
        int [] brr=mergly(pop,mid+1,end);
        return mergee(arr,brr);
    }


}