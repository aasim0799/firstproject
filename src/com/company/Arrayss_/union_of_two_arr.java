package com.company.Arrayss_;

import java.util.HashSet;

public class union_of_two_arr {
    public static void main(String[] args) {
        int arr[]={5,10,15,5};
        int rra[]={10,15,4,5};
        System.out.println(union(arr,rra));
    }
    public static int union(int arr[],int rra[]){
        HashSet<Integer> set=new HashSet<>();
        for(int var:arr){
            set.add(var);
        }
        for(int car:rra){
            set.add(car);
        }
        return set.size();
    }
}
