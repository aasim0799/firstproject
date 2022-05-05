package com.company.practice;
import java.util.*;

public class maxsubarray {
    public static void main(String[] args) {
        int [] arr={-2,7,-5,6,-3,9,-6};
        System.out.println(Arrays.toString(maxsub(arr)));
        System.out.println(max(arr));
    }
    public static int [] maxsub(int [] arr) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int start=0;
        int end=-1;
        int first=0;
        int i=0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
               first=i+1;
            }
            if (sum > max_sum) {
                max_sum = sum;
                start=first;//1
                end=i;////5
            }
            i++;
        }
       return new int[]{start,end};
    }
    public static int max(int [] arr) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int i=0;
        while(i < arr.length) {
            sum = sum + arr[i];
            if(max_sum < sum) {
                max_sum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
            i++;
        }
        return max_sum;
    }
}
