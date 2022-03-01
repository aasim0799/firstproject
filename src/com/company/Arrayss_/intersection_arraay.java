package com.company.Arrayss_;

import java.util.HashSet;

public class intersection_arraay {
    public static void main(String[] args) {
        int arr[]={5,10,15,5,10};
        int rra[]={15,10,4};
        System.out.println(inter(arr,rra));
    }
    public static int inter(int arr[],int rra[]){
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int elment:arr){
            set.add(elment);
        }
        for(int elment:rra){
            if(set.contains(elment)){
                count++;
                set.remove(elment);
            }
        }
        return count;
    }
}
