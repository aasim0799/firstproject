package com.company.Arrayss_;

import java.util.HashSet;
import java.util.Set;

public class isdup_exist {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,7,1,4};
        Set<Integer> values = new HashSet<>();

        for(int i=0; i<arr.length ;i++)
        {
            if(values.contains(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
            else{
                values.add(arr[i]);
            }
        }
    }
}
