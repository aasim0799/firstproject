package com.company.Arrayss_;

import java.util.HashMap;
import java.util.Map;

public class majority {
    public static void main(String[] args) {
        int arr[]={3,3,2,2,3,2,3};
        System.out.println(major(arr));
    }
    public static int major(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int val=arr.length/2;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > val){
                result= entry.getKey();
               break;
            }
        }
        return result;
    }
}
