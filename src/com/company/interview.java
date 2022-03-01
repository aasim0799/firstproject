package com.company;

import java.util.ArrayList;
import java.util.*;

public class interview {
    public static void main(String[] args) {
        int arr[]={2,3,3,5,4};
       // System.out.println(min(arr));
        int a[]={1,2,3,5};
       // missing(arr);
        int b[]={0,1,3,2,4};
        missing_0(b);
    }
    public static List<Integer> min(int[] arr){
        List<Integer> list=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<>();
        for(int nums:arr){
            set.add(nums);
        }
        for(int i=1;i<arr.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void missing(int arr[]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int sum1=(n+1)*(n+2)/2;
        int fina=sum1-sum;
        System.out.println(fina);
    }
    public static void missing_0(int arr[]){
        int sum=0;
        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];//7
        }
        int sum1=(n*(n+1))/2;//10
        int fina=sum1-sum;
        System.out.println(fina);
    }
}
