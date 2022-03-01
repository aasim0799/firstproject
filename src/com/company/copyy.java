package com.company;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class copyy {
    public static void main(String[] args) {
           int arr[]={1,2,3,4,5,6};
           int sum[]=copyOfRange(arr,0,3);
        System.out.println(Arrays.toString(sum));
    }
}
