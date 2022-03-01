package com.company.Arrayss_;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_dope {
    public static void main(String[] args) {
        int arr[]={2,4,5,5,9,8};
       // remove(arr);
        remove1(arr);
        //removee(arr);
    }
    public static void remove(int arr[]){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0;
        while(i<arr.length-1){
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else{
                i++;
            }
        }
        System.out.print(arr[i]);
    }
    public static void remove1(int arr[]){
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int var:set){
            System.out.print(var+" ");
        }
    }
    public static void removee(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int var:set){
            System.out.print(var+" ");
        }
    }

}
