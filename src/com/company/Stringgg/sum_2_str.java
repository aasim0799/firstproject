package com.company.Stringgg;

import java.util.Arrays;

public class sum_2_str {
    public static void main(String[] args) {
        String s1="111";
        String s2="222";
        sum(s1,s2);
    }
    public static void sum(String s1,String s2){
        char [] arr=s1.toCharArray();
        char [] brr=s2.toCharArray();

        int i=0;
        int j=0;
        while(i<arr.length && j<brr.length){
            System.out.print(arr[i]+brr[j]+" ");
            i++;
            j++;
        }
    }
}
