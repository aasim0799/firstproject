package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two2pair_sum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
      //  System.out.println(Arrays.toString(two(arr,18)));
        System.out.println(Arrays.toString(sum(arr, 18)));
    }
    public static int [] two(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[i]+arr[j]==target){
                    return new int [] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No pair");
    }
    public static int [] sum(int arr[],int target){
          Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            int find=target-arr[i];
            if(map.containsKey(find) && map.get(find) != i){
                return new int []{i,map.get(find)};
            }
        }
        throw new IllegalArgumentException("No pair");
    }

}
