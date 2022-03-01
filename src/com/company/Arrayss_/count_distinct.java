package com.company.Arrayss_;

import java.util.HashSet;

public class count_distinct {
    public static void main(String[] args) {
        int arr[]={5,10,5,4,5,10};
        System.out.println(distinct(arr));
    }
    public static int distinct(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int element:arr){
            set.add(element);
        }
        return set.size();
    }
}
