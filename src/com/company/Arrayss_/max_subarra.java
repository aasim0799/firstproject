package com.company.Arrayss_;
import java.util.*;

public class max_subarra {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sub(arr));
        System.out.println(Arrays.toString(arra(arr)));
        System.out.println(arsub(arr));
    }
    public static int  sub(int [] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i]; //3
            if(max<sum) {
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static int [] arra(int [] arr) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int start=0;
        int end=-1;
        int first=0;
        int i=0;
        while(i < arr.length) {
            sum = sum + arr[i];
            if(sum < 0) {
                sum = 0;
                first=i+1;
            }
            if(sum > max_sum) {
                max_sum = sum;
                start = first;
                end = i;
            }
            i++;
        }
        return new int[] {start,end};
    }
    public static int arsub(int [] arr) {
        //-2,1,-3,4,-1,2,1,-5,4
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            if(sum > max_sum) {
                max_sum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }
}
